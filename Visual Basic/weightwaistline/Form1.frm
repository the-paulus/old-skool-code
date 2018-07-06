VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3195
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   2490
   LinkTopic       =   "Form1"
   ScaleHeight     =   3195
   ScaleWidth      =   2490
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text5 
      Height          =   285
      Left            =   1080
      Locked          =   -1  'True
      TabIndex        =   11
      Top             =   2280
      Width           =   1215
   End
   Begin VB.TextBox Text4 
      Height          =   285
      Left            =   1080
      Locked          =   -1  'True
      TabIndex        =   10
      Top             =   1920
      Width           =   1215
   End
   Begin VB.TextBox Text3 
      Height          =   285
      Left            =   1080
      Locked          =   -1  'True
      TabIndex        =   9
      Top             =   1560
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Calculate"
      Height          =   375
      Left            =   120
      TabIndex        =   4
      Top             =   960
      Width           =   2175
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   1080
      TabIndex        =   3
      Top             =   480
      Width           =   1215
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   1080
      TabIndex        =   1
      Top             =   120
      Width           =   1215
   End
   Begin VB.Label Label6 
      AutoSize        =   -1  'True
      Caption         =   "By Paul Lyon"
      Height          =   195
      Left            =   1320
      TabIndex        =   8
      Top             =   2880
      Width           =   930
   End
   Begin VB.Label Label5 
      AutoSize        =   -1  'True
      Caption         =   "Shoe Size: "
      Height          =   195
      Left            =   120
      TabIndex        =   7
      Top             =   2280
      Width           =   810
   End
   Begin VB.Label Label4 
      AutoSize        =   -1  'True
      Caption         =   "Hat Size: "
      Height          =   195
      Left            =   120
      TabIndex        =   6
      Top             =   1920
      Width           =   690
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "Necksize: "
      Height          =   195
      Left            =   120
      TabIndex        =   5
      Top             =   1560
      Width           =   750
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "WaistLine: "
      Height          =   195
      Left            =   120
      TabIndex        =   2
      Top             =   600
      Width           =   795
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "Weight: "
      Height          =   195
      Left            =   120
      TabIndex        =   0
      Top             =   240
      Width           =   600
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Paul Lyon

Private Sub Command1_Click()
If IsNumeric(Text1.Text) = False And IsNumeric(Text2.Text) = False Then
    MsgBox "Hey numbers only buddy!", vbExclamation, "NUMBERS!"
Else
    Text3.Text = 3 * (Val(Text1.Text) / Val(Text2.Text))
    Text4.Text = (3 * Val(Text1.Text)) / (2.125 * Val(Text2.Text))
    Text5.Text = 50 * (Val(Text2.Text) / Val(Text1.Text))
End If
End Sub
