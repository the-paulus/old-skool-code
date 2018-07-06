Public Class ImportantDate
    Implements IComparable

    Private start_date As Date
    Private appt_reason As String
    Private repeate As Boolean
    Private app As Boolean

    Public Sub New(ByVal start As Date, ByVal reason As String, ByVal recur As Boolean)
        start_date = start
        appt_reason = reason
        repeate = recur
    End Sub

    Public Sub New()

    End Sub

    Public Property Start() As Date
        Get
            Return start_date
        End Get
        Set(ByVal Value As Date)
            start_date = Value
        End Set
    End Property

    Public Property Reason() As String
        Get
            Return appt_reason
        End Get
        Set(ByVal Value As String)
            appt_reason = Value
        End Set
    End Property

    Public Property Recurring() As Boolean
        Get
            Return repeate
        End Get
        Set(ByVal Value As Boolean)
            repeate = Value
        End Set
    End Property

    Public Property Appointment() As Boolean
        Get
            Return app
        End Get
        Set(ByVal Value As Boolean)
            app = Value
        End Set
    End Property

    Public Overloads Function CompareTo(ByVal obj As Object) As Integer Implements IComparable.CompareTo
        Dim impdat As ImportantDate
        If Object.Equals(Me, obj) = True Then
            Return 0
        Else
            impdat = CType(obj, ImportantDate)
            If Me.app = impdat.app Then
                If Me.Appointment = impdat.Appointment Then
                    If Me.appt_reason = impdat.appt_reason Then
                        If Me.Reason = impdat.Reason Then
                            Return 1
                        End If
                    End If
                End If
            Else
                Return 0
            End If
        End If
    End Function
End Class
