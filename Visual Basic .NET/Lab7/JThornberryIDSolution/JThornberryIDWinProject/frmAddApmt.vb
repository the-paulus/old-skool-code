Imports ApptLib
Public Class frmAddApmt
    Inherits System.Windows.Forms.Form
    Private fMain As frmMain
    Private start As Date
    Private idc As ImportantDateCollection

#Region " Windows Form Designer generated code "
    <System.STAThread()> _
    Public Shared Sub Main()
        System.Windows.Forms.Application.EnableVisualStyles()
        System.Windows.Forms.Application.Run(New frmAddApmt)
    End Sub
    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub
    Public Sub New(ByVal fMain As frmMain, ByVal startdate As Date, ByVal idc As ImportantDateCollection)
        MyBase.New()
        InitializeComponent()
        Me.fMain = fMain
        start = startdate
        lblStart.Text = start
        Me.idc = idc
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
    Friend WithEvents lblStart As System.Windows.Forms.Label
    Friend WithEvents txtReason As System.Windows.Forms.TextBox
    Friend WithEvents txtContact As System.Windows.Forms.TextBox
    Friend WithEvents txtLocation As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents txthrs As System.Windows.Forms.TextBox
    Friend WithEvents txtmins As System.Windows.Forms.TextBox
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents btnOk As System.Windows.Forms.Button
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    Friend WithEvents txtNotes As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents StatusBar1 As System.Windows.Forms.StatusBar
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblStart = New System.Windows.Forms.Label
        Me.txtReason = New System.Windows.Forms.TextBox
        Me.txtNotes = New System.Windows.Forms.TextBox
        Me.txtContact = New System.Windows.Forms.TextBox
        Me.txtLocation = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.Label5 = New System.Windows.Forms.Label
        Me.txthrs = New System.Windows.Forms.TextBox
        Me.txtmins = New System.Windows.Forms.TextBox
        Me.Label7 = New System.Windows.Forms.Label
        Me.Label8 = New System.Windows.Forms.Label
        Me.btnOk = New System.Windows.Forms.Button
        Me.btnCancel = New System.Windows.Forms.Button
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.StatusBar1 = New System.Windows.Forms.StatusBar
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'lblStart
        '
        Me.lblStart.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblStart.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStart.Location = New System.Drawing.Point(120, 16)
        Me.lblStart.Name = "lblStart"
        Me.lblStart.Size = New System.Drawing.Size(256, 23)
        Me.lblStart.TabIndex = 0
        '
        'txtReason
        '
        Me.txtReason.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtReason.Location = New System.Drawing.Point(120, 136)
        Me.txtReason.Name = "txtReason"
        Me.txtReason.Size = New System.Drawing.Size(256, 22)
        Me.txtReason.TabIndex = 3
        Me.txtReason.Text = ""
        '
        'txtNotes
        '
        Me.txtNotes.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtNotes.Location = New System.Drawing.Point(416, 24)
        Me.txtNotes.Multiline = True
        Me.txtNotes.Name = "txtNotes"
        Me.txtNotes.ScrollBars = System.Windows.Forms.ScrollBars.Vertical
        Me.txtNotes.Size = New System.Drawing.Size(280, 248)
        Me.txtNotes.TabIndex = 6
        Me.txtNotes.Text = ""
        '
        'txtContact
        '
        Me.txtContact.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtContact.Location = New System.Drawing.Point(120, 56)
        Me.txtContact.Name = "txtContact"
        Me.txtContact.Size = New System.Drawing.Size(256, 22)
        Me.txtContact.TabIndex = 1
        Me.txtContact.Text = ""
        '
        'txtLocation
        '
        Me.txtLocation.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtLocation.Location = New System.Drawing.Point(120, 96)
        Me.txtLocation.Name = "txtLocation"
        Me.txtLocation.Size = New System.Drawing.Size(256, 22)
        Me.txtLocation.TabIndex = 2
        Me.txtLocation.Text = ""
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(8, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 7
        Me.Label1.Text = "Start Date"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(8, 136)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 8
        Me.Label2.Text = "Reason"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(8, 56)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 9
        Me.Label3.Text = "Contact"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(8, 96)
        Me.Label4.Name = "Label4"
        Me.Label4.TabIndex = 10
        Me.Label4.Text = "Location"
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(416, 8)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(56, 23)
        Me.Label5.TabIndex = 11
        Me.Label5.Text = "Notes"
        '
        'txthrs
        '
        Me.txthrs.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txthrs.Location = New System.Drawing.Point(16, 24)
        Me.txthrs.Name = "txthrs"
        Me.txthrs.Size = New System.Drawing.Size(48, 22)
        Me.txthrs.TabIndex = 4
        Me.txthrs.Text = ""
        '
        'txtmins
        '
        Me.txtmins.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtmins.Location = New System.Drawing.Point(16, 64)
        Me.txtmins.Name = "txtmins"
        Me.txtmins.Size = New System.Drawing.Size(48, 22)
        Me.txtmins.TabIndex = 5
        Me.txtmins.Text = ""
        '
        'Label7
        '
        Me.Label7.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(72, 32)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(40, 23)
        Me.Label7.TabIndex = 15
        Me.Label7.Text = "Hours"
        '
        'Label8
        '
        Me.Label8.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.Location = New System.Drawing.Point(72, 72)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(48, 16)
        Me.Label8.TabIndex = 16
        Me.Label8.Text = "Minutes"
        '
        'btnOk
        '
        Me.btnOk.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnOk.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnOk.Location = New System.Drawing.Point(624, 280)
        Me.btnOk.Name = "btnOk"
        Me.btnOk.TabIndex = 7
        Me.btnOk.Text = "OK"
        '
        'btnCancel
        '
        Me.btnCancel.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnCancel.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCancel.Location = New System.Drawing.Point(528, 280)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.TabIndex = 8
        Me.btnCancel.Text = "Cancel"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.txthrs)
        Me.GroupBox1.Controls.Add(Me.txtmins)
        Me.GroupBox1.Controls.Add(Me.Label7)
        Me.GroupBox1.Controls.Add(Me.Label8)
        Me.GroupBox1.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.GroupBox1.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(8, 176)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(368, 96)
        Me.GroupBox1.TabIndex = 20
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Duration"
        '
        'StatusBar1
        '
        Me.StatusBar1.Font = New System.Drawing.Font("Tahoma", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.StatusBar1.Location = New System.Drawing.Point(0, 314)
        Me.StatusBar1.Name = "StatusBar1"
        Me.StatusBar1.Size = New System.Drawing.Size(712, 22)
        Me.StatusBar1.SizingGrip = False
        Me.StatusBar1.TabIndex = 21
        Me.StatusBar1.Text = "StatusBar1"
        '
        'frmAddApmt
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(6, 13)
        Me.ClientSize = New System.Drawing.Size(712, 336)
        Me.ControlBox = False
        Me.Controls.Add(Me.txtNotes)
        Me.Controls.Add(Me.StatusBar1)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.btnCancel)
        Me.Controls.Add(Me.btnOk)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.txtLocation)
        Me.Controls.Add(Me.txtContact)
        Me.Controls.Add(Me.txtReason)
        Me.Controls.Add(Me.lblStart)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.Name = "frmAddApmt"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Add Appointment"
        Me.GroupBox1.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub btnOK_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnOk.Click
        Dim hrs As Integer
        Dim mins As Integer

        If txthrs.Text = "" Then
            StatusBar1.Text = "You must enter the length of time for hours"
            Exit Sub
        End If

        If txtmins.Text = "" Then
            StatusBar1.Text = "You must enter the length of time for minutes"
            Exit Sub
        End If

        hrs = Convert.ToInt16(txthrs.Text)
        mins = Convert.ToInt16(txtmins.Text)

        Try
            Dim Apmt As Appointment
            Apmt = New Appointment(start, txtReason.Text, txtContact.Text, txtLocation.Text, New TimeSpan(hrs, mins, 0), txtNotes.Text)
            idc.Add(Apmt)
            Me.Dispose()
            fMain.Show()
        Catch ex As ArgumentException
            StatusBar1.Text = ex.Message
        End Try

    End Sub

    Private Sub btnCancel_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCancel.Click

        Me.Dispose()

    End Sub

    Private Sub frmAddApmt_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        StatusBar1.Text = "Ready"

    End Sub

End Class
