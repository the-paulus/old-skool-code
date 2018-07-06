Imports ApptLib
Public Class frmAddDate
    Inherits System.Windows.Forms.Form
    Private fMain As frmMain
    Private start As Date
    Private idc As ImportantDateCollection

#Region " Windows Form Designer generated code "
    <System.STAThread()> _
    Public Shared Sub Main()
        System.Windows.Forms.Application.EnableVisualStyles()
        System.Windows.Forms.Application.Run(New frmAddDate)
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
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents lblStart As System.Windows.Forms.Label
    Friend WithEvents txtReason As System.Windows.Forms.TextBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents chkRecur As System.Windows.Forms.CheckBox
    Friend WithEvents btnOk As System.Windows.Forms.Button
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    Friend WithEvents StatusBar1 As System.Windows.Forms.StatusBar
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label
        Me.lblStart = New System.Windows.Forms.Label
        Me.txtReason = New System.Windows.Forms.TextBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.chkRecur = New System.Windows.Forms.CheckBox
        Me.btnOk = New System.Windows.Forms.Button
        Me.btnCancel = New System.Windows.Forms.Button
        Me.StatusBar1 = New System.Windows.Forms.StatusBar
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(8, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(40, 23)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Start"
        '
        'lblStart
        '
        Me.lblStart.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblStart.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.lblStart.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStart.Location = New System.Drawing.Point(64, 8)
        Me.lblStart.Name = "lblStart"
        Me.lblStart.Size = New System.Drawing.Size(216, 23)
        Me.lblStart.TabIndex = 1
        '
        'txtReason
        '
        Me.txtReason.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtReason.Location = New System.Drawing.Point(64, 48)
        Me.txtReason.Name = "txtReason"
        Me.txtReason.Size = New System.Drawing.Size(216, 22)
        Me.txtReason.TabIndex = 2
        Me.txtReason.Text = ""
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(8, 56)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(56, 23)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "Reason"
        '
        'chkRecur
        '
        Me.chkRecur.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.chkRecur.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.chkRecur.Location = New System.Drawing.Point(64, 80)
        Me.chkRecur.Name = "chkRecur"
        Me.chkRecur.Size = New System.Drawing.Size(160, 24)
        Me.chkRecur.TabIndex = 4
        Me.chkRecur.Text = "Annually Recurring Date"
        '
        'btnOk
        '
        Me.btnOk.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnOk.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnOk.Location = New System.Drawing.Point(208, 112)
        Me.btnOk.Name = "btnOk"
        Me.btnOk.TabIndex = 5
        Me.btnOk.Text = "OK"
        '
        'btnCancel
        '
        Me.btnCancel.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnCancel.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCancel.Location = New System.Drawing.Point(112, 112)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.TabIndex = 6
        Me.btnCancel.Text = "Cancel"
        '
        'StatusBar1
        '
        Me.StatusBar1.Font = New System.Drawing.Font("Tahoma", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.StatusBar1.Location = New System.Drawing.Point(0, 146)
        Me.StatusBar1.Name = "StatusBar1"
        Me.StatusBar1.Size = New System.Drawing.Size(296, 22)
        Me.StatusBar1.SizingGrip = False
        Me.StatusBar1.TabIndex = 7
        Me.StatusBar1.Text = "StatusBar1"
        '
        'frmAddDate
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(296, 168)
        Me.ControlBox = False
        Me.Controls.Add(Me.StatusBar1)
        Me.Controls.Add(Me.btnCancel)
        Me.Controls.Add(Me.btnOk)
        Me.Controls.Add(Me.chkRecur)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtReason)
        Me.Controls.Add(Me.lblStart)
        Me.Controls.Add(Me.Label1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.Name = "frmAddDate"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Add Important Date"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub btnOk_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnOk.Click

        Dim newImpDate As ImportantDate
        newImpDate = New ImportantDate(start, txtReason.Text, chkRecur.Checked)

        Try
            idc.Add(newImpDate)
            Me.Dispose()
            fMain.Show()
        Catch ex As ArgumentOutOfRangeException
            StatusBar1.Text = "Error: Duplicate Date Entry!"
        End Try

    End Sub


    Private Sub btnCancel_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnCancel.Click

        Me.Dispose()

    End Sub

    Private Sub frmAddDate_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        StatusBar1.Text = ""

    End Sub

End Class
