Imports System.Text.RegularExpressions

Public Class RoomTypes
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
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents txtRoomID As System.Windows.Forms.TextBox
    Friend WithEvents txtDesc As System.Windows.Forms.TextBox
    Friend WithEvents FirstRecord As System.Windows.Forms.Button
    Friend WithEvents PreviousRecord As System.Windows.Forms.Button
    Friend WithEvents NextRecord As System.Windows.Forms.Button
    Friend WithEvents LAstRecord As System.Windows.Forms.Button
    Friend WithEvents btnNew As System.Windows.Forms.Button
    Friend WithEvents btnEdit As System.Windows.Forms.Button
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents ErrorProvider1 As System.Windows.Forms.ErrorProvider
    Friend WithEvents numbeds As System.Windows.Forms.NumericUpDown
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.txtRoomID = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.txtDesc = New System.Windows.Forms.TextBox
        Me.FirstRecord = New System.Windows.Forms.Button
        Me.PreviousRecord = New System.Windows.Forms.Button
        Me.NextRecord = New System.Windows.Forms.Button
        Me.LAstRecord = New System.Windows.Forms.Button
        Me.btnNew = New System.Windows.Forms.Button
        Me.btnEdit = New System.Windows.Forms.Button
        Me.btnDelete = New System.Windows.Forms.Button
        Me.ErrorProvider1 = New System.Windows.Forms.ErrorProvider
        Me.numbeds = New System.Windows.Forms.NumericUpDown
        CType(Me.numbeds, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'txtRoomID
        '
        Me.txtRoomID.Location = New System.Drawing.Point(192, 24)
        Me.txtRoomID.Name = "txtRoomID"
        Me.txtRoomID.ReadOnly = True
        Me.txtRoomID.TabIndex = 0
        Me.txtRoomID.Text = ""
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(80, 24)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(80, 16)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "RoomID: "
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(80, 56)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(96, 16)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "Number of Beds"
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(80, 88)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(80, 16)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "Description:"
        '
        'txtDesc
        '
        Me.txtDesc.Location = New System.Drawing.Point(192, 88)
        Me.txtDesc.Name = "txtDesc"
        Me.txtDesc.Size = New System.Drawing.Size(96, 20)
        Me.txtDesc.TabIndex = 4
        Me.txtDesc.Text = ""
        '
        'FirstRecord
        '
        Me.FirstRecord.Location = New System.Drawing.Point(64, 144)
        Me.FirstRecord.Name = "FirstRecord"
        Me.FirstRecord.Size = New System.Drawing.Size(32, 24)
        Me.FirstRecord.TabIndex = 6
        Me.FirstRecord.Text = "<<"
        '
        'PreviousRecord
        '
        Me.PreviousRecord.Location = New System.Drawing.Point(96, 144)
        Me.PreviousRecord.Name = "PreviousRecord"
        Me.PreviousRecord.Size = New System.Drawing.Size(32, 24)
        Me.PreviousRecord.TabIndex = 7
        Me.PreviousRecord.Text = "<"
        '
        'NextRecord
        '
        Me.NextRecord.Location = New System.Drawing.Point(128, 144)
        Me.NextRecord.Name = "NextRecord"
        Me.NextRecord.Size = New System.Drawing.Size(32, 24)
        Me.NextRecord.TabIndex = 8
        Me.NextRecord.Text = ">"
        '
        'LAstRecord
        '
        Me.LAstRecord.Location = New System.Drawing.Point(160, 144)
        Me.LAstRecord.Name = "LAstRecord"
        Me.LAstRecord.Size = New System.Drawing.Size(32, 24)
        Me.LAstRecord.TabIndex = 9
        Me.LAstRecord.Text = ">>"
        '
        'btnNew
        '
        Me.btnNew.Location = New System.Drawing.Point(200, 144)
        Me.btnNew.Name = "btnNew"
        Me.btnNew.Size = New System.Drawing.Size(64, 23)
        Me.btnNew.TabIndex = 11
        Me.btnNew.Text = "New"
        '
        'btnEdit
        '
        Me.btnEdit.Location = New System.Drawing.Point(264, 144)
        Me.btnEdit.Name = "btnEdit"
        Me.btnEdit.Size = New System.Drawing.Size(72, 23)
        Me.btnEdit.TabIndex = 12
        Me.btnEdit.Text = "Edit (Save)"
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(336, 144)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.Size = New System.Drawing.Size(64, 23)
        Me.btnDelete.TabIndex = 13
        Me.btnDelete.Text = "Delete"
        '
        'ErrorProvider1
        '
        Me.ErrorProvider1.ContainerControl = Me
        '
        'numbeds
        '
        Me.numbeds.Location = New System.Drawing.Point(192, 56)
        Me.numbeds.Name = "numbeds"
        Me.numbeds.Size = New System.Drawing.Size(96, 20)
        Me.numbeds.TabIndex = 14
        '
        'RoomTypes
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(448, 214)
        Me.Controls.Add(Me.numbeds)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnEdit)
        Me.Controls.Add(Me.btnNew)
        Me.Controls.Add(Me.LAstRecord)
        Me.Controls.Add(Me.NextRecord)
        Me.Controls.Add(Me.PreviousRecord)
        Me.Controls.Add(Me.FirstRecord)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtDesc)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.txtRoomID)
        Me.Name = "RoomTypes"
        Me.Text = "RoomTypes"
        CType(Me.numbeds, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim db As New Database

    Private Sub RoomTypes_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        db.daRoomType.Fill(db.DataSet11)

        txtRoomID.DataBindings.Add("Text", db.DataSet11, "RoomType.RoomTypeID")
        txtDesc.DataBindings.Add("Text", db.DataSet11, "RoomType.TypeDescription")
        numbeds.DataBindings.Add("Value", db.DataSet11, "RoomType.NumberBeds")

        ' Solve Microsoft Bug => AddNew 
        ' See http://support.microsoft.com/default.aspx?scid=kb;en-us;326440

        db.DataSet11.RoomType.Columns("NumberBeds").DefaultValue = 0


    End Sub

    Private Sub FirstRecord_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles FirstRecord.Click
        Me.BindingContext(db.DataSet11, "RoomType").Position = 0

    End Sub

    Private Sub PreviousRecord_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PreviousRecord.Click
        Me.BindingContext(db.DataSet11, "RoomType").Position -= 1

    End Sub

    Private Sub NextRecord_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NextRecord.Click
        Me.BindingContext(db.DataSet11, "RoomType").Position += 1

    End Sub

    Private Sub LAstRecord_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles LAstRecord.Click
        With Me.BindingContext(db.DataSet11, "RoomType")
            .Position = .Count - 1

        End With
    End Sub

    Private Sub btnNew_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNew.Click


        If btnNew.Text = "New" Then
            '   ' Create a new row in the dataset
            Me.BindingContext(db.DataSet11, "RoomType").AddNew()
            btnNew.Text = "Save"

        Else

            ' Basic Validation

            If txtDesc.Text = "" Then
                ErrorProvider1.SetError(txtDesc, "Please enter a description")
                Exit Sub

            End If

            ErrorProvider1.SetError(txtDesc, "")

            ' Set values to dataset & update Dataset
            Me.BindingContext(db.DataSet11, "RoomType").EndCurrentEdit()
            db.daRoomType.Update(db.DataSet11, "RoomType")
            btnNew.Text = "New"

        End If

        '' If you use Insert Parameters

        'With db.daRoomType.InsertCommand
        '    .Parameters("NumberBeds").Value = numBeds.Value
        '    .Parameters("TypeDescription").Value = txtDesc.Text
        '    db.con1.Open()
        '    .Prepare()
        '    .ExecuteNonQuery()
        '    db.con1.Close()

        'End With
        'ReLoad_All()


        '' Go to the last record
        'With Me.BindingContext(db.DataSet11, "RoomType")
        '    .Position = .Count - 1

        'End With



    End Sub

    Private Sub ReLoad_All()
        db.DataSet11.Clear()
        db.daRoomType.Fill(db.DataSet11)

    End Sub

    Private Sub btnEdit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnEdit.Click
        Me.BindingContext(db.DataSet11, "RoomType").EndCurrentEdit()
        db.daRoomType.Update(db.DataSet11, "RoomType")

    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        With Me.BindingContext(db.DataSet11, "RoomType")
            .RemoveAt(.Position)

        End With
        db.daRoomType.Update(db.DataSet11, "RoomType")

    End Sub

End Class
