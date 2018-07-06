Imports ApptLib

Public Class frmChgApmt
    Inherits System.Windows.Forms.Form
    Private fMain As frmMain
    Private ap As Appointment
    Private idc As ImportantDateCollection

#Region " Windows Form Designer generated code "
    <System.STAThread()> _
    Public Shared Sub Main()
        System.Windows.Forms.Application.EnableVisualStyles()
        System.Windows.Forms.Application.Run(New frmChgApmt)
    End Sub
    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub
    Public Sub New(ByVal fMain As frmMain, ByVal ap As Appointment, ByVal idc As ImportantDateCollection)
        MyBase.New()
        Me.fMain = fMain
        Me.ap = ap
        Me.idc = idc

        InitializeComponent()
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
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    Friend WithEvents btnOk As System.Windows.Forms.Button
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents txtmins As System.Windows.Forms.TextBox
    Friend WithEvents txthrs As System.Windows.Forms.TextBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents txtLocation As System.Windows.Forms.TextBox
    Friend WithEvents txtContact As System.Windows.Forms.TextBox
    Friend WithEvents txtNotes As System.Windows.Forms.TextBox
    Friend WithEvents txtReason As System.Windows.Forms.TextBox
    Friend WithEvents txtStart As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents StatusBar1 As System.Windows.Forms.StatusBar
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.btnCancel = New System.Windows.Forms.Button
        Me.btnOk = New System.Windows.Forms.Button
        Me.Label8 = New System.Windows.Forms.Label
        Me.Label7 = New System.Windows.Forms.Label
        Me.txtmins = New System.Windows.Forms.TextBox
        Me.txthrs = New System.Windows.Forms.TextBox
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label1 = New System.Windows.Forms.Label
        Me.txtLocation = New System.Windows.Forms.TextBox
        Me.txtContact = New System.Windows.Forms.TextBox
        Me.txtNotes = New System.Windows.Forms.TextBox
        Me.txtReason = New System.Windows.Forms.TextBox
        Me.txtStart = New System.Windows.Forms.TextBox
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.StatusBar1 = New System.Windows.Forms.StatusBar
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'btnCancel
        '
        Me.btnCancel.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnCancel.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCancel.Location = New System.Drawing.Point(528, 280)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.TabIndex = 36
        Me.btnCancel.Text = "Cancel"
        '
        'btnOk
        '
        Me.btnOk.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnOk.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnOk.Location = New System.Drawing.Point(624, 280)
        Me.btnOk.Name = "btnOk"
        Me.btnOk.TabIndex = 35
        Me.btnOk.Text = "OK"
        '
        'Label8
        '
        Me.Label8.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.Location = New System.Drawing.Point(64, 72)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(56, 23)
        Me.Label8.TabIndex = 34
        Me.Label8.Text = "Minutes"
        '
        'Label7
        '
        Me.Label7.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(64, 32)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(56, 23)
        Me.Label7.TabIndex = 33
        Me.Label7.Text = "Hours"
        '
        'txtmins
        '
        Me.txtmins.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtmins.Location = New System.Drawing.Point(8, 64)
        Me.txtmins.Name = "txtmins"
        Me.txtmins.Size = New System.Drawing.Size(48, 22)
        Me.txtmins.TabIndex = 31
        Me.txtmins.Text = ""
        '
        'txthrs
        '
        Me.txthrs.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txthrs.Location = New System.Drawing.Point(8, 24)
        Me.txthrs.Name = "txthrs"
        Me.txthrs.Size = New System.Drawing.Size(48, 22)
        Me.txthrs.TabIndex = 30
        Me.txthrs.Text = ""
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(408, 8)
        Me.Label5.Name = "Label5"
        Me.Label5.TabIndex = 29
        Me.Label5.Text = "Notes"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(8, 136)
        Me.Label4.Name = "Label4"
        Me.Label4.TabIndex = 28
        Me.Label4.Text = "Location"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(8, 56)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 27
        Me.Label3.Text = "Contact"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(8, 96)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 26
        Me.Label2.Text = "Reason"
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(8, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 25
        Me.Label1.Text = "Start Date"
        '
        'txtLocation
        '
        Me.txtLocation.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtLocation.Location = New System.Drawing.Point(112, 136)
        Me.txtLocation.Name = "txtLocation"
        Me.txtLocation.Size = New System.Drawing.Size(256, 22)
        Me.txtLocation.TabIndex = 24
        Me.txtLocation.Text = ""
        '
        'txtContact
        '
        Me.txtContact.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtContact.Location = New System.Drawing.Point(112, 56)
        Me.txtContact.Name = "txtContact"
        Me.txtContact.Size = New System.Drawing.Size(256, 22)
        Me.txtContact.TabIndex = 23
        Me.txtContact.Text = ""
        '
        'txtNotes
        '
        Me.txtNotes.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtNotes.Location = New System.Drawing.Point(416, 24)
        Me.txtNotes.Multiline = True
        Me.txtNotes.Name = "txtNotes"
        Me.txtNotes.ScrollBars = System.Windows.Forms.ScrollBars.Vertical
        Me.txtNotes.Size = New System.Drawing.Size(280, 248)
        Me.txtNotes.TabIndex = 22
        Me.txtNotes.Text = ""
        '
        'txtReason
        '
        Me.txtReason.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtReason.Location = New System.Drawing.Point(112, 96)
        Me.txtReason.Name = "txtReason"
        Me.txtReason.Size = New System.Drawing.Size(256, 22)
        Me.txtReason.TabIndex = 21
        Me.txtReason.Text = ""
        '
        'txtStart
        '
        Me.txtStart.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtStart.Location = New System.Drawing.Point(112, 16)
        Me.txtStart.Name = "txtStart"
        Me.txtStart.Size = New System.Drawing.Size(256, 22)
        Me.txtStart.TabIndex = 38
        Me.txtStart.Text = ""
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
        Me.GroupBox1.Size = New System.Drawing.Size(360, 104)
        Me.GroupBox1.TabIndex = 39
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
        Me.StatusBar1.TabIndex = 40
        Me.StatusBar1.Text = "StatusBar1"
        '
        'frmChgApmt
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(712, 336)
        Me.ControlBox = False
        Me.Controls.Add(Me.txtNotes)
        Me.Controls.Add(Me.StatusBar1)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.txtStart)
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
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.Name = "frmChgApmt"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Edit Appointment"
        Me.GroupBox1.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub btnCancel_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCancel.Click
        Me.Dispose()
        fMain.Show()
    End Sub

    Private Sub btnOk_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnOk.Click
        Try
            ap.Start = txtStart.Text
            ap.Reason = txtReason.Text
            ap.Contact = txtContact.Text
            ap.Location = txtLocation.Text
            ap.Notes = txtNotes.Text
            Dim hrs As Int16
            Dim min As Int16
            hrs = Convert.ToInt16(txthrs.Text)
            min = Convert.ToInt16(txtmins.Text)
            ap.Duration = New TimeSpan(hrs, min, 0)

            Me.Dispose()
            fMain.Show()
        Catch ex As Exception
            StatusBar1.Text = ex.Message
        End Try

    End Sub

    Private Sub frmChgApmt_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles MyBase.Load
        txtStart.Text = ap.Start
        txtReason.Text = ap.Reason
        txtContact.Text = ap.Contact
        txtLocation.Text = ap.Location
        txtNotes.Text = ap.Notes
        txthrs.Text = ap.Duration.Hours
        txtmins.Text = ap.Duration.Minutes
        StatusBar1.Text = "Ready"
    End Sub
End Class
