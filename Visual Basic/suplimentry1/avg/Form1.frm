VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3225
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   2205
   LinkTopic       =   "Form1"
   ScaleHeight     =   3225
   ScaleWidth      =   2205
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   ".."
      Default         =   -1  'True
      Height          =   315
      Left            =   1800
      TabIndex        =   3
      Top             =   120
      Width           =   255
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Get Average"
      Height          =   375
      Left            =   120
      TabIndex        =   2
      Top             =   2760
      Width           =   1935
   End
   Begin VB.ListBox List1 
      Height          =   2205
      Left            =   120
      TabIndex        =   1
      Top             =   480
      Width           =   1935
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   1575
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If List1.ListCount <= 1 Then
    MsgBox "NOT ENOUGH DATA!!", vbCritical, "WARNING!"
Else
    For s = 0 To List1.ListCount
        TOTAL = TOTAL + Val(List1.List(s))
        Debug.Print TOTAL
     Next
     Avg = TOTAL / List1.ListCount
     MsgBox "The average of the " & List1.ListCount & " scores is " & Avg & ".", vbInformation, "Average"
End If
End Sub

Private Sub Command2_Click()
If IsNumeric(Text1.Text) = True Then
    List1.AddItem Text1.Text
    Text1.Text = ""
    Text1.SetFocus
Else
    Text1.Text = ""
    Text1.SetFocus
    MsgBox "Hey numbers only!", vbCritical, "!!!"
End If
End Sub

