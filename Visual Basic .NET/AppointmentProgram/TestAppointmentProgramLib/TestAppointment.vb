Imports NUnit.Framework
Imports AppointmentProgramLib
<TestFixture()> _
Public Class TestAppointment
    Private test_date As Date = Date.Now
    Private test_reason As String = "reason"
    Private test_recurring As Boolean = True
    Private test_hour As Integer = 10
    Private test_minute As Integer = 0
    Private test_contact As String = "Paul"
    Private test_location As String = "here"
    Private test_duration_days As Integer = 0
    Private test_duration_hours As Integer = 1
    Private test_duration_minutes As Integer = 30
    Private test_notes As String = "notes"

    <Test()> _
    Public Sub constructorsTest()
        Dim app As Appointment = New Appointment(test_date, test_hour, test_minute, test_contact, test_location, test_reason, test_duration_days, test_duration_hours, test_duration_minutes, test_notes, test_recurring)

        Assertion.AssertEquals("Constructor failed! - Date.", test_date, app.StartDate)
        Assertion.AssertEquals("Constructor failed! - Reason", test_reason, app.theReason)
        Assertion.AssertEquals("Constructor failed! - Recurring", test_recurring, app.isRecurring)
        Assertion.AssertEquals("Constructor failed! - Hour", test_hour, app.appointmentHour)
        Assertion.AssertEquals("Constructor failed! - Minute", test_minute, app.appointmentMinute)
        Assertion.AssertEquals("Constructor failed! - Contact", test_contact, app.appointmentContact)
        Assertion.AssertEquals("Constructor failed! - Location", test_location, app.appointmentLocation)
        Assertion.AssertEquals("Constructor failed! - Duration days", test_duration_days, app.appointmentDurationDays)
        Assertion.AssertEquals("Constructor failed! - Duration hours", test_duration_hours, app.appointmentDurationHours)
        Assertion.AssertEquals("Constructor failed! - Duration minutes", test_duration_minutes, app.appointmentDurationMinutes)
        Assertion.AssertEquals("Constructor failed! - Notes", test_notes, app.appointmentNotes)
    End Sub

    <Test()> _
    Public Sub propertiesTest()
        Dim app As Appointment = New Appointment

        app.appointmentDurationHours = test_duration_hours
        app.appointmentDurationMinutes = test_duration_minutes
        app.appointmentDurationDays = test_duration_days
        app.appointmentContact = test_contact
        app.appointmentHour = test_hour
        app.appointmentLocation = test_location
        app.appointmentMinute = test_minute
        app.appointmentNotes = test_notes
        app.theReason = test_reason
        app.StartDate = test_date
        app.isRecurring = test_recurring

        Assertion.AssertEquals("Duration hours failed.", test_duration_hours, app.appointmentDurationHours)
        Assertion.AssertEquals("Duration minutes failed!", test_duration_minutes, app.appointmentDurationMinutes)
        Assertion.AssertEquals("Duration days failed!", test_duration_days, app.appointmentDurationDays)
        Assertion.AssertEquals("Contact failed!", test_contact, app.appointmentContact)
        Assertion.AssertEquals("Hour failed!", test_hour, app.appointmentHour)
        Assertion.AssertEquals("Location failed!", test_location, app.appointmentLocation)
        Assertion.AssertEquals("Minute failed!", test_minute, app.appointmentMinute)
        Assertion.AssertEquals("Notes failed!", test_notes, app.appointmentNotes)
        Assertion.AssertEquals("Reason failed!", test_reason, app.theReason)
        Assertion.AssertEquals("Date failed!", test_date, app.StartDate)
        Assertion.AssertEquals("Recurring failed!", test_recurring, app.isRecurring)

    End Sub
End Class
