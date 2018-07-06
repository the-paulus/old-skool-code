VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4485
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   3795
   LinkTopic       =   "Form1"
   ScaleHeight     =   4485
   ScaleWidth      =   3795
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame Frame3 
      Caption         =   "Style: "
      Height          =   1455
      Left            =   2160
      TabIndex        =   2
      Top             =   2640
      Width           =   1455
      Begin VB.OptionButton Option6 
         Caption         =   "Dot"
         Height          =   255
         Left            =   120
         TabIndex        =   8
         Top             =   960
         Width           =   1215
      End
      Begin VB.OptionButton Option5 
         Caption         =   "Dash"
         Height          =   255
         Left            =   120
         TabIndex        =   7
         Top             =   600
         Width           =   1215
      End
      Begin VB.OptionButton Option4 
         Caption         =   "Solid"
         Height          =   255
         Left            =   120
         TabIndex        =   6
         Top             =   240
         Width           =   1215
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "Shape: "
      Height          =   1455
      Left            =   120
      TabIndex        =   1
      Top             =   2640
      Width           =   1455
      Begin VB.OptionButton Option3 
         Caption         =   "Oval"
         Height          =   255
         Left            =   120
         TabIndex        =   5
         Top             =   960
         Width           =   1215
      End
      Begin VB.OptionButton Option2 
         Caption         =   "Circle"
         Height          =   255
         Left            =   120
         TabIndex        =   4
         Top             =   600
         Width           =   1215
      End
      Begin VB.OptionButton Option1 
         Caption         =   "Rectangle"
         Height          =   255
         Left            =   120
         TabIndex        =   3
         Top             =   240
         Width           =   1095
      End
   End
   Begin VB.Frame Frame1 
      Height          =   2295
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   3495
      Begin VB.Shape Shape1 
         Height          =   1695
         Left            =   480
         Top             =   360
         Width           =   2535
      End
   End
   Begin VB.Label Label1 
      Alignment       =   1  'Right Justify
      Caption         =   "By: Paul Lyon"
      Height          =   255
      Left            =   2520
      TabIndex        =   9
      Top             =   4200
      Width           =   1095
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Paul Lyon

Private Sub Form_Load()

End Sub

Private Sub Option1_Click()
Shape1.Shape = 0
End Sub

Private Sub Option2_Click()
Shape1.Shape = 3
End Sub

Private Sub Option3_Click()
Shape1.Shape = 2
End Sub

Private Sub Option4_Click()
Shape1.BorderStyle = 1
End Sub

Private Sub Option5_Click()
Shape1.BorderStyle = 2
End Sub

Private Sub Option6_Click()
Shape1.BorderStyle = 3
End Sub
