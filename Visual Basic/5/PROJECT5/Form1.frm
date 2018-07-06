VERSION 4.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4590
   ClientLeft      =   2880
   ClientTop       =   3825
   ClientWidth     =   6960
   Height          =   5280
   Left            =   2820
   LinkTopic       =   "Form1"
   ScaleHeight     =   4590
   ScaleWidth      =   6960
   Top             =   3195
   Width           =   7080
   Begin VB.PictureBox Picture1 
      Height          =   480
      Index           =   1
      Left            =   6120
      ScaleHeight     =   420
      ScaleWidth      =   555
      TabIndex        =   10
      Top             =   2760
      Width           =   615
   End
   Begin VB.PictureBox Picture1 
      Height          =   480
      Index           =   3
      Left            =   3120
      ScaleHeight     =   420
      ScaleWidth      =   555
      TabIndex        =   9
      Top             =   2760
      Width           =   615
   End
   Begin VB.PictureBox Picture1 
      Height          =   480
      Index           =   4
      Left            =   1680
      ScaleHeight     =   420
      ScaleWidth      =   555
      TabIndex        =   8
      Top             =   2760
      Width           =   615
   End
   Begin VB.PictureBox Picture1 
      Height          =   480
      Index           =   0
      Left            =   4800
      ScaleHeight     =   420
      ScaleWidth      =   555
      TabIndex        =   7
      Top             =   2760
      Width           =   615
   End
   Begin VB.PictureBox Picture1 
      Height          =   480
      Index           =   2
      Left            =   240
      ScaleHeight     =   420
      ScaleWidth      =   555
      TabIndex        =   1
      Top             =   2760
      Width           =   615
   End
   Begin VB.Frame Frame1 
      Caption         =   "Drag and Drop The Signs Into The Correct Boxes: "
      Height          =   1335
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   6615
      Begin VB.Image Image1 
         DragIcon        =   "Form1.frx":0000
         Height          =   495
         Index           =   4
         Left            =   4560
         Picture         =   "Form1.frx":0442
         Stretch         =   -1  'True
         Top             =   480
         Width           =   495
      End
      Begin VB.Image Image1 
         DragIcon        =   "Form1.frx":0884
         Height          =   495
         Index           =   3
         Left            =   5880
         Picture         =   "Form1.frx":0CC6
         Stretch         =   -1  'True
         Top             =   480
         Width           =   495
      End
      Begin VB.Image Image1 
         DragIcon        =   "Form1.frx":1108
         Height          =   495
         Index           =   2
         Left            =   3120
         Picture         =   "Form1.frx":154A
         Stretch         =   -1  'True
         Top             =   480
         Width           =   495
      End
      Begin VB.Image Image1 
         DragIcon        =   "Form1.frx":198C
         Height          =   495
         Index           =   1
         Left            =   1560
         Picture         =   "Form1.frx":1DCE
         Stretch         =   -1  'True
         Top             =   480
         Width           =   495
      End
      Begin VB.Image Image1 
         DragIcon        =   "Form1.frx":2210
         Height          =   495
         Index           =   0
         Left            =   240
         MousePointer    =   2  'Cross
         Picture         =   "Form1.frx":2652
         Stretch         =   -1  'True
         Top             =   480
         Width           =   495
      End
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Do Not Enter"
      Height          =   195
      Index           =   4
      Left            =   5880
      TabIndex        =   6
      Top             =   3480
      Width           =   930
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Slippery Road"
      Height          =   195
      Index           =   3
      Left            =   4560
      TabIndex        =   5
      Top             =   3480
      Width           =   990
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Speed Limit"
      Height          =   195
      Index           =   2
      Left            =   3000
      TabIndex        =   4
      Top             =   3480
      Width           =   825
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Stop"
      Height          =   195
      Index           =   1
      Left            =   1800
      TabIndex        =   3
      Top             =   3480
      Width           =   330
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Divided Highway"
      Height          =   195
      Index           =   0
      Left            =   120
      TabIndex        =   2
      Top             =   3480
      Width           =   1200
   End
   Begin VB.Image Image3 
      Height          =   375
      Left            =   240
      Top             =   4080
      Visible         =   0   'False
      Width           =   1095
   End
   Begin VB.Image Image2 
      Height          =   495
      Left            =   2520
      Top             =   1680
      Width           =   1575
   End
   Begin VB.Menu mnuOption 
      Caption         =   "Option"
      Begin VB.Menu mnuClear 
         Caption         =   "&Clear"
      End
      Begin VB.Menu mnuShow 
         Caption         =   "&Show"
      End
      Begin VB.Menu mnuQuiz 
         Caption         =   "&Quiz"
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Dim NumCorrect As Integer

Private Sub Form_DragDrop(Source As Control, X As Single, Y As Single)
Source.Visible = True
End Sub

Private Sub Form_DragOver(Source As Control, X As Single, Y As Single, State As Integer)
Source.Visible = False

End Sub

Private Sub Form_Load()
Form1.Top = (Screen.Height - Form1.Height) / 2
Form1.Left = (Screen.Width - Form1.Width) / 2

For Index = 0 To 4
    Image1(Index).DragIcon = Image1(Index).Picture
Next
End Sub


Private Sub Image1_DragDrop(Index As Integer, Source As Control, X As Single, Y As Single)
Source.Visible = True
End Sub


Private Sub Image1_DragOver(Index As Integer, Source As Control, X As Single, Y As Single, State As Integer)
Source.Visible = True
End Sub


Private Sub Label1_DragDrop(Index As Integer, Source As Control, X As Single, Y As Single)
Source.Visible = True
End Sub


Private Sub mnuQuiz_Click()
NL = Chr$(13) & Chr$(10)
inst1 = "Type the letter of the correct response and click ok. "
inst2 = "Click Cancle to skip this question." & NL & NL

answers = "a. Stop" & NL & "b. Do not enter" & NL & "c. Slippery Road"

Form1.Hide

For QuesNum = 1 To 3
    Select Case QuesNum
        Case Is = 1
            question = "1. Which sign has a diamon shape?" & NL & NL & answers
            CorrectAnswer = "C"
        Case Is = 2
            question = "2. Which sign has a octagonal shape?" & NL & NL & answers
            CorrectAnswer = "A"
        Case Is = 3
            question = "3. Which sign has a round shape?" & NL & NL & answers
            CorrectAnswer = "B"
    End Select
    
    response = InputBox(inst1 & inst2 & question, "Traffic Sign Shape Quiz")
    Do Until UCase(response) = CorrectAnswer Or response = ""
        tryagain = "Your response was not correct. Please try again."
        MsgBox tryagain, , "Traffic Sign Shape Quiz"
        response = InputBox(inst1 & inst2 & question, "Traffic Sign Shape Quiz")
    Loop
Next

Form1.Show
End Sub

Private Sub mnuShow_Click()
For Index = 0 To 4
    Picture1(Index).Picture = Image1(Index).Picture
    Image1(Index).Visible = False
Next
End Sub

Private Sub Picture1_Click(Index As Integer)
If Source.Index = Picture1(Index) Then
    Picture1(Index).Picture = Source.Picture
    NumCorrect = NumCorrect + 1
    
    If try = 5 Then
        MsgBox "Sorry, you lose...", vbCritical, "Sorry!"
        'mnuClear_Click
    End If
Else
    Source.Visible = True
End If
End Sub


