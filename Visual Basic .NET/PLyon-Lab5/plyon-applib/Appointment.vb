
Public Class Appointment
    Inherits ImportantDate
    Dim contact As String
    Dim location As String
    Dim duration_minutes As Integer
    Dim notes As String

    Public Sub New(ByVal new_contact As String, ByVal new_location As String, ByVal new_duration_minutes As Integer, ByVal new_note As String)
        MyBase.New()
        contact = new_contact
        location = new_location
        duration_minutes = new_duration_minutes
        notes = new_note
    End Sub

    Public Property ContactInfo() As String
        Get
            Return contact
        End Get
        Set(ByVal value As String)
            contact = value
        End Set
    End Property

    Public Property LocationInfo() As String
        Get
            Return location
        End Get
        Set(ByVal Value As String)
            location = Value
        End Set
    End Property

    Public Property DurationTime() As Integer
        Get
            Return duration_minutes
        End Get
        Set(ByVal Value As Integer)
            duration_minutes = Value
        End Set
    End Property

    Public Property Note() As String
        Get
            Return notes
        End Get
        Set(ByVal Value As String)
            notes = Value
        End Set
    End Property

End Class
