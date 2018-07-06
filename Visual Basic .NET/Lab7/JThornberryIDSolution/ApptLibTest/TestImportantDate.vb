Imports NUnit.Framework
Imports ApptLib
<TestFixture()> _
Public Class TestImportantDate

    <Test()> _
    Public Sub constructorandPropertyTest()
        Dim id As ImportantDate

        id = New ImportantDate(Today, "Work", False)
        Assertion.AssertEquals(Today, id.Start)
        Assertion.AssertEquals("Work", id.Reason)
        Assertion.AssertEquals(False, id.Recurring)

    End Sub
    <Test()> _
  Public Sub propertyTest()
        Dim id As ImportantDate

        id = New ImportantDate(Today, "Work", False)
        id.Start = Today.AddDays(1)
        id.Reason = "Work"
        id.Recurring = True
        Assertion.AssertEquals(Today.AddDays(1), id.Start)
        Assertion.AssertEquals("Work", id.Reason)
        Assertion.AssertEquals(True, id.Recurring)

    End Sub

    <Test(), ExpectedException(GetType(ArgumentOutOfRangeException))> _
       Public Sub ExpectedException1()
        Dim id As ImportantDate
        id = New ImportantDate(#2/21/2004#, "Birthday", False)

        id.Start = #2/21/2004#

    End Sub
    <Test(), ExpectedException(GetType(ArgumentNullException))> _
    Public Sub ExpectedExcpetion2()
        Dim id As ImportantDate

        id = New ImportantDate(#2/21/2004#, "Birthday", False)
        id.Reason = ""
    End Sub
    <Test(), ExpectedException(GetType(ArgumentException))> _
    Public Sub ExpectedException3()
        Dim id As ImportantDate

        id = New ImportantDate(#2/21/2004#, "Birthday", False)

        id.Reason = "(none)"
    End Sub

End Class

