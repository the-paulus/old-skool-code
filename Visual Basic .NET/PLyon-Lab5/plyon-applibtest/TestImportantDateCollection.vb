Imports NUnit.Framework
Imports plyon_applib

<TestFixture()> _
Public Class TestImportantDateCollection
    Dim db As ImportantDateCollection

    <Test()>_
    Public Sub testConstructor()
        db = New ImportantDateCollection
        Assertion.AssertEquals(0, db.Count)
    End Sub

    <Test()> _
     Public Sub testAdd1()
        Dim adate As ImportantDate
        adate = New ImportantDate(1)
        db = New ImportantDateCollection
        theAccounts.Add(anAccount)
        Assertion.AssertEquals(1, theAccounts.Count)
        Assertion.AssertEquals(1, theAccounts(0).AccountNumber)
    End Sub
    <Test(), ExpectedException(GetType(ArgumentNullException))> _
      Public Sub testAdd2()
        Dim anAccount As Account
        theAccounts = New Accounts
        theAccounts.Add(anAccount)          ' attempt to add a null value
    End Sub
    '********************************************************************************
    ' Test Remove account methods
    '********************************************************************************
    <Test()> _
      Public Sub testRemove()
        Dim aAccount As Account
        Dim bAccount As Account
        Dim cAccount As Account
        theAccounts = New Accounts
        aAccount = New Account(1)
        theAccounts.Add(aAccount)
        bAccount = New Account(2)
        theAccounts.Add(bAccount)
        cAccount = New Account(3)
        theAccounts.Add(cAccount)
        Assertion.AssertEquals(3, theAccounts.Count)
        theAccounts.Remove(bAccount)  'remove using a reference to an account
        Assertion.AssertEquals(2, theAccounts.Count)
    End Sub
    <Test()> _
       Public Sub testSort()
        Dim aAccount As Account
        Dim bAccount As Account
        Dim cAccount As Account
        theAccounts = New Accounts
        aAccount = New Account(4)
        theAccounts.Add(aAccount)
        bAccount = New Account(2)
        theAccounts.Add(bAccount)
        cAccount = New Account(3)
        theAccounts.Add(cAccount)
        Assertion.AssertEquals(3, theAccounts.Count)
        theAccounts.Sort()
        Assertion.AssertEquals(2, theAccounts(0).AccountNumber)
        Assertion.AssertEquals(4, theAccounts(2).AccountNumber)
    End Sub
End Class
