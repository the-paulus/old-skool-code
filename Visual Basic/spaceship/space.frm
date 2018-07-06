VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Blast Off"
   ClientHeight    =   4020
   ClientLeft      =   2130
   ClientTop       =   1695
   ClientWidth     =   4110
   BeginProperty Font 
      Name            =   "MS Sans Serif"
      Size            =   8.25
      Charset         =   0
      Weight          =   700
      Underline       =   0   'False
      Italic          =   0   'False
      Strikethrough   =   0   'False
   EndProperty
   ForeColor       =   &H80000008&
   LinkTopic       =   "Form1"
   PaletteMode     =   1  'UseZOrder
   ScaleHeight     =   4020
   ScaleWidth      =   4110
   Begin VB.CommandButton Command2 
      Caption         =   "Down"
      Height          =   495
      Left            =   3240
      TabIndex        =   2
      Top             =   3120
      Width           =   855
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Up"
      Height          =   495
      Left            =   3240
      TabIndex        =   1
      Top             =   2520
      Width           =   855
   End
   Begin VB.PictureBox Picture1 
      AutoRedraw      =   -1  'True
      AutoSize        =   -1  'True
      Height          =   540
      Left            =   600
      Picture         =   "space.frx":0000
      ScaleHeight     =   480
      ScaleWidth      =   480
      TabIndex        =   0
      Top             =   1920
      Width           =   540
   End
   Begin VB.Label Label1 
      Alignment       =   1  'Right Justify
      Caption         =   "Paul Lyon"
      Height          =   255
      Left            =   2880
      TabIndex        =   3
      Top             =   3720
      Width           =   1215
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Picture1.Top = Picture1.Top - 50

End Sub

Private Sub Command2_Click()
Picture1.Top = Picture1.Top + 50
End Sub

