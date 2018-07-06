VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   2370
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   1995
   LinkTopic       =   "Form2"
   ScaleHeight     =   2370
   ScaleWidth      =   1995
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   "Reset"
      Height          =   255
      Left            =   120
      TabIndex        =   9
      Top             =   1920
      Width           =   1695
   End
   Begin VB.Label Label1 
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   8
      Left            =   1320
      TabIndex        =   8
      Top             =   1320
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H00FF00FF&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   7
      Left            =   720
      TabIndex        =   7
      Top             =   1320
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H00FF0000&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   6
      Left            =   120
      TabIndex        =   6
      Top             =   1320
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H0000FF00&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   5
      Left            =   1320
      TabIndex        =   5
      Top             =   720
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H0000FFFF&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   4
      Left            =   720
      TabIndex        =   4
      Top             =   720
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H000080FF&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   3
      Left            =   120
      TabIndex        =   3
      Top             =   720
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H000000FF&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   2
      Left            =   1320
      TabIndex        =   2
      Top             =   120
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H00000000&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   1
      Left            =   720
      TabIndex        =   1
      Top             =   120
      Width           =   480
   End
   Begin VB.Label Label1 
      BackColor       =   &H00FFFFFF&
      DragMode        =   1  'Automatic
      Height          =   480
      Index           =   0
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   480
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Label1(8).BackColor = &H8000000F
End Sub

Private Sub Command2_Click()
Form1.Label1.BackColor = &H8000000F
Form1.Text1.BackColor = &H8000000F
Form1.Check1.BackColor = &H8000000F
Form1.Option1.BackColor = &H8000000F
Form1.List1.BackColor = &H8000000F
Form1.Combo1.BackColor = &H8000000F
Form1.Frame1.BackColor = &H8000000F
Form1.BackColor = &H8000000F
End Sub

