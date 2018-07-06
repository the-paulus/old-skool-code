VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   2475
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   2775
   LinkTopic       =   "Form1"
   ScaleHeight     =   2475
   ScaleWidth      =   2775
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command1 
      Caption         =   "Cost/Disk"
      Height          =   375
      Left            =   840
      TabIndex        =   8
      Top             =   1920
      Width           =   1215
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   1440
      TabIndex        =   7
      Top             =   1440
      Width           =   1215
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   1440
      TabIndex        =   4
      Top             =   1080
      Width           =   1215
   End
   Begin VB.Frame Frame1 
      Caption         =   "Disk Type: "
      Height          =   855
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   2535
      Begin VB.OptionButton Option2 
         Caption         =   "LD"
         Height          =   195
         Left            =   1680
         TabIndex        =   3
         Top             =   600
         Width           =   735
      End
      Begin VB.OptionButton Option1 
         Caption         =   "HD"
         Height          =   195
         Left            =   240
         TabIndex        =   2
         Top             =   600
         Width           =   830
      End
      Begin VB.ComboBox Combo1 
         Height          =   315
         Left            =   240
         TabIndex        =   1
         Text            =   "Combo1"
         Top             =   240
         Width           =   2055
      End
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Cost of Disks: "
      Height          =   195
      Left            =   120
      TabIndex        =   6
      Top             =   1560
      Width           =   1020
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Number of Disks: "
      Height          =   195
      Left            =   120
      TabIndex        =   5
      Top             =   1080
      Width           =   1260
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim price As Double
Dim disks As Integer

Private Sub Command1_Click()
price = Val(Text1.Text)
disk = Val(Text2.Text)
cost = price / disk
MsgBox "Each " & Combo1.Text & " costs " & Format(cost, "currency"), vbInformation, "Price Per Disk"
End Sub

Private Sub Form_Load()
Combo1.AddItem "Floppy 3.5"
Combo1.AddItem "Floppy 5.5"
Combo1.AddItem "Floppy 3.5"
Combo1.AddItem "CD-R"
Combo1.AddItem "CD-RW"
Combo1.AddItem "Zip100"
Combo1.AddItem "Zip250"
Combo1.AddItem "Super Disk"
Combo1.AddItem "Orb"
Combo1.AddItem "Tape"
End Sub

Private Sub Text1_Change()
If IsNumeric(Text1.Text) = True Then
Else
    If Text1.Text = "" Then
        Exit Sub
    End If
    Text1.Text = ""
    Text1.SetFocus
    MsgBox "Error: Invalid Data", vbCritical, "Error"
End If

End Sub

Private Sub Text2_Change()
If IsNumeric(Text2.Text) = True Then
Else
    If Text2.Text = "" Then
        Exit Sub
    End If
    Text2.Text = ""
    Text2.SetFocus
    MsgBox "Error: Invalid Data", vbCritical, "Error"
End If
End Sub
