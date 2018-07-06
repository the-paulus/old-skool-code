Imports NUnit.Framework
Imports ApptLib


<TestFixture()> _
Public Class TestAppointment

    <Test()> _
    Public Sub constructorandPropertyTest()
        Dim id As Appointment

        id = New Appointment(Today, "Work", "Jacob", "Target", New TimeSpan(6, 30, 0), "Six hours")
        Assertion.AssertEquals(Today, id.Start)
        Assertion.AssertEquals("Work", id.Reason)
        Assertion.AssertEquals("Target", id.Location)
        Assertion.AssertEquals("Jacob", id.Contact)
        Assertion.AssertEquals(New TimeSpan(6, 30, 0), id.Duration)
        Assertion.AssertEquals("Six hours", id.Notes)

    End Sub
    <Test()> _
  Public Sub propertyTest()
        Dim id As Appointment

        id = New Appointment(Today, "Work", "Jacob", "Target", New TimeSpan(6, 30, 0), "Six hours")
        id.Contact = "Jacob"
        id.Location = "Target"
        id.Duration = New TimeSpan(6, 30, 0)
        id.Notes = "Six hours"
        Assertion.AssertEquals("Jacob", id.Contact)
        Assertion.AssertEquals("Target", id.Location)
        Assertion.AssertEquals("Six hours", id.Notes)
        Assertion.AssertEquals(New TimeSpan(6, 30, 0), id.Duration)

    End Sub
    <Test(), ExpectedException(GetType(ArgumentNullException))> _
    Public Sub ExpectAnException()
        Dim id As Appointment

        id = New Appointment(Today, "Work", "Jacob", "Target", New TimeSpan(6, 30, 0), "Six hours")

        id.Location = ""

    End Sub
End Class

