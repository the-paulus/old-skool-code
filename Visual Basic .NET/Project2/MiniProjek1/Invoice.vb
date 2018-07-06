Public Class Invoice
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
    Friend WithEvents ReadAllData As System.Windows.Forms.Button
    Friend WithEvents LinkData As System.Windows.Forms.Button
    Friend WithEvents Button1 As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.ReadAllData = New System.Windows.Forms.Button
        Me.LinkData = New System.Windows.Forms.Button
        Me.Button1 = New System.Windows.Forms.Button
        Me.SuspendLayout()
        '
        'ReadAllData
        '
        Me.ReadAllData.Location = New System.Drawing.Point(160, 64)
        Me.ReadAllData.Name = "ReadAllData"
        Me.ReadAllData.Size = New System.Drawing.Size(200, 23)
        Me.ReadAllData.TabIndex = 0
        Me.ReadAllData.Text = "Read Data in ArrayLists"
        '
        'LinkData
        '
        Me.LinkData.Location = New System.Drawing.Point(160, 104)
        Me.LinkData.Name = "LinkData"
        Me.LinkData.Size = New System.Drawing.Size(200, 23)
        Me.LinkData.TabIndex = 1
        Me.LinkData.Text = "Link"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(160, 144)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(200, 23)
        Me.Button1.TabIndex = 2
        Me.Button1.Text = "Export to TextFile and Update DB"
        '
        'Invoice
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(496, 310)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.LinkData)
        Me.Controls.Add(Me.ReadAllData)
        Me.Name = "Invoice"
        Me.Text = "Invoice"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim db As New Database
    Dim CustomerList As New ArrayList
    Dim ValuedCustomerList As New ArrayList
    Dim RoomList As New ArrayList
    Dim BookingsRoomList As New ArrayList
    Dim InvoiceList As New ArrayList

    Private Sub ReadAllData_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ReadAllData.Click

        db.daCustomer.Fill(db.DataSet11)

        Dim row As DataRow
        Dim customer As Object

        For Each row In db.DataSet11.Customer

            If row("ValuedCustomer") = True Then
                ' Create new objec of class CValuedCustomer
                customer = New CValuedCustomer(row("CustomerID"), _
                                               row("CNAme"), _
                                               row("CSurname"), _
                                               row("CAddress"), _
                                               row("CTel"), _
                                               row("AmountPoints"))

            Else
                ' Create new objec of class CCustomer
                customer = New CCustomer(row("CustomerID"), _
                                               row("CNAme"), _
                                               row("CSurname"), _
                                               row("CAddress"), _
                                               row("CTel"), _
                                               row("AmountPoints"))

            End If

            CustomerList.Add(customer)

        Next


        db.daRoom.Fill(db.DataSet11)
        For Each row In db.DataSet11.Room
            RoomList.Add(New CRoom(row("RoomID"), row("Ratepernight"), row("Description")))

        Next


        db.daBookingRoom.Fill(db.DataSet11)
        For Each row In db.DataSet11.BookingRoom
            Dim room As CRoom = getRoom(row("RoomID"))
            BookingsRoomList.Add(New CBookingRoom(room, row("BookingID"), row("StartDate"), row("EndDate")))
        Next


        db.daBooking.Fill(db.DataSet11)
        For Each row In db.DataSet11.Booking
            If row("InvoiceIssued") = False Then
                Dim customer1 As Object
                customer1 = getCustomer(row("CustomerID"))

                InvoiceList.Add(New CInvoice(customer1, row("BookingID"), row("BookingDate")))


            End If
        Next

    End Sub

    Function getRoom(ByVal _ID As Integer) As CRoom
        Dim enum1 As IEnumerator = RoomList.GetEnumerator
        While enum1.MoveNext
            If enum1.Current.RoomNumber = _ID Then
                Return enum1.Current
            End If
        End While
    End Function

    Function getCustomer(ByVal _ID As Integer) As Object
        Dim enum1 As IEnumerator = CustomerList.GetEnumerator
        While enum1.MoveNext
            If enum1.Current.CustomerNumber = _ID Then
                Return enum1.Current
            End If
        End While
    End Function

    Private Sub LinkData_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles LinkData.Click

        Dim enum1 As IEnumerator = InvoiceList.GetEnumerator
        While enum1.MoveNext
            enum1.Current.LinkBookings(BookingsRoomList)

        End While
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        'Export

        Dim enum1 As IEnumerator = InvoiceList.GetEnumerator
        While enum1.MoveNext
            enum1.Current.Export()

        End While

        'Update

        Dim row As DataRow
        For Each row In db.DataSet11.Booking
            If row("InvoiceIssued") = False Then
                Dim invoice As CInvoice = getInvoice(row("BookingID"))
                row("InvoiceTotal") = invoice.CalculateTotal
                row("InvoiceIssued") = True

            End If
        Next

        db.daBooking.Update(db.DataSet11, "Booking")

    End Sub

    Function getInvoice(ByVal _ID As Integer) As CInvoice
        Dim enum1 As IEnumerator = InvoiceList.GetEnumerator
        While enum1.MoveNext
            If enum1.Current.BookingNumber = _ID Then
                Return enum1.Current
            End If
        End While
    End Function
End Class
