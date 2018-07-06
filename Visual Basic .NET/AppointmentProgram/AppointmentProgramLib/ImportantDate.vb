Imports System
<Serializable()> _
Public Class ImportantDate
    Implements IComparable

    Private start_date As Date
    Private reason As String
    Private recurring As Boolean

    Public Sub New()

    End Sub

    Public Sub New(ByVal dt As Date, ByVal res As String, ByVal rec As Boolean)
        Me.start_date = dt
        Me.reason = res
        Me.recurring = rec
    End Sub

    Public Sub New(ByVal dt As Date, ByVal res As String)
        Me.start_date = dt
        Me.reason = res
        Me.recurring = False
    End Sub

    Property StartDate() As Date
        Get
            Return start_date
        End Get
        Set(ByVal Value As Date)
            start_date = Value
        End Set
    End Property

    Property theReason() As String
        Get
            Return Me.reason
        End Get
        Set(ByVal Value As String)
            Me.reason = Value
        End Set
    End Property

    Property isRecurring() As Boolean
        Get
            Return Me.recurring
        End Get
        Set(ByVal Value As Boolean)
            Me.recurring = Value
        End Set
    End Property
    Public Overloads Function Equals(ByVal obj As Object) As Boolean
        If obj.GetType().ToString = "AppointmenProgramLib.ImportantDate" Then
            Dim temp As ImportantDate
            temp = CType(obj, ImportantDate)
            If Me.start_date = temp.start_date And Me.reason = temp.reason Then
                Return True
            Else
                Return False
            End If
        End If
    End Function

    Public Function CompareTo(ByVal obj As Object) As Integer Implements System.IComparable.CompareTo
        Dim temp As ImportantDate
        temp = CType(obj, ImportantDate)

        Return Me.start_date.CompareTo(temp.start_date)

    End Function
End Class
