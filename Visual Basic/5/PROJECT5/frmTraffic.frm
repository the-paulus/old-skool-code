VERSION 5.00
Begin VB.Form frmTraffic 
   Caption         =   "Form1"
   ClientHeight    =   5985
   ClientLeft      =   2745
   ClientTop       =   2655
   ClientWidth     =   6690
   Icon            =   "frmTraffic.frx":0000
   LinkTopic       =   "Form1"
   PaletteMode     =   1  'UseZOrder
   ScaleHeight     =   5985
   ScaleWidth      =   6690
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Do Not Enter"
      Height          =   195
      Index           =   4
      Left            =   5520
      TabIndex        =   5
      Top             =   4560
      Width           =   930
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Slippery Road"
      Height          =   195
      Index           =   3
      Left            =   4200
      TabIndex        =   4
      Top             =   4560
      Width           =   990
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Speed Limit"
      Height          =   195
      Index           =   2
      Left            =   2880
      TabIndex        =   3
      Top             =   4560
      Width           =   825
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Stop"
      Height          =   195
      Index           =   1
      Left            =   1560
      TabIndex        =   2
      Top             =   4560
      Width           =   330
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Divided Highway"
      Height          =   195
      Index           =   0
      Left            =   240
      TabIndex        =   1
      Top             =   4560
      Width           =   1200
   End
   Begin VB.Image imgContainer 
      BorderStyle     =   1  'Fixed Single
      Height          =   480
      Index           =   4
      Left            =   5640
      Top             =   3960
      Width           =   480
   End
   Begin VB.Image imgContainer 
      BorderStyle     =   1  'Fixed Single
      Height          =   480
      Index           =   3
      Left            =   4320
      Top             =   3960
      Width           =   480
   End
   Begin VB.Image imgContainer 
      BorderStyle     =   1  'Fixed Single
      Height          =   480
      Index           =   2
      Left            =   3000
      Top             =   3960
      Width           =   480
   End
   Begin VB.Image imgContainer 
      BorderStyle     =   1  'Fixed Single
      Height          =   480
      Index           =   1
      Left            =   1680
      Top             =   3960
      Width           =   480
   End
   Begin VB.Image imgContainer 
      BorderStyle     =   1  'Fixed Single
      Height          =   480
      Index           =   0
      Left            =   360
      Top             =   3960
      Width           =   480
   End
   Begin VB.Image imgSign 
      DragIcon        =   "frmTraffic.frx":0442
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   4
      Left            =   5520
      Picture         =   "frmTraffic.frx":0884
      Top             =   960
      Width           =   480
   End
   Begin VB.Image imgSign 
      DragIcon        =   "frmTraffic.frx":0CC6
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   3
      Left            =   4200
      Picture         =   "frmTraffic.frx":1108
      Top             =   960
      Width           =   480
   End
   Begin VB.Image imgSign 
      DragIcon        =   "frmTraffic.frx":154A
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   2
      Left            =   2880
      Picture         =   "frmTraffic.frx":198C
      Top             =   960
      Width           =   480
   End
   Begin VB.Image imgSign 
      DragIcon        =   "frmTraffic.frx":1DCE
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   1
      Left            =   1560
      Picture         =   "frmTraffic.frx":2210
      Top             =   960
      Width           =   480
   End
   Begin VB.Image imgSign 
      DragIcon        =   "frmTraffic.frx":2652
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   0
      Left            =   240
      Picture         =   "frmTraffic.frx":2A94
      Top             =   960
      Width           =   480
   End
   Begin VB.Image imgBlank 
      Height          =   495
      Left            =   360
      Top             =   5400
      Visible         =   0   'False
      Width           =   1215
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BorderStyle     =   1  'Fixed Single
      Caption         =   "Drag and drop the signs into the correct boxes."
      Height          =   255
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   6375
   End
   Begin VB.Shape Shape1 
      Height          =   1815
      Left            =   120
      Top             =   480
      Width           =   6375
   End
   Begin VB.Menu mnuOptions 
      Caption         =   "&Options"
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
Attribute VB_Name = "frmTraffic"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Project 5
'By: Paul Lyon
'
'This file is NOT intended to copy. This will only be used as
'a reference. I can NOT be held responsable if you are caught
'copying this program. By accepting this you agree to these
'Terms!

'Declare variables
Dim NumberCorrect As Integer

Private Sub Form_DragDrop(Source As Control, X As Single, Y As Single)
'When droped the image will be visible
Source.Visible = True
End Sub

Private Sub Form_DragOver(Source As Control, X As Single, Y As Single, State As Integer)
'when the image is taken from its orignial location it is invisible
Source.Visible = False
End Sub

Private Sub Form_Load()
'centers the form
frmTraffic.Top = (Screen.Height - frmTraffic.Height) / 2
frmTraffic.Left = (Screen.Width - frmTraffic.Width) / 2

'sets the image drag icon to the picture in the image box
For Index = 0 To 4
    imgSign(0).DragIcon = imgSign(0).Picture
Next
End Sub

Private Sub imgContainer_DragDrop(Index As Integer, Source As Control, X As Single, Y As Single)
If Source.Index = Index Then 'checks if the index of the image being draged is equal to the image box's index
    'sets the image container pic to the source picture
    imgContainer(Index).Picture = Source.Picture
    NumberCorrect = NumberCorrect + 1
    If NumberCorrect = 5 Then
        MsgBox "Well Done", 48, "Traffic Signs"
        mnuClear_Click
    End If
Else
    'resets the image
    Source.Visible = True
End If
End Sub


Private Sub imgSign_DragDrop(Index As Integer, Source As Control, X As Single, Y As Single)
'resets the image
Source.Visible = True
End Sub


Private Sub Label2_DragDrop(Index As Integer, Source As Control, X As Single, Y As Single)
Source.Visible = True
End Sub


Private Sub mnuClear_Click()
'clears the image boxes
For Index = 0 To 4
    imgContainer(Index).Picture = imgBlank.Picture
    imgSign(Index).Visible = True
Next
'sets NumberCorrect to 0
NumberCorrect = 0
End Sub


Private Sub mnuQuiz_Click()
NL = Chr$(13) & Chr$(10)
'Tells the user the instructions
inst1 = "Type the letter of the correct response and click OK. "
inst2 = "Click Cancel to skip this question." & NL & NL
'defines the answers
answers = "a. Stop" & NL & "b. Do not enter" & NL & "c. Slippery Road"
'hides the form when quizing
frmTraffic.Hide
'the questions
For QuesNum = 1 To 3
    Select Case QuesNum
        Case Is = 1
            question = "1. Which sign has a diamond shape?" & NL & NL & answers
            CorrectAnswer = "C"
        Case Is = 2
            question = "2. Which sign has an octagonal shape?" & NL & NL & answers
            CorrectAnswer = "A"
        Case Is = 3
            question = "3. Which sign has a round shape?" & NL & NL & answers
            CorrectAnswer = "B"
    End Select
    'defines the response
    Response = InputBox(inst1 & inst2 & question, "Traffic Sign Shape Quiz")
    'checks the answer
    Do Until UCase(Response) = CorrectAnswer Or Repsonse = ""
        tryagain = "Your response was incorrect. Please try again"
        MsgBox tryagain, , "Traffic Sign Shape Quiz"
        Response = InputBox(inst1 & inst2 & question, "Traffic Sign Shape Quiz")
    Loop
Next
'shows the form when done
frmTraffic.Show
End Sub

Private Sub mnuShow_Click()
'displays the answers
For Index = 0 To 4
    imgContainer(Index).Picture = imgSign(Index).Picture
    imgSign(Index).Visible = False
Next
End Sub


