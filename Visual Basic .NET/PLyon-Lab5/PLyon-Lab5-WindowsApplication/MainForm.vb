Imports plyon_applib
Imports System.Windows.Forms.ListBox.ObjectCollection

Public Class MainForm
    Inherits System.Windows.Forms.Form
    Private mainform As MainForm
    Private start As Date
    Private idc As ImportantDateCollection

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
    Friend WithEvents cbbApptOnly As System.Windows.Forms.CheckBox
    Friend WithEvents btnAddSDate As System.Windows.Forms.Button
    Friend WithEvents btnAddAppointment As System.Windows.Forms.Button
    Friend WithEvents lsbApptList As System.Windows.Forms.ListBox
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.MonthCalendar1 = New System.Windows.Forms.MonthCalendar
        Me.btnSave = New System.Windows.Forms.Button
        Me.btnContacts = New System.Windows.Forms.Button
        Me.cbbApptOnly = New System.Windows.Forms.CheckBox
        Me.btnAddSDate = New System.Windows.Forms.Button
        Me.btnAddAppointment = New System.Windows.Forms.Button
        Me.lsbApptList = New System.Windows.Forms.ListBox
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
        Me.btnSave.Location = New System.Drawing.Point(216, 16)
        Me.btnSave.Name = "btnSave"
        Me.btnSave.TabIndex = 1
        Me.btnSave.Text = "&Save"
        '
        'btnContacts
        '
        Me.btnContacts.Location = New System.Drawing.Point(216, 80)
        Me.btnContacts.Name = "btnContacts"
        Me.btnContacts.TabIndex = 2
        Me.btnContacts.Text = "&Contacts"
        '
        'cbbApptOnly
        '
        Me.cbbApptOnly.Location = New System.Drawing.Point(216, 136)
        Me.cbbApptOnly.Name = "cbbApptOnly"
        Me.cbbApptOnly.Size = New System.Drawing.Size(80, 16)
        Me.cbbApptOnly.TabIndex = 3
        Me.cbbApptOnly.Text = "&Appt Only"
        '
        'btnAddSDate
        '
        Me.btnAddSDate.Location = New System.Drawing.Point(16, 176)
        Me.btnAddSDate.Name = "btnAddSDate"
        Me.btnAddSDate.Size = New System.Drawing.Size(120, 23)
        Me.btnAddSDate.TabIndex = 4
        Me.btnAddSDate.Text = "Add &Significant Date"
        '
        'btnAddAppointment
        '
        Me.btnAddAppointment.Location = New System.Drawing.Point(152, 176)
        Me.btnAddAppointment.Name = "btnAddAppointment"
        Me.btnAddAppointment.Size = New System.Drawing.Size(120, 23)
        Me.btnAddAppointment.TabIndex = 5
        Me.btnAddAppointment.Text = "A&dd Appointment"
        '
        'lsbApptList
        '
        Me.lsbApptList.Location = New System.Drawing.Point(8, 208)
        Me.lsbApptList.Name = "lsbApptList"
        Me.lsbApptList.Size = New System.Drawing.Size(288, 160)
        Me.lsbApptList.TabIndex = 6
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(304, 373)
        Me.Controls.Add(Me.lsbApptList)
        Me.Controls.Add(Me.btnAddAppointment)
        Me.Controls.Add(Me.btnAddSDate)
        Me.Controls.Add(Me.cbbApptOnly)
        Me.Controls.Add(Me.btnContacts)
        Me.Controls.Add(Me.btnSave)
        Me.Controls.Add(Me.MonthCalendar1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Public Sub New(ByVal mf As mainform, ByVal startdate As Date, ByVal idc As ImportantDateCollection)
        MyBase.New()
        InitializeComponent()
        Me.mainform = mf
        Me.start = startdate
        Me.idc = idc
    End Sub

    Public Sub New()
        MyBase.New()

        InitializeComponent()
    End Sub

    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose()
    End Sub

End Class
