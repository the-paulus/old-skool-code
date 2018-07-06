Public Class BookingRoom
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
    Friend WithEvents txtRoomID As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents cbType As System.Windows.Forms.ComboBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents ratepernight As System.Windows.Forms.NumericUpDown
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents txtDescription As System.Windows.Forms.TextBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents imagebox As System.Windows.Forms.PictureBox
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents btnEdit As System.Windows.Forms.Button
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents btnLast As System.Windows.Forms.Button
    Friend WithEvents btnRight As System.Windows.Forms.Button
    Friend WithEvents btnLeft As System.Windows.Forms.Button
    Friend WithEvents btnFirst As System.Windows.Forms.Button
    Friend WithEvents chkFurnished As System.Windows.Forms.CheckBox
    Friend WithEvents txtImage As System.Windows.Forms.TextBox
    Friend WithEvents ErrorProvider1 As System.Windows.Forms.ErrorProvider
    Friend WithEvents OpenFileDialog1 As System.Windows.Forms.OpenFileDialog
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents dgBooking As System.Windows.Forms.DataGrid
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents Button3 As System.Windows.Forms.Button
    Friend WithEvents Button4 As System.Windows.Forms.Button
    Friend WithEvents Button5 As System.Windows.Forms.Button
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents DateTimePicker1 As System.Windows.Forms.DateTimePicker
    Friend WithEvents DateTimePicker2 As System.Windows.Forms.DateTimePicker
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Button6 As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.txtRoomID = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.cbType = New System.Windows.Forms.ComboBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.ratepernight = New System.Windows.Forms.NumericUpDown
        Me.Label4 = New System.Windows.Forms.Label
        Me.txtDescription = New System.Windows.Forms.TextBox
        Me.Label5 = New System.Windows.Forms.Label
        Me.txtImage = New System.Windows.Forms.TextBox
        Me.imagebox = New System.Windows.Forms.PictureBox
        Me.chkFurnished = New System.Windows.Forms.CheckBox
        Me.btnDelete = New System.Windows.Forms.Button
        Me.btnEdit = New System.Windows.Forms.Button
        Me.btnAdd = New System.Windows.Forms.Button
        Me.btnLast = New System.Windows.Forms.Button
        Me.btnRight = New System.Windows.Forms.Button
        Me.btnLeft = New System.Windows.Forms.Button
        Me.btnFirst = New System.Windows.Forms.Button
        Me.ErrorProvider1 = New System.Windows.Forms.ErrorProvider
        Me.OpenFileDialog1 = New System.Windows.Forms.OpenFileDialog
        Me.Button1 = New System.Windows.Forms.Button
        Me.dgBooking = New System.Windows.Forms.DataGrid
        Me.Button2 = New System.Windows.Forms.Button
        Me.Button3 = New System.Windows.Forms.Button
        Me.Button4 = New System.Windows.Forms.Button
        Me.Button5 = New System.Windows.Forms.Button
        Me.Label6 = New System.Windows.Forms.Label
        Me.DateTimePicker1 = New System.Windows.Forms.DateTimePicker
        Me.DateTimePicker2 = New System.Windows.Forms.DateTimePicker
        Me.Label7 = New System.Windows.Forms.Label
        Me.Button6 = New System.Windows.Forms.Button
        CType(Me.ratepernight, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.dgBooking, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'txtRoomID
        '
        Me.txtRoomID.Location = New System.Drawing.Point(176, 32)
        Me.txtRoomID.Name = "txtRoomID"
        Me.txtRoomID.ReadOnly = True
        Me.txtRoomID.TabIndex = 0
        Me.txtRoomID.Text = ""
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(40, 32)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Room ID:"
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(40, 72)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Room Type:"
        '
        'cbType
        '
        Me.cbType.Location = New System.Drawing.Point(176, 72)
        Me.cbType.Name = "cbType"
        Me.cbType.Size = New System.Drawing.Size(104, 21)
        Me.cbType.TabIndex = 3
        Me.cbType.Text = "ComboBox1"
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(40, 112)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 4
        Me.Label3.Text = "Rate per Night:"
        '
        'ratepernight
        '
        Me.ratepernight.Location = New System.Drawing.Point(176, 112)
        Me.ratepernight.Maximum = New Decimal(New Integer() {3000, 0, 0, 0})
        Me.ratepernight.Name = "ratepernight"
        Me.ratepernight.TabIndex = 5
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(40, 152)
        Me.Label4.Name = "Label4"
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "Description:"
        '
        'txtDescription
        '
        Me.txtDescription.Location = New System.Drawing.Point(176, 152)
        Me.txtDescription.Name = "txtDescription"
        Me.txtDescription.TabIndex = 6
        Me.txtDescription.Text = ""
        '
        'Label5
        '
        Me.Label5.Location = New System.Drawing.Point(400, 32)
        Me.Label5.Name = "Label5"
        Me.Label5.TabIndex = 9
        Me.Label5.Text = "Path to Image:"
        '
        'txtImage
        '
        Me.txtImage.Location = New System.Drawing.Point(528, 32)
        Me.txtImage.Name = "txtImage"
        Me.txtImage.Size = New System.Drawing.Size(176, 20)
        Me.txtImage.TabIndex = 8
        Me.txtImage.Text = ""
        '
        'imagebox
        '
        Me.imagebox.Location = New System.Drawing.Point(536, 72)
        Me.imagebox.Name = "imagebox"
        Me.imagebox.Size = New System.Drawing.Size(216, 160)
        Me.imagebox.TabIndex = 10
        Me.imagebox.TabStop = False
        '
        'chkFurnished
        '
        Me.chkFurnished.Location = New System.Drawing.Point(176, 192)
        Me.chkFurnished.Name = "chkFurnished"
        Me.chkFurnished.TabIndex = 11
        Me.chkFurnished.Text = "Furnished"
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(408, 240)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.TabIndex = 26
        Me.btnDelete.Text = "Delete"
        '
        'btnEdit
        '
        Me.btnEdit.Location = New System.Drawing.Point(328, 240)
        Me.btnEdit.Name = "btnEdit"
        Me.btnEdit.TabIndex = 25
        Me.btnEdit.Text = "Edit (save)"
        '
        'btnAdd
        '
        Me.btnAdd.Location = New System.Drawing.Point(248, 240)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.TabIndex = 24
        Me.btnAdd.Text = "Add"
        '
        'btnLast
        '
        Me.btnLast.Location = New System.Drawing.Point(168, 240)
        Me.btnLast.Name = "btnLast"
        Me.btnLast.Size = New System.Drawing.Size(32, 23)
        Me.btnLast.TabIndex = 23
        Me.btnLast.Text = ">>"
        '
        'btnRight
        '
        Me.btnRight.Location = New System.Drawing.Point(144, 240)
        Me.btnRight.Name = "btnRight"
        Me.btnRight.Size = New System.Drawing.Size(24, 23)
        Me.btnRight.TabIndex = 22
        Me.btnRight.Text = ">"
        Me.btnRight.TextAlign = System.Drawing.ContentAlignment.TopLeft
        '
        'btnLeft
        '
        Me.btnLeft.Location = New System.Drawing.Point(120, 240)
        Me.btnLeft.Name = "btnLeft"
        Me.btnLeft.Size = New System.Drawing.Size(24, 23)
        Me.btnLeft.TabIndex = 21
        Me.btnLeft.Text = "<"
        '
        'btnFirst
        '
        Me.btnFirst.Location = New System.Drawing.Point(88, 240)
        Me.btnFirst.Name = "btnFirst"
        Me.btnFirst.Size = New System.Drawing.Size(32, 23)
        Me.btnFirst.TabIndex = 20
        Me.btnFirst.Text = "<<"
        '
        'ErrorProvider1
        '
        Me.ErrorProvider1.ContainerControl = Me
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(712, 32)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(24, 23)
        Me.Button1.TabIndex = 27
        Me.Button1.Text = "..."
        '
        'dgBooking
        '
        Me.dgBooking.DataMember = ""
        Me.dgBooking.HeaderForeColor = System.Drawing.SystemColors.ControlText
        Me.dgBooking.Location = New System.Drawing.Point(40, 344)
        Me.dgBooking.Name = "dgBooking"
        Me.dgBooking.Size = New System.Drawing.Size(648, 192)
        Me.dgBooking.TabIndex = 28
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(168, 544)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(32, 23)
        Me.Button2.TabIndex = 32
        Me.Button2.Text = ">>"
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(144, 544)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(24, 23)
        Me.Button3.TabIndex = 31
        Me.Button3.Text = ">"
        Me.Button3.TextAlign = System.Drawing.ContentAlignment.TopLeft
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(120, 544)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(24, 23)
        Me.Button4.TabIndex = 30
        Me.Button4.Text = "<"
        '
        'Button5
        '
        Me.Button5.Location = New System.Drawing.Point(88, 544)
        Me.Button5.Name = "Button5"
        Me.Button5.Size = New System.Drawing.Size(32, 23)
        Me.Button5.TabIndex = 29
        Me.Button5.Text = "<<"
        '
        'Label6
        '
        Me.Label6.Location = New System.Drawing.Point(64, 272)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(384, 23)
        Me.Label6.TabIndex = 33
        Me.Label6.Text = "Booking for this room for period"
        '
        'DateTimePicker1
        '
        Me.DateTimePicker1.Location = New System.Drawing.Point(96, 304)
        Me.DateTimePicker1.Name = "DateTimePicker1"
        Me.DateTimePicker1.Size = New System.Drawing.Size(128, 20)
        Me.DateTimePicker1.TabIndex = 34
        '
        'DateTimePicker2
        '
        Me.DateTimePicker2.Location = New System.Drawing.Point(304, 304)
        Me.DateTimePicker2.Name = "DateTimePicker2"
        Me.DateTimePicker2.Size = New System.Drawing.Size(128, 20)
        Me.DateTimePicker2.TabIndex = 35
        '
        'Label7
        '
        Me.Label7.Location = New System.Drawing.Point(240, 304)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(48, 23)
        Me.Label7.TabIndex = 36
        Me.Label7.Text = "to"
        '
        'Button6
        '
        Me.Button6.Location = New System.Drawing.Point(464, 304)
        Me.Button6.Name = "Button6"
        Me.Button6.TabIndex = 37
        Me.Button6.Text = "Refresh"
        '
        'BookingRoom
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(864, 574)
        Me.Controls.Add(Me.Button6)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.DateTimePicker2)
        Me.Controls.Add(Me.DateTimePicker1)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.Button5)
        Me.Controls.Add(Me.dgBooking)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnEdit)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.btnLast)
        Me.Controls.Add(Me.btnRight)
        Me.Controls.Add(Me.btnLeft)
        Me.Controls.Add(Me.btnFirst)
        Me.Controls.Add(Me.chkFurnished)
        Me.Controls.Add(Me.imagebox)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.txtImage)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtDescription)
        Me.Controls.Add(Me.ratepernight)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.cbType)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.txtRoomID)
        Me.Name = "BookingRoom"
        Me.Text = "BookingRoom"
        CType(Me.ratepernight, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.dgBooking, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim db As New Database

    Private Sub BookingRoom_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load


        db.daRoomType.Fill(db.DataSet11)
        db.daRoom.Fill(db.DataSet11)
        'db.daBookingRoom.Fill(db.DataSet11)

        Dim hundreddays As New System.TimeSpan(100, 0, 0, 0)

        DateTimePicker1.Value = Now.Date.Subtract(hundreddays)
        DateTimePicker2.Value = Now.Date.Add(hundreddays)
        Reload_BookingRoom()



        cbType.DataSource = db.DataSet11
        cbType.DisplayMember = "RoomType.TypeDescription"
        cbType.ValueMember = "RoomType.RoomTypeID"

        txtRoomID.DataBindings.Add("Text", db.DataSet11, "Room.RoomID")
        cbType.DataBindings.Add("SelectedValue", db.DataSet11, "Room.RoomTypeID")
        ratepernight.DataBindings.Add("Value", db.DataSet11, "Room.RatePerNight")
        txtDescription.DataBindings.Add("Text", db.DataSet11, "Room.Description")
        chkFurnished.DataBindings.Add("Checked", db.DataSet11, "Room.Furnished")
        txtImage.DataBindings.Add("Text", db.DataSet11, "Room.Image")

        db.DataSet11.Room.Columns("Furnished").DefaultValue = True
        db.DataSet11.Room.Columns("RatePerNight").DefaultValue = 100


        dgBooking.SetDataBinding(db.DataSet11, "Room.RoomBookingRoom")

        LoadImage()

    End Sub


    Sub Reload_BookingRoom()

        db.DataSet11.BookingRoom.Clear()

        With db.daBookingRoomDates.SelectCommand
            .Parameters("StartDate").Value = DateTimePicker1.Value.ToShortDateString
            .Parameters("EndDate").Value = DateTimePicker2.Value.ToShortDateString

        End With
        db.daBookingRoomDates.Fill(db.DataSet11)

    End Sub

    Private Sub btnFirst_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFirst.Click
        Me.BindingContext(db.DataSet11, "Room").Position = 0
        LoadImage()


    End Sub

    Private Sub btnLeft_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLeft.Click
        Me.BindingContext(db.DataSet11, "Room").Position -= 1
        LoadImage()

    End Sub

    Private Sub btnRight_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnRight.Click
        Me.BindingContext(db.DataSet11, "Room").Position += 1
        LoadImage()

    End Sub

    Private Sub btnLast_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLast.Click
        With Me.BindingContext(db.DataSet11, "Room")
            .Position = .Count - 1

        End With
        LoadImage()

    End Sub

    Sub LoadImage()

        Try
            imagebox.Image = Image.FromFile(txtImage.Text)

        Catch ex As Exception

            imagebox.Image = Nothing
            MessageBox.Show("File not found: " & ex.Message)

        End Try

    End Sub

    Private Sub btnAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAdd.Click
        If btnAdd.Text = "Add" Then

            Me.BindingContext(db.DataSet11, "Room").AddNew()
            btnAdd.Text = "Save"

        Else

            Me.BindingContext(db.DataSet11, "Room").EndCurrentEdit()
            db.daRoom.Update(db.DataSet11, "Room")
            btnAdd.Text = "Add"
        End If
    End Sub

    Private Sub txtImage_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtImage.Validating
        If Not System.IO.File.Exists(txtImage.Text) Then
            e.Cancel = True
            ErrorProvider1.SetError(txtImage, "File not Found")
            txtImage.Select(0, txtImage.Text.Length)

        End If
    End Sub

    Private Sub txtImage_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtImage.Validated
        ErrorProvider1.SetError(txtImage, "")

    End Sub

    Private Sub txtDescription_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtDescription.Validating

        Dim regex1 As New System.Text.RegularExpressions.Regex("\w+")

        If Not regex1.IsMatch(txtDescription.Text) Then
            e.Cancel = True
            ErrorProvider1.SetError(txtDescription, "Enter description")
            txtDescription.Select(0, txtDescription.Text.Length)
        End If

    End Sub

    Private Sub txtDescription_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtDescription.Validated
        ErrorProvider1.SetError(txtDescription, "")

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        OpenFileDialog1.ShowDialog()
        txtImage.Text = OpenFileDialog1.FileName
        LoadImage()

    End Sub

    Private Sub btnEdit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnEdit.Click
        Me.BindingContext(db.DataSet11, "Room").EndCurrentEdit()
        db.daRoom.Update(db.DataSet11, "Room")

    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        With Me.BindingContext(db.DataSet11, "Room")
            .RemoveAt(.Position)

        End With
        db.daRoom.Update(db.DataSet11, "Room")


    End Sub

    Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button5.Click
        Me.BindingContext(db.DataSet11, "Room.RoomBookingRoom").Position = 0

    End Sub

    Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button4.Click
        Me.BindingContext(db.DataSet11, "Room.RoomBookingRoom").Position -= 1

    End Sub

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        Me.BindingContext(db.DataSet11, "Room.RoomBookingRoom").Position += 1

    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        With Me.BindingContext(db.DataSet11, "Room.RoomBookingRoom")
            .Position = .Count - 1

        End With
    End Sub

    Private Sub Button6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button6.Click
        Reload_BookingRoom()

    End Sub
End Class
