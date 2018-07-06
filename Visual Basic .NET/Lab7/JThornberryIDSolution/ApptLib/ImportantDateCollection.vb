Imports System
Imports System.Collections
Imports System.IO
Imports System.Runtime.Serialization.Formatters.Soap

<Serializable()> _
Public Class ImportantDateCollection
    Inherits CollectionBase
    Public Sub Serialize(ByVal idc As ImportantDateCollection, ByVal filename As String)

        Dim fs As FileStream

        fs = New FileStream(filename, FileMode.Create)

        Dim SoapFormatter As New SoapFormatter
        SoapFormatter.Serialize(fs, idc)
        fs.Close()

    End Sub
    Public Shared Function DeSerialize(ByVal filename As String) As ImportantDateCollection

        Dim fs As FileStream
        fs = New FileStream(filename, FileMode.Open)

        Dim SoapFormatter As New SoapFormatter
        Dim idc As ImportantDateCollection

        idc = SoapFormatter.Deserialize(fs)
        fs.Close()

        Return idc

    End Function
    Public Sub Insert(ByVal idx As Integer, ByVal value As ImportantDate)

        List.Insert(idx, value)

    End Sub

    Public Sub Remove(ByVal aDate As ImportantDate)

        List.Remove(aDate)

    End Sub

    Public Function IndexOf(ByVal dat As ImportantDate) As Integer

        Return List.IndexOf(dat)

    End Function

    Public Sub Sort()

        ArrayList.Adapter(List).Sort()

    End Sub

    Public Sub New()

        MyBase.New()

    End Sub

    Default Public Property Item(ByVal idx As Integer) As ImportantDate

        Get
            Return CType(List.Item(idx), ImportantDate)

        End Get

        Set(ByVal Value As ImportantDate)
            List(idx) = Value
        End Set

    End Property

    Public Function Add(ByVal aDate As ImportantDate)

        If aDate Is Nothing Then

            Throw New ArgumentNullException

        End If

        If aDate.GetType().ToString = "ApptLib.Appointment" Then

            Dim ap As Appointment
            ap = CType(aDate, Appointment)

            Dim tp As TimeSpan

            If ap.Duration.Equals(tp) Then
                tp = New TimeSpan(0, 0, 0)

                Throw New ArgumentException("You have not specified a time length.")

            End If

        End If

        If Me.IndexOf(aDate) >= 0 Then

            Throw New ArgumentException("Duplicate Object")

        End If

        Return List.Add(aDate)

    End Function

    Public Function GetDatesBetween(ByVal dt As Date, ByVal dt1 As Date) As ImportantDateCollection

        Dim dts As ImportantDateCollection
        dts = New ImportantDateCollection

        For Each id As ImportantDate In Me

            If id.Start >= dt And id.Start <= dt1 Then
                dts.Add(id)
            End If

        Next

        Return dts

    End Function

End Class
