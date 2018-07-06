Imports AppointmentProgramLib
Public Class MainForm
    Inherits System.Windows.Forms.Form
    Private cc As ContactCollection
    Private idc As ImportantDateCollection
    Private ds As ImportantDateCollection
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
    Friend WithEvents MonthCalendar1 As System.Windows.Forms.MonthCalendar
    Friend WithEvents btnSave As System.Windows.Forms.Button
    Friend WithEvents btnContacts As System.Windows.Forms.Button
    Friend WithEvents lst As System.Windows.Forms.ListBox
    Friend WithEvents btnAddSig As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.MonthCalendar1 = New System.Windows.Forms.MonthCalendar
        Me.btnSave = New System.Windows.Forms.Button
        Me.btnContacts = New System.Windows.Forms.Button
        Me.lst = New System.Windows.Forms.ListBox
        Me.btnAddSig = New System.Windows.Forms.Button
        Me.Button2 = New System.Windows.Forms.Button
        Me.SuspendLayout()
        '
        'MonthCalendar1
        '
        Me.MonthCalendar1.Location = New System.Drawing.Point(8, 8)
        Me.MonthCalendar1.Name = "MonthCalendar1"
        Me.MonthCalendar1.TabIndex = 0
        '
        'btnSave
        '
        Me.btnSave.Location = New System.Drawing.Point(208, 8)
        Me.btnSave.Name = "btnSave"
        Me.btnSave.Size = New System.Drawing.Size(75, 32)
        Me.btnSave.TabIndex = 1
        Me.btnSave.Text = "Save"
        '
        'btnContacts
        '
        Me.btnContacts.Location = New System.Drawing.Point(208, 128)
        Me.btnContacts.Name = "btnContacts"
        Me.btnContacts.Size = New System.Drawing.Size(75, 32)
        Me.btnContacts.TabIndex = 2
        Me.btnContacts.Text = "Contacts"
        '
        'lst
        '
        Me.lst.Location = New System.Drawing.Point(8, 176)
        Me.lst.Name = "lst"
        Me.lst.Size = New System.Drawing.Size(272, 212)
        Me.lst.TabIndex = 6
        '
        'btnAddSig
        '
        Me.btnAddSig.Location = New System.Drawing.Point(208, 48)
        Me.btnAddSig.Name = "btnAddSig"
        Me.btnAddSig.Size = New System.Drawing.Size(75, 32)
        Me.btnAddSig.TabIndex = 7
        Me.btnAddSig.Text = "Add Date"
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(208, 88)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(75, 32)
        Me.Button2.TabIndex = 8
        Me.Button2.Text = "Add Appt"
        '
        'MainForm
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(288, 397)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.btnAddSig)
        Me.Controls.Add(Me.lst)
        Me.Controls.Add(Me.btnContacts)
        Me.Controls.Add(Me.btnSave)
        Me.Controls.Add(Me.MonthCalendar1)
        Me.Name = "MainForm"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Appointment"
        Me.ResumeLayout(False)

    End Sub

#End Region


    Private Sub btnSave_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSave.Click
        idc.Serialize(idc, System.Environment.CurrentDirectory & "\importantdates.soap")

    End Sub

    Private Sub loadList(ByVal dt As Date)
        Dim lstitem As String
        ds = idc.getDatesBetween(dt, dt.AddDays(7))
        Me.lst.Items.Clear()

        For Each id As ImportantDate In ds
            If (id.StartDate.Day - MonthCalendar1.SelectionStart.Day).Equals(0) Then
                lstitem &= id.StartDate.ToShortDateString & " - " & id.theReason
            ElseIf (id.StartDate.Day - MonthCalendar1.SelectionStart.Day).Equals(1) Then
                lstitem &= id.StartDate.ToShortDateString & " - " & id.theReason & " (In 1 day)"
            Else
                lstitem &= id.StartDate.ToShortDateString & " - " & id.theReason & " (In " & (Convert.ToString(id.StartDate.Day - MonthCalendar1.SelectionStart.Day)) & " days)"
            End If
            Me.lst.Items.Add(lstitem)
        Next
    End Sub

    Private Sub MainForm_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Try
            idc = ImportantDateCollection.DeSerialize(System.Environment.CurrentDirectory & "importantdates.soap")
        Catch ex As Exception
            idc = New ImportantDateCollection
        End Try
    End Sub


    Private Sub btnAddSig_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAddSig.Click
        Dim adddateform As addImportantDate
        Dim i As ImportantDate
        adddateform = New addImportantDate(Me, MonthCalendar1.SelectionStart(), idc, i)
        adddateform.Show()
    End Sub

    Private Sub lst_DoubleClick(ByVal sender As Object, ByVal e As System.EventArgs) Handles lst.DoubleClick
        Dim id As ImportantDate
        Dim app As Appointment
        Dim eapp As frmAddAppointment
        Dim edate As addImportantDate

        'MsgBox(idc.Item(lst.SelectedIndex).GetType.ToString)

        If idc.Item(lst.SelectedIndex).GetType.ToString = "AppointmentProgramLib.ImportantDate" Then
            id = idc.Item(lst.SelectedIndex)
            edate = New addImportantDate(Me, id, idc, True)
            edate.Show()

            Try
                edate.txtDate.Text = id.StartDate.ToString
                edate.txtReason.Text = id.theReason
                edate.cbxRecurring.CheckState = id.isRecurring

            Catch ex As NullReferenceException
                'MsgBox(id.StartDate & ", " & id.theReason & ", " & id.isRecurring)
            End Try

        ElseIf idc.Item(lst.SelectedIndex).GetType.ToString = "AppointmentProgramLib.Appointment" Then
            app = idc.Item(lst.SelectedIndex)
            eapp = New frmAddAppointment(Me, Me.MonthCalendar1.SelectionStart, idc, True, app)
            eapp.Show()

            Try
                eapp.txtContact.Text = app.appointmentContact
                eapp.txtLocation.Text = app.appointmentLocation
                eapp.txtNotes.Text = app.appointmentNotes
                eapp.txtReason.Text = app.appointmentReason
                eapp.txtStartDate.Text = app.appointmentStartDate
                eapp.cbxRecurring.Checked = app.isRecurring
                eapp.numDurationDays.Value = app.appointmentDurationDays
                eapp.numDurationHours.Value = app.appointmentDurationHours
                eapp.numDurationMinutes.Value = app.appointmentDurationMinutes
                eapp.numHour.Value = app.appointmentHour
                eapp.numMinute.Value = app.appointmentMinute
            Catch ex As Exception

            End Try
        End If

    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Dim addappform As frmAddAppointment
        Dim a As Appointment
        addappform = New frmAddAppointment(Me, Me.MonthCalendar1.SelectionStart, idc, False, a)
        addappform.Show()
    End Sub

    Private Sub btnContacts_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnContacts.Click
        Dim conform As frmContact
        conform = New frmContact
        conform.Show()
    End Sub
End Class
