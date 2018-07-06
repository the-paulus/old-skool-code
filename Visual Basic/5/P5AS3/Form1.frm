VERSION 4.00
Begin VB.Form Form1 
   Caption         =   "Security Check"
   ClientHeight    =   1005
   ClientLeft      =   1485
   ClientTop       =   2250
   ClientWidth     =   3255
   Height          =   1410
   Left            =   1425
   LinkTopic       =   "Form1"
   ScaleHeight     =   1005
   ScaleWidth      =   3255
   Top             =   1905
   Width           =   3375
   Begin VB.Label Label1 
      Caption         =   "By: Paul Lyon"
      Height          =   255
      Left            =   1560
      TabIndex        =   0
      Top             =   600
      Width           =   1455
   End
End
Attribute VB_Name = "Form1"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Dim EnteredPassword As String
Private Sub Form_Load()
Do While ErrorCount < 3
    EnteredPassword = InputBox("Enter password.", "Enter Password")
    If EnteredPassword = "Microsuck" Then
        ConMsg = "Wow you hacked Microsoft, I don't see why you wasted your time.."
        MsgTitle = "YAY!"
        MsgBox ConMsg, vbExclamation, MsgTitle
        End
    Else
        ConMsg = "You call yourself a hacker?!"
        MsgTitle = "HAHA!"
        MsgBox ConMsg, vbExclamation, MsgTitle
        ErrorCount = ErrorCount + 1
        
        If ErrorCount > 3 Then
            End
        End If
    End If
Loop
End Sub


