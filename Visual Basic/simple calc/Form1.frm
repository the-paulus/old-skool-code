VERSION 5.00
Begin VB.Form Form1 
   BorderStyle     =   4  'Fixed ToolWindow
   Caption         =   "Form1"
   ClientHeight    =   2250
   ClientLeft      =   45
   ClientTop       =   285
   ClientWidth     =   3315
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   2250
   ScaleWidth      =   3315
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame Frame1 
      Caption         =   "Operators: "
      Height          =   1095
      Left            =   240
      TabIndex        =   5
      Top             =   600
      Width           =   2775
      Begin VB.OptionButton Option4 
         Caption         =   "/"
         Height          =   255
         Left            =   1560
         TabIndex        =   9
         Top             =   720
         Width           =   855
      End
      Begin VB.OptionButton Option3 
         Caption         =   "*"
         Height          =   195
         Left            =   1560
         TabIndex        =   8
         Top             =   360
         Width           =   855
      End
      Begin VB.OptionButton Option2 
         Caption         =   "-"
         Height          =   195
         Left            =   120
         TabIndex        =   7
         Top             =   720
         Width           =   855
      End
      Begin VB.OptionButton Option1 
         Caption         =   "+"
         Height          =   195
         Left            =   120
         TabIndex        =   6
         Top             =   360
         Width           =   855
      End
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   1440
      TabIndex        =   2
      Top             =   120
      Width           =   615
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   240
      TabIndex        =   0
      Top             =   120
      Width           =   615
   End
   Begin VB.Label Label4 
      Alignment       =   1  'Right Justify
      AutoSize        =   -1  'True
      Caption         =   "By Paul Lyon"
      Height          =   195
      Left            =   2160
      TabIndex        =   10
      Top             =   1920
      Width           =   930
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Height          =   195
      Left            =   2640
      TabIndex        =   4
      Top             =   120
      Width           =   45
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "="
      Height          =   195
      Left            =   2280
      TabIndex        =   3
      Top             =   120
      Width           =   90
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Height          =   195
      Left            =   1080
      TabIndex        =   1
      Top             =   120
      Width           =   45
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Paul Lyon

Dim num1 As Integer
Dim num2 As Integer

Private Sub Combo1_Change()

End Sub

Private Sub Option1_Click()
num1 = Text1.Text
num2 = Text2.Text
Label1.Caption = "+"
Label2.Caption = num1 + num2
End Sub

Private Sub Option2_Click()
num1 = Text1.Text
num2 = Text2.Text
Label1.Caption = "-"
Label2.Caption = num1 - num2
End Sub

Private Sub Option3_Click()
num1 = Text1.Text
num2 = Text2.Text
Label1.Caption = "*"
Label2.Caption = num1 * num2
End Sub

Private Sub Option4_Click()
num1 = Text1.Text
num2 = Text2.Text
Label1.Caption = "/"
Label2.Caption = num1 / num2
End Sub
