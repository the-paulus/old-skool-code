Imports System

<Serializable()> _
Public Class Contact

    Implements IComparable
    Private sLName As String
    Private sFName As String
    Private sEmail As String
    Private sAddress As String
    Private sCity As String
    Private sState As String
    Private sZip As String
    Private sHPh As String
    Private sWPh As String
    Private sCPh As String
    Private sNotes As String

    Public Sub New(ByVal LN As String, ByVal FN As String, ByVal EM As String, ByVal Ad As String, ByVal Cty As String, ByVal ST As String, ByVal Zp As String, ByVal HP As String, ByVal WP As String, ByVal CP As String, ByVal Note As String)

        sLName = LN
        sFName = FN
        sEmail = EM
        sAddress = Ad
        sCity = Cty
        sState = ST
        sZip = Zp
        sHPh = HP
        sWPh = WP
        sCPh = CP
        sNotes = Note

    End Sub

    Public Function CompareTo(ByVal obj As Object) As Integer Implements System.IComparable.CompareTo

        Dim temp As Contact
        temp = CType(obj, Contact)

        Return Me.sLName.CompareTo(temp.sLName)

    End Function

    Public Property LName() As String

        Get
            Return sLName

        End Get

        Set(ByVal Value As String)
            sLName = Value
        End Set

    End Property

    Public Property FName() As String

        Get
            Return sFName
        End Get

        Set(ByVal Value As String)
            sFName = Value
        End Set

    End Property

    Public Property Email() As String

        Get
            Return sEmail
        End Get

        Set(ByVal Value As String)
            sEmail = Value
        End Set

    End Property

    Public Property Address() As String

        Get
            Return sAddress
        End Get

        Set(ByVal Value As String)
            sAddress = Value
        End Set

    End Property

    Public Property City() As String

        Get
            Return sCity
        End Get

        Set(ByVal Value As String)
            sCity = Value
        End Set

    End Property

    Public Property State() As String

        Get
            Return sState
        End Get

        Set(ByVal Value As String)
            sState = Value
        End Set

    End Property

    Public Property Zip() As String

        Get
            Return sZip
        End Get

        Set(ByVal Value As String)
            sZip = Value
        End Set

    End Property

    Public Property HomePh() As String

        Get
            Return sHPh
        End Get

        Set(ByVal Value As String)
            sHPh = Value

        End Set

    End Property

    Public Property WorkPh() As String

        Get
            Return sWPh
        End Get

        Set(ByVal Value As String)
            sWPh = Value
        End Set

    End Property

    Public Property CellPh() As String

        Get
            Return sCPh
        End Get

        Set(ByVal Value As String)
            sCPh = Value
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
