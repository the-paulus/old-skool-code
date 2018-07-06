Public Class Bookings
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
    Friend WithEvents cbCustomer As System.Windows.Forms.ComboBox
    Friend WithEvents cbRoom As System.Windows.Forms.ComboBox
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents startdate As System.Windows.Forms.DateTimePicker
    Friend WithEvents enddate As System.Windows.Forms.DateTimePicker
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents btnEdit As System.Windows.Forms.Button
    Friend WithEvents btnLast As System.Windows.Forms.Button
    Friend WithEvents btnRight As System.Windows.Forms.Button
    Friend WithEvents btnLeft As System.Windows.Forms.Button
    Friend WithEvents btnFirst As System.Windows.Forms.Button
    Friend WithEvents dgRooms As System.Windows.Forms.DataGrid
    Friend WithEvents txtBookingID2 As System.Windows.Forms.TextBox
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents BookingID As System.Windows.Forms.ComboBox
    Friend WithEvents Label6 As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label
        Me.cbCustomer = New System.Windows.Forms.ComboBox
        Me.cbRoom = New System.Windows.Forms.ComboBox
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.startdate = New System.Windows.Forms.DateTimePicker
        Me.enddate = New System.Windows.Forms.DateTimePicker
        Me.Label4 = New System.Windows.Forms.Label
        Me.Button1 = New System.Windows.Forms.Button
        Me.Label5 = New System.Windows.Forms.Label
        Me.dgRooms = New System.Windows.Forms.DataGrid
        Me.btnDelete = New System.Windows.Forms.Button
        Me.btnEdit = New System.Windows.Forms.Button
        Me.btnLast = New System.Windows.Forms.Button
        Me.btnRight = New System.Windows.Forms.Button
        Me.btnLeft = New System.Windows.Forms.Button
        Me.btnFirst = New System.Windows.Forms.Button
        Me.btnAdd = New System.Windows.Forms.Button
        Me.txtBookingID2 = New System.Windows.Forms.TextBox
        Me.BookingID = New System.Windows.Forms.ComboBox
        Me.Label6 = New System.Windows.Forms.Label
        CType(Me.dgRooms, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(392, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Customer"
        '
        'cbCustomer
        '
        Me.cbCustomer.Location = New System.Drawing.Point(512, 16)
        Me.cbCustomer.Name = "cbCustomer"
        Me.cbCustomer.Size = New System.Drawing.Size(121, 21)
        Me.cbCustomer.TabIndex = 1
        '
        'cbRoom
        '
        Me.cbRoom.Location = New System.Drawing.Point(168, 104)
        Me.cbRoom.Name = "cbRoom"
        Me.cbRoom.Size = New System.Drawing.Size(121, 21)
        Me.cbRoom.TabIndex = 3
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(48, 104)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Room:"
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(48, 136)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 4
        Me.Label3.Text = "Start Date"
        '
        'startdate
        '
        Me.startdate.Location = New System.Drawing.Point(168, 136)
        Me.startdate.Name = "startdate"
        Me.startdate.Size = New System.Drawing.Size(192, 20)
        Me.startdate.TabIndex = 5
        '
        'enddate
        '
        Me.enddate.Location = New System.Drawing.Point(168, 176)
        Me.enddate.Name = "enddate"
        Me.enddate.Size = New System.Drawing.Size(192, 20)
        Me.enddate.TabIndex = 7
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(48, 176)
        Me.Label4.Name = "Label4"
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "End Date"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(464, 232)
        Me.Button1.Name = "Button1"
        Me.Button1.TabIndex = 8
        Me.Button1.Text = "Close"
        '
        'Label5
        '
        Me.Label5.Location = New System.Drawing.Point(64, 288)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(376, 23)
        Me.Label5.TabIndex = 9
        Me.Label5.Text = "Room and booking details"
        '
        'dgRooms
        '
        Me.dgRooms.DataMember = ""
        Me.dgRooms.HeaderForeColor = System.Drawing.SystemColors.ControlText
        Me.dgRooms.Location = New System.Drawing.Point(64, 320)
        Me.dgRooms.Name = "dgRooms"
        Me.dgRooms.Size = New System.Drawing.Size(512, 152)
        Me.dgRooms.TabIndex = 10
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(416, 488)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.TabIndex = 26
        Me.btnDelete.Text = "Delete"
        '
        'btnEdit
        '
        Me.btnEdit.Location = New System.Drawing.Point(328, 488)
        Me.btnEdit.Name = "btnEdit"
        Me.btnEdit.Size = New System.Drawing.Size(80, 23)
        Me.btnEdit.TabIndex = 25
        Me.btnEdit.Text = "Edit (save)"
        '
        'btnLast
        '
        Me.btnLast.Location = New System.Drawing.Point(176, 488)
        Me.btnLast.Name = "btnLast"
        Me.btnLast.Size = New System.Drawing.Size(32, 23)
        Me.btnLast.TabIndex = 23
        Me.btnLast.Text = ">>"
        '
        'btnRight
        '
        Me.btnRight.Location = New System.Drawing.Point(152, 488)
        Me.btnRight.Name = "btnRight"
        Me.btnRight.Size = New System.Drawing.Size(24, 23)
        Me.btnRight.TabIndex = 22
        Me.btnRight.Text = ">"
        Me.btnRight.TextAlign = System.Drawing.ContentAlignment.TopLeft
        '
        'btnLeft
        '
        Me.btnLeft.Location = New System.Drawing.Point(128, 488)
        Me.btnLeft.Name = "btnLeft"
        Me.btnLeft.Size = New System.Drawing.Size(24, 23)
        Me.btnLeft.TabIndex = 21
        Me.btnLeft.Text = "<"
        '
        'btnFirst
        '
        Me.btnFirst.Location = New System.Drawing.Point(96, 488)
        Me.btnFirst.Name = "btnFirst"
        Me.btnFirst.Size = New System.Drawing.Size(32, 23)
        Me.btnFirst.TabIndex = 20
        Me.btnFirst.Text = "<<"
        '
        'btnAdd
        '
        Me.btnAdd.Location = New System.Drawing.Point(224, 232)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(152, 23)
        Me.btnAdd.TabIndex = 27
        Me.btnAdd.Text = "Add Room to Booking"
        '
        'txtBookingID2
        '
        Me.txtBookingID2.Location = New System.Drawing.Point(264, 16)
        Me.txtBookingID2.Name = "txtBookingID2"
        Me.txtBookingID2.ReadOnly = True
        Me.txtBookingID2.TabIndex = 30
        Me.txtBookingID2.Text = ""
        '
        'BookingID
        '
        Me.BookingID.Location = New System.Drawing.Point(136, 16)
        Me.BookingID.Name = "BookingID"
        Me.BookingID.Size = New System.Drawing.Size(121, 21)
        Me.BookingID.TabIndex = 31
        '
        'Label6
        '
        Me.Label6.Location = New System.Drawing.Point(24, 16)
        Me.Label6.Name = "Label6"
        Me.Label6.TabIndex = 32
        Me.Label6.Text = "BookingID:"
        '
        'Bookings
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(880, 518)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.BookingID)
        Me.Controls.Add(Me.txtBookingID2)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnEdit)
        Me.Controls.Add(Me.btnLast)
        Me.Controls.Add(Me.btnRight)
        Me.Controls.Add(Me.btnLeft)
        Me.Controls.Add(Me.btnFirst)
        Me.Controls.Add(Me.dgRooms)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.enddate)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.startdate)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.cbRoom)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.cbCustomer)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Bookings"
        Me.Text = "Bookings"
        CType(Me.dgRooms, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim db As New Database


    Private Sub Bookings_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        db.daCustomer.Fill(db.DataSet11)
        db.daRoom.Fill(db.DataSet11)
        db.daBooking.Fill(db.DataSet11)

        If BookingID.Text = "" Then
            BookingID.DataSource = db.DataSet11
            BookingID.DisplayMember = "Booking.BookingID"
            BookingID.ValueMember = "Booking.BookingID"

        End If


        db.daBookingRoomperBooking.SelectCommand.Parameters("BookingID").Value = BookingID.Text
        db.daBookingRoomperBooking.Fill(db.DataSet11)

        cbRoom.DataSource = db.DataSet11
        cbRoom.DisplayMember = "Room.Description"
        cbRoom.ValueMember = "Room.RoomID"

        dgRooms.SetDataBinding(db.DataSet11, "BookingRoom")

        cbRoom.DataBindings.Add("SelectedValue", db.DataSet11, "BookingRoom.RoomID")
        enddate.DataBindings.Add("Value", db.DataSet11, "BookingRoom.endDate")
        startdate.DataBindings.Add("Value", db.DataSet11, "BookingRoom.startDate")
        txtBookingID2.DataBindings.Add("Text", db.DataSet11, "BookingRoom.BookingID")


        db.DataSet11.BookingRoom.Columns("EndDate").DefaultValue = Now.Add(New TimeSpan(4, 0, 0, 0)).ToShortDateString
        db.DataSet11.BookingRoom.Columns("StartDate").DefaultValue = Now.ToShortDateString
        db.DataSet11.BookingRoom.Columns("RoomID").DefaultValue = 0


    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Me.Close()

    End Sub

    Private Sub btnAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAdd.Click

        Try

            If btnAdd.Text = "Add Room to Booking" Then

                Me.BindingContext(db.DataSet11, "BookingRoom").AddNew()
                txtBookingID2.Text = BookingID.Text
                btnAdd.Text = "Save"
            Else

                txtBookingID2.Text = BookingID.Text
                Me.BindingContext(db.DataSet11, "BookingRoom").EndCurrentEdit()
                db.daBookingRoomperBooking.Update(db.DataSet11, "BookingRoom")

                btnAdd.Text = "Add Room to Booking"

            End If

        Catch ex As Exception
            MessageBox.Show(ex.Message)

        End Try


        'With db.daBookingRoom.InsertCommand
        '    .Parameters("BookingID").Value = txtBookingID.Text
        '    .Parameters("EndDate").Value = enddate.Value.ToShortDateString
        '    .Parameters("RoomID").Value = cbRoom.SelectedValue
        '    .Parameters("StartDate").Value = startdate.Value.ToShortDateString

        '    db.con1.Open()
        '    .Prepare()
        '    .ExecuteNonQuery()
        '    db.con1.Close()

        'End With
        'Reload_All()



    End Sub

    Sub Reload_All()

        If Not BookingID.Text = "System.Data.DataViewManagerListItemTypeDescriptor" Then

            'db.DataSet11.BookingRoom.Clear()
            db.daBookingRoomperBooking.SelectCommand.Parameters("BookingID").Value = BookingID.Text
            db.daBookingRoomperBooking.Fill(db.DataSet11)
            dgRooms.Refresh()

        End If

    End Sub

    Private Sub btnFirst_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFirst.Click
        Me.BindingContext(db.DataSet11, "BookingRoom").Position = 0

    End Sub

    Private Sub btnLeft_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLeft.Click
        Me.BindingContext(db.DataSet11, "BookingRoom").Position -= 1

    End Sub

    Private Sub btnRight_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnRight.Click
        Me.BindingContext(db.DataSet11, "BookingRoom").Position += 1

    End Sub

    Private Sub btnLast_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLast.Click
        With Me.BindingContext(db.DataSet11, "BookingRoom")
            .Position = .Count - 1

        End With

    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        With Me.BindingContext(db.DataSet11, "BookingRoom")
            .RemoveAt(.Position)

        End With

        db.daBookingRoomperBooking.Update(db.DataSet11, "BookingRoom")

    End Sub

    Private Sub btnEdit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnEdit.Click

        Me.BindingContext(db.DataSet11, "BookingRoom").EndCurrentEdit()
        db.daBookingRoomperBooking.Update(db.DataSet11, "BookingRoom")

        dgRooms.Refresh()

        MessageBox.Show("Record updated!")


    End Sub

    Private Sub BookingID_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BookingID.SelectedIndexChanged
        Reload_All()

    End Sub
End Class
