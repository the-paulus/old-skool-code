Imports System
Imports System.Collections
Imports System.IO
Imports System.Runtime.Serialization.Formatters.Soap

<Serializable()> _
Public Class ImportantDateCollection
    Inherits CollectionBase
    Dim next_index As Integer = 0

    Public Sub New()

    End Sub

    Public Shared Sub Serialize(ByVal idc As ImportantDateCollection, ByVal filename As String)
        Dim fs As FileStream
        fs = New FileStream(filename, FileMode.Create)
        Dim soapformatter As New SoapFormatter
        soapformatter.Serialize(fs, idc)
        fs.Close()
    End Sub

    Public Shared Function DeSerialize(ByVal filename As String) As ImportantDateCollection
        Dim fs As FileStream
        fs = New FileStream(filename, FileMode.Open)
        Dim soapformatter As New SoapFormatter
        Dim idc As ImportantDateCollection
        idc = soapformatter.Deserialize(fs)
        fs.Close()
        Return idc
    End Function

    Default Public Property Item(ByVal index As Integer) As ImportantDate
        Get
            Try
                Return list(index)
            Catch ex As ArgumentOutOfRangeException
            End Try
        End Get
        Set(ByVal Value As ImportantDate)
            List(index) = Value
        End Set
    End Property

    Public Function Add(ByVal value As ImportantDate) As Integer
        Try
            If value Is Nothing Then
                Throw New ArgumentNullException("Can not add nothing!")
            End If
            For Each obj As ImportantDate In list
                If obj.Equals(value) Then
                    Throw New System.ArgumentOutOfRangeException("Duplicate")
                End If
            Next
        Catch argex As System.ArgumentNullException
            Console.WriteLine(argex.StackTrace)
        End Try
        Return list.Add(value)
    End Function

    Private Function getNextIndex() As Integer
        Return ++next_index
    End Function

    Public Function getDatesBetween(ByVal dt As Date, ByVal dt1 As Date) As ImportantDateCollection
        Dim dts As ImportantDateCollection
        dts = New ImportantDateCollection
        For Each id As ImportantDate In Me
            If id.StartDate >= dt And id.StartDate <= dt1 Then
                dts.Add(id)
            End If
        Next id
        Return (dts)
    End Function

    Public Function IndexOf(ByVal value As ImportantDate) As Integer
        Return list.IndexOf(value)
    End Function

    Public Sub Insert(ByVal index As Integer, ByVal value As ImportantDate)
        list.Insert(index, value)
    End Sub

    Public Sub Remove(ByVal value As ImportantDate)
        Try
            list.Remove(value)
        Catch argex As System.ArgumentException
            Console.WriteLine(argex.StackTrace())
        End Try

    End Sub

    Public Function Contains(ByVal value As ImportantDate) As Boolean
        Return list.Contains(value)
    End Function

    Public Sub sort()
        ArrayList.Adapter(list).Sort()
    End Sub

    'Protected Overrides Sub OnInsert(ByVal index As Integer, ByVal value As Object)
    '    Try
    '        If Not value.GetType() Is Type.GetType("AppointmentProgramLib.ImportantDate") Or Not value.GetType Is Type.GetType("AppointmentProgramLib.Appointment") Then
    '            Throw New ArgumentException("Value must be of type ImportantDate or Appointment.", "value")
    '        End If
    '    Catch ex As NullReferenceException
    '    End Try
    'End Sub

    'Protected Overrides Sub onset(ByVal index As Integer, ByVal oldvalue As Object, ByVal newvalue As Object)
    '    If Not newvalue.GetType() Is Type.GetType("AppointmentProgramLib.ImportantDate") Or Not newvalue.GetType Is Type.GetType("ApplointmentProgramLib.Appointment") Then Throw New ArgumentException("newvalue must be of type ImportantDate.", "newvalue")
    'End Sub

    'Protected Overrides Sub onvalidate(ByVal value As Object)
    '    Try
    '        If Not value.GetType() Is Type.GetType("AppointmentProgramLib.ImportantDate") Or Not value.GetType Is Type.GetType("AppointmentProgramLib.Appointment") Then
    '            Throw New ArgumentException("value must be of type ImportantDate or Appointment." & value.GetType.ToString, "value")
    '        End If
    '   Catch nullrefex As NullReferenceException
    '        Console.WriteLine(nullrefex.StackTrace)
    '    End Try

    'End Sub
End Class
