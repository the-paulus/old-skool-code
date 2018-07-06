Public Class Database
    Inherits System.ComponentModel.Component

#Region " Component Designer generated code "

    Public Sub New(Container As System.ComponentModel.IContainer)
        MyClass.New()

        'Required for Windows.Forms Class Composition Designer support
        Container.Add(me)
    End Sub

    Public Sub New()
        MyBase.New()

        'This call is required by the Component Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub

    'Component overrides dispose to clean up the component list.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Component Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Component Designer
    'It can be modified using the Component Designer.
    'Do not modify it using the code editor.
    Friend WithEvents daCustomer As System.Data.OleDb.OleDbDataAdapter
    Friend WithEvents OleDbSelectCommand1 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand1 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand1 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand1 As System.Data.OleDb.OleDbCommand
    Friend WithEvents con1 As System.Data.OleDb.OleDbConnection
    Friend WithEvents daRoomType As System.Data.OleDb.OleDbDataAdapter
    Friend WithEvents OleDbSelectCommand2 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand2 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand2 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand2 As System.Data.OleDb.OleDbCommand
    Friend WithEvents daRoom As System.Data.OleDb.OleDbDataAdapter
    Friend WithEvents OleDbSelectCommand3 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand3 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand3 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand3 As System.Data.OleDb.OleDbCommand
    Friend WithEvents daBooking As System.Data.OleDb.OleDbDataAdapter
    Friend WithEvents OleDbSelectCommand4 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand4 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand4 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand4 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbSelectCommand5 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand5 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand5 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand5 As System.Data.OleDb.OleDbCommand
    Friend WithEvents DataSet11 As MiniProjek1.DataSet1
    Friend WithEvents OleDbSelectCommand6 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand6 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand6 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand6 As System.Data.OleDb.OleDbCommand
    Friend WithEvents daBookingRoomDates As System.Data.OleDb.OleDbDataAdapter
    Friend WithEvents OleDbSelectCommand7 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbInsertCommand7 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbUpdateCommand7 As System.Data.OleDb.OleDbCommand
    Friend WithEvents OleDbDeleteCommand7 As System.Data.OleDb.OleDbCommand
    Friend WithEvents daBookingRoom As System.Data.OleDb.OleDbDataAdapter
    Friend WithEvents daBookingRoomperBooking As System.Data.OleDb.OleDbDataAdapter
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.daCustomer = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand1 = New System.Data.OleDb.OleDbCommand
        Me.con1 = New System.Data.OleDb.OleDbConnection
        Me.OleDbInsertCommand1 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand1 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand1 = New System.Data.OleDb.OleDbCommand
        Me.daRoomType = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand2 = New System.Data.OleDb.OleDbCommand
        Me.OleDbInsertCommand2 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand2 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand2 = New System.Data.OleDb.OleDbCommand
        Me.daRoom = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand3 = New System.Data.OleDb.OleDbCommand
        Me.OleDbInsertCommand3 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand3 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand3 = New System.Data.OleDb.OleDbCommand
        Me.daBooking = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand4 = New System.Data.OleDb.OleDbCommand
        Me.OleDbInsertCommand4 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand4 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand4 = New System.Data.OleDb.OleDbCommand
        Me.daBookingRoomperBooking = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand5 = New System.Data.OleDb.OleDbCommand
        Me.OleDbInsertCommand5 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand5 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand5 = New System.Data.OleDb.OleDbCommand
        Me.DataSet11 = New MiniProjek1.DataSet1
        Me.daBookingRoomDates = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand6 = New System.Data.OleDb.OleDbCommand
        Me.OleDbInsertCommand6 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand6 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand6 = New System.Data.OleDb.OleDbCommand
        Me.daBookingRoom = New System.Data.OleDb.OleDbDataAdapter
        Me.OleDbDeleteCommand7 = New System.Data.OleDb.OleDbCommand
        Me.OleDbInsertCommand7 = New System.Data.OleDb.OleDbCommand
        Me.OleDbSelectCommand7 = New System.Data.OleDb.OleDbCommand
        Me.OleDbUpdateCommand7 = New System.Data.OleDb.OleDbCommand
        CType(Me.DataSet11, System.ComponentModel.ISupportInitialize).BeginInit()
        '
        'daCustomer
        '
        Me.daCustomer.DeleteCommand = Me.OleDbDeleteCommand1
        Me.daCustomer.InsertCommand = Me.OleDbInsertCommand1
        Me.daCustomer.SelectCommand = Me.OleDbSelectCommand1
        Me.daCustomer.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Customer", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("AmountPoints", "AmountPoints"), New System.Data.Common.DataColumnMapping("CAddress", "CAddress"), New System.Data.Common.DataColumnMapping("CName", "CName"), New System.Data.Common.DataColumnMapping("CSurname", "CSurname"), New System.Data.Common.DataColumnMapping("CTel", "CTel"), New System.Data.Common.DataColumnMapping("CustomerID", "CustomerID"), New System.Data.Common.DataColumnMapping("ValuedCustomer", "ValuedCustomer")})})
        Me.daCustomer.UpdateCommand = Me.OleDbUpdateCommand1
        '
        'OleDbDeleteCommand1
        '
        Me.OleDbDeleteCommand1.CommandText = "DELETE FROM Customer WHERE (CustomerID = ?) AND (AmountPoints = ? OR ? IS NULL AN" & _
        "D AmountPoints IS NULL) AND (CAddress = ? OR ? IS NULL AND CAddress IS NULL) AND" & _
        " (CName = ? OR ? IS NULL AND CName IS NULL) AND (CSurname = ? OR ? IS NULL AND C" & _
        "Surname IS NULL) AND (CTel = ? OR ? IS NULL AND CTel IS NULL) AND (ValuedCustome" & _
        "r = ?)"
        Me.OleDbDeleteCommand1.Connection = Me.con1
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CustomerID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CustomerID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_AmountPoints", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "AmountPoints", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_AmountPoints1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "AmountPoints", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CAddress", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CAddress", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CAddress1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CAddress", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CName", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CName", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CName1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CName", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CSurname", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CSurname", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CSurname1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CSurname", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CTel", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CTel", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CTel1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CTel", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_ValuedCustomer", System.Data.OleDb.OleDbType.Boolean, 2, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "ValuedCustomer", System.Data.DataRowVersion.Original, Nothing))
        '
        'con1
        '
        Me.con1.ConnectionString = "Jet OLEDB:Global Partial Bulk Ops=2;Jet OLEDB:Registry Path=;Jet OLEDB:Database L" & _
        "ocking Mode=1;Jet OLEDB:Database Password=;Data Source=""C:\s12345678\mp1.mdb"";Pa" & _
        "ssword=;Jet OLEDB:Engine Type=5;Jet OLEDB:Global Bulk Transactions=1;Provider=""M" & _
        "icrosoft.Jet.OLEDB.4.0"";Jet OLEDB:System database=;Jet OLEDB:SFP=False;Extended " & _
        "Properties=;Mode=Share Deny None;Jet OLEDB:New Database Password=;Jet OLEDB:Crea" & _
        "te System Database=False;Jet OLEDB:Don't Copy Locale on Compact=False;Jet OLEDB:" & _
        "Compact Without Replica Repair=False;User ID=Admin;Jet OLEDB:Encrypt Database=Fa" & _
        "lse"
        '
        'OleDbInsertCommand1
        '
        Me.OleDbInsertCommand1.CommandText = "INSERT INTO Customer(AmountPoints, CAddress, CName, CSurname, CTel, ValuedCustome" & _
        "r) VALUES (?, ?, ?, ?, ?, ?)"
        Me.OleDbInsertCommand1.Connection = Me.con1
        Me.OleDbInsertCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("AmountPoints", System.Data.OleDb.OleDbType.Integer, 0, "AmountPoints"))
        Me.OleDbInsertCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CAddress", System.Data.OleDb.OleDbType.VarWChar, 50, "CAddress"))
        Me.OleDbInsertCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CName", System.Data.OleDb.OleDbType.VarWChar, 50, "CName"))
        Me.OleDbInsertCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CSurname", System.Data.OleDb.OleDbType.VarWChar, 50, "CSurname"))
        Me.OleDbInsertCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CTel", System.Data.OleDb.OleDbType.VarWChar, 50, "CTel"))
        Me.OleDbInsertCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("ValuedCustomer", System.Data.OleDb.OleDbType.Boolean, 2, "ValuedCustomer"))
        '
        'OleDbSelectCommand1
        '
        Me.OleDbSelectCommand1.CommandText = "SELECT AmountPoints, CAddress, CName, CSurname, CTel, CustomerID, ValuedCustomer " & _
        "FROM Customer"
        Me.OleDbSelectCommand1.Connection = Me.con1
        '
        'OleDbUpdateCommand1
        '
        Me.OleDbUpdateCommand1.CommandText = "UPDATE Customer SET AmountPoints = ?, CAddress = ?, CName = ?, CSurname = ?, CTel" & _
        " = ?, ValuedCustomer = ? WHERE (CustomerID = ?) AND (AmountPoints = ? OR ? IS NU" & _
        "LL AND AmountPoints IS NULL) AND (CAddress = ? OR ? IS NULL AND CAddress IS NULL" & _
        ") AND (CName = ? OR ? IS NULL AND CName IS NULL) AND (CSurname = ? OR ? IS NULL " & _
        "AND CSurname IS NULL) AND (CTel = ? OR ? IS NULL AND CTel IS NULL) AND (ValuedCu" & _
        "stomer = ?)"
        Me.OleDbUpdateCommand1.Connection = Me.con1
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("AmountPoints", System.Data.OleDb.OleDbType.Integer, 0, "AmountPoints"))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CAddress", System.Data.OleDb.OleDbType.VarWChar, 50, "CAddress"))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CName", System.Data.OleDb.OleDbType.VarWChar, 50, "CName"))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CSurname", System.Data.OleDb.OleDbType.VarWChar, 50, "CSurname"))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("CTel", System.Data.OleDb.OleDbType.VarWChar, 50, "CTel"))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("ValuedCustomer", System.Data.OleDb.OleDbType.Boolean, 2, "ValuedCustomer"))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CustomerID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CustomerID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_AmountPoints", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "AmountPoints", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_AmountPoints1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "AmountPoints", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CAddress", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CAddress", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CAddress1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CAddress", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CName", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CName", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CName1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CName", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CSurname", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CSurname", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CSurname1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CSurname", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CTel", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CTel", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CTel1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CTel", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand1.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_ValuedCustomer", System.Data.OleDb.OleDbType.Boolean, 2, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "ValuedCustomer", System.Data.DataRowVersion.Original, Nothing))
        '
        'daRoomType
        '
        Me.daRoomType.DeleteCommand = Me.OleDbDeleteCommand2
        Me.daRoomType.InsertCommand = Me.OleDbInsertCommand2
        Me.daRoomType.SelectCommand = Me.OleDbSelectCommand2
        Me.daRoomType.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "RoomType", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("NumberBeds", "NumberBeds"), New System.Data.Common.DataColumnMapping("RoomTypeID", "RoomTypeID"), New System.Data.Common.DataColumnMapping("TypeDescription", "TypeDescription")})})
        Me.daRoomType.UpdateCommand = Me.OleDbUpdateCommand2
        '
        'OleDbDeleteCommand2
        '
        Me.OleDbDeleteCommand2.CommandText = "DELETE FROM RoomType WHERE (RoomTypeID = ?) AND (NumberBeds = ? OR ? IS NULL AND " & _
        "NumberBeds IS NULL) AND (TypeDescription = ? OR ? IS NULL AND TypeDescription IS" & _
        " NULL)"
        Me.OleDbDeleteCommand2.Connection = Me.con1
        Me.OleDbDeleteCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomTypeID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomTypeID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_NumberBeds", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "NumberBeds", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_NumberBeds1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "NumberBeds", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_TypeDescription", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "TypeDescription", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_TypeDescription1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "TypeDescription", System.Data.DataRowVersion.Original, Nothing))
        '
        'OleDbInsertCommand2
        '
        Me.OleDbInsertCommand2.CommandText = "INSERT INTO RoomType(NumberBeds, TypeDescription) VALUES (?, ?)"
        Me.OleDbInsertCommand2.Connection = Me.con1
        Me.OleDbInsertCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("NumberBeds", System.Data.OleDb.OleDbType.Integer, 0, "NumberBeds"))
        Me.OleDbInsertCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("TypeDescription", System.Data.OleDb.OleDbType.VarWChar, 50, "TypeDescription"))
        '
        'OleDbSelectCommand2
        '
        Me.OleDbSelectCommand2.CommandText = "SELECT NumberBeds, RoomTypeID, TypeDescription FROM RoomType"
        Me.OleDbSelectCommand2.Connection = Me.con1
        '
        'OleDbUpdateCommand2
        '
        Me.OleDbUpdateCommand2.CommandText = "UPDATE RoomType SET NumberBeds = ?, TypeDescription = ? WHERE (RoomTypeID = ?) AN" & _
        "D (NumberBeds = ? OR ? IS NULL AND NumberBeds IS NULL) AND (TypeDescription = ? " & _
        "OR ? IS NULL AND TypeDescription IS NULL)"
        Me.OleDbUpdateCommand2.Connection = Me.con1
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("NumberBeds", System.Data.OleDb.OleDbType.Integer, 0, "NumberBeds"))
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("TypeDescription", System.Data.OleDb.OleDbType.VarWChar, 50, "TypeDescription"))
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomTypeID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomTypeID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_NumberBeds", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "NumberBeds", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_NumberBeds1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "NumberBeds", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_TypeDescription", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "TypeDescription", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand2.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_TypeDescription1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "TypeDescription", System.Data.DataRowVersion.Original, Nothing))
        '
        'daRoom
        '
        Me.daRoom.DeleteCommand = Me.OleDbDeleteCommand3
        Me.daRoom.InsertCommand = Me.OleDbInsertCommand3
        Me.daRoom.SelectCommand = Me.OleDbSelectCommand3
        Me.daRoom.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Room", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Description", "Description"), New System.Data.Common.DataColumnMapping("Furnished", "Furnished"), New System.Data.Common.DataColumnMapping("Image", "Image"), New System.Data.Common.DataColumnMapping("RateperNight", "RateperNight"), New System.Data.Common.DataColumnMapping("RoomID", "RoomID"), New System.Data.Common.DataColumnMapping("RoomTypeID", "RoomTypeID")})})
        Me.daRoom.UpdateCommand = Me.OleDbUpdateCommand3
        '
        'OleDbDeleteCommand3
        '
        Me.OleDbDeleteCommand3.CommandText = "DELETE FROM Room WHERE (RoomID = ?) AND (Description = ? OR ? IS NULL AND Descrip" & _
        "tion IS NULL) AND (Furnished = ?) AND ([Image] = ? OR ? IS NULL AND [Image] IS N" & _
        "ULL) AND (RateperNight = ? OR ? IS NULL AND RateperNight IS NULL) AND (RoomTypeI" & _
        "D = ? OR ? IS NULL AND RoomTypeID IS NULL)"
        Me.OleDbDeleteCommand3.Connection = Me.con1
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Description", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Description", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Description1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Description", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Furnished", System.Data.OleDb.OleDbType.Boolean, 2, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Furnished", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Image", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Image", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Image1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Image", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RateperNight", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RateperNight", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RateperNight1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RateperNight", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomTypeID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomTypeID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomTypeID1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomTypeID", System.Data.DataRowVersion.Original, Nothing))
        '
        'OleDbInsertCommand3
        '
        Me.OleDbInsertCommand3.CommandText = "INSERT INTO Room(Description, Furnished, [Image], RateperNight, RoomTypeID) VALUE" & _
        "S (?, ?, ?, ?, ?)"
        Me.OleDbInsertCommand3.Connection = Me.con1
        Me.OleDbInsertCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Description", System.Data.OleDb.OleDbType.VarWChar, 50, "Description"))
        Me.OleDbInsertCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Furnished", System.Data.OleDb.OleDbType.Boolean, 2, "Furnished"))
        Me.OleDbInsertCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Image", System.Data.OleDb.OleDbType.VarWChar, 50, "Image"))
        Me.OleDbInsertCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("RateperNight", System.Data.OleDb.OleDbType.Integer, 0, "RateperNight"))
        Me.OleDbInsertCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomTypeID", System.Data.OleDb.OleDbType.Integer, 0, "RoomTypeID"))
        '
        'OleDbSelectCommand3
        '
        Me.OleDbSelectCommand3.CommandText = "SELECT Description, Furnished, [Image], RateperNight, RoomID, RoomTypeID FROM Roo" & _
        "m"
        Me.OleDbSelectCommand3.Connection = Me.con1
        '
        'OleDbUpdateCommand3
        '
        Me.OleDbUpdateCommand3.CommandText = "UPDATE Room SET Description = ?, Furnished = ?, [Image] = ?, RateperNight = ?, Ro" & _
        "omTypeID = ? WHERE (RoomID = ?) AND (Description = ? OR ? IS NULL AND Descriptio" & _
        "n IS NULL) AND (Furnished = ?) AND ([Image] = ? OR ? IS NULL AND [Image] IS NULL" & _
        ") AND (RateperNight = ? OR ? IS NULL AND RateperNight IS NULL) AND (RoomTypeID =" & _
        " ? OR ? IS NULL AND RoomTypeID IS NULL)"
        Me.OleDbUpdateCommand3.Connection = Me.con1
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Description", System.Data.OleDb.OleDbType.VarWChar, 50, "Description"))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Furnished", System.Data.OleDb.OleDbType.Boolean, 2, "Furnished"))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Image", System.Data.OleDb.OleDbType.VarWChar, 50, "Image"))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("RateperNight", System.Data.OleDb.OleDbType.Integer, 0, "RateperNight"))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomTypeID", System.Data.OleDb.OleDbType.Integer, 0, "RoomTypeID"))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Description", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Description", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Description1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Description", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Furnished", System.Data.OleDb.OleDbType.Boolean, 2, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Furnished", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Image", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Image", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_Image1", System.Data.OleDb.OleDbType.VarWChar, 50, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Image", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RateperNight", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RateperNight", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RateperNight1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RateperNight", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomTypeID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomTypeID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand3.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomTypeID1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomTypeID", System.Data.DataRowVersion.Original, Nothing))
        '
        'daBooking
        '
        Me.daBooking.DeleteCommand = Me.OleDbDeleteCommand4
        Me.daBooking.InsertCommand = Me.OleDbInsertCommand4
        Me.daBooking.SelectCommand = Me.OleDbSelectCommand4
        Me.daBooking.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Booking", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("BookingDate", "BookingDate"), New System.Data.Common.DataColumnMapping("BookingID", "BookingID"), New System.Data.Common.DataColumnMapping("CustomerID", "CustomerID"), New System.Data.Common.DataColumnMapping("InvoiceIssued", "InvoiceIssued"), New System.Data.Common.DataColumnMapping("InvoiceTotal", "InvoiceTotal")})})
        Me.daBooking.UpdateCommand = Me.OleDbUpdateCommand4
        '
        'OleDbDeleteCommand4
        '
        Me.OleDbDeleteCommand4.CommandText = "DELETE FROM Booking WHERE (BookingID = ?) AND (BookingDate = ? OR ? IS NULL AND B" & _
        "ookingDate IS NULL) AND (CustomerID = ? OR ? IS NULL AND CustomerID IS NULL) AND" & _
        " (InvoiceIssued = ?) AND (InvoiceTotal = ? OR ? IS NULL AND InvoiceTotal IS NULL" & _
        ")"
        Me.OleDbDeleteCommand4.Connection = Me.con1
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CustomerID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CustomerID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CustomerID1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CustomerID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_InvoiceIssued", System.Data.OleDb.OleDbType.Boolean, 2, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "InvoiceIssued", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_InvoiceTotal", System.Data.OleDb.OleDbType.Currency, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "InvoiceTotal", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_InvoiceTotal1", System.Data.OleDb.OleDbType.Currency, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "InvoiceTotal", System.Data.DataRowVersion.Original, Nothing))
        '
        'OleDbInsertCommand4
        '
        Me.OleDbInsertCommand4.CommandText = "INSERT INTO Booking(BookingDate, CustomerID, InvoiceIssued, InvoiceTotal) VALUES " & _
        "(?, ?, ?, ?)"
        Me.OleDbInsertCommand4.Connection = Me.con1
        Me.OleDbInsertCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingDate", System.Data.OleDb.OleDbType.DBDate, 0, "BookingDate"))
        Me.OleDbInsertCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("CustomerID", System.Data.OleDb.OleDbType.Integer, 0, "CustomerID"))
        Me.OleDbInsertCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("InvoiceIssued", System.Data.OleDb.OleDbType.Boolean, 2, "InvoiceIssued"))
        Me.OleDbInsertCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("InvoiceTotal", System.Data.OleDb.OleDbType.Currency, 0, "InvoiceTotal"))
        '
        'OleDbSelectCommand4
        '
        Me.OleDbSelectCommand4.CommandText = "SELECT BookingDate, InvoiceIssued, InvoiceTotal, CustomerID, BookingID FROM Booki" & _
        "ng"
        Me.OleDbSelectCommand4.Connection = Me.con1
        '
        'OleDbUpdateCommand4
        '
        Me.OleDbUpdateCommand4.CommandText = "UPDATE Booking SET BookingDate = ?, CustomerID = ?, InvoiceIssued = ?, InvoiceTot" & _
        "al = ? WHERE (BookingID = ?) AND (BookingDate = ? OR ? IS NULL AND BookingDate I" & _
        "S NULL) AND (CustomerID = ? OR ? IS NULL AND CustomerID IS NULL) AND (InvoiceIss" & _
        "ued = ?) AND (InvoiceTotal = ? OR ? IS NULL AND InvoiceTotal IS NULL)"
        Me.OleDbUpdateCommand4.Connection = Me.con1
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingDate", System.Data.OleDb.OleDbType.DBDate, 0, "BookingDate"))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("CustomerID", System.Data.OleDb.OleDbType.Integer, 0, "CustomerID"))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("InvoiceIssued", System.Data.OleDb.OleDbType.Boolean, 2, "InvoiceIssued"))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("InvoiceTotal", System.Data.OleDb.OleDbType.Currency, 0, "InvoiceTotal"))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CustomerID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CustomerID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_CustomerID1", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "CustomerID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_InvoiceIssued", System.Data.OleDb.OleDbType.Boolean, 2, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "InvoiceIssued", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_InvoiceTotal", System.Data.OleDb.OleDbType.Currency, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "InvoiceTotal", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand4.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_InvoiceTotal1", System.Data.OleDb.OleDbType.Currency, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "InvoiceTotal", System.Data.DataRowVersion.Original, Nothing))
        '
        'daBookingRoomperBooking
        '
        Me.daBookingRoomperBooking.DeleteCommand = Me.OleDbDeleteCommand5
        Me.daBookingRoomperBooking.InsertCommand = Me.OleDbInsertCommand5
        Me.daBookingRoomperBooking.SelectCommand = Me.OleDbSelectCommand5
        Me.daBookingRoomperBooking.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "BookingRoom", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("BookingID", "BookingID"), New System.Data.Common.DataColumnMapping("EndDate", "EndDate"), New System.Data.Common.DataColumnMapping("RoomID", "RoomID"), New System.Data.Common.DataColumnMapping("StartDate", "StartDate")})})
        Me.daBookingRoomperBooking.UpdateCommand = Me.OleDbUpdateCommand5
        '
        'OleDbDeleteCommand5
        '
        Me.OleDbDeleteCommand5.CommandText = "DELETE FROM BookingRoom WHERE (BookingID = ?) AND (RoomID = ?) AND (EndDate = ? O" & _
        "R ? IS NULL AND EndDate IS NULL) AND (StartDate = ? OR ? IS NULL AND StartDate I" & _
        "S NULL)"
        Me.OleDbDeleteCommand5.Connection = Me.con1
        Me.OleDbDeleteCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        '
        'OleDbInsertCommand5
        '
        Me.OleDbInsertCommand5.CommandText = "INSERT INTO BookingRoom(BookingID, EndDate, RoomID, StartDate) VALUES (?, ?, ?, ?" & _
        ")"
        Me.OleDbInsertCommand5.Connection = Me.con1
        Me.OleDbInsertCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        Me.OleDbInsertCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        Me.OleDbInsertCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomID", System.Data.OleDb.OleDbType.Integer, 0, "RoomID"))
        Me.OleDbInsertCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        '
        'OleDbSelectCommand5
        '
        Me.OleDbSelectCommand5.CommandText = "SELECT BookingRoom.BookingID, BookingRoom.EndDate, BookingRoom.RoomID, BookingRoo" & _
        "m.StartDate, Customer.CustomerID, Customer.CName FROM ((BookingRoom INNER JOIN B" & _
        "ooking ON BookingRoom.BookingID = Booking.BookingID) INNER JOIN Customer ON Book" & _
        "ing.CustomerID = Customer.CustomerID) WHERE (BookingRoom.BookingID = ?)"
        Me.OleDbSelectCommand5.Connection = Me.con1
        Me.OleDbSelectCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        '
        'OleDbUpdateCommand5
        '
        Me.OleDbUpdateCommand5.CommandText = "UPDATE BookingRoom SET BookingID = ?, EndDate = ?, RoomID = ?, StartDate = ? WHER" & _
        "E (BookingID = ?) AND (RoomID = ?) AND (EndDate = ? OR ? IS NULL AND EndDate IS " & _
        "NULL) AND (StartDate = ? OR ? IS NULL AND StartDate IS NULL)"
        Me.OleDbUpdateCommand5.Connection = Me.con1
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomID", System.Data.OleDb.OleDbType.Integer, 0, "RoomID"))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand5.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        '
        'DataSet11
        '
        Me.DataSet11.DataSetName = "DataSet1"
        Me.DataSet11.Locale = New System.Globalization.CultureInfo("en-ZA")
        '
        'daBookingRoomDates
        '
        Me.daBookingRoomDates.DeleteCommand = Me.OleDbDeleteCommand6
        Me.daBookingRoomDates.InsertCommand = Me.OleDbInsertCommand6
        Me.daBookingRoomDates.SelectCommand = Me.OleDbSelectCommand6
        Me.daBookingRoomDates.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "BookingRoom", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("BookingID", "BookingID"), New System.Data.Common.DataColumnMapping("EndDate", "EndDate"), New System.Data.Common.DataColumnMapping("RoomID", "RoomID"), New System.Data.Common.DataColumnMapping("StartDate", "StartDate")})})
        Me.daBookingRoomDates.UpdateCommand = Me.OleDbUpdateCommand6
        '
        'OleDbDeleteCommand6
        '
        Me.OleDbDeleteCommand6.CommandText = "DELETE FROM BookingRoom WHERE (BookingID = ?) AND (RoomID = ?) AND (EndDate = ? O" & _
        "R ? IS NULL AND EndDate IS NULL) AND (StartDate = ? OR ? IS NULL AND StartDate I" & _
        "S NULL)"
        Me.OleDbDeleteCommand6.Connection = Me.con1
        Me.OleDbDeleteCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        '
        'OleDbInsertCommand6
        '
        Me.OleDbInsertCommand6.CommandText = "INSERT INTO BookingRoom(BookingID, EndDate, RoomID, StartDate) VALUES (?, ?, ?, ?" & _
        ")"
        Me.OleDbInsertCommand6.Connection = Me.con1
        Me.OleDbInsertCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        Me.OleDbInsertCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        Me.OleDbInsertCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomID", System.Data.OleDb.OleDbType.Integer, 0, "RoomID"))
        Me.OleDbInsertCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        '
        'OleDbSelectCommand6
        '
        Me.OleDbSelectCommand6.CommandText = "SELECT BookingRoom.BookingID, BookingRoom.EndDate, BookingRoom.RoomID, BookingRoo" & _
        "m.StartDate, Customer.CustomerID, Customer.CName FROM ((BookingRoom INNER JOIN B" & _
        "ooking ON BookingRoom.BookingID = Booking.BookingID) INNER JOIN Customer ON Book" & _
        "ing.CustomerID = Customer.CustomerID) WHERE (BookingRoom.StartDate >= ?) AND (Bo" & _
        "okingRoom.EndDate <= ?)"
        Me.OleDbSelectCommand6.Connection = Me.con1
        Me.OleDbSelectCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        Me.OleDbSelectCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        '
        'OleDbUpdateCommand6
        '
        Me.OleDbUpdateCommand6.CommandText = "UPDATE BookingRoom SET BookingID = ?, EndDate = ?, RoomID = ?, StartDate = ? WHER" & _
        "E (BookingID = ?) AND (RoomID = ?) AND (EndDate = ? OR ? IS NULL AND EndDate IS " & _
        "NULL) AND (StartDate = ? OR ? IS NULL AND StartDate IS NULL)"
        Me.OleDbUpdateCommand6.Connection = Me.con1
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomID", System.Data.OleDb.OleDbType.Integer, 0, "RoomID"))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand6.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        '
        'daBookingRoom
        '
        Me.daBookingRoom.DeleteCommand = Me.OleDbDeleteCommand7
        Me.daBookingRoom.InsertCommand = Me.OleDbInsertCommand7
        Me.daBookingRoom.SelectCommand = Me.OleDbSelectCommand7
        Me.daBookingRoom.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "BookingRoom", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("BookingID", "BookingID"), New System.Data.Common.DataColumnMapping("EndDate", "EndDate"), New System.Data.Common.DataColumnMapping("RoomID", "RoomID"), New System.Data.Common.DataColumnMapping("StartDate", "StartDate")})})
        Me.daBookingRoom.UpdateCommand = Me.OleDbUpdateCommand7
        '
        'OleDbDeleteCommand7
        '
        Me.OleDbDeleteCommand7.CommandText = "DELETE FROM BookingRoom WHERE (BookingID = ?) AND (RoomID = ?) AND (EndDate = ? O" & _
        "R ? IS NULL AND EndDate IS NULL) AND (StartDate = ? OR ? IS NULL AND StartDate I" & _
        "S NULL)"
        Me.OleDbDeleteCommand7.Connection = Me.con1
        Me.OleDbDeleteCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbDeleteCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        '
        'OleDbInsertCommand7
        '
        Me.OleDbInsertCommand7.CommandText = "INSERT INTO BookingRoom(BookingID, EndDate, RoomID, StartDate) VALUES (?, ?, ?, ?" & _
        ")"
        Me.OleDbInsertCommand7.Connection = Me.con1
        Me.OleDbInsertCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        Me.OleDbInsertCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        Me.OleDbInsertCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomID", System.Data.OleDb.OleDbType.Integer, 0, "RoomID"))
        Me.OleDbInsertCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        '
        'OleDbSelectCommand7
        '
        Me.OleDbSelectCommand7.CommandText = "SELECT BookingRoom.BookingID, BookingRoom.EndDate, BookingRoom.RoomID, BookingRoo" & _
        "m.StartDate, Customer.CustomerID, Customer.CName FROM ((BookingRoom INNER JOIN B" & _
        "ooking ON BookingRoom.BookingID = Booking.BookingID) INNER JOIN Customer ON Book" & _
        "ing.CustomerID = Customer.CustomerID)"
        Me.OleDbSelectCommand7.Connection = Me.con1
        '
        'OleDbUpdateCommand7
        '
        Me.OleDbUpdateCommand7.CommandText = "UPDATE BookingRoom SET BookingID = ?, EndDate = ?, RoomID = ?, StartDate = ? WHER" & _
        "E (BookingID = ?) AND (RoomID = ?) AND (EndDate = ? OR ? IS NULL AND EndDate IS " & _
        "NULL) AND (StartDate = ? OR ? IS NULL AND StartDate IS NULL)"
        Me.OleDbUpdateCommand7.Connection = Me.con1
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("BookingID", System.Data.OleDb.OleDbType.Integer, 0, "BookingID"))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("EndDate", System.Data.OleDb.OleDbType.DBDate, 0, "EndDate"))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("RoomID", System.Data.OleDb.OleDbType.Integer, 0, "RoomID"))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("StartDate", System.Data.OleDb.OleDbType.DBDate, 0, "StartDate"))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_BookingID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "BookingID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_RoomID", System.Data.OleDb.OleDbType.Integer, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "RoomID", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_EndDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "EndDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        Me.OleDbUpdateCommand7.Parameters.Add(New System.Data.OleDb.OleDbParameter("Original_StartDate1", System.Data.OleDb.OleDbType.DBDate, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "StartDate", System.Data.DataRowVersion.Original, Nothing))
        CType(Me.DataSet11, System.ComponentModel.ISupportInitialize).EndInit()

    End Sub

#End Region

End Class
