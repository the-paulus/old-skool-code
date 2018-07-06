Imports System
<Serializable()> _
Public Class ImportantDate
    Implements IComparable

    Private mStart As DateTime
    Private mReason As String
    Private mrepeatsAnnually As Boolean

    Public Sub New(ByVal start As DateTime, ByVal reason As String, ByVal recur As Boolean)

        mStart = start
        mReason = reason
        mrepeatsAnnually = recur

    End Sub

    Public Property Recurring() As Boolean

        Get
            Return mrepeatsAnnually
        End Get

        Set(ByVal Value As Boolean)
            mrepeatsAnnually = Value
        End Set

    End Property

    Public Overloads Function Equals(ByVal obj As Object) As Boolean

        If obj.GetType.ToString = "ImportantDate" Then

            Dim temp As ImportantDate
            temp = CType(obj, ImportantDate)

            If Me.mStart = temp.mStart And Me.mReason = temp.mReason Then
                Return True
            Else
                Return False
            End If

        End If

    End Function

    Public Function CompareTo(ByVal obj As Object) As Integer Implements System.IComparable.CompareTo

        Dim temp As ImportantDate
        temp = CType(obj, ImportantDate)

        Return Me.mStart.CompareTo(temp.mStart)

    End Function

    Public Property Reason() As String

        Get
            Return mReason
        End Get

        Set(ByVal Value As String)
            mReason = Value

            If mReason = "" Then
                Throw New ArgumentNullException("You must enter a reason")

            End If

        End Set

    End Property

    Public Property Start() As DateTime

        Get
            Return mStart
        End Get

        Set(ByVal Value As DateTime)
            mStart = Value

            If mStart < Today And mrepeatsAnnually = False Then
                Throw New ArgumentOutOfRangeException("This appointment occurs in the past.")
            End If

        End Set

    End Property

End Class
