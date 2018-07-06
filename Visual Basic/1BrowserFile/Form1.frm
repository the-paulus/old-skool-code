VERSION 5.00
Object = "{831FDD16-0C5C-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCTL.OCX"
Object = "{6FBA474E-43AC-11CE-9A0E-00AA0062BB4C}#1.0#0"; "SYSINFO.OCX"
Object = "{F9043C88-F6F2-101A-A3C9-08002B2F49FB}#1.2#0"; "COMDLG32.OCX"
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5520
   ClientLeft      =   165
   ClientTop       =   735
   ClientWidth     =   9810
   LinkTopic       =   "Form1"
   ScaleHeight     =   5520
   ScaleWidth      =   9810
   StartUpPosition =   3  'Windows Default
   Begin SysInfoLib.SysInfo SysInfo1 
      Left            =   1560
      Top             =   4560
      _ExtentX        =   1005
      _ExtentY        =   1005
      _Version        =   393216
   End
   Begin MSComDlg.CommonDialog CommonDialog1 
      Left            =   2760
      Top             =   4680
      _ExtentX        =   847
      _ExtentY        =   847
      _Version        =   393216
   End
   Begin MSComctlLib.ImageList ImageList1 
      Left            =   2160
      Top             =   4560
      _ExtentX        =   1005
      _ExtentY        =   1005
      BackColor       =   -2147483643
      MaskColor       =   12632256
      _Version        =   393216
   End
   Begin MSComctlLib.ListView ListView1 
      Height          =   5295
      Left            =   3480
      TabIndex        =   1
      Top             =   120
      Width           =   6255
      _ExtentX        =   11033
      _ExtentY        =   9340
      View            =   2
      Arrange         =   1
      MultiSelect     =   -1  'True
      LabelWrap       =   -1  'True
      HideSelection   =   -1  'True
      _Version        =   393217
      ForeColor       =   -2147483640
      BackColor       =   -2147483643
      BorderStyle     =   1
      Appearance      =   1
      NumItems        =   1
      BeginProperty ColumnHeader(1) {BDD1F052-858B-11D1-B16A-00C0F0283628} 
         Text            =   "Name"
         Object.Width           =   2540
      EndProperty
   End
   Begin MSComctlLib.TreeView TreeView1 
      Height          =   5295
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   3135
      _ExtentX        =   5530
      _ExtentY        =   9340
      _Version        =   393217
      HideSelection   =   0   'False
      LineStyle       =   1
      Sorted          =   -1  'True
      Style           =   7
      Appearance      =   1
   End
   Begin VB.Menu mnuFIle 
      Caption         =   "&File"
      Begin VB.Menu mnuNew 
         Caption         =   "New"
         Begin VB.Menu mnuFolder 
            Caption         =   "Folder"
         End
         Begin VB.Menu mnunFile 
            Caption         =   "File"
         End
         Begin VB.Menu mnuterm 
            Caption         =   "Terminal"
         End
      End
      Begin VB.Menu h1 
         Caption         =   "-"
      End
      Begin VB.Menu mnuExit 
         Caption         =   "&Exit"
      End
   End
   Begin VB.Menu mnuEdit 
      Caption         =   "&Edit"
      Begin VB.Menu mnuCut 
         Caption         =   "Cut"
      End
      Begin VB.Menu mnucopy 
         Caption         =   "Copy"
      End
      Begin VB.Menu mnuPaste 
         Caption         =   "Paste"
      End
      Begin VB.Menu h2 
         Caption         =   "-"
      End
      Begin VB.Menu mnuFind 
         Caption         =   "Find"
      End
      Begin VB.Menu mnuDelete 
         Caption         =   "Delete"
      End
   End
   Begin VB.Menu mnuTools 
      Caption         =   "&Tools"
      Begin VB.Menu mnuFormat 
         Caption         =   "Format"
      End
      Begin VB.Menu mnuPart 
         Caption         =   "Partition"
      End
      Begin VB.Menu mnuLinux 
         Caption         =   "Linux"
      End
      Begin VB.Menu mnuAt 
         Caption         =   "Edit Attributes"
      End
      Begin VB.Menu mnuControlPanel 
         Caption         =   "Control Panel"
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Form_Load()
    Dim DriveList As New FileSystemObject
        
    Set DrivesOnCom = DriveList.Drives
    For Each Drive In DrivesOnCom
        If Drive.IsReady Then
            TreeView1.Nodes.Add , tvwChild, Drive.RootFolder, Drive.RootFolder
        Else
            TreeView1.Nodes.Add , tvwChild, Drive.DriveLetter + ":", Drive.DriveLetter + ":\DRIVE NOT READY"
        End If
    Next
End Sub



Private Sub Form_Resize()
    On Error Resume Next
    If Me.Width < 3000 Then Me.Width = 3000
    SizeControls imgSplitter.Left
End Sub

Private Sub mnuFolder_Click()
    NewFolder = InputBox("Enter the path of the new directory.", "Enter New Path")
    MkDir NewFolder
End Sub

Private Sub mnunFile_Click()
    NewFileName = InputBox("Enter the full path of the new file.", "Enter Path")
    mkfile.CreateTextFile CStr(NewFileName)
End Sub

Private Sub TreeView1_NodeClick(ByVal Node As MSComctlLib.Node)
     Me.MousePointer = vbHourglass
     ListView1.ListItems.Clear
     
     Dim FileSYS, CurrentFolder, s, CFsub, AllFiles
     Dim EsubF As Folder
     Set FileSYS = CreateObject("Scripting.FileSystemObject")
     Set CurrentFolder = FileSYS.GetFolder(Node.Key)

     Set CFsub = CurrentFolder.SubFolders
     
     If CFsub.Count > 0 Then
          On Error Resume Next
          For Each EsubF In CFsub
               TreeView1.Nodes.Add Node.Key, tvwChild, EsubF.ShortPath, EsubF.Name
          Next
     End If
     
     Set AllFiles = CurrentFolder.Files
     If AllFiles.Count > 0 Then
          On Error Resume Next
          For Each fi In AllFiles
               ListView1.ListItems.Add , fi.ShortPath, fi.Name
          Next
     End If
     
     Me.MousePointer = vbDefault
     
End Sub

Sub SizeControls(x As Single)
    On Error Resume Next
    

    'set the width
    If x < 1500 Then x = 1500
    If x > (Me.Width - 1500) Then x = Me.Width - 1500
    TreeView1.Width = x
    ListView1.Left = x + 40
    ListView1.Width = Me.Width - (TreeView1.Width + 140)
    


    If tbToolBar.Visible Then
        tvTreeView.Top = tbToolBar.Height + picTitles.Height
    Else
        tvTreeView.Top = picTitles.Height
    End If

  lvListView.Top = tvTreeView.Top
    

    'set the height
    If sbStatusBar.Visible Then
        tvTreeView.Height = Me.ScaleHeight - (picTitles.Top + picTitles.Height + sbStatusBar.Height)
    Else
        tvTreeView.Height = Me.ScaleHeight - (picTitles.Top + picTitles.Height)
    End If
    

    ListView1.Height = TreeView1.Height
    
    
End Sub

