VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3195
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   3195
   ScaleWidth      =   4680
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text3 
      BackColor       =   &H8000000F&
      Height          =   285
      Left            =   120
      Locked          =   -1  'True
      TabIndex        =   8
      Top             =   2520
      Width           =   4335
   End
   Begin VB.OptionButton Option6 
      Caption         =   "Is equal"
      Height          =   255
      Left            =   1560
      TabIndex        =   7
      Top             =   2040
      Width           =   1575
   End
   Begin VB.OptionButton Option5 
      Caption         =   "Is less or equal "
      Height          =   255
      Left            =   1560
      TabIndex        =   6
      Top             =   1680
      Width           =   1575
   End
   Begin VB.OptionButton Option4 
      Caption         =   "Is less than"
      Height          =   255
      Left            =   1560
      TabIndex        =   5
      Top             =   1320
      Width           =   1575
   End
   Begin VB.OptionButton Option3 
      Caption         =   "Is not equal to"
      Height          =   255
      Left            =   1560
      TabIndex        =   4
      Top             =   960
      Width           =   1575
   End
   Begin VB.OptionButton Option2 
      Caption         =   "Is greater or equal"
      Height          =   255
      Left            =   1560
      TabIndex        =   3
      Top             =   600
      Width           =   1575
   End
   Begin VB.OptionButton Option1 
      Caption         =   "Is greater than"
      Height          =   255
      Left            =   1560
      TabIndex        =   2
      Top             =   240
      Width           =   1455
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   3240
      TabIndex        =   1
      Top             =   240
      Width           =   1215
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   120
      TabIndex        =   0
      Top             =   240
      Width           =   1215
   End
   Begin VB.Label Label1 
      Alignment       =   1  'Right Justify
      AutoSize        =   -1  'True
      Caption         =   "By Paul Lyon"
      Height          =   195
      Left            =   3360
      TabIndex        =   9
      Top             =   2880
      Width           =   930
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Paul Lyon

Private Sub Form_Load()
Val (Text1.Text)
Val (Text2.Text)
End Sub

Private Sub Option1_Click()
If Text1.Text > Text2.Text Then
    Text3.Text = "This statement is true"
Else
    Text3.Text = "This statement is FALSE!"
End If
End Sub

Private Sub Option2_Click()
If Text1.Text >= Text2.Text Then
    Text3.Text = "This statement is true"
Else
    Text3.Text = "This statement is FALSE!"
End If
End Sub

Private Sub Option3_Click()
If Text1.Text <> Text2.Text Then
    Text3.Text = "This statement is true"
Else
    Text3.Text = "This statement is FALSE!"
End If
End Sub

Private Sub Option4_Click()
If Text1.Text < Text2.Text Then
    Text3.Text = "This statement is true"
Else
    Text3.Text = "This statement is FALSE!"
End If
End Sub

Private Sub Option5_Click()
If Text1.Text <= Text2.Text Then
    Text3.Text = "This statement is true"
Else
    Text3.Text = "This statement is FALSE!"
End If
End Sub

Private Sub Option6_Click()
If Text1.Text = Text2.Text Then
    Text3.Text = "This statement is true"
Else
    Text3.Text = "This statement is FALSE!"
End If
End Sub
