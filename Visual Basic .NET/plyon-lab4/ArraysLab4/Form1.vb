Option Strict Off

Public Class Form1
    Inherits System.Windows.Forms.Form
    Dim array1() As String = New String() {"Bob", "Eric", "Rob", "Gary"}
    Dim array2() As String = New String() {"Paul", "John", "Clyde"}
    Dim array3 As ArrayList

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
    Friend WithEvents btnDspArray1 As System.Windows.Forms.Button
    Friend WithEvents btnDspArray2 As System.Windows.Forms.Button
    Friend WithEvents btnDspArray3 As System.Windows.Forms.Button
    Friend WithEvents btnAppend1to3 As System.Windows.Forms.Button
    Friend WithEvents btnAppend2to3 As System.Windows.Forms.Button
    Friend WithEvents btnSortArray As System.Windows.Forms.Button
    Friend WithEvents btnCreateArray3 As System.Windows.Forms.Button
    Friend WithEvents btnFindItem As System.Windows.Forms.Button
    Friend WithEvents lblTitle As System.Windows.Forms.Label
    Friend WithEvents lblArrayContents As System.Windows.Forms.Label
    Friend WithEvents lsbArrayContents As System.Windows.Forms.ListBox
    Friend WithEvents txtQuery As System.Windows.Forms.TextBox
    Friend WithEvents statusbar As System.Windows.Forms.StatusBar
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.btnDspArray1 = New System.Windows.Forms.Button
        Me.btnDspArray2 = New System.Windows.Forms.Button
        Me.btnDspArray3 = New System.Windows.Forms.Button
        Me.btnAppend1to3 = New System.Windows.Forms.Button
        Me.btnAppend2to3 = New System.Windows.Forms.Button
        Me.btnSortArray = New System.Windows.Forms.Button
        Me.btnCreateArray3 = New System.Windows.Forms.Button
        Me.btnFindItem = New System.Windows.Forms.Button
        Me.lblTitle = New System.Windows.Forms.Label
        Me.lblArrayContents = New System.Windows.Forms.Label
        Me.lsbArrayContents = New System.Windows.Forms.ListBox
        Me.statusbar = New System.Windows.Forms.StatusBar
        Me.txtQuery = New System.Windows.Forms.TextBox
        Me.SuspendLayout()
        '
        'btnDspArray1
        '
        Me.btnDspArray1.Location = New System.Drawing.Point(24, 56)
        Me.btnDspArray1.Name = "btnDspArray1"
        Me.btnDspArray1.Size = New System.Drawing.Size(144, 23)
        Me.btnDspArray1.TabIndex = 0
        Me.btnDspArray1.Text = "Display Array 1"
        '
        'btnDspArray2
        '
        Me.btnDspArray2.Location = New System.Drawing.Point(24, 88)
        Me.btnDspArray2.Name = "btnDspArray2"
        Me.btnDspArray2.Size = New System.Drawing.Size(144, 24)
        Me.btnDspArray2.TabIndex = 1
        Me.btnDspArray2.Text = "Display Array 2"
        '
        'btnDspArray3
        '
        Me.btnDspArray3.Location = New System.Drawing.Point(24, 120)
        Me.btnDspArray3.Name = "btnDspArray3"
        Me.btnDspArray3.Size = New System.Drawing.Size(144, 24)
        Me.btnDspArray3.TabIndex = 2
        Me.btnDspArray3.Text = "Display Array 3"
        '
        'btnAppend1to3
        '
        Me.btnAppend1to3.Location = New System.Drawing.Point(24, 184)
        Me.btnAppend1to3.Name = "btnAppend1to3"
        Me.btnAppend1to3.Size = New System.Drawing.Size(144, 24)
        Me.btnAppend1to3.TabIndex = 3
        Me.btnAppend1to3.Text = "Append Array 1 to 3"
        '
        'btnAppend2to3
        '
        Me.btnAppend2to3.Location = New System.Drawing.Point(24, 216)
        Me.btnAppend2to3.Name = "btnAppend2to3"
        Me.btnAppend2to3.Size = New System.Drawing.Size(144, 24)
        Me.btnAppend2to3.TabIndex = 4
        Me.btnAppend2to3.Text = "Append Array 2 to 3"
        '
        'btnSortArray
        '
        Me.btnSortArray.Location = New System.Drawing.Point(24, 248)
        Me.btnSortArray.Name = "btnSortArray"
        Me.btnSortArray.Size = New System.Drawing.Size(144, 24)
        Me.btnSortArray.TabIndex = 5
        Me.btnSortArray.Text = "Sort Array"
        '
        'btnCreateArray3
        '
        Me.btnCreateArray3.Location = New System.Drawing.Point(200, 152)
        Me.btnCreateArray3.Name = "btnCreateArray3"
        Me.btnCreateArray3.Size = New System.Drawing.Size(144, 24)
        Me.btnCreateArray3.TabIndex = 6
        Me.btnCreateArray3.Text = "Create Array 3"
        '
        'btnFindItem
        '
        Me.btnFindItem.Location = New System.Drawing.Point(24, 312)
        Me.btnFindItem.Name = "btnFindItem"
        Me.btnFindItem.Size = New System.Drawing.Size(144, 24)
        Me.btnFindItem.TabIndex = 7
        Me.btnFindItem.Text = "Find in Array"
        '
        'lblTitle
        '
        Me.lblTitle.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTitle.Location = New System.Drawing.Point(8, 16)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(520, 24)
        Me.lblTitle.TabIndex = 8
        Me.lblTitle.Text = "Working with arrays,  sorting and binary search"
        Me.lblTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblArrayContents
        '
        Me.lblArrayContents.Location = New System.Drawing.Point(368, 56)
        Me.lblArrayContents.Name = "lblArrayContents"
        Me.lblArrayContents.Size = New System.Drawing.Size(144, 16)
        Me.lblArrayContents.TabIndex = 9
        Me.lblArrayContents.Text = "Array Contains:"
        '
        'lsbArrayContents
        '
        Me.lsbArrayContents.Location = New System.Drawing.Point(360, 72)
        Me.lsbArrayContents.Name = "lsbArrayContents"
        Me.lsbArrayContents.Size = New System.Drawing.Size(152, 264)
        Me.lsbArrayContents.TabIndex = 11
        '
        'statusbar
        '
        Me.statusbar.Location = New System.Drawing.Point(0, 368)
        Me.statusbar.Name = "statusbar"
        Me.statusbar.Size = New System.Drawing.Size(528, 22)
        Me.statusbar.TabIndex = 12
        '
        'txtQuery
        '
        Me.txtQuery.Location = New System.Drawing.Point(192, 312)
        Me.txtQuery.Name = "txtQuery"
        Me.txtQuery.Size = New System.Drawing.Size(144, 20)
        Me.txtQuery.TabIndex = 13
        Me.txtQuery.Text = ""
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(528, 390)
        Me.Controls.Add(Me.txtQuery)
        Me.Controls.Add(Me.statusbar)
        Me.Controls.Add(Me.lsbArrayContents)
        Me.Controls.Add(Me.lblArrayContents)
        Me.Controls.Add(Me.lblTitle)
        Me.Controls.Add(Me.btnFindItem)
        Me.Controls.Add(Me.btnCreateArray3)
        Me.Controls.Add(Me.btnSortArray)
        Me.Controls.Add(Me.btnAppend2to3)
        Me.Controls.Add(Me.btnAppend1to3)
        Me.Controls.Add(Me.btnDspArray3)
        Me.Controls.Add(Me.btnDspArray2)
        Me.Controls.Add(Me.btnDspArray1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)

    End Sub

#End Region
    Private Sub displayArray1(ByVal array() As String, ByRef listbox As ListBox)
        listbox.Items.Clear()
        listbox.Items.AddRange(array)
    End Sub

    Private Sub DisplayArray2(ByVal array() As String, ByRef listbox As ListBox)
        listbox.Items.Clear()
        listbox.Items.AddRange(array)
    End Sub

    Private Sub DisplayArray3(ByVal array As ArrayList, ByRef listbox As ListBox)
        Dim i As Integer
        Dim stuff() As Object

        listbox.Items.Clear()

        stuff = array.ToArray()

        For i = 0 To stuff.GetUpperBound(0)
            listbox.Items.Add(stuff(i))
        Next
    End Sub

    Private Sub btnDspArray1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDspArray1.Click
        displayArray1(array1, lsbArrayContents)
    End Sub

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub

    Private Sub btnDspArray2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDspArray2.Click
        DisplayArray2(array2, lsbArrayContents)
    End Sub

    Private Sub btnDspArray3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDspArray3.Click
        DisplayArray3(array3, lsbArrayContents)
    End Sub

    Private Sub btnCreateArray3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCreateArray3.Click
        array3 = New ArrayList(10)
    End Sub

    Private Sub AppendToArray3(ByRef array_to_append_to As ArrayList, ByVal array() As String)
        Dim i As Integer

        For i = 0 To array.GetUpperBound(0)
            array_to_append_to.Add(array(i))
        Next
    End Sub
    Private Sub btnAppend1to3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAppend1to3.Click
        AppendToArray3(array3, array1)
    End Sub

    Private Sub btnAppend2to3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAppend2to3.Click
        AppendToArray3(array3, array2)
    End Sub

    Private Sub btnSortArray_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSortArray.Click
        array3.Sort()
    End Sub

    Private Sub btnFindItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFindItem.Click
        Dim ret As Integer
        statusbar.Text = ""
        If array3.Contains(txtQuery.Text) = False Then
            statusbar.Text = txtQuery.Text + " not found in array list!"
        ElseIf array3.Contains(txtQuery.Text) = True Then
            statusbar.Text = txtQuery.Text + " found at " + array3.BinarySearch(txtQuery.Text).ToString()
        End If
        ret = array3.Contains(txtQuery.Text)
    End Sub
End Class
