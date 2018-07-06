VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3570
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   2010
   LinkTopic       =   "Form1"
   ScaleHeight     =   3570
   ScaleWidth      =   2010
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame Frame3 
      Caption         =   "Average: "
      Height          =   975
      Left            =   120
      TabIndex        =   8
      Top             =   2400
      Width           =   1695
      Begin VB.CommandButton Command6 
         Caption         =   "Clear All"
         Height          =   255
         Left            =   840
         TabIndex        =   11
         Top             =   600
         Width           =   735
      End
      Begin VB.CommandButton Command5 
         Caption         =   "Update"
         Height          =   255
         Left            =   120
         TabIndex        =   10
         Top             =   600
         Width           =   735
      End
      Begin VB.Label Label1 
         BorderStyle     =   1  'Fixed Single
         Height          =   255
         Left            =   120
         TabIndex        =   9
         Top             =   240
         Width           =   1455
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "Veiw: "
      Height          =   975
      Left            =   120
      TabIndex        =   3
      Top             =   1320
      Width           =   1695
      Begin VB.CommandButton Command4 
         Caption         =   "Delete"
         Height          =   255
         Left            =   840
         TabIndex        =   7
         Top             =   600
         Width           =   735
      End
      Begin VB.CommandButton Command3 
         Caption         =   "Edit"
         Height          =   255
         Left            =   120
         TabIndex        =   6
         Top             =   600
         Width           =   735
      End
      Begin VB.ComboBox Combo1 
         Height          =   315
         Left            =   120
         TabIndex        =   4
         Top             =   240
         Width           =   1455
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "Editing: "
      Height          =   1095
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   1695
      Begin VB.CommandButton Command2 
         Caption         =   "End"
         Height          =   255
         Left            =   840
         TabIndex        =   5
         Top             =   720
         Width           =   735
      End
      Begin VB.CommandButton Command1 
         Caption         =   "Add"
         Height          =   255
         Left            =   120
         TabIndex        =   2
         Top             =   720
         Width           =   735
      End
      Begin VB.TextBox Text1 
         Height          =   285
         Left            =   120
         TabIndex        =   1
         Top             =   360
         Width           =   1455
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim s As Integer
Combo1.AddItem Text1.Text
s = s + 1
End Sub

Private Sub Command2_Click()
End
End Sub

Private Sub Command3_Click()
Combo1.Text
End Sub
