<Serializable()> _
Public Class Appointment

    Inherits ImportantDate

    Private sContact As String
    Private sLocation As String
    Private sNotes As String
    Private sDuration As TimeSpan

    Public Sub New(ByVal dt As DateTime, ByVal rs As String, ByVal Contact As String, ByVal Location As String, ByVal Duration As TimeSpan, ByVal Notes As String)

        MyBase.new(dt, rs, False)
        sContact = Contact
        sLocation = Location
        sDuration = Duration
        sNotes = Notes

    End Sub

    Public Property Contact() As String

        Get
            Return sContact
        End Get

        Set(ByVal Value As String)
            sContact = Value

            If sContact = "" Then
                Throw New ArgumentNullException("You must enter a contact for the appointment")
            End If

        End Set

    End Property

    Public Property Duration() As TimeSpan

        Get
            Return sDuration
        End Get

        Set(ByVal Value As TimeSpan)
            sDuration = Value
        End Set

    End Property

    Public Property Location() As String

        Get
            Return sLocation
        End Get

        Set(ByVal Value As String)
            sLocation = Value
            If sLocation = "" Then
                Throw New ArgumentNullException("You must enter a location for the appointment")
            End If

        End Set

    End Property

    Public Property Notes() As String

        Get
            Return sNotes
        End Get

        Set(ByVal Value As String)
            sNotes = Value
        End Set

    End Property

End Class
