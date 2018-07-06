VERSION 5.00
Begin VB.Form Form3 
   Caption         =   "Form3"
   ClientHeight    =   1860
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4365
   LinkTopic       =   "Form3"
   ScaleHeight     =   1860
   ScaleWidth      =   4365
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command1 
      Caption         =   "Next"
      Height          =   495
      Left            =   3000
      TabIndex        =   3
      Top             =   0
      Width           =   1215
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Skip"
      Height          =   495
      Left            =   3000
      TabIndex        =   2
      Top             =   600
      Width           =   1215
   End
   Begin VB.CommandButton Command3 
      Caption         =   "Cancel"
      Height          =   495
      Left            =   3000
      TabIndex        =   1
      Top             =   1200
      Width           =   1215
   End
   Begin VB.TextBox Text1 
      Height          =   375
      Left            =   2520
      MaxLength       =   1
      TabIndex        =   0
      Top             =   1320
      Width           =   255
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1215
      Left            =   0
      TabIndex        =   5
      Top             =   0
      Width           =   2775
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Place your answer here: "
      Height          =   195
      Left            =   600
      TabIndex        =   4
      Top             =   1440
      Width           =   1755
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If UCase(Text1.Text) = "A" Then
    Form3.Hide
    Form4.Show
    Form1.NC = Form1.NC + 1
    Debug.Print NC
Else
    MsgBox "Sorry, that is the wrong answer try again.", vbInformation, "Sorry!"
    Text1.Text = ""
    Text1.SetFocus
End If
End Sub

Private Sub Command2_Click()
Form3.Hide
Form4.Show
End Sub

Private Sub Command3_Click()
End
End Sub

Private Sub Form_Load()
NL = Chr(13) & Chr(10)
MANSWERS = "a. Stop" & NL & "b. Do not enter" & NL & "c. Slippery Road"
Label1.Caption = "Which sign has an octgonal shape?" & NL & NL & MANSWERS

End Sub

