VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   960
   ClientLeft      =   1140
   ClientTop       =   1515
   ClientWidth     =   3210
   LinkTopic       =   "Form1"
   PaletteMode     =   1  'UseZOrder
   ScaleHeight     =   960
   ScaleWidth      =   3210
   Begin VB.CommandButton Command1 
      Caption         =   "Quiz By Paul Lyon"
      Height          =   495
      Left            =   720
      TabIndex        =   0
      Top             =   240
      Width           =   1695
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
'Tells the user the instructions
'defines the answers
Form2.Show
End Sub


