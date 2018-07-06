Imports ApptLib
Public Class frmMain
    Inherits System.Windows.Forms.Form
    Private idc As ImportantDateCollection
    Private ContactC As ContactCollection
    Private dts As ImportantDateCollection
    Private selectedDate As Date

#Region " Windows Form Designer generated code "
    <System.STAThread()> _
    Public Shared Sub Main()
        System.Windows.Forms.Application.EnableVisualStyles()
        System.Windows.Forms.Application.Run(New frmMain)
    End Sub

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
    Friend WithEvents btnSave As System.Windows.Forms.Button
    Friend WithEvents btnAddDate As System.Windows.Forms.Button
    Friend WithEvents btnAddApmt As System.Windows.Forms.Button
    Friend WithEvents btnContacts As System.Windows.Forms.Button
    Friend WithEvents MonthCalendar As System.Windows.Forms.MonthCalendar
    Friend WithEvents StatusBar1 As System.Windows.Forms.StatusBar
    Friend WithEvents btnExit As System.Windows.Forms.Button
    Friend WithEvents lstTasks As System.Windows.Forms.ListBox
    Friend WithEvents ToolTip1 As System.Windows.Forms.ToolTip
    Friend WithEvents Timer1 As System.Windows.Forms.Timer
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container
        Dim resources As System.Resources.ResourceManager = New System.Resources.ResourceManager(GetType(frmMain))
        Me.btnSave = New System.Windows.Forms.Button
        Me.btnAddDate = New System.Windows.Forms.Button
        Me.btnAddApmt = New System.Windows.Forms.Button
        Me.btnContacts = New System.Windows.Forms.Button
        Me.MonthCalendar = New System.Windows.Forms.MonthCalendar
        Me.lstTasks = New System.Windows.Forms.ListBox
        Me.StatusBar1 = New System.Windows.Forms.StatusBar
        Me.btnExit = New System.Windows.Forms.Button
        Me.ToolTip1 = New System.Windows.Forms.ToolTip(Me.components)
        Me.Timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.SuspendLayout()
        '
        'btnSave
        '
        Me.btnSave.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnSave.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnSave.Location = New System.Drawing.Point(232, 8)
        Me.btnSave.Name = "btnSave"
        Me.btnSave.Size = New System.Drawing.Size(136, 23)
        Me.btnSave.TabIndex = 0
        Me.btnSave.Text = "Save"
        '
        'btnAddDate
        '
        Me.btnAddDate.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnAddDate.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnAddDate.Location = New System.Drawing.Point(232, 40)
        Me.btnAddDate.Name = "btnAddDate"
        Me.btnAddDate.Size = New System.Drawing.Size(136, 23)
        Me.btnAddDate.TabIndex = 1
        Me.btnAddDate.Text = "Add a Significant Date"
        '
        'btnAddApmt
        '
        Me.btnAddApmt.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnAddApmt.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnAddApmt.Location = New System.Drawing.Point(232, 72)
        Me.btnAddApmt.Name = "btnAddApmt"
        Me.btnAddApmt.Size = New System.Drawing.Size(136, 23)
        Me.btnAddApmt.TabIndex = 2
        Me.btnAddApmt.Text = "Add Appointment"
        '
        'btnContacts
        '
        Me.btnContacts.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnContacts.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnContacts.Location = New System.Drawing.Point(232, 104)
        Me.btnContacts.Name = "btnContacts"
        Me.btnContacts.Size = New System.Drawing.Size(136, 23)
        Me.btnContacts.TabIndex = 3
        Me.btnContacts.Text = "Contact List"
        '
        'MonthCalendar
        '
        Me.MonthCalendar.Font = New System.Drawing.Font("Tahoma", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.MonthCalendar.Location = New System.Drawing.Point(8, 8)
        Me.MonthCalendar.MaxSelectionCount = 30
        Me.MonthCalendar.Name = "MonthCalendar"
        Me.MonthCalendar.ShowWeekNumbers = True
        Me.MonthCalendar.TabIndex = 5
        '
        'lstTasks
        '
        Me.lstTasks.Font = New System.Drawing.Font("Lucida Console", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lstTasks.HorizontalScrollbar = True
        Me.lstTasks.Location = New System.Drawing.Point(8, 176)
        Me.lstTasks.Name = "lstTasks"
        Me.lstTasks.Size = New System.Drawing.Size(360, 238)
        Me.lstTasks.TabIndex = 6
        '
        'StatusBar1
        '
        Me.StatusBar1.Font = New System.Drawing.Font("Tahoma", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.StatusBar1.Location = New System.Drawing.Point(0, 426)
        Me.StatusBar1.Name = "StatusBar1"
        Me.StatusBar1.Size = New System.Drawing.Size(378, 22)
        Me.StatusBar1.SizingGrip = False
        Me.StatusBar1.TabIndex = 7
        Me.StatusBar1.Text = "StatusBar1"
        '
        'btnExit
        '
        Me.btnExit.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.btnExit.FlatStyle = System.Windows.Forms.FlatStyle.System
        Me.btnExit.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(232, 136)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(136, 23)
        Me.btnExit.TabIndex = 8
        Me.btnExit.Text = "Exit"
        '
        'frmMain
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.CancelButton = Me.btnExit
        Me.ClientSize = New System.Drawing.Size(378, 448)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.StatusBar1)
        Me.Controls.Add(Me.lstTasks)
        Me.Controls.Add(Me.MonthCalendar)
        Me.Controls.Add(Me.btnContacts)
        Me.Controls.Add(Me.btnAddApmt)
        Me.Controls.Add(Me.btnAddDate)
        Me.Controls.Add(Me.btnSave)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "frmMain"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Date and Contact Manager"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub fillListBox(ByVal dt As Date)

        Dim lstItem As String

        dts = idc.GetDatesBetween(dt, dt.AddDays(7))
        lstTasks.Items.Clear()

        For Each id As ImportantDate In dts
            lstItem = ""
            If (id.Start.Day - MonthCalendar.SelectionStart.Day).Equals(0) Then
                lstItem &= id.Start.ToShortDateString & " - " & id.Reason
            ElseIf (id.Start.Day - MonthCalendar.SelectionStart.Day).Equals(1) Then
                lstItem &= id.Start.ToShortDateString & " - " & id.Reason & " (In 1 day)"
            Else
                lstItem &= id.Start.ToShortDateString & " - " & id.Reason & " (In " & (Convert.ToString(id.Start.Day - MonthCalendar.SelectionStart.Day)) & " days)"
            End If
            lstTasks.Items.Add(lstItem)
            StatusBar1.Text = "Loading Calendar Item " & lstItem
        Next
        StatusBar1.Text = "Calendar for " & dt.ToLongDateString & " loaded"

    End Sub

    Private Sub btnSave_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSave.Click

        Try
            StatusBar1.Text = "Saving Dates..."
            idc.Serialize(idc, System.Environment.CurrentDirectory & "\dates.soap")
            StatusBar1.Text = "Saved to " & System.Environment.CurrentDirectory
        Catch ex As Exception
            StatusBar1.Text = "Error while saving Dates: " & ex.message
        End Try

        Try
            StatusBar1.Text = "Saving Contact List..."
            ContactC.Serialize(ContactC, System.Environment.CurrentDirectory & "\contacts.soap")
            StatusBar1.Text = "Saved to " & System.Environment.CurrentDirectory
        Catch ex As Exception
            StatusBar1.Text = "Error while saving Contact List: " & ex.message
        End Try
        
    End Sub

    Private Sub StatusBar1_MouseHover(ByVal sender As Object, ByVal e As System.EventArgs) Handles StatusBar1.MouseHover

        ToolTip1.SetToolTip(StatusBar1, StatusBar1.Text)

    End Sub

    Private Sub frmMain_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        StatusBar1.Text = ""

        Try
            StatusBar1.Text = "Loading Dates..."
            idc = ImportantDateCollection.DeSerialize(System.Environment.CurrentDirectory & "\dates.soap")
            Me.fillListBox(Today)
            StatusBar1.Text = "Dates Loaded Successfully"
        Catch ex As Exception
            idc = New ImportantDateCollection
            Dim LoadErr As String
            StatusBar1.Text = "Dates load error: " & ex.message
        End Try

        Try
            StatusBar1.Text = "Loading Contact List..."
            ContactC = ContactCollection.DeSerialize(System.Environment.CurrentDirectory & "\contacts.soap")
            StatusBar1.Text = "Contact List Loaded Successfully"
        Catch ex As Exception
            ContactC = New ContactCollection
            StatusBar1.Text = "Contact List load error: " & ex.message
        End Try

        selectedDate = Today

    End Sub

    Private Sub btnAddDate_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddDate.Click

        Dim frmAddDate As New frmAddDate(Me, MonthCalendar.SelectionStart, idc)
        frmAddDate.Show()

    End Sub


    Private Sub lstTasks_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lstTasks.SelectedIndexChanged

        Dim i As Integer = lstTasks.SelectedIndex

        If i.Equals(-1) Then
            StatusBar1.Text = "No Appointment Selected"
            Exit Sub
        End If

        If dts(i).GetType.ToString = "ApptLib.Appointment" Then
            Dim chgApmtForm As New frmChgApmt(Me, dts(i), idc)
            chgApmtForm.Show()
            StatusBar1.Text = "Appointment Updated"
        Else
            Dim chgDTForm As New frmChgDate(Me, dts(i), idc)
            chgDTForm.Show()
            StatusBar1.Text = "Date Updated"
        End If

    End Sub

    Private Sub MonthCalendar_DateChanged(ByVal sender As Object, ByVal e As System.Windows.Forms.DateRangeEventArgs) Handles MonthCalendar.DateChanged

        Me.lstTasks.Items.Clear()
        Me.fillListBox(e.Start)
        selectedDate = e.Start

    End Sub

    Private Sub frmMain_Activated(ByVal sender As Object, ByVal e As System.EventArgs) Handles MyBase.Activated

        Me.fillListBox(selectedDate)

    End Sub

    Private Sub btnAddApmt_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAddApmt.Click

        Dim addApmtForm As New frmAddApmt(Me, MonthCalendar.SelectionStart, idc)
        addApmtForm.Show()

    End Sub

    Private Sub btnContacts_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnContacts.Click

        Dim addContactForm As New frmContacts(Me, ContactC)
        addContactForm.Show()

    End Sub

    Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click
        Timer1.Interval = 50
        Timer1.Enabled = True

    End Sub

    Private Sub Timer1_Tick(ByVal sender As Object, ByVal e As System.EventArgs) Handles Timer1.Tick
        If Not Me.Opacity = 0 Then
            Me.Opacity -= 0.1
            Exit Sub
        End If
        Timer1.Enabled = False
        Me.Dispose()
        End

    End Sub
End Class
