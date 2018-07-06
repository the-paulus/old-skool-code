VERSION 4.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   2295
   ClientLeft      =   4740
   ClientTop       =   4155
   ClientWidth     =   2475
   Height          =   2700
   Left            =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   2295
   ScaleWidth      =   2475
   Top             =   3810
   Width           =   2595
   Begin VB.CommandButton Command1 
      Caption         =   "Clear Form"
      Height          =   375
      Left            =   120
      TabIndex        =   5
      Top             =   1680
      Width           =   2175
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   1080
      TabIndex        =   4
      Top             =   1200
      Width           =   1215
   End
   Begin VB.ComboBox Combo1 
      Height          =   315
      ItemData        =   "Form1.frx":0000
      Left            =   120
      List            =   "Form1.frx":0002
      TabIndex        =   2
      Top             =   720
      Width           =   2175
   End
   Begin VB.TextBox Text1 
      Alignment       =   1  'Right Justify
      Height          =   285
      Left            =   1080
      TabIndex        =   0
      Top             =   240
      Width           =   1215
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Amount"
      Height          =   195
      Left            =   120
      TabIndex        =   3
      Top             =   1200
      Width           =   540
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Dollars:  "
      Height          =   195
      Left            =   120
      TabIndex        =   1
      Top             =   240
      Width           =   615
   End
End
Attribute VB_Name = "Form1"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Dim ComboText As String

Private Sub Combo1_Click()
If Combo1.Text = "Pounds" Then
        Text2.Text = Val(Text1.Text) * 1.492
If Combo1.Text = "Guilders" Then
        Text2.Text = Val(Text1.Text) * 1.625
If Combo1.Text = "Marks" Then
        Text2.Text = Val(Text1.Text) * 1.4506
If Combo1.Text = "Canadian Dollars" Then
        Text2.Text = Val(Text1.Text) * 1.3757
End If
End If
End If
End If
End Sub

Private Sub Combo1_DropDown()
If Text1.Text = "" Then
    MsgBox "You need to enter an amount to be converted!", , "Error!"
    Text1.SetFocus
End If
End Sub


Private Sub Command1_Click()
Text1.Text = ""
Text2.Text = ""
Combo1.Text = ""
End Sub

Private Sub Form_Load()
Combo1.AddItem "Pounds"
Combo1.AddItem "Guilders"
Combo1.AddItem "Marks"
Combo1.AddItem "Canadian Dollars"
End Sub


