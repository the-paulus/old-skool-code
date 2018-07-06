Public Class CRoom

#Region "Variables"
    Private RoomID As Integer
    Private Rate As Double
    Private description As String

#End Region

#Region "properties"
    ReadOnly Property RoomNumber()
        Get
            Return RoomID
        End Get
    End Property

    Property RoomRate()
        Get
            Return Rate
        End Get
        Set(ByVal Value)
            Rate = Value
        End Set
    End Property

    Property RoomDescription()
        Get
            Return description
        End Get
        Set(ByVal Value)
            description = Value
        End Set
    End Property

#End Region

#Region "Methods"

    Sub New(ByVal _ID As Integer, _
             ByVal _rate As Double, _
             ByVal _desc As String)
        RoomID = _ID
        Rate = _rate
        description = _desc

    End Sub

#End Region

End Class
