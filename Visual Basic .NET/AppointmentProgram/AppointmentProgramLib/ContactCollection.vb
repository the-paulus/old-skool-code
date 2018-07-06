Imports System
Imports System.Collections
Imports System.IO
Imports System.Runtime.Serialization.Formatters.Soap
Imports AppointmentProgramLib
<Serializable()> _
Public Class ContactCollection
    Inherits CollectionBase

    Public Sub New()
        MyBase.New()
    End Sub

    Public Sub Serialize(ByVal cc As ContactCollection, ByVal filename As String)
        Dim fs As New FileStream(filename, FileMode.Create)
        Dim sf As New SoapFormatter

        sf.Serialize(fs, cc)
        fs.Close()
    End Sub

    Public Shared Function Deserialize(ByVal filename As String) As ContactCollection
        Dim fs As New FileStream(filename, FileMode.Open)
        Dim sf As New SoapFormatter
        Dim cc As ContactCollection

        cc = sf.Deserialize(fs)
        Return cc
    End Function

    Default Public Property Item(ByVal index As Integer) As Contact
        Get
            Return CType(List.Item(index), Contact)
        End Get
        Set(ByVal Value As Contact)
            list(index) = Value
        End Set
    End Property

    Public Function Add(ByVal c As Contact) As Integer
        If c Is Nothing Then
            Throw New NullReferenceException("The contact can not be null!")
        End If

        If c.LastName Is Nothing Then
            Throw New NullReferenceException("The last name can not be null!")
        End If

        If c.FirstName Is Nothing Then
            Throw New NullReferenceException("The first name can not be null!")
        End If

        If c.Address Is Nothing Then
            Throw New NullReferenceException("The address can not be null!")
        End If

        If c.City Is Nothing Then
            Throw New NullReferenceException("The City can not be null!")
        End If

        If c.HomePhone Is Nothing Or c.WorkPhone Is Nothing Or c.CellPhone Is Nothing Then
            Throw New NullReferenceException("There must be at least one number.")
        End If

        If Me.IndexOf(c) Then
            Throw New ArgumentException("This person is already in the data base.")
        End If

        Return list.Add(c)
    End Function

    Public Sub Insert(ByVal index As Integer, ByVal value As Contact)
        List.Insert(index, value)
    End Sub

    Public Sub Remove(ByVal c As Contact)
        List.Remove(c)
    End Sub

    Public Function IndexOf(ByVal c As Contact) As Integer
        Return List.IndexOf(c)
    End Function

    Public Sub Sort()
        ArrayList.Adapter(List).Sort()
    End Sub
End Class
