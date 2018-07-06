VERSION 4.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4185
   ClientLeft      =   1140
   ClientTop       =   1515
   ClientWidth     =   3900
   Height          =   4590
   Left            =   1080
   LinkTopic       =   "Form1"
   ScaleHeight     =   4185
   ScaleWidth      =   3900
   Top             =   1170
   Width           =   4020
   Begin VB.TextBox Text1 
      DragMode        =   1  'Automatic
      Height          =   285
      Left            =   120
      TabIndex        =   4
      Top             =   120
      Width           =   1695
   End
   Begin VB.Label Label1 
      Caption         =   "By: Paul Lyon"
      Height          =   255
      Left            =   2040
      TabIndex        =   5
      Top             =   120
      Width           =   1575
   End
   Begin VB.Label Label2 
      BorderStyle     =   1  'Fixed Single
      Height          =   1575
      Index           =   3
      Left            =   2040
      TabIndex        =   3
      Top             =   2400
      Width           =   1695
   End
   Begin VB.Label Label2 
      BorderStyle     =   1  'Fixed Single
      Height          =   1575
      Index           =   2
      Left            =   120
      TabIndex        =   2
      Top             =   2400
      Width           =   1695
   End
   Begin VB.Label Label2 
      BorderStyle     =   1  'Fixed Single
      Height          =   1575
      Index           =   1
      Left            =   2040
      TabIndex        =   1
      Top             =   600
      Width           =   1695
   End
   Begin VB.Label Label2 
      BorderStyle     =   1  'Fixed Single
      Height          =   1575
      Index           =   0
      Left            =   120
      TabIndex        =   0
      Top             =   600
      Width           =   1695
   End
End
Attribute VB_Name = "Form1"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Private Sub Command1_Click()
For Index = 0 To 3
    Label2(Index).Caption = ""
Next
End Sub


Private Sub Label2_DragDrop(Index As Integer, Source As Control, X As Single, Y As Single)
Label2(Index).Caption = ""
End Sub

Private Sub Label2_DragOver(Index As Integer, Source As Control, X As Single, Y As Single, State As Integer)
If State = 2 Then
    Label2(Index).Caption = Source.Text
Else
    Label2(Index).Caption = ""
End If
End Sub


