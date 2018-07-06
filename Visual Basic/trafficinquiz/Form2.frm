VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   1905
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4425
   LinkTopic       =   "Form2"
   ScaleHeight     =   1905
   ScaleWidth      =   4425
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Height          =   375
      Left            =   2640
      MaxLength       =   1
      TabIndex        =   5
      Top             =   1440
      Width           =   255
   End
   Begin VB.CommandButton Command3 
      Caption         =   "Cancel"
      Height          =   495
      Left            =   3120
      TabIndex        =   3
      Top             =   1320
      Width           =   1215
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Skip"
      Height          =   495
      Left            =   3120
      TabIndex        =   2
      Top             =   720
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Next"
      Height          =   495
      Left            =   3120
      TabIndex        =   1
      Top             =   120
      Width           =   1215
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Place your answer here: "
      Height          =   195
      Left            =   720
      TabIndex        =   4
      Top             =   1560
      Width           =   1755
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1215
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   2775
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Command1_Click()
If UCase(Text1.Text) = "C" Then
    Form2.Hide
    Form3.Show
    Form1.NC = Form1.NC + 1
    
Else
    MsgBox "Sorry, that is the wrong answer try again.", vbInformation, "Sorry!"
    Text1.Text = ""
    Text1.SetFocus
End If
End Sub

Private Sub Command2_Click()
Form2.Hide
Form3.Show
End Sub

Private Sub Command3_Click()
End
End Sub

Private Sub Form_Load()
NL = Chr(13) & Chr(10)
MANSWERS = "a. Stop" & NL & "b. Do not enter" & NL & "c. Slippery Road"
Label1.Caption = "Which sign has a diamond shape?" & NL & NL & MANSWERS

End Sub
