Imports System
Imports AppointmentProgramLib

Public Class frmContact
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
    Friend WithEvents lblFirstName As System.Windows.Forms.Label
    Friend WithEvents txtFirstName As System.Windows.Forms.TextBox
    Friend WithEvents lblLastName As System.Windows.Forms.Label
    Friend WithEvents txtLastName As System.Windows.Forms.TextBox
    Friend WithEvents lblEmail As System.Windows.Forms.Label
    Friend WithEvents txtEmail As System.Windows.Forms.TextBox
    Friend WithEvents lblAddress As System.Windows.Forms.Label
    Friend WithEvents txtAddress As System.Windows.Forms.TextBox
    Friend WithEvents lblCity As System.Windows.Forms.Label
    Friend WithEvents lblState As System.Windows.Forms.Label
    Friend WithEvents lblZip As System.Windows.Forms.Label
    Friend WithEvents lblHomePhone As System.Windows.Forms.Label
    Friend WithEvents lblWorkPhone As System.Windows.Forms.Label
    Friend WithEvents lblCellPhone As System.Windows.Forms.Label
    Friend WithEvents lblNotes As System.Windows.Forms.Label
    Friend WithEvents txtCity As System.Windows.Forms.TextBox
    Friend WithEvents txtState As System.Windows.Forms.TextBox
    Friend WithEvents txtZip As System.Windows.Forms.TextBox
    Friend WithEvents txtHomePhone As System.Windows.Forms.TextBox
    Friend WithEvents txtWorkPhone As System.Windows.Forms.TextBox
    Friend WithEvents txtCellPhone As System.Windows.Forms.TextBox
    Friend WithEvents txtNotes As System.Windows.Forms.TextBox
    Friend WithEvents btnAddDelete As System.Windows.Forms.Button
    Friend WithEvents btnUpdate As System.Windows.Forms.Button
    Friend WithEvents btnFirst As System.Windows.Forms.Button
    Friend WithEvents btnPrevious As System.Windows.Forms.Button
    Friend WithEvents btnNext As System.Windows.Forms.Button
    Friend WithEvents btnLast As System.Windows.Forms.Button
    Friend WithEvents btnCancel As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblFirstName = New System.Windows.Forms.Label
        Me.txtFirstName = New System.Windows.Forms.TextBox
        Me.lblLastName = New System.Windows.Forms.Label
        Me.txtLastName = New System.Windows.Forms.TextBox
        Me.lblEmail = New System.Windows.Forms.Label
        Me.txtEmail = New System.Windows.Forms.TextBox
        Me.lblAddress = New System.Windows.Forms.Label
        Me.txtAddress = New System.Windows.Forms.TextBox
        Me.lblCity = New System.Windows.Forms.Label
        Me.lblState = New System.Windows.Forms.Label
        Me.lblZip = New System.Windows.Forms.Label
        Me.lblHomePhone = New System.Windows.Forms.Label
        Me.lblWorkPhone = New System.Windows.Forms.Label
        Me.lblCellPhone = New System.Windows.Forms.Label
        Me.lblNotes = New System.Windows.Forms.Label
        Me.txtCity = New System.Windows.Forms.TextBox
        Me.txtState = New System.Windows.Forms.TextBox
        Me.txtZip = New System.Windows.Forms.TextBox
        Me.txtHomePhone = New System.Windows.Forms.TextBox
        Me.txtWorkPhone = New System.Windows.Forms.TextBox
        Me.txtCellPhone = New System.Windows.Forms.TextBox
        Me.txtNotes = New System.Windows.Forms.TextBox
        Me.btnAddDelete = New System.Windows.Forms.Button
        Me.btnUpdate = New System.Windows.Forms.Button
        Me.btnFirst = New System.Windows.Forms.Button
        Me.btnPrevious = New System.Windows.Forms.Button
        Me.btnNext = New System.Windows.Forms.Button
        Me.btnLast = New System.Windows.Forms.Button
        Me.btnCancel = New System.Windows.Forms.Button
        Me.SuspendLayout()
        '
        'lblFirstName
        '
        Me.lblFirstName.Location = New System.Drawing.Point(8, 16)
        Me.lblFirstName.Name = "lblFirstName"
        Me.lblFirstName.Size = New System.Drawing.Size(80, 16)
        Me.lblFirstName.TabIndex = 0
        Me.lblFirstName.Text = "Frist Name:"
        '
        'txtFirstName
        '
        Me.txtFirstName.Location = New System.Drawing.Point(80, 16)
        Me.txtFirstName.Name = "txtFirstName"
        Me.txtFirstName.TabIndex = 1
        Me.txtFirstName.Text = ""
        '
        'lblLastName
        '
        Me.lblLastName.Location = New System.Drawing.Point(8, 48)
        Me.lblLastName.Name = "lblLastName"
        Me.lblLastName.Size = New System.Drawing.Size(100, 16)
        Me.lblLastName.TabIndex = 2
        Me.lblLastName.Text = "Last Name:"
        '
        'txtLastName
        '
        Me.txtLastName.Location = New System.Drawing.Point(80, 48)
        Me.txtLastName.Name = "txtLastName"
        Me.txtLastName.TabIndex = 3
        Me.txtLastName.Text = ""
        '
        'lblEmail
        '
        Me.lblEmail.Location = New System.Drawing.Point(8, 80)
        Me.lblEmail.Name = "lblEmail"
        Me.lblEmail.Size = New System.Drawing.Size(100, 16)
        Me.lblEmail.TabIndex = 4
        Me.lblEmail.Text = "E-Mail:"
        '
        'txtEmail
        '
        Me.txtEmail.Location = New System.Drawing.Point(80, 80)
        Me.txtEmail.Name = "txtEmail"
        Me.txtEmail.TabIndex = 5
        Me.txtEmail.Text = ""
        '
        'lblAddress
        '
        Me.lblAddress.Location = New System.Drawing.Point(8, 112)
        Me.lblAddress.Name = "lblAddress"
        Me.lblAddress.Size = New System.Drawing.Size(100, 16)
        Me.lblAddress.TabIndex = 6
        Me.lblAddress.Text = "Address:"
        '
        'txtAddress
        '
        Me.txtAddress.Location = New System.Drawing.Point(80, 112)
        Me.txtAddress.Name = "txtAddress"
        Me.txtAddress.Size = New System.Drawing.Size(104, 20)
        Me.txtAddress.TabIndex = 7
        Me.txtAddress.Text = ""
        '
        'lblCity
        '
        Me.lblCity.Location = New System.Drawing.Point(8, 144)
        Me.lblCity.Name = "lblCity"
        Me.lblCity.Size = New System.Drawing.Size(100, 16)
        Me.lblCity.TabIndex = 8
        Me.lblCity.Text = "City:"
        '
        'lblState
        '
        Me.lblState.Location = New System.Drawing.Point(8, 176)
        Me.lblState.Name = "lblState"
        Me.lblState.Size = New System.Drawing.Size(100, 16)
        Me.lblState.TabIndex = 9
        Me.lblState.Text = "State:"
        '
        'lblZip
        '
        Me.lblZip.Location = New System.Drawing.Point(8, 208)
        Me.lblZip.Name = "lblZip"
        Me.lblZip.Size = New System.Drawing.Size(100, 16)
        Me.lblZip.TabIndex = 10
        Me.lblZip.Text = "Zip:"
        '
        'lblHomePhone
        '
        Me.lblHomePhone.Location = New System.Drawing.Point(208, 16)
        Me.lblHomePhone.Name = "lblHomePhone"
        Me.lblHomePhone.Size = New System.Drawing.Size(100, 16)
        Me.lblHomePhone.TabIndex = 11
        Me.lblHomePhone.Text = "Home Phone:"
        '
        'lblWorkPhone
        '
        Me.lblWorkPhone.Location = New System.Drawing.Point(208, 48)
        Me.lblWorkPhone.Name = "lblWorkPhone"
        Me.lblWorkPhone.Size = New System.Drawing.Size(100, 16)
        Me.lblWorkPhone.TabIndex = 12
        Me.lblWorkPhone.Text = "Work Phone:"
        '
        'lblCellPhone
        '
        Me.lblCellPhone.Location = New System.Drawing.Point(208, 80)
        Me.lblCellPhone.Name = "lblCellPhone"
        Me.lblCellPhone.Size = New System.Drawing.Size(100, 16)
        Me.lblCellPhone.TabIndex = 13
        Me.lblCellPhone.Text = "Cell Phone:"
        '
        'lblNotes
        '
        Me.lblNotes.Location = New System.Drawing.Point(208, 112)
        Me.lblNotes.Name = "lblNotes"
        Me.lblNotes.Size = New System.Drawing.Size(100, 16)
        Me.lblNotes.TabIndex = 14
        Me.lblNotes.Text = "Notes:"
        '
        'txtCity
        '
        Me.txtCity.Location = New System.Drawing.Point(80, 144)
        Me.txtCity.Name = "txtCity"
        Me.txtCity.TabIndex = 15
        Me.txtCity.Text = ""
        '
        'txtState
        '
        Me.txtState.Location = New System.Drawing.Point(80, 176)
        Me.txtState.Name = "txtState"
        Me.txtState.TabIndex = 16
        Me.txtState.Text = ""
        '
        'txtZip
        '
        Me.txtZip.Location = New System.Drawing.Point(80, 208)
        Me.txtZip.Name = "txtZip"
        Me.txtZip.TabIndex = 17
        Me.txtZip.Text = ""
        '
        'txtHomePhone
        '
        Me.txtHomePhone.Location = New System.Drawing.Point(288, 16)
        Me.txtHomePhone.Name = "txtHomePhone"
        Me.txtHomePhone.TabIndex = 18
        Me.txtHomePhone.Text = ""
        '
        'txtWorkPhone
        '
        Me.txtWorkPhone.Location = New System.Drawing.Point(288, 48)
        Me.txtWorkPhone.Name = "txtWorkPhone"
        Me.txtWorkPhone.TabIndex = 19
        Me.txtWorkPhone.Text = ""
        '
        'txtCellPhone
        '
        Me.txtCellPhone.Location = New System.Drawing.Point(288, 80)
        Me.txtCellPhone.Name = "txtCellPhone"
        Me.txtCellPhone.TabIndex = 20
        Me.txtCellPhone.Text = ""
        '
        'txtNotes
        '
        Me.txtNotes.Location = New System.Drawing.Point(208, 136)
        Me.txtNotes.Multiline = True
        Me.txtNotes.Name = "txtNotes"
        Me.txtNotes.Size = New System.Drawing.Size(184, 104)
        Me.txtNotes.TabIndex = 21
        Me.txtNotes.Text = ""
        '
        'btnAddDelete
        '
        Me.btnAddDelete.Location = New System.Drawing.Point(416, 16)
        Me.btnAddDelete.Name = "btnAddDelete"
        Me.btnAddDelete.Size = New System.Drawing.Size(72, 24)
        Me.btnAddDelete.TabIndex = 22
        Me.btnAddDelete.Text = "Add"
        '
        'btnUpdate
        '
        Me.btnUpdate.Location = New System.Drawing.Point(416, 48)
        Me.btnUpdate.Name = "btnUpdate"
        Me.btnUpdate.Size = New System.Drawing.Size(72, 24)
        Me.btnUpdate.TabIndex = 23
        Me.btnUpdate.Text = "Update"
        '
        'btnFirst
        '
        Me.btnFirst.Location = New System.Drawing.Point(416, 80)
        Me.btnFirst.Name = "btnFirst"
        Me.btnFirst.TabIndex = 24
        Me.btnFirst.Text = "First"
        '
        'btnPrevious
        '
        Me.btnPrevious.Location = New System.Drawing.Point(416, 112)
        Me.btnPrevious.Name = "btnPrevious"
        Me.btnPrevious.TabIndex = 25
        Me.btnPrevious.Text = "Previous"
        '
        'btnNext
        '
        Me.btnNext.Location = New System.Drawing.Point(416, 144)
        Me.btnNext.Name = "btnNext"
        Me.btnNext.TabIndex = 26
        Me.btnNext.Text = "Next"
        '
        'btnLast
        '
        Me.btnLast.Location = New System.Drawing.Point(416, 176)
        Me.btnLast.Name = "btnLast"
        Me.btnLast.TabIndex = 27
        Me.btnLast.Text = "Last"
        '
        'btnCancel
        '
        Me.btnCancel.Location = New System.Drawing.Point(416, 208)
        Me.btnCancel.Name = "btnCancel"
        Me.btnCancel.TabIndex = 28
        Me.btnCancel.Text = "Cancel"
        '
        'frmContact
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(504, 253)
        Me.Controls.Add(Me.btnCancel)
        Me.Controls.Add(Me.btnLast)
        Me.Controls.Add(Me.btnNext)
        Me.Controls.Add(Me.btnPrevious)
        Me.Controls.Add(Me.btnFirst)
        Me.Controls.Add(Me.btnUpdate)
        Me.Controls.Add(Me.btnAddDelete)
        Me.Controls.Add(Me.txtNotes)
        Me.Controls.Add(Me.txtCellPhone)
        Me.Controls.Add(Me.txtWorkPhone)
        Me.Controls.Add(Me.txtHomePhone)
        Me.Controls.Add(Me.txtZip)
        Me.Controls.Add(Me.txtState)
        Me.Controls.Add(Me.txtCity)
        Me.Controls.Add(Me.lblNotes)
        Me.Controls.Add(Me.lblCellPhone)
        Me.Controls.Add(Me.lblWorkPhone)
        Me.Controls.Add(Me.lblHomePhone)
        Me.Controls.Add(Me.lblZip)
        Me.Controls.Add(Me.lblState)
        Me.Controls.Add(Me.lblCity)
        Me.Controls.Add(Me.txtAddress)
        Me.Controls.Add(Me.lblAddress)
        Me.Controls.Add(Me.txtEmail)
        Me.Controls.Add(Me.lblEmail)
        Me.Controls.Add(Me.txtLastName)
        Me.Controls.Add(Me.lblLastName)
        Me.Controls.Add(Me.txtFirstName)
        Me.Controls.Add(Me.lblFirstName)
        Me.Name = "frmContact"
        Me.Text = "frmContact"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private frmain As MainForm
    Private cc As ContactCollection
    Private c As Contact

    Private Sub btnAddDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAddDelete.Click
        Dim newc As Contact

        newc.FirstName = Me.txtFirstName.Text
        newc.LastName = Me.txtLastName.Text
        newc.EMail = Me.txtEmail.Text
        newc.Address = Me.txtAddress.Text
        newc.City = Me.txtCity.Text
        newc.State = Me.txtState.Text
        newc.Zip = Me.txtZip.Text
        newc.HomePhone = Me.txtHomePhone.Text
        newc.WorkPhone = Me.txtWorkPhone.Text
        newc.CellPhone = Me.txtCellPhone.Text
        newc.Notes = Me.txtNotes.Text

        Try
            cc.Add(newc)
        Catch ex As NullReferenceException
            MsgBox("Contact can not be null", MsgBoxStyle.Exclamation, "Error")
        End Try
    End Sub

    Private Sub btnUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnUpdate.Click
        Dim con As New Contact

        con.Address = Me.txtAddress.Text
        con.CellPhone = Me.txtCellPhone.Text
        con.City = Me.txtCity.Text
        con.EMail = Me.txtEmail.Text
        con.FirstName = Me.txtFirstName.Text
        con.HomePhone = Me.txtHomePhone.Text
        con.LastName = Me.txtLastName.Text
        con.Notes = Me.txtNotes.Text
        con.State = Me.txtState.Text
        con.WorkPhone = Me.txtWorkPhone.Text
        con.Zip = Me.txtZip.Text

        cc.Item(cc.IndexOf(c)) = con
        c = con
    End Sub

    Private Sub btnFirst_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFirst.Click
        c = cc.Item(0)
        fill(c)
    End Sub

    Private Sub btnLast_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLast.Click
        c = cc.Item(cc.Count - 1)
        fill(c)
    End Sub

    Private Sub btnPrevious_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnPrevious.Click
        If cc.IndexOf(c) = 0 Then
        Else
            Dim prevcontact As Contact
            prevcontact = cc.Item(cc.IndexOf(c) - 1)
            fill(prevcontact)
        End If
    End Sub

    Private Sub fill(ByVal con As Contact)
        Me.txtAddress.Text = con.Address
        Me.txtCellPhone.Text = con.CellPhone
        Me.txtCity.Text = con.City
        Me.txtEmail.Text = con.EMail
        Me.txtFirstName.Text = con.FirstName
        Me.txtHomePhone.Text = con.HomePhone
        Me.txtLastName.Text = con.LastName
        Me.txtNotes.Text = con.Notes
        Me.txtState.Text = con.State
        Me.txtWorkPhone.Text = con.WorkPhone
        Me.txtZip.Text = con.Zip

        c = con
    End Sub

    Private Sub btnNext_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNext.Click
        If cc.IndexOf(c) = (cc.Count - 1) Then
        Else
            Dim nextcon As Contact
            nextcon = cc.Item(cc.IndexOf(c) - 1)
            fill(nextcon)
        End If
    End Sub


    Private Sub btnCancel_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCancel.Click
        Me.Dispose()
    End Sub
End Class
