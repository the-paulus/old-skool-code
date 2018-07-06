VERSION 5.00
Begin VB.Form Form1 
   BorderStyle     =   4  'Fixed ToolWindow
   ClientHeight    =   1770
   ClientLeft      =   45
   ClientTop       =   285
   ClientWidth     =   2955
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   1770
   ScaleWidth      =   2955
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox txtTotal 
      Height          =   285
      Left            =   1680
      Locked          =   -1  'True
      MousePointer    =   1  'Arrow
      TabIndex        =   5
      Top             =   1320
      Width           =   1215
   End
   Begin VB.TextBox txtTax 
      Height          =   285
      Left            =   1680
      Locked          =   -1  'True
      MousePointer    =   1  'Arrow
      TabIndex        =   3
      Top             =   600
      Width           =   1215
   End
   Begin VB.TextBox txtWasted 
      Height          =   285
      Left            =   1680
      Locked          =   -1  'True
      MousePointer    =   1  'Arrow
      TabIndex        =   1
      Top             =   120
      Width           =   1215
   End
   Begin VB.Label lblTotal 
      AutoSize        =   -1  'True
      Caption         =   "Total wasted: "
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
      TabIndex        =   4
      Top             =   1320
      Width           =   1245
   End
   Begin VB.Line Line1 
      X1              =   120
      X2              =   2880
      Y1              =   1080
      Y2              =   1080
   End
   Begin VB.Label lblTax 
      AutoSize        =   -1  'True
      Caption         =   "Sales tax: "
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
      TabIndex        =   2
      Top             =   600
      Width           =   915
   End
   Begin VB.Label lblWasted 
      AutoSize        =   -1  'True
      Caption         =   "Amount wasted: "
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
      TabIndex        =   0
      Top             =   120
      Width           =   1455
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim PRICE As Double
Dim SALESTAX As Double

Private Sub Form_Load()
    PRICE = InputBox("How much did you waste on that Micro$oft product?", "Amount wasted?")
    SALESTAX = InputBox("What was the sales tax?", "Tax?")
    
    txtWasted.Text = Format(PRICE, "currency")
    SALESTAX = 1 + (Val(SALESTAX) / 100)
    
    totaltax = (PRICE * SALESTAX) - PRICE
    Debug.Print totaltax
    
    
    txtTotal.Text = Format((PRICE * SALESTAX), "currency")
    txtTax.Text = Format(totaltax, "currency")
    txtWasted.Text = Format(PRICE, "currency")
End Sub



