VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3210
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   2985
   LinkTopic       =   "Form1"
   ScaleHeight     =   3210
   ScaleWidth      =   2985
   StartUpPosition =   3  'Windows Default
   Begin VB.ListBox List1 
      BackColor       =   &H8000000F&
      Height          =   450
      Left            =   120
      TabIndex        =   6
      Top             =   1920
      Width           =   1215
   End
   Begin VB.ComboBox Combo1 
      BackColor       =   &H8000000F&
      Height          =   315
      Left            =   1560
      TabIndex        =   5
      Text            =   "Combo1"
      Top             =   1920
      Width           =   1215
   End
   Begin VB.OptionButton Option1 
      Caption         =   "Option"
      Height          =   495
      Left            =   1440
      TabIndex        =   4
      Top             =   1200
      Width           =   1215
   End
   Begin VB.CheckBox Check1 
      Caption         =   "CheckBox"
      Height          =   495
      Left            =   120
      TabIndex        =   3
      Top             =   1200
      Width           =   1215
   End
   Begin VB.Frame Frame1 
      Caption         =   "Frame1"
      Height          =   495
      Left            =   120
      TabIndex        =   2
      Top             =   2520
      Width           =   1215
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H8000000F&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1200
      TabIndex        =   1
      Text            =   "TextBox"
      Top             =   360
      Width           =   1215
   End
   Begin VB.Shape Shape1 
      Height          =   375
      Left            =   120
      Top             =   480
      Width           =   855
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Label"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   240
      TabIndex        =   0
      Top             =   480
      Width           =   690
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Check1_DragDrop(Source As Control, X As Single, Y As Single)
Check1.BackColor = Source.BackColor
End Sub

Private Sub Combo1_DragDrop(Source As Control, X As Single, Y As Single)
Combo1.BackColor = Source.BackColor
End Sub

Private Sub Form_DragDrop(Source As Control, X As Single, Y As Single)
Form1.BackColor = Source.BackColor
End Sub

Private Sub Form_Load()
Form2.Show
End Sub

Private Sub Frame1_DragDrop(Source As Control, X As Single, Y As Single)
Frame1.BackColor = Source.BackColor
End Sub

Private Sub Label1_DragDrop(Source As Control, X As Single, Y As Single)
Label1.BackColor = Source.BackColor
End Sub

Private Sub List1_DragDrop(Source As Control, X As Single, Y As Single)
List1.BackColor = Source.BackColor
End Sub

Private Sub Option1_DragDrop(Source As Control, X As Single, Y As Single)
Option1.BackColor = Source.BackColor
End Sub

Private Sub Text1_DragDrop(Source As Control, X As Single, Y As Single)
Text1.BackColor = Source.BackColor
End Sub
