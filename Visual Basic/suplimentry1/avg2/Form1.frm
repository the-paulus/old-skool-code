VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   1395
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   1395
   ScaleWidth      =   4680
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command1 
      Caption         =   "Calculate"
      Height          =   435
      Left            =   3360
      TabIndex        =   9
      Top             =   120
      Width           =   1215
   End
   Begin VB.TextBox Text6 
      Height          =   285
      Left            =   2400
      TabIndex        =   8
      Top             =   960
      Width           =   495
   End
   Begin VB.TextBox Text5 
      Height          =   285
      Left            =   1560
      TabIndex        =   6
      Top             =   960
      Width           =   495
   End
   Begin VB.TextBox Text4 
      Height          =   285
      Left            =   2760
      TabIndex        =   5
      Top             =   600
      Width           =   495
   End
   Begin VB.TextBox Text3 
      Height          =   285
      Left            =   1920
      TabIndex        =   3
      Top             =   600
      Width           =   495
   End
   Begin VB.TextBox Text2 
      Height          =   285
      Left            =   2400
      TabIndex        =   2
      Top             =   240
      Width           =   495
   End
   Begin VB.TextBox Text1 
      Height          =   285
      Left            =   1560
      TabIndex        =   0
      Top             =   240
      Width           =   495
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "Final Exame:            /"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   120
      TabIndex        =   7
      Top             =   960
      Width           =   2145
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "Second quarter:            /"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   120
      TabIndex        =   4
      Top             =   600
      Width           =   2490
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "First quarter:            /"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   120
      TabIndex        =   1
      Top             =   240
      Width           =   2130
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
NL = Chr(13) & Chr(10)
fq = Val(Text1.Text) / Val(Text2.Text)
sq = Val(Text3.Text) / Val(Text4.Text)
ex = Val(Text5.Text) / Val(Text6.Text)
If Text1.Text = "" Or IsNumeric(Text1.Text) = False Then
     MsgBox "Error in first quater", vbCritical, "Error"
     If Text3.Text = "" Or IsNumeric(Text3.Text) = False Then
          MsgBox "Error in first quater", vbCritical, "Error"
          If Text5.Text = "" Or IsNumeric(Text5.Text) = False Then
               MsgBox "Error in first quater", vbCritical, "Error"
          End If
     End If
Else
     MsgBox "The averages for:" & NL & NL & "First quarter: " & fq & NL & "Second quarter: " & sq & NL & "Exam: " & ex, vbInformation, "Resaults"
End If

End Sub

Private Sub Form_Load()

End Sub
