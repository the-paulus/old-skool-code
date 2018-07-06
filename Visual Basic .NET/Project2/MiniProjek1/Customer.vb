Imports System.Text.RegularExpressions

Public Class Customer
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
    Friend WithEvents txtName As System.Windows.Forms.TextBox
    Friend WithEvents txtSurname As System.Windows.Forms.TextBox
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents txtAddress As System.Windows.Forms.TextBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents txtTelephone As System.Windows.Forms.TextBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents txtCustID As System.Windows.Forms.TextBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents txtPoints As System.Windows.Forms.TextBox
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents chkValued As System.Windows.Forms.CheckBox
    Friend WithEvents btnFirst As System.Windows.Forms.Button
    Friend WithEvents btnLeft As System.Windows.Forms.Button
    Friend WithEvents btnRight As System.Windows.Forms.Button
    Friend WithEvents btnLast As System.Windows.Forms.Button
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents btnEdit As System.Windows.Forms.Button
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents ErrorProvider1 As System.Windows.Forms.ErrorProvider
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents dgBookings As System.Windows.Forms.DataGrid
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents Button3 As System.Windows.Forms.Button
    Friend WithEvents Button4 As System.Windows.Forms.Button
    Friend WithEvents Button5 As System.Windows.Forms.Button
    Friend WithEvents Button6 As System.Windows.Forms.Button
    Friend WithEvents Button7 As System.Windows.Forms.Button
    Friend WithEvents txtDate As System.Windows.Forms.TextBox
    Friend WithEvents txtBookingID As System.Windows.Forms.TextBox
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label
        Me.txtName = New System.Windows.Forms.TextBox
        Me.txtSurname = New System.Windows.Forms.TextBox
        Me.Label2 = New System.Windows.Forms.Label
        Me.txtAddress = New System.Windows.Forms.TextBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.txtTelephone = New System.Windows.Forms.TextBox
        Me.Label4 = New System.Windows.Forms.Label
        Me.txtCustID = New System.Windows.Forms.TextBox
        Me.Label5 = New System.Windows.Forms.Label
        Me.txtPoints = New System.Windows.Forms.TextBox
        Me.Label6 = New System.Windows.Forms.Label
        Me.chkValued = New System.Windows.Forms.CheckBox
        Me.btnFirst = New System.Windows.Forms.Button
        Me.btnLeft = New System.Windows.Forms.Button
        Me.btnRight = New System.Windows.Forms.Button
        Me.btnLast = New System.Windows.Forms.Button
        Me.btnAdd = New System.Windows.Forms.Button
        Me.btnEdit = New System.Windows.Forms.Button
        Me.btnDelete = New System.Windows.Forms.Button
        Me.ErrorProvider1 = New System.Windows.Forms.ErrorProvider
        Me.Label7 = New System.Windows.Forms.Label
        Me.dgBookings = New System.Windows.Forms.DataGrid
        Me.Button1 = New System.Windows.Forms.Button
        Me.Button2 = New System.Windows.Forms.Button
        Me.Button3 = New System.Windows.Forms.Button
        Me.Button4 = New System.Windows.Forms.Button
        Me.Button5 = New System.Windows.Forms.Button
        Me.Button6 = New System.Windows.Forms.Button
        Me.Button7 = New System.Windows.Forms.Button
        Me.txtDate = New System.Windows.Forms.TextBox
        Me.txtBookingID = New System.Windows.Forms.TextBox
        CType(Me.dgBookings, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(32, 32)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Name:"
        '
        'txtName
        '
        Me.txtName.Location = New System.Drawing.Point(152, 32)
        Me.txtName.Name = "txtName"
        Me.txtName.TabIndex = 1
        Me.txtName.Text = ""
        '
        'txtSurname
        '
        Me.txtSurname.Location = New System.Drawing.Point(152, 64)
        Me.txtSurname.Name = "txtSurname"
        Me.txtSurname.TabIndex = 3
        Me.txtSurname.Text = ""
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(32, 64)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Surname:"
        '
        'txtAddress
        '
        Me.txtAddress.Location = New System.Drawing.Point(152, 96)
        Me.txtAddress.Name = "txtAddress"
        Me.txtAddress.TabIndex = 5
        Me.txtAddress.Text = ""
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(32, 96)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 4
        Me.Label3.Text = "Address:"
        '
        'txtTelephone
        '
        Me.txtTelephone.Location = New System.Drawing.Point(152, 128)
        Me.txtTelephone.Name = "txtTelephone"
        Me.txtTelephone.TabIndex = 7
        Me.txtTelephone.Text = ""
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(32, 128)
        Me.Label4.Name = "Label4"
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "Telephone:"
        '
        'txtCustID
        '
        Me.txtCustID.Location = New System.Drawing.Point(448, 32)
        Me.txtCustID.Name = "txtCustID"
        Me.txtCustID.ReadOnly = True
        Me.txtCustID.TabIndex = 9
        Me.txtCustID.Text = ""
        '
        'Label5
        '
        Me.Label5.Location = New System.Drawing.Point(328, 32)
        Me.Label5.Name = "Label5"
        Me.Label5.TabIndex = 8
        Me.Label5.Text = "Customer ID:"
        '
        'txtPoints
        '
        Me.txtPoints.Location = New System.Drawing.Point(448, 64)
        Me.txtPoints.Name = "txtPoints"
        Me.txtPoints.TabIndex = 11
        Me.txtPoints.Text = ""
        '
        'Label6
        '
        Me.Label6.Location = New System.Drawing.Point(328, 64)
        Me.Label6.Name = "Label6"
        Me.Label6.TabIndex = 10
        Me.Label6.Text = "Points earned:"
        '
        'chkValued
        '
        Me.chkValued.Location = New System.Drawing.Point(152, 168)
        Me.chkValued.Name = "chkValued"
        Me.chkValued.Size = New System.Drawing.Size(128, 24)
        Me.chkValued.TabIndex = 12
        Me.chkValued.Text = "Valued Customer"
        '
        'btnFirst
        '
        Me.btnFirst.Location = New System.Drawing.Point(88, 216)
        Me.btnFirst.Name = "btnFirst"
        Me.btnFirst.Size = New System.Drawing.Size(32, 23)
        Me.btnFirst.TabIndex = 13
        Me.btnFirst.Text = "<<"
        '
        'btnLeft
        '
        Me.btnLeft.Location = New System.Drawing.Point(120, 216)
        Me.btnLeft.Name = "btnLeft"
        Me.btnLeft.Size = New System.Drawing.Size(24, 23)
        Me.btnLeft.TabIndex = 14
        Me.btnLeft.Text = "<"
        '
        'btnRight
        '
        Me.btnRight.Location = New System.Drawing.Point(144, 216)
        Me.btnRight.Name = "btnRight"
        Me.btnRight.Size = New System.Drawing.Size(24, 23)
        Me.btnRight.TabIndex = 15
        Me.btnRight.Text = ">"
        Me.btnRight.TextAlign = System.Drawing.ContentAlignment.TopLeft
        '
        'btnLast
        '
        Me.btnLast.Location = New System.Drawing.Point(168, 216)
        Me.btnLast.Name = "btnLast"
        Me.btnLast.Size = New System.Drawing.Size(32, 23)
        Me.btnLast.TabIndex = 16
        Me.btnLast.Text = ">>"
        '
        'btnAdd
        '
        Me.btnAdd.Location = New System.Drawing.Point(248, 216)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.TabIndex = 17
        Me.btnAdd.Text = "Add"
        '
        'btnEdit
        '
        Me.btnEdit.Location = New System.Drawing.Point(328, 216)
        Me.btnEdit.Name = "btnEdit"
        Me.btnEdit.TabIndex = 18
        Me.btnEdit.Text = "Edit (upd)"
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(408, 216)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.TabIndex = 19
        Me.btnDelete.Text = "Delete"
        '
        'ErrorProvider1
        '
        Me.ErrorProvider1.ContainerControl = Me
        '
        'Label7
        '
        Me.Label7.Location = New System.Drawing.Point(40, 256)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(312, 23)
        Me.Label7.TabIndex = 20
        Me.Label7.Text = "All bookings per customer"
        '
        'dgBookings
        '
        Me.dgBookings.DataMember = ""
        Me.dgBookings.HeaderForeColor = System.Drawing.SystemColors.ControlText
        Me.dgBookings.Location = New System.Drawing.Point(40, 288)
        Me.dgBookings.Name = "dgBookings"
        Me.dgBookings.Size = New System.Drawing.Size(512, 160)
        Me.dgBookings.TabIndex = 21
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(392, 464)
        Me.Button1.Name = "Button1"
        Me.Button1.TabIndex = 28
        Me.Button1.Text = "Delete"
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(312, 464)
        Me.Button2.Name = "Button2"
        Me.Button2.TabIndex = 27
        Me.Button2.Text = "Edit"
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(232, 464)
        Me.Button3.Name = "Button3"
        Me.Button3.TabIndex = 26
        Me.Button3.Text = "Add"
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(152, 464)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(32, 23)
        Me.Button4.TabIndex = 25
        Me.Button4.Text = ">>"
        '
        'Button5
        '
        Me.Button5.Location = New System.Drawing.Point(128, 464)
        Me.Button5.Name = "Button5"
        Me.Button5.Size = New System.Drawing.Size(24, 23)
        Me.Button5.TabIndex = 24
        Me.Button5.Text = ">"
        Me.Button5.TextAlign = System.Drawing.ContentAlignment.TopLeft
        '
        'Button6
        '
        Me.Button6.Location = New System.Drawing.Point(104, 464)
        Me.Button6.Name = "Button6"
        Me.Button6.Size = New System.Drawing.Size(24, 23)
        Me.Button6.TabIndex = 23
        Me.Button6.Text = "<"
        '
        'Button7
        '
        Me.Button7.Location = New System.Drawing.Point(72, 464)
        Me.Button7.Name = "Button7"
        Me.Button7.Size = New System.Drawing.Size(32, 23)
        Me.Button7.TabIndex = 22
        Me.Button7.Text = "<<"
        '
        'txtDate
        '
        Me.txtDate.Location = New System.Drawing.Point(568, 312)
        Me.txtDate.Name = "txtDate"
        Me.txtDate.TabIndex = 29
        Me.txtDate.Text = ""
        '
        'txtBookingID
        '
        Me.txtBookingID.Location = New System.Drawing.Point(568, 344)
        Me.txtBookingID.Name = "txtBookingID"
        Me.txtBookingID.TabIndex = 30
        Me.txtBookingID.Text = ""
        '
        'Customer
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(1000, 574)
        Me.Controls.Add(Me.txtBookingID)
        Me.Controls.Add(Me.txtDate)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.Button5)
        Me.Controls.Add(Me.Button6)
        Me.Controls.Add(Me.Button7)
        Me.Controls.Add(Me.dgBookings)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnEdit)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.btnLast)
        Me.Controls.Add(Me.btnRight)
        Me.Controls.Add(Me.btnLeft)
        Me.Controls.Add(Me.btnFirst)
        Me.Controls.Add(Me.chkValued)
        Me.Controls.Add(Me.txtPoints)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.txtCustID)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.txtTelephone)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtAddress)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtSurname)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtName)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Customer"
        Me.Text = "Customer"
        CType(Me.dgBookings, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim db As New Database

    Private Sub Customer_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        db.daCustomer.Fill(db.DataSet11)
        db.daBooking.Fill(db.DataSet11)

        txtName.DataBindings.Add("Text", db.DataSet11, "Customer.CName")
        txtSurname.DataBindings.Add("Text", db.DataSet11, "Customer.CSurname")
        txtAddress.DataBindings.Add("Text", db.DataSet11, "Customer.CAddress")
        txtTelephone.DataBindings.Add("Text", db.DataSet11, "Customer.CTel")
        txtCustID.DataBindings.Add("Text", db.DataSet11, "Customer.CustomerID")
        txtPoints.DataBindings.Add("Text", db.DataSet11, "Customer.AmountPoints")
        chkValued.DataBindings.Add("Checked", db.DataSet11, "Customer.ValuedCustomer")

        db.DataSet11.Customer.Columns("ValuedCustomer").DefaultValue = False

        dgBookings.SetDataBinding(db.DataSet11, "Customer.CustomerBooking")

        txtDate.DataBindings.Add("Text", db.DataSet11, "Customer.CustomerBooking.BookingDate")
        txtBookingID.DataBindings.Add("Text", db.DataSet11, "Customer.CustomerBooking.BookingID")



    End Sub

    Private Sub btnFirst_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFirst.Click
        Me.BindingContext(db.DataSet11, "Customer").Position = 0

    End Sub

    Private Sub btnLeft_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLeft.Click
        Me.BindingContext(db.DataSet11, "Customer").Position -= 1

    End Sub

    Private Sub btnRight_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnRight.Click
        Me.BindingContext(db.DataSet11, "Customer").Position += 1

    End Sub

    Private Sub btnLast_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLast.Click
        With Me.BindingContext(db.DataSet11, "Customer")
            .Position = .Count - 1

        End With

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAdd.Click
        If btnAdd.Text = "Add" Then
            '   ' Create a new row in the dataset
            Me.BindingContext(db.DataSet11, "Customer").AddNew()
            btnAdd.Text = "Save"

        Else

            Me.BindingContext(db.DataSet11, "Customer").EndCurrentEdit()
            db.daCustomer.Update(db.DataSet11, "Customer")
            btnAdd.Text = "Add"

        End If


    End Sub

    Private Sub txtName_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtName.Validating

        If Not oneChar(txtName.Text) Then
            e.Cancel = True
            ErrorProvider1.SetError(txtName, "Invalid name entered")
            txtName.Select(0, txtName.Text.Length)
        End If
    End Sub

    Private Sub txtName_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtName.Validated
        ErrorProvider1.SetError(txtName, "")

    End Sub

    Function oneChar(ByVal tocheck As String) As Boolean
        Dim regex1 As New Regex("\w{1,}")
        If regex1.IsMatch(tocheck) Then
            Return True
        End If

        Return False


    End Function

    Private Sub txtSurname_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtSurname.Validating
        If Not oneChar(txtSurname.Text) Then
            e.Cancel = True
            ErrorProvider1.SetError(txtSurname, "Invalid surname entered")
            txtSurname.Select(0, txtSurname.Text.Length)
        End If

    End Sub

    Private Sub txtSurname_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtSurname.Validated
        ErrorProvider1.SetError(txtSurname, "")

    End Sub

    Private Sub txtAddress_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtAddress.Validating

        Dim regAddress As New Regex("\d+\s\w+")
        If Not regAddress.IsMatch(txtAddress.Text) Then
            e.Cancel = True
            ErrorProvider1.SetError(txtAddress, "Invalid address entered. Ex: '22 Koekoekweg'")
            txtAddress.Select(0, txtAddress.Text.Length)

        End If
    End Sub

    Private Sub txtAddress_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtAddress.Validated
        ErrorProvider1.SetError(txtAddress, "")

    End Sub

    Private Sub txtTelephone_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtTelephone.Validating
        Dim regTel As New Regex("\(\d{3}\)\s\d{3}\-\d{4}")

        If Not regTel.IsMatch(txtTelephone.Text) Then
            e.Cancel = True
            ErrorProvider1.SetError(txtTelephone, "Invalid number entered. Ex: (012) 333-2121")
            txtTelephone.Select(0, txtTelephone.Text.Length)

        End If
    End Sub

    Private Sub txtTelephone_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtTelephone.Validated
        ErrorProvider1.SetError(txtTelephone, "")

    End Sub

    Private Sub txtPoints_Validating(ByVal sender As Object, ByVal e As System.ComponentModel.CancelEventArgs) Handles txtPoints.Validating
        Try
            Dim a As Integer = CInt(txtPoints.Text)

        Catch ex As Exception
            e.Cancel = True
            ErrorProvider1.SetError(txtPoints, "Only numbers accepted")
            txtPoints.Select(0, txtPoints.Text.Length)
        End Try
    End Sub

    Private Sub txtPoints_Validated(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtPoints.Validated
        ErrorProvider1.SetError(txtPoints, "")

    End Sub

    Private Sub btnEdit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnEdit.Click
        Me.BindingContext(db.DataSet11, "Customer").EndCurrentEdit()
        db.daCustomer.Update(db.DataSet11, "Customer")

        MessageBox.Show("Record Updated!")

    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        With Me.BindingContext(db.DataSet11, "Customer")
            .EndCurrentEdit()
            .RemoveAt(.Position)

        End With

        db.daCustomer.Update(db.DataSet11, "Customer")
    End Sub

    Private Sub Button7_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button7.Click
        Me.BindingContext(db.DataSet11, "Customer.CustomerBooking").Position = 0

    End Sub

    Private Sub Button6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button6.Click
        Me.BindingContext(db.DataSet11, "Customer.CustomerBooking").Position -= 1

    End Sub

    Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button5.Click
        Me.BindingContext(db.DataSet11, "Customer.CustomerBooking").Position += 1

    End Sub

    Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button4.Click
        With Me.BindingContext(db.DataSet11, "Customer.CustomerBooking")
            .Position = .Count - 1

        End With

    End Sub

    Private Sub Button1_Click_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click

        If Not IsDate(txtDate.Text) Then
            MessageBox.Show("Invalid Booking date")
            Exit Sub
        End If

        Dim bookdate As Date = txtDate.Text
        bookdate.AddDays(8)

        If Now.ToShortDateString < bookdate Then
            With Me.BindingContext(db.DataSet11, "Customer.CustomerBooking")
                .RemoveAt(.Position)
            End With
            db.daBooking.Update(db.DataSet11, "Booking")
            MessageBox.Show("Record deleted!")

        Else
            MessageBox.Show("Record cannot be deleted!")

        End If



    End Sub

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        ' new booking for specific customer

        Dim pos As Integer = Me.BindingContext(db.DataSet11, "Customer").Position
        Dim bookingdate As Date = Now.ToShortDateString
        Dim CustomerID As String = txtCustID.Text
        Dim currentCustomer As DataSet1.CustomerRow

        currentCustomer = db.DataSet11.Customer.Rows(pos)

        db.DataSet11.Booking.AddBookingRow(bookingdate, False, 0, currentCustomer)

        ' go to the last record (The inserted record)

        With Me.BindingContext(db.DataSet11, "Customer.CustomerBooking")
            .Position = .Count - 1

        End With

        db.daBooking.Update(db.DataSet11, "Booking")

        ' Now: Open the form to add Rooms to the booking!
        ' From here on it is basically the same as EDIT

        Dim frmBooking As New Bookings
        frmBooking.BookingID.Text = txtBookingID.Text
        frmBooking.cbCustomer.Text = txtSurname.Text
        frmBooking.ShowDialog()


        'Same, but with InsertCommands
        '   With db.daBooking.InsertCommand
        '    .Parameters("BookingDate").Value = Now.ToShortDateString
        '    .Parameters("CustomerID").Value = txtCustID.Text
        '    .Parameters("InvoiceIssued").Value = False
        '    .Parameters("InvoiceTotal").Value = 0

        '    db.con1.Open()
        '    .Prepare()
        '    .ExecuteNonQuery()
        '    db.con1.Close()

        'End With



    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        ' Edit current booking for customer
        Dim frmBooking As New Bookings
        frmBooking.BookingID.Text = txtBookingID.Text
        frmBooking.cbCustomer.Text = txtSurname.Text
        frmBooking.ShowDialog()


    End Sub
End Class
