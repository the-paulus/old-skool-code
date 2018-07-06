Imports NUnit.Framework
Imports ApptLib

<TestFixture()> _
Public Class TestImportantDateCollection

    <Test()> _
    Public Sub CollectionConstructorandPropertyTest()
        Dim myCollection As ImportantDateCollection
        Dim Meeting As Appointment
        Dim Anniversary As ImportantDate
        Dim Wedding As ImportantDate

        myCollection = New ImportantDateCollection
        Meeting = New Appointment(#7/2/2004#, "Employee Evaluation", "Staff", "Office", New TimeSpan(0, 1, 0), "")
        Anniversary = New ImportantDate(Today, "First Anniversary", True)
        Wedding = New ImportantDate(#5/31/2004#, "Your wedding", False)


        myCollection.Add(Anniversary)
        myCollection.Add(Wedding)
        myCollection.Add(Meeting)

        Assertion.AssertEquals(0, myCollection.IndexOf(Anniversary))
        Assertion.AssertEquals(1, myCollection.IndexOf(Wedding))
        Assertion.AssertEquals(2, myCollection.IndexOf(Meeting))

        myCollection.Remove(Meeting)

        Assertion.AssertEquals(2, myCollection.Count)


    End Sub

    <Test(), ExpectedException(GetType(ArgumentException))> _
    Public Sub ExpectanException1()
        Dim myCollection As ImportantDateCollection
        Dim Wedding As ImportantDate

        myCollection = New ImportantDateCollection
        Wedding = New ImportantDate(#5/31/2004#, "You are getting married", False)

        myCollection.Add(Wedding)
        myCollection.Add(Wedding)

    End Sub
    <Test(), ExpectedException(GetType(ArgumentOutOfRangeException))> _
    Public Sub ExpectanException2()
        Dim myCollection As ImportantDateCollection
        Dim Meeting As ImportantDate

        myCollection = New ImportantDateCollection
        Meeting = New ImportantDate(#7/2/2004#, "Employee Evaluation", False)

        myCollection.Add(Meeting)

    End Sub

End Class
