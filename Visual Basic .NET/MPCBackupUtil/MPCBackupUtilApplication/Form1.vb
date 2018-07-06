Imports Microsoft.VisualBasic
Imports System
Imports System.Management
Imports MPCBackupUtilLib

Public Class Form1



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
    Friend WithEvents gbFiles As System.Windows.Forms.GroupBox
    Friend WithEvents clbFileExtentions As System.Windows.Forms.CheckedListBox
    Friend WithEvents lblDrive As System.Windows.Forms.Label
    Friend WithEvents ComboBox1 As System.Windows.Forms.ComboBox
    Friend WithEvents lblFileExtentions As System.Windows.Forms.Label
    Friend WithEvents txtExtentions As System.Windows.Forms.TextBox
    Friend WithEvents btnAddExt As System.Windows.Forms.Button
    Friend WithEvents btnDirectory As System.Windows.Forms.Button
    Friend WithEvents txtDirectory As System.Windows.Forms.TextBox
    Friend WithEvents lblDirectory As System.Windows.Forms.Label
    Friend WithEvents gbBackupLocation As System.Windows.Forms.GroupBox
    Friend WithEvents txtCustomerName As System.Windows.Forms.Label
    Friend WithEvents txtCustomer As System.Windows.Forms.TextBox
    Friend WithEvents lblDestination As System.Windows.Forms.Label
    Friend WithEvents txtDestination As System.Windows.Forms.TextBox
    Friend WithEvents btnBrowse As System.Windows.Forms.Button
    Friend WithEvents btnBackup As System.Windows.Forms.Button
    Friend WithEvents clbDirectories As System.Windows.Forms.CheckedListBox
    Friend WithEvents BackupDestination As System.Windows.Forms.FolderBrowserDialog
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.gbFiles = New System.Windows.Forms.GroupBox
        Me.btnDirectory = New System.Windows.Forms.Button
        Me.txtDirectory = New System.Windows.Forms.TextBox
        Me.lblDirectory = New System.Windows.Forms.Label
        Me.clbDirectories = New System.Windows.Forms.CheckedListBox
        Me.btnAddExt = New System.Windows.Forms.Button
        Me.txtExtentions = New System.Windows.Forms.TextBox
        Me.lblFileExtentions = New System.Windows.Forms.Label
        Me.ComboBox1 = New System.Windows.Forms.ComboBox
        Me.lblDrive = New System.Windows.Forms.Label
        Me.clbFileExtentions = New System.Windows.Forms.CheckedListBox
        Me.gbBackupLocation = New System.Windows.Forms.GroupBox
        Me.btnBackup = New System.Windows.Forms.Button
        Me.btnBrowse = New System.Windows.Forms.Button
        Me.txtDestination = New System.Windows.Forms.TextBox
        Me.lblDestination = New System.Windows.Forms.Label
        Me.txtCustomer = New System.Windows.Forms.TextBox
        Me.txtCustomerName = New System.Windows.Forms.Label
        Me.BackupDestination = New System.Windows.Forms.FolderBrowserDialog
        Me.gbFiles.SuspendLayout()
        Me.gbBackupLocation.SuspendLayout()
        Me.SuspendLayout()
        '
        'gbFiles
        '
        Me.gbFiles.Controls.Add(Me.btnDirectory)
        Me.gbFiles.Controls.Add(Me.txtDirectory)
        Me.gbFiles.Controls.Add(Me.lblDirectory)
        Me.gbFiles.Controls.Add(Me.clbDirectories)
        Me.gbFiles.Controls.Add(Me.btnAddExt)
        Me.gbFiles.Controls.Add(Me.txtExtentions)
        Me.gbFiles.Controls.Add(Me.lblFileExtentions)
        Me.gbFiles.Controls.Add(Me.ComboBox1)
        Me.gbFiles.Controls.Add(Me.lblDrive)
        Me.gbFiles.Controls.Add(Me.clbFileExtentions)
        Me.gbFiles.Location = New System.Drawing.Point(8, 8)
        Me.gbFiles.Name = "gbFiles"
        Me.gbFiles.Size = New System.Drawing.Size(368, 216)
        Me.gbFiles.TabIndex = 0
        Me.gbFiles.TabStop = False
        Me.gbFiles.Text = "Files to Backup:"
        '
        'btnDirectory
        '
        Me.btnDirectory.Location = New System.Drawing.Point(280, 176)
        Me.btnDirectory.Name = "btnDirectory"
        Me.btnDirectory.Size = New System.Drawing.Size(75, 24)
        Me.btnDirectory.TabIndex = 9
        Me.btnDirectory.Text = "Add Dir"
        '
        'txtDirectory
        '
        Me.txtDirectory.Location = New System.Drawing.Point(192, 176)
        Me.txtDirectory.Name = "txtDirectory"
        Me.txtDirectory.Size = New System.Drawing.Size(80, 20)
        Me.txtDirectory.TabIndex = 8
        Me.txtDirectory.Text = ""
        '
        'lblDirectory
        '
        Me.lblDirectory.Location = New System.Drawing.Point(192, 56)
        Me.lblDirectory.Name = "lblDirectory"
        Me.lblDirectory.Size = New System.Drawing.Size(100, 16)
        Me.lblDirectory.TabIndex = 7
        Me.lblDirectory.Text = "Directories:"
        '
        'clbDirectories
        '
        Me.clbDirectories.Location = New System.Drawing.Point(192, 80)
        Me.clbDirectories.Name = "clbDirectories"
        Me.clbDirectories.Size = New System.Drawing.Size(160, 94)
        Me.clbDirectories.TabIndex = 6
        '
        'btnAddExt
        '
        Me.btnAddExt.Location = New System.Drawing.Point(96, 176)
        Me.btnAddExt.Name = "btnAddExt"
        Me.btnAddExt.TabIndex = 5
        Me.btnAddExt.Text = "Add Ext"
        '
        'txtExtentions
        '
        Me.txtExtentions.Location = New System.Drawing.Point(8, 176)
        Me.txtExtentions.Name = "txtExtentions"
        Me.txtExtentions.Size = New System.Drawing.Size(80, 20)
        Me.txtExtentions.TabIndex = 4
        Me.txtExtentions.Text = ""
        '
        'lblFileExtentions
        '
        Me.lblFileExtentions.Location = New System.Drawing.Point(8, 56)
        Me.lblFileExtentions.Name = "lblFileExtentions"
        Me.lblFileExtentions.Size = New System.Drawing.Size(100, 16)
        Me.lblFileExtentions.TabIndex = 3
        Me.lblFileExtentions.Text = "File Extentions: "
        '
        'ComboBox1
        '
        Me.ComboBox1.Location = New System.Drawing.Point(48, 16)
        Me.ComboBox1.Name = "ComboBox1"
        Me.ComboBox1.Size = New System.Drawing.Size(121, 21)
        Me.ComboBox1.TabIndex = 2
        Me.ComboBox1.Text = "ComboBox1"
        '
        'lblDrive
        '
        Me.lblDrive.Location = New System.Drawing.Point(8, 24)
        Me.lblDrive.Name = "lblDrive"
        Me.lblDrive.Size = New System.Drawing.Size(100, 16)
        Me.lblDrive.TabIndex = 1
        Me.lblDrive.Text = "Drive"
        '
        'clbFileExtentions
        '
        Me.clbFileExtentions.Location = New System.Drawing.Point(8, 80)
        Me.clbFileExtentions.Name = "clbFileExtentions"
        Me.clbFileExtentions.Size = New System.Drawing.Size(160, 94)
        Me.clbFileExtentions.TabIndex = 0
        '
        'gbBackupLocation
        '
        Me.gbBackupLocation.Controls.Add(Me.btnBackup)
        Me.gbBackupLocation.Controls.Add(Me.btnBrowse)
        Me.gbBackupLocation.Controls.Add(Me.txtDestination)
        Me.gbBackupLocation.Controls.Add(Me.lblDestination)
        Me.gbBackupLocation.Controls.Add(Me.txtCustomer)
        Me.gbBackupLocation.Controls.Add(Me.txtCustomerName)
        Me.gbBackupLocation.Location = New System.Drawing.Point(8, 240)
        Me.gbBackupLocation.Name = "gbBackupLocation"
        Me.gbBackupLocation.Size = New System.Drawing.Size(360, 120)
        Me.gbBackupLocation.TabIndex = 1
        Me.gbBackupLocation.TabStop = False
        Me.gbBackupLocation.Text = "Backup Location:"
        '
        'btnBackup
        '
        Me.btnBackup.Location = New System.Drawing.Point(184, 80)
        Me.btnBackup.Name = "btnBackup"
        Me.btnBackup.TabIndex = 5
        Me.btnBackup.Text = "Backup"
        '
        'btnBrowse
        '
        Me.btnBrowse.Location = New System.Drawing.Point(272, 80)
        Me.btnBrowse.Name = "btnBrowse"
        Me.btnBrowse.TabIndex = 4
        Me.btnBrowse.Text = "Browse"
        '
        'txtDestination
        '
        Me.txtDestination.Location = New System.Drawing.Point(104, 48)
        Me.txtDestination.Name = "txtDestination"
        Me.txtDestination.Size = New System.Drawing.Size(240, 20)
        Me.txtDestination.TabIndex = 3
        Me.txtDestination.Text = ""
        '
        'lblDestination
        '
        Me.lblDestination.Location = New System.Drawing.Point(8, 48)
        Me.lblDestination.Name = "lblDestination"
        Me.lblDestination.Size = New System.Drawing.Size(100, 16)
        Me.lblDestination.TabIndex = 2
        Me.lblDestination.Text = "Destination:"
        '
        'txtCustomer
        '
        Me.txtCustomer.Location = New System.Drawing.Point(104, 16)
        Me.txtCustomer.Name = "txtCustomer"
        Me.txtCustomer.Size = New System.Drawing.Size(240, 20)
        Me.txtCustomer.TabIndex = 1
        Me.txtCustomer.Text = ""
        '
        'txtCustomerName
        '
        Me.txtCustomerName.Location = New System.Drawing.Point(8, 24)
        Me.txtCustomerName.Name = "txtCustomerName"
        Me.txtCustomerName.Size = New System.Drawing.Size(100, 16)
        Me.txtCustomerName.TabIndex = 0
        Me.txtCustomerName.Text = "Customer's Name:"
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(384, 373)
        Me.Controls.Add(Me.gbBackupLocation)
        Me.Controls.Add(Me.gbFiles)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.gbFiles.ResumeLayout(False)
        Me.gbBackupLocation.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Dim t As Collection
        Dim i As Integer
        t = MPCBackupUtilLib.MPCBackupUtilLib.GetAvalibleDrives()
        For i = 0 To t.Count - 1
            ComboBox1.Items.Add(t.Item(i))
        Next

    End Sub

    Private Sub gbFiles_Enter(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles gbFiles.Enter

    End Sub

    Private Sub btnAddExt_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAddExt.Click
        clbFileExtentions.Items.Add(txtExtentions.Text)
    End Sub

    Private Sub btnDirectory_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDirectory.Click
        clbDirectories.Items.Add(txtDirectory.Text)
    End Sub

    Private Sub btnBrowse_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBrowse.Click
        BackupDestination.ShowDialog()
        txtDestination.Text = BackupDestination.SelectedPath() & "\" & txtCustomer.Text
    End Sub
End Class
