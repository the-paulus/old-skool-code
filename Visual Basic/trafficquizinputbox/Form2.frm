VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Taffic Shape Quiz"
   ClientHeight    =   2160
   ClientLeft      =   3435
   ClientTop       =   1530
   ClientWidth     =   4500
   LinkTopic       =   "Form2"
   PaletteMode     =   1  'UseZOrder
   ScaleHeight     =   2160
   ScaleWidth      =   4500
   Begin VB.TextBox txtQuestion 
      Height          =   1335
      Left            =   120
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   4
      Text            =   "Form2.frx":0000
      Top             =   120
      Width           =   2895
   End
   Begin VB.TextBox txtAnswer 
      Height          =   285
      Left            =   2040
      TabIndex        =   2
      Top             =   1680
      Width           =   1095
   End
   Begin VB.CommandButton cmdStop 
      Caption         =   "Stop Quiz"
      Height          =   375
      Left            =   3120
      TabIndex        =   1
      Top             =   600
      Width           =   1215
   End
   Begin VB.CommandButton cmdAccept 
      Caption         =   "Accept"
      Height          =   375
      Left            =   3120
      TabIndex        =   0
      Top             =   120
      Width           =   1215
   End
   Begin VB.Label Label2 
      Caption         =   "Place your answer here:"
      Height          =   255
      Left            =   120
      TabIndex        =   3
      Top             =   1680
      Width           =   1815
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub cmdAccept_Click()
Select Case QuestionNum
Case 0
    If UCase(txtAnswer.Text) = "C" Then
        QuestionNum = QuestionNum + 1
        txtQuestion.Text = ""
        txtQuestion.Text = inst & DS & "2. Which sign has an octonal shape?" & DS & Answers
        score = score + 1
    Else
        MsgBox "Sorry, that's the wrong answer.", vbCritical, "Sorry"
        txtAnswer.Text = ""
        txtAnswer.SetFocus
    End If
Case 1
    If UCase(txtAnswer.Text) = "A" Then
        QuestionNum = QuestionNum + 1
        txtQuestion.Text = ""
        txtQuestion.Text = inst & DS & "3. Which sign has a round shape?" & DS & Answers
        score = score + 1
    Else
        MsgBox "Sorry, that's the wrong answer.", vbCritical, "Sorry"
        txtAnswer.Text = ""
        txtAnswer.SetFocus
    End If
End Select
End Sub

Private Sub cmdStop_Click()
End
End Sub

Private Sub Form_Load()
NL = Chr$(13) & Chr$(10)
DS = Chr$(13) & Chr$(10) & Chr$(13) & Chr$(10)
inst = "Enter the correct answer, if you do not know it then click the skip button."
Answers = "a. Stop" & NL & "b. Do not enter" & NL & "c. Slippery Road"
txtQuestion.Text = inst & DS & "1. Which sign has a diamond shape?" & DS & Answers
QuestionNum = 0
End Sub


