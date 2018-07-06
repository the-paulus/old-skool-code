Imports AppointmentProgramLib

Public Class Contact
    Implements IComparable

    Private m_first_name As String
    Private m_last_name As String
    Private m_e_mail As String
    Private m_address As String
    Private m_city As String
    Private m_state As String
    Private m_zip As Integer
    Private m_home_phone As String
    Private m_work_phone As String
    Private m_cell_phone As String
    Private m_notes As String

    Public Sub New()

    End Sub

    Public Sub New(ByVal fname As String, ByVal lname As String, ByVal email As String, ByVal add As String, ByVal c As String, ByVal s As String, ByVal z As Integer, ByVal hphone As String, ByVal wphone As String, ByVal cphone As String, ByVal n As String)
        Me.m_first_name = fname
        Me.m_last_name = lname
        Me.m_e_mail = email
        Me.m_address = add
        Me.m_city = c
        Me.m_state = s
        Me.m_zip = z
        Me.m_home_phone = hphone
        Me.m_work_phone = wphone
        Me.m_cell_phone = cphone
        Me.m_notes = n
    End Sub

    Public Property FirstName() As String
        Get
            Return m_first_name
        End Get
        Set(ByVal Value As String)
            Me.m_first_name = Value
        End Set
    End Property

    Public Property LastName() As String
        Get
            Return Me.m_last_name
        End Get
        Set(ByVal Value As String)
            Me.m_last_name = Value
        End Set
    End Property

    Public Property EMail() As String
        Get
            Return Me.m_e_mail
        End Get
        Set(ByVal Value As String)
            Me.m_e_mail = Value
        End Set
    End Property

    Public Property Address() As String
        Get
            Return Me.m_address
        End Get
        Set(ByVal Value As String)
            Me.m_address = Value
        End Set
    End Property

    Public Property City() As String
        Get
            Return Me.m_city
        End Get
        Set(ByVal Value As String)
            Me.m_city = Value
        End Set
    End Property

    Public Property State() As String
        Get
            Return Me.m_city
        End Get
        Set(ByVal Value As String)
            Me.m_city = Value
        End Set
    End Property

    Public Property Zip() As Integer
        Get
            Return Me.m_zip
        End Get
        Set(ByVal Value As Integer)
            Me.m_zip = Value
        End Set
    End Property

    Public Property HomePhone() As String
        Get
            Return Me.m_home_phone
        End Get
        Set(ByVal Value As String)
            Me.m_home_phone = Value
        End Set
    End Property

    Public Property WorkPhone() As String
        Get
            Return Me.m_work_phone
        End Get
        Set(ByVal Value As String)
            Me.m_work_phone = Value
        End Set
    End Property

    Public Property CellPhone() As String
        Get
            Return Me.m_cell_phone
        End Get
        Set(ByVal Value As String)
            Me.m_cell_phone = Value
        End Set
    End Property

    Public Property Notes() As String
        Get
            Return Me.m_notes
        End Get
        Set(ByVal Value As String)
            Me.m_notes = Value
        End Set
    End Property

    Public Function CompareTo(ByVal obj As Object) As Integer Implements System.IComparable.CompareTo
        Dim temp As Contact

        temp = CType(obj, Contact)

        Return Me.CompareTo(temp.LastName)
    End Function
End Class
