Imports AppointmentProgramLib

Public Class frmAddAppointment
    Inherits System.Windows.Forms.Form

    Private mf As MainForm
    Private idc As ImportantDateCollection
    Private aapp As Appointment
    Private modify As Boolean

#Region " Windows Form Designer generated code "
    'Form overrides dispose to clean up the component list.

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents lblStartDate As System.Windows.Forms.Label
    Friend WithEvents lblStartTime As System.Windows.Forms.Label
    Friend WithEvents lblContact As System.Windows.Forms.Label
    Friend WithEvents lblLocation As System.Windows.Forms.Label
    Friend WithEvents lblReason As System.Windows.Forms.Label
    Friend WithEvents lblDuration As System.Windows.Forms.Label
    Friend WithEvents lblDurationDays As System.Windows.Forms.Label
    Friend WithEvents lblDurationHours As System.Windows.Forms.Label
    Friend WithEvents lblDurationMinutes As System.Windows.Forms.Label
    Friend WithEvents numHour As System.Windows.Forms.NumericUpDown
    Friend WithEvents numMinute As System.Windows.Forms.NumericUpDown
    Friend WithEvents numDurationDays As System.Windows.Forms.NumericUpDown
    Friend WithEvents numDurationHours As System.Windows.Forms.NumericUpDown
    Friend WithEvents numDurationMinutes As System.Windows.Forms.NumericUpDown
    Friend WithEvents txtStartDate As System.Windows.Forms.TextBox
    Friend WithEvents txtContact As System.Windows.Forms.TextBox
    Friend WithEvents txtLocation As System.Windows.Forms.TextBox
    Friend WithEvents txtReason As System.Windows.Forms.TextBox
    Friend WithEvents txtNotes As System.Windows.Forms.TextBox
    Friend WithEvents btnOk As System.Windows.Forms.Button
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents cbxRecurring As System.Windows.Forms.CheckBox
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblStartDate = New System.Windows.Forms.Label
        Me.lblStartTime = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.lblContact = New System.Windows.Forms.Label
        Me.lblLocation = New System.Windows.Forms.Label
        Me.lblReason = New System.Windows.Forms.Label
        Me.Label7 = New System.Windows.Forms.Label
        Me.lblDuration = New System.Windows.Forms.Label
        Me.lblDurationDays = New System.Windows.Forms.Label
        Me.lblDurationHours = New System.Windows.Forms.Label
        Me.lblDurationMinutes = New System.Windows.Forms.Label
        Me.numHour = New System.Windows.Forms.NumericUpDown
        Me.numMinute = New System.Windows.Forms.NumericUpDown
        Me.numDurationDays = New System.Windows.Forms.NumericUpDown
        Me.numDurationHours = New System.Windows.Forms.NumericUpDown
        Me.numDurationMinutes = New System.Windows.Forms.NumericUpDown
        Me.txtStartDate = New System.Windows.Forms.TextBox
        Me.txtContact = New System.Windows.Forms.TextBox
        Me.txtLocation = New System.Windows.Forms.TextBox
        Me.txtReason = New System.Windows.Forms.TextBox
        Me.txtNotes = New System.Windows.Forms.TextBox
        Me.btnOk = New System.Windows.Forms.Button
        Me.btnCancel = New System.Windows.Forms.Button
        Me.btnDelete = New System.Windows.Forms.Button
        Me.cbxRecurring = New System.Windows.Forms.CheckBox
        CType(Me.numHour, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numMinute, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numDurationDays, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numDurationHours, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numDurationMinutes, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'lblStartDate
        '
        Me.lblStartDate.Location = New System.Drawing.Point(16, 16)
        Me.lblStartDate.Name = "lblStartDate"
        Me.lblStartDate.TabIndex = 0
        Me.lblStartDate.Text = "Start Date"
        '
        'lblStartTime
        '
        Me.lblStartTime.Location = New System.Drawing.Point(16, 40)
        Me.lblStartTime.Name = "lblStartTime"
        Me.lblStartTime.TabIndex = 1
        Me.lblStartTime.Text = "Start Time:"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(128, 32)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(16, 32)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = ":"
        '
        'lblContact
        '
        Me.lblContact.Location = New System.Drawing.Point(16, 64)
        Me.lblContact.Name = "lblContact"
        Me.lblContact.TabIndex = 3
        Me.lblContact.Text = "Contact:"
        '
        'lblLocation
        '
        Me.lblLocation.Location = New System.Drawing.Point(16, 88)
        Me.lblLocation.Name = "lblLocation"
        Me.lblLocation.TabIndex = 4
        Me.lblLocation.Text = "Location:"
        '
        'lblReason
        '
        Me.lblReason.Location = New System.Drawing.Point(16, 112)
        Me.lblReason.Name = "lblReason"
        Me.lblReason.TabIndex = 5
        Me.lblReason.Text = "Reason:"
        '
        'Label7
        '
        Me.Label7.Location = New System.Drawing.Point(240, 16)
        Me.Label7.Name = "Label7"
        Me.Label7.TabIndex = 6
        Me.Label7.Text = "Notes:"
        '
        'lblDuration
        '
        Me.lblDuration.Location = New System.Drawing.Point(16, 160)
        Me.lblDuration.Name = "lblDuration"
        Me.lblDuration.TabIndex = 7
        Me.lblDuration.Text = "Duration:"
        '
        'lblDurationDays
        '
        Me.lblDurationDays.Location = New System.Drawing.Point(88, 136)
        Me.lblDurationDays.Name = "lblDurationDays"
        Me.lblDurationDays.Size = New System.Drawing.Size(40, 23)
        Me.lblDurationDays.TabIndex = 8
        Me.lblDurationDays.Text = "Days"
        '
        'lblDurationHours
        '
        Me.lblDurationHours.Location = New System.Drawing.Point(136, 136)
        Me.lblDurationHours.Name = "lblDurationHours"
        Me.lblDurationHours.Size = New System.Drawing.Size(40, 23)
        Me.lblDurationHours.TabIndex = 9
        Me.lblDurationHours.Text = "Hours"
        '
        'lblDurationMinutes
        '
        Me.lblDurationMinutes.Location = New System.Drawing.Point(184, 136)
        Me.lblDurationMinutes.Name = "lblDurationMinutes"
        Me.lblDurationMinutes.Size = New System.Drawing.Size(48, 23)
        Me.lblDurationMinutes.TabIndex = 10
        Me.lblDurationMinutes.Text = "Minutes"
        '
        'numHour
        '
        Me.numHour.Location = New System.Drawing.Point(88, 40)
        Me.numHour.Maximum = New Decimal(New Integer() {23, 0, 0, 0})
        Me.numHour.Name = "numHour"
        Me.numHour.Size = New System.Drawing.Size(40, 20)
        Me.numHour.TabIndex = 11
        '
        'numMinute
        '
        Me.numMinute.Increment = New Decimal(New Integer() {5, 0, 0, 0})
        Me.numMinute.Location = New System.Drawing.Point(144, 40)
        Me.numMinute.Maximum = New Decimal(New Integer() {59, 0, 0, 0})
        Me.numMinute.Name = "numMinute"
        Me.numMinute.Size = New System.Drawing.Size(40, 20)
        Me.numMinute.TabIndex = 12
        '
        'numDurationDays
        '
        Me.numDurationDays.Location = New System.Drawing.Point(88, 160)
        Me.numDurationDays.Name = "numDurationDays"
        Me.numDurationDays.Size = New System.Drawing.Size(40, 20)
        Me.numDurationDays.TabIndex = 13
        '
        'numDurationHours
        '
        Me.numDurationHours.Location = New System.Drawing.Point(136, 160)
        Me.numDurationHours.Maximum = New Decimal(New Integer() {23, 0, 0, 0})
        Me.numDurationHours.Name = "numDurationHours"
        Me.numDurationHours.Size = New System.Drawing.Size(40, 20)
        Me.numDurationHours.TabIndex = 14
        '
        'numDurationMinutes
        '
        Me.numDurationMinutes.Increment = New Decimal(New Integer() {5, 0, 0, 0})
        Me.numDurationMinutes.Location = New System.Drawing.Point(184, 160)
        Me.numDurationMinutes.Name = "numDurationMinutes"
        Me.numDurationMinutes.Size = New System.Drawing.Size(40, 20)
        Me.numDurationMinutes.TabIndex = 15
        '
        'txtStartDate
        '
        Me.txtStartDate.Location = New System.Drawing.Point(88, 16)
        Me.txtStartDate.Name = "txtStartDate"
        Me.txtStartDate.TabIndex = 16
        Me.txtStartDate.Text = ""
        '
        'txtContact
        '
        Me.txtContact.Location = New System.Drawing.Point(88, 64)
        Me.txtContact.Name = "txtContact"
        Me.txtContact.TabIndex = 17
        Me.txtContact.Text = ""
        '
        'txtLocation
        '
        Me.txtLocation.Location = New System.Drawing.Point(88, 88)
        Me.txtLocation.Name = "txtLocation"
        Me.txtLocation.Size = New System.Drawing.Size(136, 20)
        Me.txtLocation.TabIndex = 18
        Me.txtLocation.Text = ""
        '
        'txtReason
        '
        Me.txtReason.Location = New System.Drawing.Point(88, 112)
        Me.txtReason.Name = "txtReason"
        Me.txtReason.Size = New System.Drawing.Size(136, 20)
        Me.txtReason.TabIndex = 19
        Me.txtReason.Text = ""
        '
        'txtNotes
        '
        Me.txtNotes.Location = New System.Drawing.Point(240, 40)
        Me.txtNotes.Multiline = True
        Me.txtNotes.Name = "txtNotes"
        Me.txtNotes.Size = New System.Drawing.Size(200, 216)
        Me.txtNotes.TabIndex = 20
        Me.txtNotes.Text = ""
        '
        'btnOk
        '
        Me.btnOk.Location = New System.Drawing.Point(8, 224)
        Me.btnOk.Name = "btnOk"
        Me.btnOk.Size = New System.Drawing.Size(72, 23)
        Me.btnOk.TabIndex = 21
        Me.btnOk.Text = "OK"
        '
        'btnCancel
        '
        Me.btnCancel.Location = New System.Drawing.Point(168, 224)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.Size = New System.Drawing.Size(64, 23)
        Me.btnCancel.TabIndex = 22
        Me.btnCancel.Text = "Cancel"
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(88, 224)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.Size = New System.Drawing.Size(72, 23)
        Me.btnDelete.TabIndex = 23
        Me.btnDelete.Text = "Delete"
        Me.btnDelete.Visible = False
        '
        'cbxRecurring
        '
        Me.cbxRecurring.Location = New System.Drawing.Point(16, 192)
        Me.cbxRecurring.Name = "cbxRecurring"
        Me.cbxRecurring.Size = New System.Drawing.Size(200, 24)
        Me.cbxRecurring.TabIndex = 24
        Me.cbxRecurring.Text = "Recurring"
        '
        'frmAddAppointment
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(448, 261)
        Me.Controls.Add(Me.cbxRecurring)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnCancel)
        Me.Controls.Add(Me.btnOk)
        Me.Controls.Add(Me.txtNotes)
        Me.Controls.Add(Me.txtReason)
        Me.Controls.Add(Me.txtLocation)
        Me.Controls.Add(Me.txtContact)
        Me.Controls.Add(Me.txtStartDate)
        Me.Controls.Add(Me.numDurationMinutes)
        Me.Controls.Add(Me.numDurationHours)
        Me.Controls.Add(Me.numDurationDays)
        Me.Controls.Add(Me.numMinute)
        Me.Controls.Add(Me.numHour)
        Me.Controls.Add(Me.lblDurationMinutes)
        Me.Controls.Add(Me.lblDurationHours)
        Me.Controls.Add(Me.lblDurationDays)
        Me.Controls.Add(Me.lblDuration)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.lblReason)
        Me.Controls.Add(Me.lblLocation)
        Me.Controls.Add(Me.lblContact)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.lblStartTime)
        Me.Controls.Add(Me.lblStartDate)
        Me.Name = "frmAddAppointment"
        Me.Text = "Add Appointment"
        CType(Me.numHour, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numMinute, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numDurationDays, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numDurationHours, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numDurationMinutes, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

#End Region

    Public Sub New()
        MyBase.New()

        InitializeComponent()
    End Sub

    Public Sub New(ByVal mfrm As MainForm, ByVal sdate As Date, ByVal idc As ImportantDateCollection, ByVal modify As Boolean, ByVal a As Appointment)
        MyBase.New()
        mf = mfrm
        InitializeComponent()

        Me.idc = idc
        Me.modify = modify

        If modify = True Then
            Me.Text = "Change/Delete Appointment"
            Me.btnDelete.Visible = True
            Me.btnOk.Text = "Update"
            Me.aapp = a
        Else
            Me.txtStartDate.Text = sdate.ToString
        End If
    End Sub

    Private Sub frmAddAppointment_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub

    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
    End Sub

    Private Sub fill(ByRef app As Appointment)
        Try
            app = New Appointment
            app.StartDate = Me.txtStartDate.Text
            app.isRecurring = Me.cbxRecurring.Checked
            app.theReason = Me.txtReason.Text
            app.appointmentNotes = Me.txtNotes.Text
            app.appointmentMinute = Me.numMinute.Value
            app.appointmentLocation = Me.txtLocation.Text
            app.appointmentHour = Me.numHour.Value
            app.appointmentDurationMinutes = Me.numDurationMinutes.Value
            app.appointmentDurationHours = Me.numDurationHours.Value
            app.appointmentDurationDays = Me.numDurationDays.Value
            app.appointmentContact = Me.txtContact.Text
        Catch ex As System.NullReferenceException
            MsgBox(ex.StackTrace)
        End Try
    End Sub
    Private Sub btnOk_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnOk.Click
        Dim newapp As Appointment

        If Me.modify = False Then
            fill(newapp)

            idc.Add(newapp)

            Try
                mf.lst.Items.Add(newapp.appointmentStartDate & ": " & newapp.appointmentReason & " (Appointment)")
            Catch ex As Exception
                MsgBox("Error adding Important Date!", MsgBoxStyle.Exclamation, "Error")
            End Try
        Else
            fill(newapp)

            idc.Item(idc.IndexOf(newapp)) = newapp

            Try
                mf.lst.Items.Item(idc.IndexOf(newapp)) = newapp.appointmentStartDate.ToString & ": " & newapp.appointmentReason & " (Appointment)"
            Catch ex As Exception

            End Try
        End If

        Me.Hide()
        mf.Show()
    End Sub

    Private Sub btnDelete_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        mf.lst.Items.Remove(aapp)
        mf.lst.Items.RemoveAt(idc.IndexOf(aapp))
        idc.Remove(aapp)
        Me.Dispose()
        Me.Hide()
        mf.Show()
    End Sub

    Private Sub btnCancel_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnCancel.Click
        Me.Dispose()
        Me.Hide()
    End Sub
End Class
