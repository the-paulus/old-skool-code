Imports System
Imports System.Collections
Imports System.IO
Imports System.Runtime.Serialization.Formatters.Soap

<Serializable()> _
Public Class ContactCollection

    Inherits CollectionBase

    Public Sub Insert(ByVal id As Integer, ByVal value As Contact)

        List.Insert(id, value)

    End Sub

    Public Sub Remove(ByVal remContact As Contact)

        List.Remove(remContact)

    End Sub

    Public Function IndexOf(ByVal cContact As Contact) As Integer

        Return List.IndexOf(cContact)

    End Function

    Public Sub Sort()

        ArrayList.Adapter(List).Sort()

    End Sub

    Public Sub Serialize(ByVal ContactC As ContactCollection, ByVal filename As String)

        Dim fs As FileStream

        fs = New FileStream(filename, FileMode.Create)

        Dim SoapFormatter As New SoapFormatter
        SoapFormatter.Serialize(fs, ContactC)
        fs.Close()

    End Sub

    Public Shared Function DeSerialize(ByVal filename As String) As ContactCollection

        Dim fs As FileStream

        fs = New FileStream(filename, FileMode.Open)

        Dim SoapFormatter As New SoapFormatter
        Dim ContactC As ContactCollection

        ContactC = SoapFormatter.Deserialize(fs)
        fs.Close()

        Return ContactC

    End Function

    Public Sub New()

        MyBase.New()

    End Sub

    Default Public Property Item(ByVal id As Integer) As Contact

        Get
            Return CType(List.Item(id), Contact)
        End Get

        Set(ByVal Value As Contact)
            List(id) = Value
        End Set

    End Property

    Public Function Add(ByVal addContact As Contact)

        If addContact Is Nothing Then
            Throw New ArgumentNullException
        End If

        If addContact.LName = "" Then
            Throw New ArgumentException("You must enter a last name")
        End If

        If addContact.FName = "" Then
            Throw New ArgumentException("You must enter a first name")
        End If

        If addContact.HomePh = "" Then
            Throw New ArgumentException("You must enter a home phone number")
        End If

        If addContact.WorkPh = "" Then
            Throw New ArgumentException("You must enter a work phone number")
        End If

        If addContact.CellPh = "" Then
            Throw New ArgumentException("You must enter a cell phone number")
        End If

        If addContact.Address = "" Then
            Throw New ArgumentException("You must enter an address")
        End If

        If addContact.City = "" Then
            Throw New ArgumentException("You must enter a location")
        End If

        If Me.IndexOf(addContact) >= 0 Then

            Throw New ArgumentException("Duplicate Contact Detected")

        End If

        If addContact.Email = "" Then
            addContact.Email = "<<Enter Email>>"
        End If

        If addContact.Address = "" Then
            addContact.Address = "<<Enter Address>>"
        End If

        If addContact.City = "" Then
            addContact.City = "<<Enter Location>>"
        End If

        If addContact.State = "" Then
            addContact.State = "<<Enter State>>"
        End If

        If addContact.Zip = "" Then
            addContact.Zip = "<<Enter Contact>>"
        End If

        If addContact.HomePh = "" Then
            addContact.HomePh = "<<Enter Home Phone>>"
        End If

        If addContact.WorkPh = "" Then
            addContact.WorkPh = "<<Enter Work Phone>>"
        End If

        If addContact.CellPh = "" Then
            addContact.CellPh = "<<Enter Cell Phone>>"
        End If

        If addContact.Notes = "" Then
            addContact.Notes = "(no notes)"
        End If

        Return List.Add(addContact)

    End Function

End Class
