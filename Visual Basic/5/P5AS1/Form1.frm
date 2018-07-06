VERSION 4.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5490
   ClientLeft      =   1140
   ClientTop       =   1515
   ClientWidth     =   2325
   Height          =   5895
   Left            =   1080
   LinkTopic       =   "Form1"
   ScaleHeight     =   5490
   ScaleWidth      =   2325
   Top             =   1170
   Width           =   2445
   Begin VB.Frame Frame3 
      Caption         =   "Team 2: "
      Height          =   1935
      Left            =   120
      TabIndex        =   3
      Top             =   3000
      Width           =   2055
      Begin VB.ListBox List2 
         Height          =   1425
         Left            =   120
         TabIndex        =   6
         Top             =   360
         Width           =   1815
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "Team 1: "
      Height          =   1815
      Left            =   120
      TabIndex        =   2
      Top             =   1080
      Width           =   2055
      Begin VB.ListBox List1 
         Height          =   1230
         Left            =   120
         TabIndex        =   5
         Top             =   360
         Width           =   1815
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "New Player: "
      Height          =   615
      Left            =   120
      TabIndex        =   0
      Top             =   240
      Width           =   2055
      Begin VB.TextBox Text1 
         DragMode        =   1  'Automatic
         Height          =   285
         Left            =   120
         TabIndex        =   1
         Text            =   "Text1"
         Top             =   240
         Width           =   1695
      End
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "By: Paul Lyon"
      Height          =   195
      Left            =   720
      TabIndex        =   4
      Top             =   5160
      Width           =   975
   End
End
Attribute VB_Name = "Form1"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Private Sub List1_DragDrop(Source As Control, X As Single, Y As Single)
List1.AddItem Source.Text
End Sub


Private Sub List2_Click()
List2.AddItem Source.Text
End Sub


Private Sub List2_DragDrop(Source As Control, X As Single, Y As Single)
List2.AddItem Source.Text
End Sub


