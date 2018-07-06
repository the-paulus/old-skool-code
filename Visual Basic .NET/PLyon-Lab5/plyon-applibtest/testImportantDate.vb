Imports NUnit.Framework
Imports plyon_applib

<TestFixture()> _
Public Class TestImportantDate

    <Test()> _
    Public Sub constructorandPropertyTest()
        Dim id As ImportantDate

        id = New ImportantDate(Today, "Great Day", False)
        Assertion.AssertEquals(Today, id.Start)
        Assertion.AssertEquals("Great Day", id.Reason)
        Assertion.AssertEquals(False, id.Recurring)

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

