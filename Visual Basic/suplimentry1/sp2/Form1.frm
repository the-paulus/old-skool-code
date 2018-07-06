VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   2235
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   2835
   LinkTopic       =   "Form1"
   ScaleHeight     =   2235
   ScaleWidth      =   2835
   StartUpPosition =   3  'Windows Default
   Begin VB.VScrollBar VScroll3 
      Height          =   855
      Left            =   2040
      Max             =   255
      TabIndex        =   10
      Top             =   840
      Width           =   255
   End
   Begin VB.VScrollBar VScroll2 
      Height          =   855
      Left            =   1800
      Max             =   255
      TabIndex        =   9
      Top             =   840
      Width           =   255
   End
   Begin VB.VScrollBar VScroll1 
      Height          =   855
      Left            =   1560
      Max             =   255
      TabIndex        =   8
      Top             =   840
      Width           =   255
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   1440
      TabIndex        =   2
      Top             =   120
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Calculate"
      Height          =   255
      Left            =   120
      TabIndex        =   1
      Top             =   1320
      Width           =   1215
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   1440
      TabIndex        =   0
      Top             =   480
      Width           =   1215
   End
   Begin VB.Label Label6 
      Caption         =   "R    G   B"
      Height          =   255
      Left            =   1560
      TabIndex        =   11
      Top             =   1800
      Width           =   735
   End
   Begin VB.Label Label5 
      Height          =   855
      Left            =   2400
      TabIndex        =   7
      Top             =   840
      Width           =   255
   End
   Begin VB.Label Label1 
      Caption         =   "Number of Yards:"
      Height          =   255
      Left            =   120
      TabIndex        =   6
      Top             =   120
      Width           =   1455
   End
   Begin VB.Label Label3 
      Alignment       =   1  'Right Justify
      AutoSize        =   -1  'True
      Caption         =   "Paul Lyon"
      Height          =   195
      Left            =   480
      TabIndex        =   5
      Top             =   1680
      Width           =   705
   End
   Begin VB.Label Label4 
      Caption         =   "Cost per yard:"
      Height          =   255
      Left            =   120
      TabIndex        =   4
      Top             =   480
      Width           =   1455
   End
   Begin VB.Label Label2 
      Caption         =   "Color"
      Height          =   255
      Left            =   120
      TabIndex        =   3
      Top             =   840
      Width           =   1335
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub VScroll1_Change()
Label5.BackColor = RGB(VScroll1.Value, VScroll2.Value, VScroll3.Value)
End Sub

Private Sub VScroll2_Change()
Label5.BackColor = RGB(VScroll1.Value, VScroll2.Value, VScroll3.Value)
End Sub

Private Sub VScroll3_Change()
Label5.BackColor = RGB(VScroll1.Value, VScroll2.Value, VScroll3.Value)
End Sub
