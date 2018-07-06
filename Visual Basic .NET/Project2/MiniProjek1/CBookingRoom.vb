Public Class CBookingRoom

#Region "Variables"
    Private forRoom As CRoom
    Private BookingID As Integer
    Private sDate As Date
    Private eDate As Date

#End Region



#Region "Properties"
    ReadOnly Property BookingNumber()
        Get
            Return BookingID
        End Get
    End Property

    Property Room()
        Get
            Return forRoom
        End Get
        Set(ByVal Value)

        End Set
    End Property

    ReadOnly Property StartDate()
        Get
            Return sDate
        End Get
    End Property

    ReadOnly Property EndDate()
        Get
            Return eDate

        End Get
    End Property

#End Region

#Region "Methods"
    Sub New(ByRef _Room As CRoom, _
            ByVal _ID As Integer, _
            ByVal _start As Date, _
            ByVal _end As Date)

        forRoom = _Room
        BookingID = _ID
        sDate = _start
        eDate = _end


    End Sub

    Function CalcSubTotal() As Double
        Dim days As TimeSpan

        days = EndDate.Subtract(StartDate)

        Return forRoom.RoomRate * days.TotalDays

    End Function

#End Region


End Class
