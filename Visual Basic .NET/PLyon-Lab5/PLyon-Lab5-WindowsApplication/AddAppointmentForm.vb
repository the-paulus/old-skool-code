Imports plyon_applib

Public Class AddAppointmentForm
    Inherits System.Windows.Forms.Form
    Dim pForm1 As Form1
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
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents TextBox1 As System.Windows.Forms.TextBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents SHours As System.Windows.Forms.NumericUpDown
    Friend WithEvents EHours As System.Windows.Forms.NumericUpDown
    Friend WithEvents EMinutes As System.Windows.Forms.NumericUpDown
    Friend WithEvents SAMPM As System.Windows.Forms.ComboBox
    Friend WithEvents EAMPM As System.Windows.Forms.ComboBox
    Friend WithEvents DateTimePicker1 As System.Windows.Forms.DateTimePicker
    Friend WithEvents SMinutes As System.Windows.Forms.NumericUpDown
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Button1 = New System.Windows.Forms.Button
        Me.Button2 = New System.Windows.Forms.Button
        Me.TextBox1 = New System.Windows.Forms.TextBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.SHours = New System.Windows.Forms.NumericUpDown
        Me.EHours = New System.Windows.Forms.NumericUpDown
        Me.SMinutes = New System.Windows.Forms.NumericUpDown
        Me.EMinutes = New System.Windows.Forms.NumericUpDown
        Me.SAMPM = New System.Windows.Forms.ComboBox
        Me.EAMPM = New System.Windows.Forms.ComboBox
        Me.DateTimePicker1 = New System.Windows.Forms.DateTimePicker
        CType(Me.SHours, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.EHours, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.SMinutes, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.EMinutes, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(8, 8)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Description:"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(16, 72)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Start:"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(48, 128)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(96, 23)
        Me.Button1.TabIndex = 2
        Me.Button1.Text = "Add"
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(192, 128)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(88, 23)
        Me.Button2.TabIndex = 3
        Me.Button2.Text = "Cancel"
        '
        'TextBox1
        '
        Me.TextBox1.Location = New System.Drawing.Point(128, 8)
        Me.TextBox1.Name = "TextBox1"
        Me.TextBox1.Size = New System.Drawing.Size(200, 20)
        Me.TextBox1.TabIndex = 4
        Me.TextBox1.Text = ""
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(16, 96)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "End:"
        '
        'SHours
        '
        Me.SHours.Location = New System.Drawing.Point(128, 72)
        Me.SHours.Maximum = New Decimal(New Integer() {12, 0, 0, 0})
        Me.SHours.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.SHours.Name = "SHours"
        Me.SHours.Size = New System.Drawing.Size(32, 20)
        Me.SHours.TabIndex = 8
        Me.SHours.Value = New Decimal(New Integer() {6, 0, 0, 0})
        '
        'EHours
        '
        Me.EHours.Location = New System.Drawing.Point(128, 96)
        Me.EHours.Maximum = New Decimal(New Integer() {12, 0, 0, 0})
        Me.EHours.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.EHours.Name = "EHours"
        Me.EHours.Size = New System.Drawing.Size(32, 20)
        Me.EHours.TabIndex = 9
        Me.EHours.Value = New Decimal(New Integer() {6, 0, 0, 0})
        '
        'SMinutes
        '
        Me.SMinutes.Location = New System.Drawing.Point(168, 72)
        Me.SMinutes.Maximum = New Decimal(New Integer() {59, 0, 0, 0})
        Me.SMinutes.Name = "SMinutes"
        Me.SMinutes.Size = New System.Drawing.Size(40, 20)
        Me.SMinutes.TabIndex = 10
        '
        'EMinutes
        '
        Me.EMinutes.Location = New System.Drawing.Point(168, 96)
        Me.EMinutes.Maximum = New Decimal(New Integer() {59, 0, 0, 0})
        Me.EMinutes.Name = "EMinutes"
        Me.EMinutes.Size = New System.Drawing.Size(40, 20)
        Me.EMinutes.TabIndex = 11
        '
        'SAMPM
        '
        Me.SAMPM.Items.AddRange(New Object() {"AM", "PM"})
        Me.SAMPM.Location = New System.Drawing.Point(216, 72)
        Me.SAMPM.Name = "SAMPM"
        Me.SAMPM.Size = New System.Drawing.Size(56, 21)
        Me.SAMPM.TabIndex = 12
        Me.SAMPM.Text = "ComboBox1"
        '
        'EAMPM
        '
        Me.EAMPM.Items.AddRange(New Object() {"AM", "PM"})
        Me.EAMPM.Location = New System.Drawing.Point(216, 96)
        Me.EAMPM.Name = "EAMPM"
        Me.EAMPM.Size = New System.Drawing.Size(56, 21)
        Me.EAMPM.TabIndex = 13
        Me.EAMPM.Text = "ComboBox2"
        '
        'DateTimePicker1
        '
        Me.DateTimePicker1.Location = New System.Drawing.Point(16, 40)
        Me.DateTimePicker1.Name = "DateTimePicker1"
        Me.DateTimePicker1.Size = New System.Drawing.Size(312, 20)
        Me.DateTimePicker1.TabIndex = 14
        '
        'AddAppointmentForm
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(336, 165)
        Me.Controls.Add(Me.DateTimePicker1)
        Me.Controls.Add(Me.EAMPM)
        Me.Controls.Add(Me.SAMPM)
        Me.Controls.Add(Me.EMinutes)
        Me.Controls.Add(Me.SMinutes)
        Me.Controls.Add(Me.EHours)
        Me.Controls.Add(Me.SHours)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.TextBox1)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "AddAppointmentForm"
        Me.Text = "5"
        CType(Me.SHours, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.EHours, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.SMinutes, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.EMinutes, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        pForm1.lsbApptList.Items.Add(New Appointment(DateTimePicker1.Value, SHours.Value, SMinutes.Value, EHours.Value, EMinutes.Value, TextBox1.Text))
        Me.Hide()
    End Sub

    Public Sub setForm(ByRef f As Form)
        pForm1 = f
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Me.Hide()
    End Sub

    Private Sub AddAppointmentForm_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub
End Class
