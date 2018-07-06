VERSION 5.00
Object = "{248DD890-BB45-11CF-9ABC-0080C7E7B78D}#1.0#0"; "MSWINSCK.OCX"
Begin VB.Form frmClient 
   Caption         =   "TCP Client"
   ClientHeight    =   3195
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4680
   LinkTopic       =   "Form2"
   ScaleHeight     =   3195
   ScaleWidth      =   4680
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton cmdConnect 
      Caption         =   "Connect"
      Height          =   255
      Left            =   3120
      TabIndex        =   4
      Top             =   2760
      Width           =   1215
   End
   Begin VB.TextBox txtSendData 
      Height          =   855
      Left            =   120
      TabIndex        =   2
      Top             =   1800
      Width           =   4335
   End
   Begin VB.TextBox txtOutput 
      Height          =   975
      Left            =   120
      Locked          =   -1  'True
      TabIndex        =   0
      Top             =   360
      Width           =   4335
   End
   Begin MSWinsockLib.Winsock tcpClient 
      Left            =   2160
      Top             =   1440
      _ExtentX        =   741
      _ExtentY        =   741
      _Version        =   393216
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Data to be sent: "
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   120
      TabIndex        =   3
      Top             =   1560
      Width           =   1440
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Remote Data: "
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   225
      Left            =   120
      TabIndex        =   1
      Top             =   120
      Width           =   1290
   End
End
Attribute VB_Name = "frmClient"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub cmdConnect_Click()
tcpClient.Connect
End Sub

Private Sub Form_Load()
tcpClient.RemoteHost = tcpClient.LocalHostName
tcpClient.RemotePort = 1001
End Sub

Private Sub tcpClient_DataArrival(ByVal bytesTotal As Long)
Dim strData As String
tcpClient.GetData strData, vbString
txtOutput.Text = strData
End Sub

Private Sub txtSendData_Change()
tcpClient.SendData txtSendData.Text
End Sub
