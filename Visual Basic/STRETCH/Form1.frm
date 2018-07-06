VERSION 5.00
Begin VB.Form Form1 
   BorderStyle     =   4  'Fixed ToolWindow
   Caption         =   "Form1"
   ClientHeight    =   4365
   ClientLeft      =   45
   ClientTop       =   285
   ClientWidth     =   4515
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   4365
   ScaleWidth      =   4515
   ShowInTaskbar   =   0   'False
   StartUpPosition =   1  'CenterOwner
   Begin VB.VScrollBar VScroll1 
      Height          =   3975
      LargeChange     =   200
      Left            =   4200
      Max             =   3300
      Min             =   480
      TabIndex        =   1
      Top             =   120
      Value           =   480
      Width           =   255
   End
   Begin VB.HScrollBar HScroll1 
      Height          =   255
      LargeChange     =   200
      Left            =   0
      Max             =   3600
      Min             =   480
      TabIndex        =   0
      Top             =   4080
      Value           =   480
      Width           =   4215
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "By: Paul Lyon"
      Height          =   195
      Left            =   3120
      TabIndex        =   2
      Top             =   3720
      Width           =   975
   End
   Begin VB.Image Image1 
      Height          =   480
      Left            =   120
      Picture         =   "Form1.frx":0000
      Stretch         =   -1  'True
      Top             =   120
      Width           =   480
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Paul Lyon

Private Sub HScroll1_Change()
Image1.Width = HScroll1.Value
End Sub

Private Sub VScroll1_Change()
Image1.Height = VScroll1.Value
End Sub
