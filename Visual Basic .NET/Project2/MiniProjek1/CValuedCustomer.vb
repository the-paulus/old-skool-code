Public Class CValuedCustomer
    Inherits CCustomer

#Region "Methods"
    Sub New(ByVal _ID As Integer, _
          ByVal _Name As String, _
          ByVal _Surname As String, _
          ByVal _Address As String, _
          ByVal _Tel As String, _
          ByVal _Points As Integer)

        MyBase.New(_ID, _Name, _Surname, _Address, _Tel, _Points)

    End Sub

    Overrides Function CalcDiscount() As Double
        Return 1.2 * CustPoints / 10

    End Function
#End Region

End Class
