'Option Strict On
Imports System

Class MyProgram

    Public Shared Sub Main()
        Dim x As Integer
        Dim y As Integer

        x = 4
        y = 3
        x = x + 1
        y = x Mod 3
        x = y ^ 2 * 2 + 1
        y = y + 2


        'Console.WriteLine("Enter X here: ")
        'x = Convert.ToInt32(Console.ReadLine())

        'Console.WriteLine("Enter S here: ")
        's = Console.ReadLine()


        Console.WriteLine("X={0} and Y={1}", x, y)
    End Sub

End Class
