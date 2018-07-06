' ****************************************************************************
' Thornberry, Jacob
' Lab 3 Code Exercise
'****************************************************************************


Imports System

Class Class1

    Public Shared Sub Main()
        Console.WriteLine("Exercise 1 ")
        exercise1()
        Console.WriteLine("Exercise 2 ")
        exercise2()
        Console.WriteLine("Exercise 3 ")
        exercise3()
        Console.WriteLine("Exercise 4 ")
        exercise4()
        Console.WriteLine("Exercise 5 ")
        exercise5()
        Console.WriteLine("Hit enter to exit")
        Console.ReadLine()
    End Sub
    Public Shared Sub exercise1()
        ' Write code to enter and display integers from the keyboard one integer 
        ' at a time. Display them using Console.WriteLine()
        ' Use -9999 as a TRAILER to indicate when to stop prompting the user for numbers.
        Dim x As Single
        Do Until x = -9999
            Console.WriteLine("Enter a number: ")
            x = Console.ReadLine
            Console.WriteLine(x)
        Loop

    End Sub

    Public Shared Sub exercise2()
        ' Write code to enter integers from the keyboard and display the
        ' total of the integers entered.
        ' Use -9999 as a TRAILER to indicate when to stop prompting the user for numbers.

        Dim x As Single
        Dim y As Single
        Do Until x = -9999
            Console.WriteLine("Enter a number: ")
            x = Console.ReadLine
            y = y + x
            Console.WriteLine(y)
        Loop

    End Sub

    Public Shared Sub exercise3()
        ' Write code to enter as series of integers from the keyboard.
        ' Display the largest and smallest entered excluding the trailer.
        ' Use -9999 as a TRAILER to indicate when to stop prompting the user for numbers.
        ' Display "No values entered" if the user just enters the trailer."

        Dim x As Single
        Dim max As Single
        Dim min As Single
        If Not x = -9999 Then
            max = x
            min = x
        End If
        Do Until x = -9999
            Console.WriteLine("Enter a number: ")
            x = Console.ReadLine
            If x < min And Not x = -9999 Then
                min = x
            End If
            If x > max Then
                max = x
            End If
            Console.WriteLine("The max number is " & max)
            Console.WriteLine("The min number is " & min)
        Loop

    End Sub
    Public Shared Sub exercise4()
        ' Write code to enter as series of integers from the keyboard.
        ' Display the largest and smallest POSITIVE values entered excluding the trailer.
        ' Use -9999 as a TRAILER to indicate when to stop prompting the user for numbers.
        ' Display "No values entered" if the user just enters the trailer."
        ' Display "No positive values entered" if the user enters only negative values.

        Dim x As Single
        Dim max As Single
        Dim min As Single
        If Not x = -9999 Then
            max = x
            min = x
        End If
        Do Until x = -9999
3:
            Console.WriteLine("Enter a number: ")
            x = Console.ReadLine
            If x < 0 And Not -9999 Then
                Console.WriteLine("No positive values entered")
                GoTo 3
            End If
            If x = -9999 Then
                Console.WriteLine("No values entered")
                GoTo 4
            End If
            If x < min And Not x = -9999 Then
                min = x
            End If
            If x > max Then
                max = x
            End If
            Console.WriteLine("The max number is " & max)
            Console.WriteLine("The min number is " & min)
        Loop
4:
    End Sub
    Public Shared Sub exercise5()
        ' Write code to enter as integers from the keyboard and display the
        ' total of the integers entered, the average of the positive integers entered,
        ' a count of all integers entered and a count of all positive integers entered.
        ' Exclude the trailer in all  totals and counts.
        ' Use -9999 as a TRAILER to indicate when to stop prompting the user for numbers.
        ' Display "No values entered" if the user just enters the trailer."
        ' Display the message "No positive values entered" if the user enters only negative values.

        Dim x As Single
        Dim y As Single
        Dim z As Single
        Do Until x = -9999
1:
            Console.WriteLine("Enter a number: ")
            x = Console.ReadLine
            If x < 0 And Not -9999 Then
                Console.WriteLine("No positive values entered.")
                GoTo 1
            End If
            If x = -9999 Then
                Console.WriteLine("No values entered")
                GoTo 2
            End If
            y = y + x
            z = z + 1
            Console.WriteLine("Total: " & y)
            Console.WriteLine("Count: " & z)
            Console.WriteLine("Average: " & (x + y) / z)

        Loop
2:
    End Sub
End Class
