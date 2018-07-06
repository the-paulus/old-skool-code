Imports ApptLib
Public Class frmChgDate
    Inherits System.Windows.Forms.Form
    Private fMain As frmMain
    Private id As ImportantDate
    Private idc As ImportantDateCollection

#Region " Windows Form Designer generated code "
    <System.STAThread()> _
    Public Shared Sub Main()
        System.Windows.Forms.Application.EnableVisualStyles()
        System.Windows.Forms.Application.Run(New frmChgDate)
    End Sub
    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub
    Public Sub New(ByVal fMain As frmMain, ByVal id As ImportantDate, ByVal idc As ImportantDateCollection)
        MyBase.New()
        InitializeComponent()
        Me.fMain = fMain
        Me.id = id
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
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    Friend WithEvents btnOk As System.Windows.Forms.Button
    Friend WithEvents chkRecur As System.Windows.Forms.CheckBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents txtReason As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents txtStart As System.Windows.Forms.TextBox
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.btnCancel = New System.Windows.Forms.Button
        Me.btnOk = New System.Windows.Forms.Button
        Me.chkRecur = New System.Windows.Forms.CheckBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.txtReason = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.txtStart = New System.Windows.Forms.TextBox
        Me.SuspendLayout()
        '
        'btnCancel
        '
        Me.btnCancel.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnCancel.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCancel.Location = New System.Drawing.Point(120, 112)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.TabIndex = 14
        Me.btnCancel.Text = "Cancel"
        '
        'btnOk
        '
        Me.btnOk.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnOk.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnOk.Location = New System.Drawing.Point(216, 112)
        Me.btnOk.Name = "btnOk"
        Me.btnOk.TabIndex = 13
        Me.btnOk.Text = "OK"
        '
        'chkRecur
        '
        Me.chkRecur.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.chkRecur.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.chkRecur.Location = New System.Drawing.Point(72, 80)
        Me.chkRecur.Name = "chkRecur"
        Me.chkRecur.Size = New System.Drawing.Size(216, 24)
        Me.chkRecur.TabIndex = 12
        Me.chkRecur.Text = "Annually Recurring Date"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(8, 56)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(56, 23)
        Me.Label3.TabIndex = 11
        Me.Label3.Text = "Reason"
        '
        'txtReason
        '
        Me.txtReason.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtReason.Location = New System.Drawing.Point(72, 48)
        Me.txtReason.Name = "txtReason"
        Me.txtReason.Size = New System.Drawing.Size(216, 22)
        Me.txtReason.TabIndex = 10
        Me.txtReason.Text = ""
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(8, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(40, 23)
        Me.Label1.TabIndex = 8
        Me.Label1.Text = "Start"
        '
        'txtStart
        '
        Me.txtStart.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtStart.Location = New System.Drawing.Point(72, 8)
        Me.txtStart.Name = "txtStart"
        Me.txtStart.Size = New System.Drawing.Size(216, 22)
        Me.txtStart.TabIndex = 16
        Me.txtStart.Text = ""
        '
        'frmChgDate
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(312, 144)
        Me.ControlBox = False
        Me.Controls.Add(Me.txtStart)
        Me.Controls.Add(Me.btnCancel)
        Me.Controls.Add(Me.btnOk)
        Me.Controls.Add(Me.chkRecur)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtReason)
        Me.Controls.Add(Me.Label1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.MaximizeBox = False
        Me.Name = "frmChgDate"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Edit Important Date"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub btnOk_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnOk.Click

        id.Start = txtStart.Text
        id.Reason = txtReason.Text
        If chkRecur.Checked = True Then
            id.Recurring = True
        End If

        Me.Dispose()
        fMain.Show()
    End Sub


    Private Sub btnCancel_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnCancel.Click

        Me.Dispose()
        fMain.Show()

    End Sub

    Private Sub frmChgDate_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles MyBase.Load
        txtStart.Text = id.Start
        txtReason.Text = id.Reason
        If id.Recurring = True Then
            chkRecur.Checked = True
        End If

    End Sub
End Class
