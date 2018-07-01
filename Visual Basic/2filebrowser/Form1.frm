VERSION 5.00
Object = "{831FDD16-0C5C-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCTL.OCX"
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6750
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   7275
   LinkTopic       =   "Form1"
   ScaleHeight     =   6750
   ScaleWidth      =   7275
   StartUpPosition =   3  'Windows Default
   Begin MSComctlLib.ListView Flist 
      Height          =   6495
      Left            =   3360
      TabIndex        =   1
      Top             =   120
      Width           =   3735
      _ExtentX        =   6588
      _ExtentY        =   11456
      LabelWrap       =   -1  'True
      HideSelection   =   -1  'True
      _Version        =   393217
      ForeColor       =   -2147483640
      BackColor       =   -2147483643
      BorderStyle     =   1
      Appearance      =   1
      NumItems        =   0
   End
   Begin MSComctlLib.TreeView DrV 
      Height          =   6495
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   3135
      _ExtentX        =   5530
      _ExtentY        =   11456
      _Version        =   393217
      Style           =   7
      Appearance      =   1
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False



Private Sub DrV_NodeClick(ByVal Node As MSComctlLib.Node)
    Dim FSYS As New FileSystemObject
    Dim ThisFolder As Folder
    Dim allfolders As Folders
    Dim allfiles As Files
    Dim thisfile As File
    Dim thisitem As ListItem

    Screen.MousePointer = vbHourglass
    Flist.ListItems.Clear

    Set ThisFolder = FSYS.GetFolder(Node.Key)
    Set allfolders = ThisFolder.SubFolders
    If allfolders.Count > 0 Then
        On Error Resume Next
         For Each ThisFolder In allfolders
            DrV.Nodes.Add ThisFolder.ParentFolder, tvwChild, ThisFolder.Name, ThisFolder.Name
        Next
    End If

    Set allfiles = ThisFolder.Files
    If allfiles.Count > 0 Then
        On Error Resume Next
            For Each thisfile In allfiles
               flsit.ListItems.Add , , thisfile.Name
            Next
     End If
    Screen.MousePointer = vbDefault

End Sub

Private Sub Form_Load()
Dim DriveList As New FileSystemObject
Dim drive As drive
Set DriveList1 = DriveList.Drives
For Each drive In DriveList1
    DrV.Nodes.Add , tvwChild, drive.DriveLetter + ":\", drive.DriveLetter + ":\"
Next
End Sub

Sub ScanDirectory(ScanThisFolder As Variant)
End Sub
