Imports System
Imports ApptLib

Public Class frmContacts
    Inherits System.Windows.Forms.Form

    Private fMain As frmMain
    Private ContactC As ContactCollection
    Private CurrentContact As Contact


#Region " Windows Form Designer generated code "
    <System.STAThread()> _
    Public Shared Sub Main()
        System.Windows.Forms.Application.EnableVisualStyles()
        System.Windows.Forms.Application.Run(New frmContacts)
    End Sub
    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub
    Public Sub New(ByVal main As frmMain, ByVal CCol As ContactCollection)
        MyBase.New()
        InitializeComponent()
        Me.fMain = main
        Me.ContactC = CCol

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
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents Label10 As System.Windows.Forms.Label
    Friend WithEvents txtLName As System.Windows.Forms.TextBox
    Friend WithEvents txtFName As System.Windows.Forms.TextBox
    Friend WithEvents txtEmail As System.Windows.Forms.TextBox
    Friend WithEvents txtAddress As System.Windows.Forms.TextBox
    Friend WithEvents txtState As System.Windows.Forms.TextBox
    Friend WithEvents txtCity As System.Windows.Forms.TextBox
    Friend WithEvents txtZip As System.Windows.Forms.TextBox
    Friend WithEvents txtHPhone As System.Windows.Forms.TextBox
    Friend WithEvents txtWPhone As System.Windows.Forms.TextBox
    Friend WithEvents txtCPhone As System.Windows.Forms.TextBox
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents txtNotes As System.Windows.Forms.TextBox
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents btnUpdate As System.Windows.Forms.Button
    Friend WithEvents btnFirst As System.Windows.Forms.Button
    Friend WithEvents btnPrev As System.Windows.Forms.Button
    Friend WithEvents btnNext As System.Windows.Forms.Button
    Friend WithEvents btnLast As System.Windows.Forms.Button
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents StatusBar1 As System.Windows.Forms.StatusBar
    Friend WithEvents grpNav As System.Windows.Forms.GroupBox
    Friend WithEvents btnExit As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.Label7 = New System.Windows.Forms.Label
        Me.txtLName = New System.Windows.Forms.TextBox
        Me.txtFName = New System.Windows.Forms.TextBox
        Me.txtEmail = New System.Windows.Forms.TextBox
        Me.txtAddress = New System.Windows.Forms.TextBox
        Me.txtState = New System.Windows.Forms.TextBox
        Me.txtCity = New System.Windows.Forms.TextBox
        Me.txtZip = New System.Windows.Forms.TextBox
        Me.Label8 = New System.Windows.Forms.Label
        Me.Label9 = New System.Windows.Forms.Label
        Me.Label10 = New System.Windows.Forms.Label
        Me.txtHPhone = New System.Windows.Forms.TextBox
        Me.txtWPhone = New System.Windows.Forms.TextBox
        Me.txtCPhone = New System.Windows.Forms.TextBox
        Me.Label11 = New System.Windows.Forms.Label
        Me.txtNotes = New System.Windows.Forms.TextBox
        Me.btnAdd = New System.Windows.Forms.Button
        Me.btnUpdate = New System.Windows.Forms.Button
        Me.btnFirst = New System.Windows.Forms.Button
        Me.btnPrev = New System.Windows.Forms.Button
        Me.btnNext = New System.Windows.Forms.Button
        Me.btnLast = New System.Windows.Forms.Button
        Me.btnDelete = New System.Windows.Forms.Button
        Me.StatusBar1 = New System.Windows.Forms.StatusBar
        Me.grpNav = New System.Windows.Forms.GroupBox
        Me.btnExit = New System.Windows.Forms.Button
        Me.grpNav.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(16, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Last Name"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(16, 56)
        Me.Label2.Name = "Label2"
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "First Name"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(16, 96)
        Me.Label3.Name = "Label3"
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Email"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(16, 136)
        Me.Label4.Name = "Label4"
        Me.Label4.TabIndex = 3
        Me.Label4.Text = "Address"
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(16, 256)
        Me.Label5.Name = "Label5"
        Me.Label5.TabIndex = 6
        Me.Label5.Text = "Zip"
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.Location = New System.Drawing.Point(16, 216)
        Me.Label6.Name = "Label6"
        Me.Label6.TabIndex = 5
        Me.Label6.Text = "State"
        '
        'Label7
        '
        Me.Label7.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(16, 176)
        Me.Label7.Name = "Label7"
        Me.Label7.TabIndex = 4
        Me.Label7.Text = "City"
        '
        'txtLName
        '
        Me.txtLName.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtLName.Location = New System.Drawing.Point(88, 16)
        Me.txtLName.Name = "txtLName"
        Me.txtLName.Size = New System.Drawing.Size(184, 22)
        Me.txtLName.TabIndex = 7
        Me.txtLName.Text = ""
        '
        'txtFName
        '
        Me.txtFName.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtFName.Location = New System.Drawing.Point(88, 56)
        Me.txtFName.Name = "txtFName"
        Me.txtFName.Size = New System.Drawing.Size(184, 22)
        Me.txtFName.TabIndex = 8
        Me.txtFName.Text = ""
        '
        'txtEmail
        '
        Me.txtEmail.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtEmail.Location = New System.Drawing.Point(88, 96)
        Me.txtEmail.Name = "txtEmail"
        Me.txtEmail.Size = New System.Drawing.Size(184, 22)
        Me.txtEmail.TabIndex = 9
        Me.txtEmail.Text = ""
        '
        'txtAddress
        '
        Me.txtAddress.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtAddress.Location = New System.Drawing.Point(88, 136)
        Me.txtAddress.Name = "txtAddress"
        Me.txtAddress.Size = New System.Drawing.Size(184, 22)
        Me.txtAddress.TabIndex = 10
        Me.txtAddress.Text = ""
        '
        'txtState
        '
        Me.txtState.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtState.Location = New System.Drawing.Point(88, 216)
        Me.txtState.Name = "txtState"
        Me.txtState.Size = New System.Drawing.Size(40, 22)
        Me.txtState.TabIndex = 12
        Me.txtState.Text = ""
        '
        'txtCity
        '
        Me.txtCity.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCity.Location = New System.Drawing.Point(88, 176)
        Me.txtCity.Name = "txtCity"
        Me.txtCity.Size = New System.Drawing.Size(184, 22)
        Me.txtCity.TabIndex = 11
        Me.txtCity.Text = ""
        '
        'txtZip
        '
        Me.txtZip.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtZip.Location = New System.Drawing.Point(88, 256)
        Me.txtZip.Name = "txtZip"
        Me.txtZip.Size = New System.Drawing.Size(56, 22)
        Me.txtZip.TabIndex = 13
        Me.txtZip.Text = ""
        '
        'Label8
        '
        Me.Label8.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.Location = New System.Drawing.Point(312, 16)
        Me.Label8.Name = "Label8"
        Me.Label8.TabIndex = 14
        Me.Label8.Text = "Home Phone"
        '
        'Label9
        '
        Me.Label9.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label9.Location = New System.Drawing.Point(312, 56)
        Me.Label9.Name = "Label9"
        Me.Label9.TabIndex = 15
        Me.Label9.Text = "Work Phone"
        '
        'Label10
        '
        Me.Label10.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label10.Location = New System.Drawing.Point(312, 96)
        Me.Label10.Name = "Label10"
        Me.Label10.TabIndex = 16
        Me.Label10.Text = "Cell Phone"
        '
        'txtHPhone
        '
        Me.txtHPhone.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtHPhone.Location = New System.Drawing.Point(400, 16)
        Me.txtHPhone.Name = "txtHPhone"
        Me.txtHPhone.Size = New System.Drawing.Size(112, 22)
        Me.txtHPhone.TabIndex = 17
        Me.txtHPhone.Text = ""
        '
        'txtWPhone
        '
        Me.txtWPhone.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtWPhone.Location = New System.Drawing.Point(400, 56)
        Me.txtWPhone.Name = "txtWPhone"
        Me.txtWPhone.Size = New System.Drawing.Size(112, 22)
        Me.txtWPhone.TabIndex = 18
        Me.txtWPhone.Text = ""
        '
        'txtCPhone
        '
        Me.txtCPhone.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCPhone.Location = New System.Drawing.Point(400, 96)
        Me.txtCPhone.Name = "txtCPhone"
        Me.txtCPhone.Size = New System.Drawing.Size(112, 22)
        Me.txtCPhone.TabIndex = 19
        Me.txtCPhone.Text = ""
        '
        'Label11
        '
        Me.Label11.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label11.Location = New System.Drawing.Point(312, 136)
        Me.Label11.Name = "Label11"
        Me.Label11.TabIndex = 20
        Me.Label11.Text = "Notes"
        '
        'txtNotes
        '
        Me.txtNotes.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtNotes.Location = New System.Drawing.Point(312, 152)
        Me.txtNotes.Multiline = True
        Me.txtNotes.Name = "txtNotes"
        Me.txtNotes.Size = New System.Drawing.Size(368, 128)
        Me.txtNotes.TabIndex = 21
        Me.txtNotes.Text = ""
        '
        'btnAdd
        '
        Me.btnAdd.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnAdd.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnAdd.Location = New System.Drawing.Point(560, 16)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(120, 23)
        Me.btnAdd.TabIndex = 22
        Me.btnAdd.Text = "Add New Contact"
        '
        'btnUpdate
        '
        Me.btnUpdate.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnUpdate.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnUpdate.Location = New System.Drawing.Point(560, 56)
        Me.btnUpdate.Name = "btnUpdate"
        Me.btnUpdate.Size = New System.Drawing.Size(120, 23)
        Me.btnUpdate.TabIndex = 23
        Me.btnUpdate.Text = "Update"
        '
        'btnFirst
        '
        Me.btnFirst.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnFirst.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnFirst.Location = New System.Drawing.Point(16, 16)
        Me.btnFirst.Name = "btnFirst"
        Me.btnFirst.Size = New System.Drawing.Size(64, 32)
        Me.btnFirst.TabIndex = 25
        Me.btnFirst.Text = "First"
        '
        'btnPrev
        '
        Me.btnPrev.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnPrev.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnPrev.Location = New System.Drawing.Point(80, 16)
        Me.btnPrev.Name = "btnPrev"
        Me.btnPrev.Size = New System.Drawing.Size(64, 32)
        Me.btnPrev.TabIndex = 26
        Me.btnPrev.Text = "Previous"
        '
        'btnNext
        '
        Me.btnNext.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnNext.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnNext.Location = New System.Drawing.Point(144, 16)
        Me.btnNext.Name = "btnNext"
        Me.btnNext.Size = New System.Drawing.Size(64, 32)
        Me.btnNext.TabIndex = 27
        Me.btnNext.Text = "Next"
        '
        'btnLast
        '
        Me.btnLast.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnLast.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnLast.Location = New System.Drawing.Point(208, 16)
        Me.btnLast.Name = "btnLast"
        Me.btnLast.Size = New System.Drawing.Size(64, 32)
        Me.btnLast.TabIndex = 28
        Me.btnLast.Text = "Last"
        '
        'btnDelete
        '
        Me.btnDelete.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnDelete.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDelete.Location = New System.Drawing.Point(280, 16)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.Size = New System.Drawing.Size(75, 32)
        Me.btnDelete.TabIndex = 29
        Me.btnDelete.Text = "Delete"
        '
        'StatusBar1
        '
        Me.StatusBar1.Font = New System.Drawing.Font("Tahoma", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.StatusBar1.Location = New System.Drawing.Point(0, 354)
        Me.StatusBar1.Name = "StatusBar1"
        Me.StatusBar1.Size = New System.Drawing.Size(696, 22)
        Me.StatusBar1.SizingGrip = False
        Me.StatusBar1.TabIndex = 32
        Me.StatusBar1.Text = "StatusBar1"
        '
        'grpNav
        '
        Me.grpNav.Controls.Add(Me.btnPrev)
        Me.grpNav.Controls.Add(Me.btnNext)
        Me.grpNav.Controls.Add(Me.btnLast)
        Me.grpNav.Controls.Add(Me.btnDelete)
        Me.grpNav.Controls.Add(Me.btnFirst)
        Me.grpNav.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.grpNav.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.grpNav.Location = New System.Drawing.Point(312, 288)
        Me.grpNav.Name = "grpNav"
        Me.grpNav.Size = New System.Drawing.Size(368, 56)
        Me.grpNav.TabIndex = 33
        Me.grpNav.TabStop = False
        Me.grpNav.Text = "Contact List Navigation"
        '
        'btnExit
        '
        Me.btnExit.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnExit.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(560, 96)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(120, 23)
        Me.btnExit.TabIndex = 34
        Me.btnExit.Text = "Exit"
        '
        'frmContacts
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(696, 376)
        Me.ControlBox = False
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.grpNav)
        Me.Controls.Add(Me.StatusBar1)
        Me.Controls.Add(Me.btnUpdate)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.txtNotes)
        Me.Controls.Add(Me.Label11)
        Me.Controls.Add(Me.txtCPhone)
        Me.Controls.Add(Me.txtWPhone)
        Me.Controls.Add(Me.txtHPhone)
        Me.Controls.Add(Me.Label10)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.txtZip)
        Me.Controls.Add(Me.txtState)
        Me.Controls.Add(Me.txtCity)
        Me.Controls.Add(Me.txtAddress)
        Me.Controls.Add(Me.txtEmail)
        Me.Controls.Add(Me.txtFName)
        Me.Controls.Add(Me.txtLName)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle
        Me.MaximizeBox = False
        Me.Name = "frmContacts"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Contact List Manager"
        Me.grpNav.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub btnAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAdd.Click

        Dim newContact As Contact
        newContact = New Contact(txtLName.Text, txtFName.Text, txtEmail.Text, txtAddress.Text, txtCity.Text, txtState.Text, txtZip.Text, txtHPhone.Text, txtWPhone.Text, txtCPhone.Text, txtNotes.Text)

        Try
            ContactC.Add(newContact)
            CurrentContact = newContact
            ContactC.Sort()
            StatusBar1.Text = "Contact '" & txtFName.Text & " " & txtLName.Text & "' added"
            grpNav.Enabled = True
            btnUpdate.Enabled = True
            txtLName.Text = ""
            txtFName.Text = ""
            txtEmail.Text = ""
            txtAddress.Text = ""
            txtCity.Text = ""
            txtState.Text = ""
            txtZip.Text = ""
            txtHPhone.Text = ""
            txtWPhone.Text = ""
            txtCPhone.Text = ""
            txtNotes.Text = ""
        Catch ex As Exception
            StatusBar1.Text = ex.Message
        End Try

    End Sub

    Private Sub btnFirst_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFirst.Click
        Dim firstContact As Contact
        firstContact = ContactC.Item(0)
        ContactFill(firstContact)
        StatusBar1.Text = "Displaying contact 1 of " & Convert.ToString(ContactC.Count)

    End Sub

    Private Sub btnLast_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLast.Click
        Dim LastContact As Contact
        LastContact = ContactC.Item(ContactC.Count - 1)
        ContactFill(LastContact)
        StatusBar1.Text = "Displaying contact " & Convert.ToString(ContactC.Count) & " of " & Convert.ToString(ContactC.Count)
    End Sub

    Private Sub btnPrev_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnPrev.Click

        If ContactC.IndexOf(CurrentContact) = 0 Then
            txtFName.Focus()
            StatusBar1.Text = "Displaying contact 1 of " & Convert.ToString(ContactC.Count)
        Else
            Dim PrevContact As Contact
            PrevContact = ContactC.Item(ContactC.IndexOf(CurrentContact) - 1)
            ContactFill(PrevContact)
            StatusBar1.Text = "Displaying contact " & Convert.ToString(ContactC.IndexOf(CurrentContact) + 1) & " of " & Convert.ToString(ContactC.Count)
        End If

    End Sub

    Public Sub ContactFill(ByVal cContact As Contact)
        txtAddress.Text = cContact.Address
        txtCity.Text = cContact.City
        txtCPhone.Text = cContact.CellPh
        txtEmail.Text = cContact.Email
        txtFName.Text = cContact.FName
        txtHPhone.Text = cContact.HomePh
        txtLName.Text = cContact.LName
        txtNotes.Text = cContact.Notes
        txtState.Text = cContact.State
        txtWPhone.Text = cContact.WorkPh
        txtZip.Text = cContact.Zip

        CurrentContact = cContact
    End Sub

    Private Sub btnNext_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNext.Click

        If ContactC.IndexOf(CurrentContact) = (ContactC.Count - 1) Then
            txtFName.Focus()
            StatusBar1.Text = "Displaying contact " & Convert.ToString(ContactC.Count) & " of " & Convert.ToString(ContactC.Count)
        Else
            Dim nextContact As Contact
            nextContact = ContactC.Item(ContactC.IndexOf(CurrentContact) + 1)
            ContactFill(nextContact)
            StatusBar1.Text = "Displaying contact " & Convert.ToString(ContactC.IndexOf(CurrentContact) + 1) & " of " & Convert.ToString(ContactC.Count)
        End If

    End Sub

    Private Sub btnUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnUpdate.Click

        Dim cContact As Contact
        cContact = New Contact("", "", "", "", "", "", "", "", "", "", "")
        cContact.Address = txtAddress.Text
        cContact.City = txtCity.Text
        cContact.CellPh = txtCPhone.Text
        cContact.Email = txtEmail.Text
        cContact.FName = txtFName.Text
        cContact.HomePh = txtHPhone.Text
        cContact.LName = txtLName.Text
        cContact.Notes = txtNotes.Text
        cContact.State = txtState.Text
        cContact.WorkPh = txtWPhone.Text
        cContact.Zip = txtZip.Text

        ContactC.Item(ContactC.IndexOf(CurrentContact)) = cContact
        CurrentContact = cContact
        StatusBar1.Text = "Contact '" & txtFName.Text & " " & txtLName.Text & "' updated"

    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click

        Dim NewIndex As Integer
        Dim DelContact As String

        DelContact = txtFName.Text & " " & txtLName.Text
        NewIndex = ContactC.IndexOf(CurrentContact)
        ContactC.Remove(CurrentContact)
        StatusBar1.Text = "Contact " & DelContact & " deleted"

        If ContactC.Count > NewIndex Then
            ContactFill(ContactC.Item(NewIndex))
        Else
            NewIndex -= 1
            ContactFill(ContactC.Item(NewIndex))
        End If
        If ContactC.Count = 0 Then
            grpNav.Enabled = False
            btnUpdate.Enabled = False
        End If
        txtLName.Focus()

    End Sub

    Private Sub frmContacts_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        If ContactC.Count = 0 Then
            grpNav.Enabled = False
            btnUpdate.Enabled = False
        End If

        StatusBar1.Text = "Ready (" & ContactC.Count & " contact(s) saved)"

    End Sub

    Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click

        Me.Dispose()

    End Sub
End Class
