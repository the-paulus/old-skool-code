Imports System

Class DisatanceConversion

    Public Shared Sub Main()
        Dim miles As Integer
        Dim feet As Integer
        Dim inches As Integer
        Dim meters As Integer
        Dim millimeters As Long

        Console.WriteLine("Enter the distance you traveled in miles: ")
        miles = Convert.ToInt32(Console.ReadLine())
        feet = miles * 5280
        inches = miles * 63360
        meters = miles * 1609.334
        millimeters = miles * 1609344

        Console.WriteLine("The {0} miles is equal to:", miles)
        Console.WriteLine("{0} feet", feet)
        Console.WriteLine("{0} inches", inches)
        Console.WriteLine("{0} meters", meters)
        Console.WriteLine("{0} millimeters", millimeters)

    End Sub

End Class
