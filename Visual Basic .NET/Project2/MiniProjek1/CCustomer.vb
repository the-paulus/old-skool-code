Public Class CCustomer

#Region "Variables"
    Private CustomerID As Integer
    Private CName As String
    Private CSurname As String
    Private CAddress As String
    Private CTel As String
    Private AmountPoints As Integer

#End Region

#Region "Properties"

    ReadOnly Property CustomerNumber()
        Get
            Return CustomerID
        End Get
    End Property

    ReadOnly Property CustomerNames()
        Get
            Return CName & " " & CSurname
        End Get
    End Property

    ReadOnly Property ContactDetails()
        Get
            Return CAddress & " Tel: " & CTel
        End Get
    End Property

    ReadOnly Property CustPoints()
        Get
            Return AmountPoints
        End Get
    End Property

#End Region


#Region "Methods"
    Sub New(ByVal _ID As Integer, _
             ByVal _Name As String, _
             ByVal _Surname As String, _
             ByVal _Address As String, _
             ByVal _Tel As String, _
             ByVal _Points As Integer)

        CustomerID = _ID
        CName = _Name
        CSurname = _Surname
        CAddress = _Address
        CTel = _Tel
        AmountPoints = _Points

    End Sub

    Overridable Function CalcDiscount() As Double
        Return CustPoints / 20

    End Function

#End Region


End Class
