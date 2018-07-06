' *************************************
' Lab 4 Assignment Part 2
' Working With Arrays, Sorting and Binary Search
'
' Jacob Thornberry
' February 3, 2004
' *************************************

Option Strict On
Option Explicit On 

Public Class frmMain
    Inherits System.Windows.Forms.Form

#Region " Windows Form Designer generated code "

    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub

    'Form overrides dispose to clean up the component list.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents lblTitle As System.Windows.Forms.Label
    Friend WithEvents btnDisArray1 As System.Windows.Forms.Button
    Friend WithEvents btnDisArray2 As System.Windows.Forms.Button
    Friend WithEvents btnDisArray3 As System.Windows.Forms.Button
    Friend WithEvents btnAppend13 As System.Windows.Forms.Button
    Friend WithEvents btnAppend23 As System.Windows.Forms.Button
    Friend WithEvents btnSort As System.Windows.Forms.Button
    Friend WithEvents btnFind As System.Windows.Forms.Button
    Friend WithEvents btnCreate As System.Windows.Forms.Button
    Friend WithEvents txtArray As System.Windows.Forms.TextBox
    Friend WithEvents txtResults As System.Windows.Forms.TextBox
    Friend WithEvents txtFind As System.Windows.Forms.TextBox
    Friend WithEvents lblArea As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblTitle = New System.Windows.Forms.Label
        Me.btnDisArray1 = New System.Windows.Forms.Button
        Me.btnDisArray2 = New System.Windows.Forms.Button
        Me.btnDisArray3 = New System.Windows.Forms.Button
        Me.btnAppend13 = New System.Windows.Forms.Button
        Me.btnAppend23 = New System.Windows.Forms.Button
        Me.btnSort = New System.Windows.Forms.Button
        Me.btnFind = New System.Windows.Forms.Button
        Me.btnCreate = New System.Windows.Forms.Button
        Me.txtArray = New System.Windows.Forms.TextBox
        Me.txtResults = New System.Windows.Forms.TextBox
        Me.txtFind = New System.Windows.Forms.TextBox
        Me.lblArea = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'lblTitle
        '
        Me.lblTitle.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTitle.Location = New System.Drawing.Point(120, 8)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(376, 23)
        Me.lblTitle.TabIndex = 1
        Me.lblTitle.Text = "Working with Arrays, Sorting and Binary Search"
        '
        'btnDisArray1
        '
        Me.btnDisArray1.Location = New System.Drawing.Point(32, 40)
        Me.btnDisArray1.Name = "btnDisArray1"
        Me.btnDisArray1.Size = New System.Drawing.Size(144, 24)
        Me.btnDisArray1.TabIndex = 2
        Me.btnDisArray1.Text = "Display Array 1"
        '
        'btnDisArray2
        '
        Me.btnDisArray2.Location = New System.Drawing.Point(32, 72)
        Me.btnDisArray2.Name = "btnDisArray2"
        Me.btnDisArray2.Size = New System.Drawing.Size(144, 23)
        Me.btnDisArray2.TabIndex = 3
        Me.btnDisArray2.Text = "Display Array 2"
        '
        'btnDisArray3
        '
        Me.btnDisArray3.Location = New System.Drawing.Point(32, 104)
        Me.btnDisArray3.Name = "btnDisArray3"
        Me.btnDisArray3.Size = New System.Drawing.Size(144, 23)
        Me.btnDisArray3.TabIndex = 4
        Me.btnDisArray3.Text = "Display Array 3"
        '
        'btnAppend13
        '
        Me.btnAppend13.Location = New System.Drawing.Point(32, 152)
        Me.btnAppend13.Name = "btnAppend13"
        Me.btnAppend13.Size = New System.Drawing.Size(144, 23)
        Me.btnAppend13.TabIndex = 5
        Me.btnAppend13.Text = "Append Array 1 to Array 3"
        '
        'btnAppend23
        '
        Me.btnAppend23.Location = New System.Drawing.Point(32, 184)
        Me.btnAppend23.Name = "btnAppend23"
        Me.btnAppend23.Size = New System.Drawing.Size(144, 23)
        Me.btnAppend23.TabIndex = 6
        Me.btnAppend23.Text = "Append Array 2 to Array 3"
        '
        'btnSort
        '
        Me.btnSort.Location = New System.Drawing.Point(32, 216)
        Me.btnSort.Name = "btnSort"
        Me.btnSort.Size = New System.Drawing.Size(144, 23)
        Me.btnSort.TabIndex = 7
        Me.btnSort.Text = "Sort Array 3"
        '
        'btnFind
        '
        Me.btnFind.Location = New System.Drawing.Point(32, 280)
        Me.btnFind.Name = "btnFind"
        Me.btnFind.Size = New System.Drawing.Size(144, 23)
        Me.btnFind.TabIndex = 8
        Me.btnFind.Text = "Find item in Array 3"
        '
        'btnCreate
        '
        Me.btnCreate.Location = New System.Drawing.Point(192, 152)
        Me.btnCreate.Name = "btnCreate"
        Me.btnCreate.Size = New System.Drawing.Size(144, 23)
        Me.btnCreate.TabIndex = 9
        Me.btnCreate.Text = "Create Array 3"
        '
        'txtArray
        '
        Me.txtArray.Location = New System.Drawing.Point(416, 64)
        Me.txtArray.Multiline = True
        Me.txtArray.Name = "txtArray"
        Me.txtArray.ScrollBars = System.Windows.Forms.ScrollBars.Vertical
        Me.txtArray.Size = New System.Drawing.Size(168, 232)
        Me.txtArray.TabIndex = 10
        Me.txtArray.Text = ""
        '
        'txtResults
        '
        Me.txtResults.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtResults.Location = New System.Drawing.Point(192, 312)
        Me.txtResults.Name = "txtResults"
        Me.txtResults.ReadOnly = True
        Me.txtResults.Size = New System.Drawing.Size(264, 20)
        Me.txtResults.TabIndex = 11
        Me.txtResults.Text = ""
        '
        'txtFind
        '
        Me.txtFind.Location = New System.Drawing.Point(192, 280)
        Me.txtFind.Name = "txtFind"
        Me.txtFind.TabIndex = 12
        Me.txtFind.Text = ""
        '
        'lblArea
        '
        Me.lblArea.Location = New System.Drawing.Point(416, 40)
        Me.lblArea.Name = "lblArea"
        Me.lblArea.TabIndex = 13
        Me.lblArea.Text = "Array Display Area"
        '
        'frmMain
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(624, 350)
        Me.Controls.Add(Me.lblArea)
        Me.Controls.Add(Me.txtFind)
        Me.Controls.Add(Me.txtResults)
        Me.Controls.Add(Me.txtArray)
        Me.Controls.Add(Me.btnCreate)
        Me.Controls.Add(Me.btnFind)
        Me.Controls.Add(Me.btnSort)
        Me.Controls.Add(Me.btnAppend23)
        Me.Controls.Add(Me.btnAppend13)
        Me.Controls.Add(Me.btnDisArray3)
        Me.Controls.Add(Me.btnDisArray2)
        Me.Controls.Add(Me.btnDisArray1)
        Me.Controls.Add(Me.lblTitle)
        Me.Name = "frmMain"
        Me.Text = "Lab4 Part2"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private array1 As String() = New String() {"One", "Two", "Three", "Four"}
    Private array2 As String() = New String() {"Winter", "Spring", "Summer", "Fall"}
    Private array3 As ArrayList()

    Private Sub btnDisArray1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDisArray1.Click

        DisplayArray1()

    End Sub

    Private Sub DisplayArray1()

        Dim i As Integer

        txtArray.Clear()
        For i = 0 To 3
            txtArray.Text &= array1(i) & vbCrLf
        Next

    End Sub

    Private Sub btnDisArray2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDisArray2.Click

        DisplayArray2()

    End Sub

    Private Sub DisplayArray2()

        Dim i As Integer

        txtArray.Clear()
        For i = 0 To 3
            txtArray.Text &= array2(i) & vbCrLf
        Next

    End Sub

    Private Sub btnDisArray3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDisArray3.Click
        txtArray.Clear()
        Dim i As Integer
        Dim max As Integer

        For i = array3.GetLowerBound(0) To array3.GetUpperBound(0)
            txtArray.Text &= Convert.ToString(array3(i)) & vbCrLf
        Next i

    End Sub

    Private Sub btnAppend13_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAppend13.Click

    End Sub

    Private Sub frmMain_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub
End Class
