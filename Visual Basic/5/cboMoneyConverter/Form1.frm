VERSION 4.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   1530
   ClientLeft      =   3255
   ClientTop       =   3540
   ClientWidth     =   1650
   Height          =   1935
   Left            =   3195
   LinkTopic       =   "Form1"
   ScaleHeight     =   1530
   ScaleWidth      =   1650
   Top             =   3195
   Width           =   1770
   Begin VB.TextBox txtCDollars 
      Height          =   285
      Left            =   840
      TabIndex        =   4
      Top             =   840
      Width           =   615
   End
   Begin VB.ComboBox cboMoney 
      Height          =   315
      ItemData        =   "Form1.frx":0000
      Left            =   120
      List            =   "Form1.frx":0002
      TabIndex        =   2
      Top             =   480
      Width           =   1335
   End
   Begin VB.TextBox txtDollars 
      Height          =   285
      Left            =   840
      TabIndex        =   0
      Top             =   120
      Width           =   615
   End
   Begin VB.Label Label3 
      Caption         =   "By: Paul Lyon"
      Height          =   255
      Left            =   480
      TabIndex        =   5
      Top             =   1200
      Width           =   1095
   End
   Begin VB.Label Label2 
      Caption         =   "Money: "
      Height          =   255
      Left            =   120
      TabIndex        =   3
      Top             =   840
      Width           =   615
   End
   Begin VB.Label Label1 
      Caption         =   "Dollars"
      Height          =   255
      Left            =   120
      TabIndex        =   1
      Top             =   120
      Width           =   615
   End
End
Attribute VB_Name = "Form1"
Attribute VB_Creatable = False
Attribute VB_Exposed = False
Private Sub cboMoney_Click()
'Get the index number from the combobox
itemindex = cboMoney.ItemData(cboMoney.ListIndex)
Select Case itemindex
Case Is = 0
    txtCDollars.Text = txtDollars.Text * 1.4543
Case Is = 1
    txtCDollars.Text = txtDollars.Text * 1.5754
End Select
End Sub


Private Sub Form_Load()
cboMoney.AddItem "Pounds", 0
cboMoney.AddItem "Guilders", 1
cboMoney.AddItem "Marks", 2
cboMoney.AddItem "Canadian Dollars", 3
End Sub


