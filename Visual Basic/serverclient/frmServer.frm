VERSION 5.00
Object = "{248DD890-BB45-11CF-9ABC-0080C7E7B78D}#1.0#0"; "MSWINSCK.OCX"
Begin VB.Form frmServer 
   Caption         =   "TCP Server"
   ClientHeight    =   2760
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   2760
   ScaleWidth      =   4680
   StartUpPosition =   3  'Windows Default
   Begin MSWinsockLib.Winsock tcpServer 
      Left            =   2160
      Top             =   1200
      _ExtentX        =   741
      _ExtentY        =   741
      _Version        =   393216
   End
   Begin VB.TextBox txtOutput 
      Height          =   1335
      Left            =   120
      TabIndex        =   1
      Text            =   "Text2"
      Top             =   1320
      Width           =   4335
   End
   Begin VB.TextBox txtSendData 
      Height          =   1095
      Left            =   120
      TabIndex        =   0
      Text            =   "Text1"
      Top             =   120
      Width           =   4335
   End
End
Attribute VB_Name = "frmServer"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
    tcpServer.LocalPort = 1001
    tcpServer.Listen
    'frmClient.Show
End Sub
Private Sub tcpServer_ConnectionRequest(ByVal requestID As Long)
If tcpServer.State <> sckClosed Then
    tcpServer.Close
    parameter.tcpServer.Accept requestID
End Sub

Private Sub txtSendData_Change()
tcpServer.SendData txtSendData.Text
End Sub

Private Sub tcpServer_DataArrival(ByVal bytesTotal As Long)
tcpServer.GetData Str
DatatxtOutput.Text = strData
End Sub

