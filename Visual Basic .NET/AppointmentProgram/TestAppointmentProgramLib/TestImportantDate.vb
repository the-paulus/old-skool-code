Imports NUnit.Framework
Imports AppointmentProgramLib

<TestFixture()> _
Public Class TestImportantDate
    Dim test_date As Date = Date.Now
    Dim test_reason As String = "Reason"
    Dim test_recurring As Boolean = True
    Dim id As ImportantDate
    <Test()> _
    Public Sub testConstructors()
        id = New ImportantDate(test_date, test_reason, test_recurring)

        Assertion.AssertEquals("Constructor failed! - Date", test_date, id.StartDate)
        Assertion.AssertEquals("Constructor failed! - Reason", test_reason, id.theReason)
        Assertion.AssertEquals("Constructor failed! - recurring", test_recurring, id.isRecurring)

    End Sub

    <Test()> _
    Public Sub testProperties()
        id = New ImportantDate

        id.theReason = test_reason
        id.isRecurring = test_recurring
        id.StartDate = test_date

        Assertion.AssertEquals("Set reason property failed!", test_reason, id.theReason)
        Assertion.AssertEquals("Set recurring property failed", test_recurring, id.isRecurring)
        Assertion.AssertEquals("Set start date property failed", test_date, id.StartDate)
    End Sub
End Class
