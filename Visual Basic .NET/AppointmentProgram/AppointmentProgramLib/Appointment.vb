
Public Class Appointment
    Inherits ImportantDate

    Private hour As Integer
    Private minute As Integer
    Private contact As String
    Private location As String
    Private duration_days As Integer
    Private duration_hours As Integer
    Private duration_minutes As Integer
    Private notes As String

    Public Sub New()

    End Sub

    Public Sub New(ByVal start As Date, ByVal hour As Integer, ByVal minute As Integer, ByVal contact As String, ByVal location As String, ByVal reason As String, ByVal ddays As Integer, ByVal dhours As Integer, ByVal dminutes As Integer, ByVal notes As String, ByVal rec As Boolean)
        MyBase.New()
        Me.StartDate = start
        Me.hour = hour
        Me.minute = minute
        Me.contact = contact
        Me.location = location
        Me.theReason = reason
        Me.duration_days = ddays
        Me.duration_hours = dhours
        Me.duration_minutes = dminutes
        Me.notes = notes
        Me.isRecurring = rec
    End Sub

    Property appointmentHour() As Integer
        Get
            Return Me.hour
        End Get
        Set(ByVal Value As Integer)
            Me.hour = Value
        End Set
    End Property

    Property appointmentMinute() As Integer
        Get
            Return Me.minute
        End Get
        Set(ByVal Value As Integer)
            minute = Value
        End Set
    End Property

    Property appointmentStartDate() As Date
        Get
            Return Me.StartDate
        End Get
        Set(ByVal Value As Date)
            Me.StartDate = Value
        End Set
    End Property

    Property appointmentContact() As String
        Get
            Return Me.contact
        End Get
        Set(ByVal Value As String)
            Me.contact = Value
        End Set
    End Property
    Property appointmentLocation() As String
        Get
            Return Me.location
        End Get
        Set(ByVal Value As String)
            Me.location = Value
        End Set
    End Property
    Property appointmentReason() As String
        Get
            Return Me.theReason
        End Get
        Set(ByVal Value As String)
            Me.theReason = Value
        End Set
    End Property
    Property appointmentDurationDays() As Integer
        Get
            Return Me.duration_days
        End Get
        Set(ByVal Value As Integer)
            Me.duration_days = Value
        End Set
    End Property
    Property appointmentDurationHours() As Integer
        Get
            Return Me.duration_hours
        End Get
        Set(ByVal Value As Integer)
            Me.duration_hours = Value
        End Set
    End Property
    Property appointmentDurationMinutes() As Integer
        Get
            Return Me.duration_minutes
        End Get
        Set(ByVal Value As Integer)
            Me.duration_minutes = Value
        End Set
    End Property
    Property appointmentNotes() As String
        Get
            Return Me.notes
        End Get
        Set(ByVal Value As String)
            Me.notes = Value
        End Set
    End Property

End Class
