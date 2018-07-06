Imports NUnit.Framework
Imports plyon_applib
<TestFixture()> _
Public Class AppointmentTest
    Inherits ImportantDate
    Dim contact As String
    Dim location As String
    Dim duration_minutes As Integer
    Dim notes As String

    <Test()> _
    Public Sub constructorandPropertyTest()
        Dim ap As Appointment

        ap = New Appointment("Jimbo", "Here", 60, "No note")
        ap.Start = Today
        ap.Reason = "wee"
        Assertion.AssertEquals(ap.Start, Today)
        Assertion.AssertEquals(ap.Reason, "wee")
        Assertion.AssertEquals(ap.Note, "No note")
        Assertion.AssertEquals(ap.DurationTime, 60)

    End Sub
    <Test()> _

    Public Sub propertyTest()
        Dim id As ImportantDate

        id = New ImportantDate(Today, "Great Day", False)
        id.Start = Today.AddDays(1)
        id.Reason = "TGIw"
        id.Recurring = True
        Assertion.AssertEquals(Today.AddDays(1), id.Start)
        Assertion.AssertEquals("TGIw", id.Reason)
        Assertion.AssertEquals(True, id.Recurring)

    End Sub
End Class
