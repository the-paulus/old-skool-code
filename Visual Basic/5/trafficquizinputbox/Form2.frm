VERSION 4.00
Begin VB.Form Form2 
   Caption         =   "Taffic Shape Quiz"
   ClientHeight    =   2160
   ClientLeft      =   3435
   ClientTop       =   1530
   ClientWidth     =   4500
   Height          =   2565
   Left            =   3375
   LinkTopic       =   "Form2"
   ScaleHeight     =   2160
   ScaleWidth      =   4500
   Top             =   1185
   Width           =   4620
   Begin VB.CommandButton Command4 
      Caption         =   "Start"
      Height          =   375
      Left            =   3120
      TabIndex        =   6
      Top             =   1560
      Width           =   1215
   End
   Begin VB.TextBox Text2 
      Height          =   1335
      Left            =   120
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   5
      Text            =   "Form2.frx":0000
      Top             =   120
      Width           =   2895
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   2040
      TabIndex        =   3
      Top             =   1680
      Width           =   1095
   End
   Begin VB.CommandButton Command3 
      Caption         =   "Stop Quiz"
      Height          =   375
      Left            =   3120
      TabIndex        =   2
      Top             =   1080
      Width           =   1215
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Skip"
      Height          =   375
      Left            =   3120
      TabIndex        =   1
      Top             =   600
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
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
      TabIndex        =   4
      Top             =   1680
      Width           =   1815
   End
End
Attribute VB_Name = "Form2"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Private Sub Command1_Click()
For QuesNum = 1 To 3
Response = text1.Text
Select Case QuesNum
Case Is = 1
    Do Until UCase(text1.Text) = "C"
        question = "1. Which sign has a diamond shape?" & NL & NL & answers
        CorrectAnswer = "C"
        text2.Text = ""
        text2.Text = inst1 & NL & inst2 & NL & question & NL & answers
        If UCase(text1.Text) = "C" Then
          QuesNum = QuesNum + 1
        Else
           tryagain = "Your response was incorrect. Please try again"
           MsgBox tryagain, , "Traffic Sign Shape Quiz"
           Exit Do
        End If
    Loop
Case Is = 2
    question = "2. Which sign has an octagonal shape?" & NL & NL & answers
    CorrectAnswer = "A"
    text2.Text = ""
    text2.Text = inst1 & NL & inst2 & NL & question & NL & answers
    If UCase(text1.Text) = "A" Then
        QuesNum = QuesNum + 1
    Else
        tryagain = "Your response was incorrect. Please try again"
        MsgBox tryagain, , "Traffic Sign Shape Quiz"
        Response = text1.Text
    End If
Case Is = 3
    question = "3. Which sign has a round shape?" & NL & NL & answers
    CorrectAnswer = "B"
    text2.Text = ""
    text2.Text = inst1 & NL & inst2 & NL & question & NL & answers
    If UCase(text1.Text) = "B" Then
        QuesNum = QuesNum + 1
    Else
        tryagain = "Your response was incorrect. Please try again"
        MsgBox tryagain, , "Traffic Sign Shape Quiz"
        Response = text1.Text
    End If
End Select
Next

'the questions
'For QuesNum = 1 To 3
'    Select Case QuesNum
'        Case Is = 1
'            question = "1. Which sign has a diamond shape?" & NL & NL & answers
'            CorrectAnswer = "C"
'        Case Is = 2
'            question = "2. Which sign has an octagonal shape?" & NL & NL & answers
'            CorrectAnswer = "A"
'        Case Is = 3
'            question = "3. Which sign has a round shape?" & NL & NL & answers
'            CorrectAnswer = "B"
'    End Select
    'defines the response
    
    'checks the answer
'    Do Until UCase(Response) = CorrectAnswer
'        tryagain = "Your response was incorrect. Please try again"
'        MsgBox tryagain, , "Traffic Sign Shape Quiz"
'        Response = text1.Text
'    Loop
'    QuesNum = QuesNum + 1
'Next
End Sub

Private Sub Form_Load()
NL = Chr$(13) & Chr$(10)
inst1 = "Type the letter of the correct response and click OK. "
inst2 = "Click Cancel to skip this question."
answers = "a. Stop" & NL & "b. Do not enter" & NL & "c. Slippery Road"
QuesNum = 1
Select Case QuesNum
    Case Is = 1
        question = "Which sign has a diamond shape?"
        CorrectAnswer = "C"
    Case Is = 2
        question = "Which sign has an octgonal shape?"
        CorrectAnswer = "A"
    Case Is = 3
        question = "Which sign has a round shape?"
        CorrectAnswer = "B"
End Select
text2.Text = inst1 & NL & inst2 & NL & question & NL & answers

End Sub


