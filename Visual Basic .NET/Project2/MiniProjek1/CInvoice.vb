Public Class CInvoice

#Region "Variables"
    ' We use Object => Don't know whether it it of type Customer / ValuedCustomer!
    Private forCustomer As Object
    Private BookingID As Integer
    Private BookingDate As Date

    Private list As New ArrayList

#End Region

#Region "Properties"
    ReadOnly Property BookingNumber()
        Get
            Return BookingID
        End Get
    End Property
#End Region

#Region "Methods"
    Sub New(ByRef _Cust As Object, _
             ByVal _ID As Integer, _
             ByVal _date As Date)
        forCustomer = _Cust
        BookingID = _ID
        BookingDate = _date

    End Sub


    Sub LinkBookings(ByRef orglist As ArrayList)

        Dim enum1 As IEnumerator = orglist.GetEnumerator

        While enum1.MoveNext
            ' browse through original list -> Make use of the BookingNumber property

            If enum1.Current.BookingNumber = BookingID Then
                ' Add this bookingroom to own ArrayList
                list.Add(enum1.Current)
            End If
        End While

    End Sub

#End Region

    Function CalculateTotal() As Double

        Dim total As Double

        Dim enum2 As IEnumerator = list.GetEnumerator
        While enum2.MoveNext
            total += enum2.Current.CalcSubTotal

        End While

        total -= forCustomer.CalcDisCount()

        Return total


    End Function

    Sub Export()

        Dim filename As String = "C:\s12345678\Export\Invoice " & BookingID & ".txt"

        Dim writeToFile As New System.IO.StreamWriter(filename, False)
        writeToFile.WriteLine("Customer ID: " & forCustomer.CustomerNumber)
        writeToFile.WriteLine("Customer Names: " & forCustomer.CustomerNames())
        writeToFile.WriteLine("Contact Details: " & forCustomer.ContactDetails())

        writeToFile.WriteLine("")

        Dim enum2 As IEnumerator = list.GetEnumerator
        While enum2.MoveNext
            writeToFile.WriteLine("Room Description: " & enum2.Current.Room.RoomDescription())
            writeToFile.WriteLine("Start Date: " & enum2.Current.StartDate())
            writeToFile.WriteLine("End Date: " & enum2.Current.EndDate())
            writeToFile.WriteLine("Sub Total: " & enum2.Current.CalcSubTotal())
            writeToFile.WriteLine(vbCrLf)

        End While

        writeToFile.WriteLine("Discount: " & forCustomer.CalcDisCount())
        writeToFile.WriteLine("Total: " & CalculateTotal())
        writeToFile.Close()


    End Sub
End Class
