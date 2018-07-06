Imports System
Imports AppointmentProgramLib

Public Class addImportantDate
    Inherits System.Windows.Forms.Form
    Private mf As MainForm
    Private id As ImportantDate
    Private idc As ImportantDateCollection

#Region " Windows Form Designer generated code "
    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents lblDate As System.Windows.Forms.Label
    Friend WithEvents lblReason As System.Windows.Forms.Label
    Friend WithEvents cbxRecurring As System.Windows.Forms.CheckBox
    Friend WithEvents txtDate As System.Windows.Forms.TextBox
    Friend WithEvents txtReason As System.Windows.Forms.TextBox
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblDate = New System.Windows.Forms.Label
        Me.lblReason = New System.Windows.Forms.Label
        Me.cbxRecurring = New System.Windows.Forms.CheckBox
        Me.txtDate = New System.Windows.Forms.TextBox
        Me.txtReason = New System.Windows.Forms.TextBox
        Me.btnAdd = New System.Windows.Forms.Button
        Me.btnCancel = New System.Windows.Forms.Button
        Me.btnDelete = New System.Windows.Forms.Button
        Me.SuspendLayout()
        '
        'lblDate
        '
        Me.lblDate.Location = New System.Drawing.Point(8, 16)
        Me.lblDate.Name = "lblDate"
        Me.lblDate.Size = New System.Drawing.Size(100, 16)
        Me.lblDate.TabIndex = 0
        Me.lblDate.Text = "Date:"
        '
        'lblReason
        '
        Me.lblReason.Location = New System.Drawing.Point(8, 40)
        Me.lblReason.Name = "lblReason"
        Me.lblReason.Size = New System.Drawing.Size(100, 16)
        Me.lblReason.TabIndex = 1
        Me.lblReason.Text = "Reason:"
        '
        'cbxRecurring
        '
        Me.cbxRecurring.Location = New System.Drawing.Point(8, 64)
        Me.cbxRecurring.Name = "cbxRecurring"
        Me.cbxRecurring.TabIndex = 2
        Me.cbxRecurring.Text = "Recurring"
        '
        'txtDate
        '
        Me.txtDate.Location = New System.Drawing.Point(72, 8)
        Me.txtDate.Name = "txtDate"
        Me.txtDate.TabIndex = 3
        Me.txtDate.Text = ""
        '
        'txtReason
        '
        Me.txtReason.Location = New System.Drawing.Point(72, 32)
        Me.txtReason.Name = "txtReason"
        Me.txtReason.Size = New System.Drawing.Size(216, 20)
        Me.txtReason.TabIndex = 4
        Me.txtReason.Text = ""
        '
        'btnAdd
        '
        Me.btnAdd.Location = New System.Drawing.Point(24, 112)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.TabIndex = 5
        Me.btnAdd.Text = "Add"
        '
        'btnCancel
        '
        Me.btnCancel.Location = New System.Drawing.Point(200, 112)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.TabIndex = 6
        Me.btnCancel.Text = "Cancel"
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(112, 112)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.TabIndex = 7
        Me.btnDelete.Text = "Delete"
        Me.btnDelete.Visible = False
        '
        'addImportantDate
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(304, 157)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnCancel)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.txtReason)
        Me.Controls.Add(Me.txtDate)
        Me.Controls.Add(Me.cbxRecurring)
        Me.Controls.Add(Me.lblReason)
        Me.Controls.Add(Me.lblDate)
        Me.Name = "addImportantDate"
        Me.ShowInTaskbar = False
        Me.Text = "Add Important Date"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Public Sub New()
        MyBase.New()
        InitializeComponent()
    End Sub

    Public Sub New(ByVal mf As MainForm, ByVal id As ImportantDate, ByVal idc As ImportantDateCollection, ByVal modify As Boolean)
        MyBase.New()

        InitializeComponent()
        Try
            If modify = True Then
                Me.mf = mf
                Me.idc = idc
                Me.txtDate.Text = id.StartDate
                Me.txtReason.Text = id.theReason
                Me.cbxRecurring.Checked = id.isRecurring
                Me.id = id
                Me.Text = "Change/Delete Important Date"
                Me.btnAdd.Hide()
                Me.btnDelete.Show()
            End If
        Catch ex As Exception

        End Try
        
    End Sub

    Public Sub New(ByVal mf As MainForm, ByVal startdate As Date, ByVal idc As ImportantDateCollection, ByVal id As ImportantDate)
        MyBase.New()

        InitializeComponent()

        Me.mf = mf
        Me.id = id
        Me.idc = idc
        Me.txtDate.Text = startdate.ToString()

    End Sub

    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
    End Sub

    Private Sub btnAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAdd.Click
        Dim newid As ImportantDate
        Try
            newid = New ImportantDate
            newid.StartDate = Me.txtDate.Text
            newid.theReason = Me.txtReason.Text
            newid.isRecurring = Me.cbxRecurring.CheckState
        Catch ex As System.NullReferenceException
            MsgBox("Start Date: " & newid.StartDate & ", Reason: " & newid.theReason & ", Recurring: " & Me.cbxRecurring.CheckState)
        End Try

        If Me.txtDate.Text Is Nothing Then
            newid.StartDate = Date.Now()
        End If

        If Me.txtReason Is Nothing Then
            newid.theReason = "No reason"
        End If

        idc.Add(newid)

        Try
            mf.lst.Items.Add(newid.theReason)
        Catch ex As Exception
            MsgBox("Error adding Important Date!", MsgBoxStyle.Exclamation, "Error")
        End Try

        Me.Hide()
        mf.Show()
    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click

        mf.lst.Items.Remove(id)
        mf.lst.Items.RemoveAt(idc.IndexOf(id))
        idc.Remove(id)
        Me.Dispose()
        Me.Hide()
        mf.Show()
    End Sub

    Private Sub btnCancel_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCancel.Click
        Me.Dispose()
        Me.Hide()
        mf.Show()
    End Sub

    Private Sub addImportantDate_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub
End Class