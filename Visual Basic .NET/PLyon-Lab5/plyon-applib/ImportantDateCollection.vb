Imports System
Imports System.Collections
Imports System.IO
Imports System.Runtime.Serialization.Formatters.Soap

<Serializable()> _
Public Class ImportantDateCollection
    Inherits CollectionBase

    Public Shared Sub serialize(ByVal imp_date_col As ImportantDateCollection, ByVal filename As String)
        Dim fstream As FileStream

        fstream = New FileStream(filename, FileMode.Create)
    End Sub

    Public Function contains(ByVal value As ImportantDate) As Boolean
        Return list.Contains(value)
    End Function

    Public Shared Function Deserialized(ByVal filename As String) As ImportantDateCollection
        Dim fstream As FileStream
        Dim formatter As New SoapFormatter
        Dim imp_date_col As ImportantDateCollection

        fstream = New FileStream(filename, FileMode.Open)
        imp_date_col = formatter.Deserialize(fstream)
        fstream.Close()
        Return imp_date_col
    End Function

    Default Public Property Item(ByVal index As Integer) As ImportantDate
        Get
            Return CType(list(index), ImportantDate)
        End Get
        Set(ByVal Value As ImportantDate)
            list(index) = Value
        End Set
    End Property

    Public Function add(ByVal value As ImportantDate) As Integer
        If value Is Nothing Then
            Throw New ArgumentException("Adding blank ImportantDate")
        End If
        For Each obj As ImportantDate In list
            If obj.Equals(value) Then
                Throw New System.ArgumentOutOfRangeException("Duplicate object!")
            End If
        Next
        Return list.Add(value)
    End Function

    Public Sub insert(ByVal index As Integer, ByVal value As ImportantDate)
        list.Insert(index, value)
    End Sub

    Public Sub remove(ByVal value As ImportantDate)
        list.Remove(value)
    End Sub

    Public Sub sort()
        ArrayList.Adapter(list).Sort()
    End Sub

    Public Function getDatesBetween(ByVal dt1 As Date, ByVal dt2 As Date) As ImportantDateCollection
        Dim dtcol As ImportantDateCollection
        dtcol = New ImportantDateCollection
        For Each i As ImportantDate In Me
            If i.Start >= dt1 And i.Start < dt2 Then
                dtcol.add(i)
            End If
        Next
    End Function
End Class

'Protected Overrides Sub OnInsert(ByVal index As Integer, ByVal value As Object)
'    If Not value.gettype() Is type.gettype("ApptLibrary.ImportantDate") Then
'        Throw New ArgumentException("Not of type ImportantDate.", "value")
'    End If
'End Sub

'Protected Overrides Sub OnRemove(ByVal index As Integer, ByVal value As Object)
'    If Not value.GetType() Is Type.getType("plyon_applib.ImportantDate") Then
'        Throw New ArgumentException("Type must be of ImportantDate.", "newvalue")
'    End If
'End Sub

'Protected Overrides Sub OnSet(ByVal index As Integer, ByVal oldvalue As Object, ByVal newvalue As Object)
'    If Not newvalue.gettype() Is type.gettype("plyon_applib.ImportantDate") Then
'        Throw New ArgumentException("newvalue must be of type ImportantDate.", "newvalue")
'    End If
'End Sub

'Protected Overrides Sub OnValidate(ByVal value As Object)
'    If Not value.gettype() Is type.gettype("plyon_applib.ImportantDate") Then
'        Throw New ArgumentException("value must be of type ImportantDate.")
'    End If
'End Sub