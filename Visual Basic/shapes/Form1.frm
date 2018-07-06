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
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_MouseDown(Button As Integer, Shift As Integer, X As Single, Y As Single)
If Button = 1 Then
xstart = X
Ystart = Y
xprevious = xstart
yprevious = Ystart
Form1.DrawMode = 7
End If
End Sub

Private Sub Form_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
Select Case Shape
    Case "LINE":
        Form1.Line (xstart, Ystart)-(xprevious, yprevious)
        Form1.Line (xstart, Ystart)-(X, Y)
    Case "CIRCLE":
        Form1.Circle (xstart, Ystart), Sqr((xprevious - xstart) ^ 2 + (yprevious - Ystart) ^ 2)
        Form1.Circle (xstart, Ystart), Sqr((X - xstart) ^ 2 + (Y - Ystart) ^ 2)
    Case "BOX":
        Form1.Line (xstart, Ystart)-(xprevious, yprevious), , B
        Form1.Line (xstart, Ystart)-(X, Y), , B
End Select
xprevious = X
yprevious = Y
End Sub

Private Sub Form_MouseUp(Button As Integer, Shift As Integer, X As Single, Y As Single)
Form1.DrawMode = 13
Select Case Shape
    Case "line":
        Form1.Line (xstart, Ystart)-(X, Y)
    Case "circle":
        Form1.Circle (xstart, Ystart), Sqr((xprevious - xstart) ^ 2 + (yprevious - Ystart) ^ 2)
    Case "box":
        Form1.Line (xstart, Ystart)-(X, Y), , B
End Select
End Sub
