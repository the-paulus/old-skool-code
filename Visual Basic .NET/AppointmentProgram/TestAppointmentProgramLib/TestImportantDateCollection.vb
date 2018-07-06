Imports AppointmentProgramLib
Imports NUnit.Framework

<TestFixture()> _
Public Class TestImportantDateCollection

    <Test()> _
    Public Sub testAdd()
        Dim idc As New ImportantDateCollection
        Dim id As ImportantDate
        Dim b As Boolean

        id = New ImportantDate(Date.Now, "No reason", True)

        idc.Add(id)

        b = idc.Contains(CType(id, ImportantDate))

        Assertion.AssertEquals("Add failed!", True, b)
    End Sub

    <Test()> _
    Public Sub testItem()
        Dim idc As New ImportantDateCollection
        Dim id As ImportantDate
        Dim id1 As ImportantDate

        id = New ImportantDate(Date.Now, "No reason", True)

        idc.Add(id)
        id1 = idc.Item(idc.IndexOf(id))

        Assertion.AssertEquals("Item property failed!", id, id1)
    End Sub

    <Test()> _
    Public Sub testDatesBetween()
        Dim idc As New ImportantDateCollection
        Dim datesbetween1 As New ImportantDateCollection
        'Dim datesbetween2 As New ImportantDateCollection
        Dim id1, id2, id3 As ImportantDate
        Dim date1 As Date
        Dim date2 As Date

        date1 = New Date(2004, 12, 5)
        date2 = New Date(2005, 1, 1)
        id1 = New ImportantDate(Date.Now, "no reason", False)
        id2 = New ImportantDate(date1, "no reason", False)
        id3 = New ImportantDate(date2, "no reason", False)

        idc.Add(id1)
        idc.Add(id2)
        idc.Add(id3)

        datesbetween1 = idc.getDatesBetween(Date.Now, date2)
        'datesbetween2.Add(id2)

        Assertion.AssertEquals("getDatesBetween failed", True, datesbetween1.Contains(id2))

    End Sub

    <Test()> _
    Public Sub testIndexOf()
        Dim idc As New ImportantDateCollection
        Dim id1, id2 As ImportantDate
        Dim index As Integer

        id1 = New ImportantDate(Date.Now, "no reason", False)
        id2 = New ImportantDate(Date.Now, "no reason", False)

        idc.Add(id1)
        idc.Add(id2)

        index = idc.IndexOf(id1)

        Assertion.AssertEquals("IndexOf failed!", 0, index)
    End Sub

    <Test()> _
    Public Sub testInsertRemove()
        Dim idc As New ImportantDateCollection
        Dim id1, id2 As ImportantDate
        Dim index As Integer

        id1 = New ImportantDate(Date.Now, "no reason", False)
        id2 = New ImportantDate(Date.Now, "no reason", False)

        idc.Insert(0, id1)
        idc.Insert(1, id2)

        Assertion.AssertEquals("Insert Failed!", id1, idc.Item(0))

        idc.Remove(id1)

        Assertion.AssertEquals("Remove Failed!", id2, idc.Item(0))
    End Sub
End Class
