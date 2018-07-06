VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   2145
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   1635
   LinkTopic       =   "Form2"
   ScaleHeight     =   2145
   ScaleWidth      =   1635
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton cmdaver 
      Caption         =   "="
      Height          =   255
      Left            =   1080
      TabIndex        =   12
      Top             =   1680
      Width           =   375
   End
   Begin VB.CommandButton cmdpoints 
      Caption         =   "/"
      Height          =   255
      Left            =   120
      TabIndex        =   11
      Top             =   1680
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "0"
      Height          =   255
      Index           =   9
      Left            =   600
      TabIndex        =   10
      Top             =   1680
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "9"
      Height          =   255
      Index           =   8
      Left            =   1080
      TabIndex        =   9
      Top             =   600
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "8"
      Height          =   255
      Index           =   7
      Left            =   600
      TabIndex        =   8
      Top             =   600
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "7"
      Height          =   255
      Index           =   6
      Left            =   120
      TabIndex        =   7
      Top             =   600
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "6"
      Height          =   255
      Index           =   5
      Left            =   1080
      TabIndex        =   6
      Top             =   960
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "5"
      Height          =   255
      Index           =   4
      Left            =   600
      TabIndex        =   5
      Top             =   960
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "4"
      Height          =   255
      Index           =   3
      Left            =   120
      TabIndex        =   4
      Top             =   960
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "3"
      Height          =   255
      Index           =   2
      Left            =   1080
      TabIndex        =   3
      Top             =   1320
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "2"
      Height          =   255
      Index           =   1
      Left            =   600
      TabIndex        =   2
      Top             =   1320
      Width           =   375
   End
   Begin VB.CommandButton cmdDigets 
      Caption         =   "1"
      Height          =   255
      Index           =   0
      Left            =   120
      TabIndex        =   1
      Top             =   1320
      Width           =   375
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   1335
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub cmdDigets_Click(Index As Integer)
Select Case Index
    Case 9:
        Text1.Text = Text1.Text + 0
    Case 0:
        Text1.Text = Text1.Text + 1
    Case 1:
        Text1.Text = Text1.Text + 2
    Case 3:
        Text1.Text = Text1.Text + 3
End Sub

Private Sub Form_Load()

End Sub
