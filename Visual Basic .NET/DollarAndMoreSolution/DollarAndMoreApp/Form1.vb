Option Explicit On 
Imports System
Public Class Form1
    Inherits System.Windows.Forms.Form

#Region " Windows Form Designer generated code "

    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub

    'Form overrides dispose to clean up the component list.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents gbManualDeposits As System.Windows.Forms.GroupBox
    Friend WithEvents lblR1 As System.Windows.Forms.Label
    Friend WithEvents lblR2 As System.Windows.Forms.Label
    Friend WithEvents lblR3 As System.Windows.Forms.Label
    Friend WithEvents txtR1Currency As System.Windows.Forms.TextBox
    Friend WithEvents txtR2Currency As System.Windows.Forms.TextBox
    Friend WithEvents txtR3Currency As System.Windows.Forms.TextBox
    Friend WithEvents lblRTotals As System.Windows.Forms.Label
    Friend WithEvents lblCurrency As System.Windows.Forms.Label
    Friend WithEvents lblCoin As System.Windows.Forms.Label
    Friend WithEvents txtCurrencyTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtCoinTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtR3Coins As System.Windows.Forms.TextBox
    Friend WithEvents txtR2Coins As System.Windows.Forms.TextBox
    Friend WithEvents txtR1Coins As System.Windows.Forms.TextBox
    Friend WithEvents txtMCheckTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtR3MChecks As System.Windows.Forms.TextBox
    Friend WithEvents txtR2MChecks As System.Windows.Forms.TextBox
    Friend WithEvents txtR1MChecks As System.Windows.Forms.TextBox
    Friend WithEvents txtTotalsTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtR3Total As System.Windows.Forms.TextBox
    Friend WithEvents txtR2Total As System.Windows.Forms.TextBox
    Friend WithEvents txtR1Total As System.Windows.Forms.TextBox
    Friend WithEvents lblChecks As System.Windows.Forms.Label
    Friend WithEvents lblTotals As System.Windows.Forms.Label
    Friend WithEvents gbAutoDeposits As System.Windows.Forms.GroupBox
    Friend WithEvents gbEChecks As System.Windows.Forms.GroupBox
    Friend WithEvents txtR3Batch As System.Windows.Forms.TextBox
    Friend WithEvents txtR2Batch As System.Windows.Forms.TextBox
    Friend WithEvents txtR1Batch As System.Windows.Forms.TextBox
    Friend WithEvents txtECheckTotal As System.Windows.Forms.TextBox
    Friend WithEvents lblBatchNum As System.Windows.Forms.Label
    Friend WithEvents lblEChecks As System.Windows.Forms.Label
    Friend WithEvents lblECheckTotal As System.Windows.Forms.Label
    Friend WithEvents lblECheck3 As System.Windows.Forms.Label
    Friend WithEvents lblECheck2 As System.Windows.Forms.Label
    Friend WithEvents lblECheck1 As System.Windows.Forms.Label
    Friend WithEvents gbVMC As System.Windows.Forms.GroupBox
    Friend WithEvents txtR3VMBatch As System.Windows.Forms.TextBox
    Friend WithEvents txtR2VMBatch As System.Windows.Forms.TextBox
    Friend WithEvents txtR1VMBatch As System.Windows.Forms.TextBox
    Friend WithEvents txtR3MC As System.Windows.Forms.TextBox
    Friend WithEvents txtR2MC As System.Windows.Forms.TextBox
    Friend WithEvents txtR1MC As System.Windows.Forms.TextBox
    Friend WithEvents txtR3Visa As System.Windows.Forms.TextBox
    Friend WithEvents txtR2Visa As System.Windows.Forms.TextBox
    Friend WithEvents txtR1Visa As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents txtR3VMTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtR2VMTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtR1VMTotal As System.Windows.Forms.TextBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents lblVisa As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents txtDate As System.Windows.Forms.TextBox
    Friend WithEvents gbDiscover As System.Windows.Forms.GroupBox
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents Label10 As System.Windows.Forms.Label
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents txtDiscoverTotal As System.Windows.Forms.TextBox
    Friend WithEvents txtR3Discover As System.Windows.Forms.TextBox
    Friend WithEvents txtR2Discover As System.Windows.Forms.TextBox
    Friend WithEvents txtR1Discover As System.Windows.Forms.TextBox
    Friend WithEvents txtR3ECheck As System.Windows.Forms.TextBox
    Friend WithEvents txtR2ECheck As System.Windows.Forms.TextBox
    Friend WithEvents txtR1ECheck As System.Windows.Forms.TextBox
    Friend WithEvents Label12 As System.Windows.Forms.Label
    Friend WithEvents txtGrandTotal As System.Windows.Forms.TextBox
    Friend WithEvents Button1 As System.Windows.Forms.Button
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.gbManualDeposits = New System.Windows.Forms.GroupBox
        Me.lblTotals = New System.Windows.Forms.Label
        Me.lblChecks = New System.Windows.Forms.Label
        Me.txtTotalsTotal = New System.Windows.Forms.TextBox
        Me.txtR3Total = New System.Windows.Forms.TextBox
        Me.txtR2Total = New System.Windows.Forms.TextBox
        Me.txtR1Total = New System.Windows.Forms.TextBox
        Me.txtMCheckTotal = New System.Windows.Forms.TextBox
        Me.txtR3MChecks = New System.Windows.Forms.TextBox
        Me.txtR2MChecks = New System.Windows.Forms.TextBox
        Me.txtR1MChecks = New System.Windows.Forms.TextBox
        Me.txtCoinTotal = New System.Windows.Forms.TextBox
        Me.txtR3Coins = New System.Windows.Forms.TextBox
        Me.txtR2Coins = New System.Windows.Forms.TextBox
        Me.txtR1Coins = New System.Windows.Forms.TextBox
        Me.txtCurrencyTotal = New System.Windows.Forms.TextBox
        Me.lblCoin = New System.Windows.Forms.Label
        Me.lblCurrency = New System.Windows.Forms.Label
        Me.lblRTotals = New System.Windows.Forms.Label
        Me.txtR3Currency = New System.Windows.Forms.TextBox
        Me.txtR2Currency = New System.Windows.Forms.TextBox
        Me.txtR1Currency = New System.Windows.Forms.TextBox
        Me.lblR3 = New System.Windows.Forms.Label
        Me.lblR2 = New System.Windows.Forms.Label
        Me.lblR1 = New System.Windows.Forms.Label
        Me.gbAutoDeposits = New System.Windows.Forms.GroupBox
        Me.gbDiscover = New System.Windows.Forms.GroupBox
        Me.txtDiscoverTotal = New System.Windows.Forms.TextBox
        Me.txtR3Discover = New System.Windows.Forms.TextBox
        Me.txtR2Discover = New System.Windows.Forms.TextBox
        Me.txtR1Discover = New System.Windows.Forms.TextBox
        Me.Label11 = New System.Windows.Forms.Label
        Me.Label8 = New System.Windows.Forms.Label
        Me.Label9 = New System.Windows.Forms.Label
        Me.Label10 = New System.Windows.Forms.Label
        Me.gbVMC = New System.Windows.Forms.GroupBox
        Me.Label4 = New System.Windows.Forms.Label
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.lblVisa = New System.Windows.Forms.Label
        Me.txtR3VMTotal = New System.Windows.Forms.TextBox
        Me.txtR2VMTotal = New System.Windows.Forms.TextBox
        Me.txtR1VMTotal = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.txtR3VMBatch = New System.Windows.Forms.TextBox
        Me.txtR2VMBatch = New System.Windows.Forms.TextBox
        Me.txtR1VMBatch = New System.Windows.Forms.TextBox
        Me.txtR3MC = New System.Windows.Forms.TextBox
        Me.txtR2MC = New System.Windows.Forms.TextBox
        Me.txtR1MC = New System.Windows.Forms.TextBox
        Me.txtR3Visa = New System.Windows.Forms.TextBox
        Me.txtR2Visa = New System.Windows.Forms.TextBox
        Me.txtR1Visa = New System.Windows.Forms.TextBox
        Me.gbEChecks = New System.Windows.Forms.GroupBox
        Me.txtR3Batch = New System.Windows.Forms.TextBox
        Me.txtR2Batch = New System.Windows.Forms.TextBox
        Me.txtR1Batch = New System.Windows.Forms.TextBox
        Me.txtECheckTotal = New System.Windows.Forms.TextBox
        Me.txtR3ECheck = New System.Windows.Forms.TextBox
        Me.txtR2ECheck = New System.Windows.Forms.TextBox
        Me.txtR1ECheck = New System.Windows.Forms.TextBox
        Me.lblBatchNum = New System.Windows.Forms.Label
        Me.lblEChecks = New System.Windows.Forms.Label
        Me.lblECheckTotal = New System.Windows.Forms.Label
        Me.lblECheck3 = New System.Windows.Forms.Label
        Me.lblECheck2 = New System.Windows.Forms.Label
        Me.lblECheck1 = New System.Windows.Forms.Label
        Me.Label7 = New System.Windows.Forms.Label
        Me.txtDate = New System.Windows.Forms.TextBox
        Me.Label12 = New System.Windows.Forms.Label
        Me.txtGrandTotal = New System.Windows.Forms.TextBox
        Me.Button1 = New System.Windows.Forms.Button
        Me.gbManualDeposits.SuspendLayout()
        Me.gbAutoDeposits.SuspendLayout()
        Me.gbDiscover.SuspendLayout()
        Me.gbVMC.SuspendLayout()
        Me.gbEChecks.SuspendLayout()
        Me.SuspendLayout()
        '
        'gbManualDeposits
        '
        Me.gbManualDeposits.Controls.Add(Me.lblTotals)
        Me.gbManualDeposits.Controls.Add(Me.lblChecks)
        Me.gbManualDeposits.Controls.Add(Me.txtTotalsTotal)
        Me.gbManualDeposits.Controls.Add(Me.txtR3Total)
        Me.gbManualDeposits.Controls.Add(Me.txtR2Total)
        Me.gbManualDeposits.Controls.Add(Me.txtR1Total)
        Me.gbManualDeposits.Controls.Add(Me.txtMCheckTotal)
        Me.gbManualDeposits.Controls.Add(Me.txtR3MChecks)
        Me.gbManualDeposits.Controls.Add(Me.txtR2MChecks)
        Me.gbManualDeposits.Controls.Add(Me.txtR1MChecks)
        Me.gbManualDeposits.Controls.Add(Me.txtCoinTotal)
        Me.gbManualDeposits.Controls.Add(Me.txtR3Coins)
        Me.gbManualDeposits.Controls.Add(Me.txtR2Coins)
        Me.gbManualDeposits.Controls.Add(Me.txtR1Coins)
        Me.gbManualDeposits.Controls.Add(Me.txtCurrencyTotal)
        Me.gbManualDeposits.Controls.Add(Me.lblCoin)
        Me.gbManualDeposits.Controls.Add(Me.lblCurrency)
        Me.gbManualDeposits.Controls.Add(Me.lblRTotals)
        Me.gbManualDeposits.Controls.Add(Me.txtR3Currency)
        Me.gbManualDeposits.Controls.Add(Me.txtR2Currency)
        Me.gbManualDeposits.Controls.Add(Me.txtR1Currency)
        Me.gbManualDeposits.Controls.Add(Me.lblR3)
        Me.gbManualDeposits.Controls.Add(Me.lblR2)
        Me.gbManualDeposits.Controls.Add(Me.lblR1)
        Me.gbManualDeposits.Location = New System.Drawing.Point(8, 8)
        Me.gbManualDeposits.Name = "gbManualDeposits"
        Me.gbManualDeposits.Size = New System.Drawing.Size(392, 152)
        Me.gbManualDeposits.TabIndex = 0
        Me.gbManualDeposits.TabStop = False
        Me.gbManualDeposits.Text = "Manual Deposits"
        '
        'lblTotals
        '
        Me.lblTotals.Location = New System.Drawing.Point(280, 16)
        Me.lblTotals.Name = "lblTotals"
        Me.lblTotals.Size = New System.Drawing.Size(40, 23)
        Me.lblTotals.TabIndex = 23
        Me.lblTotals.Text = "Totals"
        '
        'lblChecks
        '
        Me.lblChecks.Location = New System.Drawing.Point(216, 16)
        Me.lblChecks.Name = "lblChecks"
        Me.lblChecks.TabIndex = 22
        Me.lblChecks.Text = "Checks"
        '
        'txtTotalsTotal
        '
        Me.txtTotalsTotal.Location = New System.Drawing.Point(280, 120)
        Me.txtTotalsTotal.Name = "txtTotalsTotal"
        Me.txtTotalsTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtTotalsTotal.TabIndex = 21
        Me.txtTotalsTotal.Text = "0"
        '
        'txtR3Total
        '
        Me.txtR3Total.Location = New System.Drawing.Point(280, 96)
        Me.txtR3Total.Name = "txtR3Total"
        Me.txtR3Total.Size = New System.Drawing.Size(56, 20)
        Me.txtR3Total.TabIndex = 20
        Me.txtR3Total.Text = "0"
        '
        'txtR2Total
        '
        Me.txtR2Total.Location = New System.Drawing.Point(280, 72)
        Me.txtR2Total.Name = "txtR2Total"
        Me.txtR2Total.Size = New System.Drawing.Size(56, 20)
        Me.txtR2Total.TabIndex = 19
        Me.txtR2Total.Text = "0"
        '
        'txtR1Total
        '
        Me.txtR1Total.Location = New System.Drawing.Point(280, 48)
        Me.txtR1Total.Name = "txtR1Total"
        Me.txtR1Total.Size = New System.Drawing.Size(56, 20)
        Me.txtR1Total.TabIndex = 18
        Me.txtR1Total.Text = "0"
        '
        'txtMCheckTotal
        '
        Me.txtMCheckTotal.Location = New System.Drawing.Point(216, 120)
        Me.txtMCheckTotal.Name = "txtMCheckTotal"
        Me.txtMCheckTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtMCheckTotal.TabIndex = 17
        Me.txtMCheckTotal.Text = "0"
        '
        'txtR3MChecks
        '
        Me.txtR3MChecks.Location = New System.Drawing.Point(216, 96)
        Me.txtR3MChecks.Name = "txtR3MChecks"
        Me.txtR3MChecks.Size = New System.Drawing.Size(56, 20)
        Me.txtR3MChecks.TabIndex = 16
        Me.txtR3MChecks.Text = "0"
        '
        'txtR2MChecks
        '
        Me.txtR2MChecks.Location = New System.Drawing.Point(216, 72)
        Me.txtR2MChecks.Name = "txtR2MChecks"
        Me.txtR2MChecks.Size = New System.Drawing.Size(56, 20)
        Me.txtR2MChecks.TabIndex = 15
        Me.txtR2MChecks.Text = "0"
        '
        'txtR1MChecks
        '
        Me.txtR1MChecks.Location = New System.Drawing.Point(216, 48)
        Me.txtR1MChecks.Name = "txtR1MChecks"
        Me.txtR1MChecks.Size = New System.Drawing.Size(56, 20)
        Me.txtR1MChecks.TabIndex = 14
        Me.txtR1MChecks.Text = "0"
        '
        'txtCoinTotal
        '
        Me.txtCoinTotal.Location = New System.Drawing.Point(152, 120)
        Me.txtCoinTotal.Name = "txtCoinTotal"
        Me.txtCoinTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtCoinTotal.TabIndex = 13
        Me.txtCoinTotal.Text = "0"
        '
        'txtR3Coins
        '
        Me.txtR3Coins.Location = New System.Drawing.Point(152, 96)
        Me.txtR3Coins.Name = "txtR3Coins"
        Me.txtR3Coins.Size = New System.Drawing.Size(56, 20)
        Me.txtR3Coins.TabIndex = 12
        Me.txtR3Coins.Text = "0"
        '
        'txtR2Coins
        '
        Me.txtR2Coins.Location = New System.Drawing.Point(152, 72)
        Me.txtR2Coins.Name = "txtR2Coins"
        Me.txtR2Coins.Size = New System.Drawing.Size(56, 20)
        Me.txtR2Coins.TabIndex = 11
        Me.txtR2Coins.Text = "0"
        '
        'txtR1Coins
        '
        Me.txtR1Coins.Location = New System.Drawing.Point(152, 48)
        Me.txtR1Coins.Name = "txtR1Coins"
        Me.txtR1Coins.Size = New System.Drawing.Size(56, 20)
        Me.txtR1Coins.TabIndex = 10
        Me.txtR1Coins.Text = "0"
        '
        'txtCurrencyTotal
        '
        Me.txtCurrencyTotal.Location = New System.Drawing.Point(88, 120)
        Me.txtCurrencyTotal.Name = "txtCurrencyTotal"
        Me.txtCurrencyTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtCurrencyTotal.TabIndex = 9
        Me.txtCurrencyTotal.Text = "0"
        '
        'lblCoin
        '
        Me.lblCoin.Location = New System.Drawing.Point(152, 16)
        Me.lblCoin.Name = "lblCoin"
        Me.lblCoin.TabIndex = 8
        Me.lblCoin.Text = "Coins"
        '
        'lblCurrency
        '
        Me.lblCurrency.Location = New System.Drawing.Point(88, 16)
        Me.lblCurrency.Name = "lblCurrency"
        Me.lblCurrency.TabIndex = 7
        Me.lblCurrency.Text = "Currency"
        '
        'lblRTotals
        '
        Me.lblRTotals.Location = New System.Drawing.Point(16, 120)
        Me.lblRTotals.Name = "lblRTotals"
        Me.lblRTotals.TabIndex = 6
        Me.lblRTotals.Text = "Totals"
        '
        'txtR3Currency
        '
        Me.txtR3Currency.Location = New System.Drawing.Point(88, 96)
        Me.txtR3Currency.Name = "txtR3Currency"
        Me.txtR3Currency.Size = New System.Drawing.Size(56, 20)
        Me.txtR3Currency.TabIndex = 5
        Me.txtR3Currency.Text = "0"
        '
        'txtR2Currency
        '
        Me.txtR2Currency.Location = New System.Drawing.Point(88, 72)
        Me.txtR2Currency.Name = "txtR2Currency"
        Me.txtR2Currency.Size = New System.Drawing.Size(56, 20)
        Me.txtR2Currency.TabIndex = 4
        Me.txtR2Currency.Text = "0"
        '
        'txtR1Currency
        '
        Me.txtR1Currency.Location = New System.Drawing.Point(88, 48)
        Me.txtR1Currency.Name = "txtR1Currency"
        Me.txtR1Currency.Size = New System.Drawing.Size(56, 20)
        Me.txtR1Currency.TabIndex = 3
        Me.txtR1Currency.Text = "0"
        '
        'lblR3
        '
        Me.lblR3.Location = New System.Drawing.Point(16, 96)
        Me.lblR3.Name = "lblR3"
        Me.lblR3.TabIndex = 2
        Me.lblR3.Text = "Register 3"
        '
        'lblR2
        '
        Me.lblR2.Location = New System.Drawing.Point(16, 72)
        Me.lblR2.Name = "lblR2"
        Me.lblR2.TabIndex = 1
        Me.lblR2.Text = "Register 2"
        '
        'lblR1
        '
        Me.lblR1.Location = New System.Drawing.Point(16, 48)
        Me.lblR1.Name = "lblR1"
        Me.lblR1.TabIndex = 0
        Me.lblR1.Text = "Register 1"
        '
        'gbAutoDeposits
        '
        Me.gbAutoDeposits.Controls.Add(Me.gbDiscover)
        Me.gbAutoDeposits.Controls.Add(Me.gbVMC)
        Me.gbAutoDeposits.Controls.Add(Me.gbEChecks)
        Me.gbAutoDeposits.Location = New System.Drawing.Point(8, 168)
        Me.gbAutoDeposits.Name = "gbAutoDeposits"
        Me.gbAutoDeposits.Size = New System.Drawing.Size(392, 360)
        Me.gbAutoDeposits.TabIndex = 1
        Me.gbAutoDeposits.TabStop = False
        Me.gbAutoDeposits.Text = "Automatic Deposits"
        '
        'gbDiscover
        '
        Me.gbDiscover.Controls.Add(Me.txtDiscoverTotal)
        Me.gbDiscover.Controls.Add(Me.txtR3Discover)
        Me.gbDiscover.Controls.Add(Me.txtR2Discover)
        Me.gbDiscover.Controls.Add(Me.txtR1Discover)
        Me.gbDiscover.Controls.Add(Me.Label11)
        Me.gbDiscover.Controls.Add(Me.Label8)
        Me.gbDiscover.Controls.Add(Me.Label9)
        Me.gbDiscover.Controls.Add(Me.Label10)
        Me.gbDiscover.Location = New System.Drawing.Point(16, 256)
        Me.gbDiscover.Name = "gbDiscover"
        Me.gbDiscover.Size = New System.Drawing.Size(360, 88)
        Me.gbDiscover.TabIndex = 2
        Me.gbDiscover.TabStop = False
        Me.gbDiscover.Text = "Discover"
        '
        'txtDiscoverTotal
        '
        Me.txtDiscoverTotal.Location = New System.Drawing.Point(240, 48)
        Me.txtDiscoverTotal.Name = "txtDiscoverTotal"
        Me.txtDiscoverTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtDiscoverTotal.TabIndex = 44
        Me.txtDiscoverTotal.Text = "0"
        '
        'txtR3Discover
        '
        Me.txtR3Discover.Location = New System.Drawing.Point(176, 48)
        Me.txtR3Discover.Name = "txtR3Discover"
        Me.txtR3Discover.Size = New System.Drawing.Size(56, 20)
        Me.txtR3Discover.TabIndex = 43
        Me.txtR3Discover.Text = "0"
        '
        'txtR2Discover
        '
        Me.txtR2Discover.Location = New System.Drawing.Point(112, 48)
        Me.txtR2Discover.Name = "txtR2Discover"
        Me.txtR2Discover.Size = New System.Drawing.Size(56, 20)
        Me.txtR2Discover.TabIndex = 42
        Me.txtR2Discover.Text = "0"
        '
        'txtR1Discover
        '
        Me.txtR1Discover.Location = New System.Drawing.Point(48, 48)
        Me.txtR1Discover.Name = "txtR1Discover"
        Me.txtR1Discover.Size = New System.Drawing.Size(56, 20)
        Me.txtR1Discover.TabIndex = 41
        Me.txtR1Discover.Text = "0"
        '
        'Label11
        '
        Me.Label11.Location = New System.Drawing.Point(240, 24)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(48, 23)
        Me.Label11.TabIndex = 40
        Me.Label11.Text = "Total"
        '
        'Label8
        '
        Me.Label8.Location = New System.Drawing.Point(176, 24)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(56, 23)
        Me.Label8.TabIndex = 39
        Me.Label8.Text = "Register 3"
        '
        'Label9
        '
        Me.Label9.Location = New System.Drawing.Point(112, 24)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(64, 23)
        Me.Label9.TabIndex = 38
        Me.Label9.Text = "Register 2"
        '
        'Label10
        '
        Me.Label10.Location = New System.Drawing.Point(48, 24)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(64, 23)
        Me.Label10.TabIndex = 37
        Me.Label10.Text = "Register 1"
        '
        'gbVMC
        '
        Me.gbVMC.Controls.Add(Me.Label4)
        Me.gbVMC.Controls.Add(Me.Label5)
        Me.gbVMC.Controls.Add(Me.Label6)
        Me.gbVMC.Controls.Add(Me.lblVisa)
        Me.gbVMC.Controls.Add(Me.txtR3VMTotal)
        Me.gbVMC.Controls.Add(Me.txtR2VMTotal)
        Me.gbVMC.Controls.Add(Me.txtR1VMTotal)
        Me.gbVMC.Controls.Add(Me.Label1)
        Me.gbVMC.Controls.Add(Me.Label2)
        Me.gbVMC.Controls.Add(Me.Label3)
        Me.gbVMC.Controls.Add(Me.txtR3VMBatch)
        Me.gbVMC.Controls.Add(Me.txtR2VMBatch)
        Me.gbVMC.Controls.Add(Me.txtR1VMBatch)
        Me.gbVMC.Controls.Add(Me.txtR3MC)
        Me.gbVMC.Controls.Add(Me.txtR2MC)
        Me.gbVMC.Controls.Add(Me.txtR1MC)
        Me.gbVMC.Controls.Add(Me.txtR3Visa)
        Me.gbVMC.Controls.Add(Me.txtR2Visa)
        Me.gbVMC.Controls.Add(Me.txtR1Visa)
        Me.gbVMC.Location = New System.Drawing.Point(16, 128)
        Me.gbVMC.Name = "gbVMC"
        Me.gbVMC.Size = New System.Drawing.Size(360, 120)
        Me.gbVMC.TabIndex = 1
        Me.gbVMC.TabStop = False
        Me.gbVMC.Text = "Visa/MasterCard Deposits"
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(272, 16)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(40, 23)
        Me.Label4.TabIndex = 44
        Me.Label4.Text = "Totals"
        '
        'Label5
        '
        Me.Label5.Location = New System.Drawing.Point(208, 16)
        Me.Label5.Name = "Label5"
        Me.Label5.TabIndex = 43
        Me.Label5.Text = "Batch"
        '
        'Label6
        '
        Me.Label6.Location = New System.Drawing.Point(144, 16)
        Me.Label6.Name = "Label6"
        Me.Label6.TabIndex = 42
        Me.Label6.Text = "MasterCard"
        '
        'lblVisa
        '
        Me.lblVisa.Location = New System.Drawing.Point(80, 16)
        Me.lblVisa.Name = "lblVisa"
        Me.lblVisa.TabIndex = 41
        Me.lblVisa.Text = "Visa"
        '
        'txtR3VMTotal
        '
        Me.txtR3VMTotal.Location = New System.Drawing.Point(272, 88)
        Me.txtR3VMTotal.Name = "txtR3VMTotal"
        Me.txtR3VMTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtR3VMTotal.TabIndex = 39
        Me.txtR3VMTotal.Text = "0"
        '
        'txtR2VMTotal
        '
        Me.txtR2VMTotal.Location = New System.Drawing.Point(272, 64)
        Me.txtR2VMTotal.Name = "txtR2VMTotal"
        Me.txtR2VMTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtR2VMTotal.TabIndex = 38
        Me.txtR2VMTotal.Text = "0"
        '
        'txtR1VMTotal
        '
        Me.txtR1VMTotal.Location = New System.Drawing.Point(272, 40)
        Me.txtR1VMTotal.Name = "txtR1VMTotal"
        Me.txtR1VMTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtR1VMTotal.TabIndex = 37
        Me.txtR1VMTotal.Text = "0"
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(8, 88)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(56, 23)
        Me.Label1.TabIndex = 36
        Me.Label1.Text = "Register 3"
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(8, 64)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(64, 23)
        Me.Label2.TabIndex = 35
        Me.Label2.Text = "Register 2"
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(8, 40)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(64, 23)
        Me.Label3.TabIndex = 34
        Me.Label3.Text = "Register 1"
        '
        'txtR3VMBatch
        '
        Me.txtR3VMBatch.Location = New System.Drawing.Point(208, 88)
        Me.txtR3VMBatch.Name = "txtR3VMBatch"
        Me.txtR3VMBatch.Size = New System.Drawing.Size(56, 20)
        Me.txtR3VMBatch.TabIndex = 32
        Me.txtR3VMBatch.Text = "0"
        '
        'txtR2VMBatch
        '
        Me.txtR2VMBatch.Location = New System.Drawing.Point(208, 64)
        Me.txtR2VMBatch.Name = "txtR2VMBatch"
        Me.txtR2VMBatch.Size = New System.Drawing.Size(56, 20)
        Me.txtR2VMBatch.TabIndex = 31
        Me.txtR2VMBatch.Text = "0"
        '
        'txtR1VMBatch
        '
        Me.txtR1VMBatch.Location = New System.Drawing.Point(208, 40)
        Me.txtR1VMBatch.Name = "txtR1VMBatch"
        Me.txtR1VMBatch.Size = New System.Drawing.Size(56, 20)
        Me.txtR1VMBatch.TabIndex = 30
        Me.txtR1VMBatch.Text = "0"
        '
        'txtR3MC
        '
        Me.txtR3MC.Location = New System.Drawing.Point(144, 88)
        Me.txtR3MC.Name = "txtR3MC"
        Me.txtR3MC.Size = New System.Drawing.Size(56, 20)
        Me.txtR3MC.TabIndex = 28
        Me.txtR3MC.Text = "0"
        '
        'txtR2MC
        '
        Me.txtR2MC.Location = New System.Drawing.Point(144, 64)
        Me.txtR2MC.Name = "txtR2MC"
        Me.txtR2MC.Size = New System.Drawing.Size(56, 20)
        Me.txtR2MC.TabIndex = 27
        Me.txtR2MC.Text = "0"
        '
        'txtR1MC
        '
        Me.txtR1MC.Location = New System.Drawing.Point(144, 40)
        Me.txtR1MC.Name = "txtR1MC"
        Me.txtR1MC.Size = New System.Drawing.Size(56, 20)
        Me.txtR1MC.TabIndex = 26
        Me.txtR1MC.Text = "0"
        '
        'txtR3Visa
        '
        Me.txtR3Visa.Location = New System.Drawing.Point(80, 88)
        Me.txtR3Visa.Name = "txtR3Visa"
        Me.txtR3Visa.Size = New System.Drawing.Size(56, 20)
        Me.txtR3Visa.TabIndex = 24
        Me.txtR3Visa.Text = "0"
        '
        'txtR2Visa
        '
        Me.txtR2Visa.Location = New System.Drawing.Point(80, 64)
        Me.txtR2Visa.Name = "txtR2Visa"
        Me.txtR2Visa.Size = New System.Drawing.Size(56, 20)
        Me.txtR2Visa.TabIndex = 23
        Me.txtR2Visa.Text = "0"
        '
        'txtR1Visa
        '
        Me.txtR1Visa.Location = New System.Drawing.Point(80, 40)
        Me.txtR1Visa.Name = "txtR1Visa"
        Me.txtR1Visa.Size = New System.Drawing.Size(56, 20)
        Me.txtR1Visa.TabIndex = 22
        Me.txtR1Visa.Text = "0"
        '
        'gbEChecks
        '
        Me.gbEChecks.Controls.Add(Me.txtR3Batch)
        Me.gbEChecks.Controls.Add(Me.txtR2Batch)
        Me.gbEChecks.Controls.Add(Me.txtR1Batch)
        Me.gbEChecks.Controls.Add(Me.txtECheckTotal)
        Me.gbEChecks.Controls.Add(Me.txtR3ECheck)
        Me.gbEChecks.Controls.Add(Me.txtR2ECheck)
        Me.gbEChecks.Controls.Add(Me.txtR1ECheck)
        Me.gbEChecks.Controls.Add(Me.lblBatchNum)
        Me.gbEChecks.Controls.Add(Me.lblEChecks)
        Me.gbEChecks.Controls.Add(Me.lblECheckTotal)
        Me.gbEChecks.Controls.Add(Me.lblECheck3)
        Me.gbEChecks.Controls.Add(Me.lblECheck2)
        Me.gbEChecks.Controls.Add(Me.lblECheck1)
        Me.gbEChecks.Location = New System.Drawing.Point(16, 24)
        Me.gbEChecks.Name = "gbEChecks"
        Me.gbEChecks.Size = New System.Drawing.Size(360, 100)
        Me.gbEChecks.TabIndex = 0
        Me.gbEChecks.TabStop = False
        Me.gbEChecks.Text = "E-Checks"
        '
        'txtR3Batch
        '
        Me.txtR3Batch.Location = New System.Drawing.Point(216, 64)
        Me.txtR3Batch.Name = "txtR3Batch"
        Me.txtR3Batch.Size = New System.Drawing.Size(56, 20)
        Me.txtR3Batch.TabIndex = 29
        Me.txtR3Batch.Text = ""
        '
        'txtR2Batch
        '
        Me.txtR2Batch.Location = New System.Drawing.Point(144, 64)
        Me.txtR2Batch.Name = "txtR2Batch"
        Me.txtR2Batch.Size = New System.Drawing.Size(56, 20)
        Me.txtR2Batch.TabIndex = 28
        Me.txtR2Batch.Text = ""
        '
        'txtR1Batch
        '
        Me.txtR1Batch.Location = New System.Drawing.Point(76, 63)
        Me.txtR1Batch.Name = "txtR1Batch"
        Me.txtR1Batch.Size = New System.Drawing.Size(56, 20)
        Me.txtR1Batch.TabIndex = 27
        Me.txtR1Batch.Text = ""
        '
        'txtECheckTotal
        '
        Me.txtECheckTotal.Location = New System.Drawing.Point(284, 31)
        Me.txtECheckTotal.Name = "txtECheckTotal"
        Me.txtECheckTotal.Size = New System.Drawing.Size(56, 20)
        Me.txtECheckTotal.TabIndex = 26
        Me.txtECheckTotal.Text = "0"
        '
        'txtR3ECheck
        '
        Me.txtR3ECheck.Location = New System.Drawing.Point(216, 32)
        Me.txtR3ECheck.Name = "txtR3ECheck"
        Me.txtR3ECheck.Size = New System.Drawing.Size(56, 20)
        Me.txtR3ECheck.TabIndex = 25
        Me.txtR3ECheck.Text = "0"
        '
        'txtR2ECheck
        '
        Me.txtR2ECheck.Location = New System.Drawing.Point(144, 31)
        Me.txtR2ECheck.Name = "txtR2ECheck"
        Me.txtR2ECheck.Size = New System.Drawing.Size(56, 20)
        Me.txtR2ECheck.TabIndex = 24
        Me.txtR2ECheck.Text = "0"
        '
        'txtR1ECheck
        '
        Me.txtR1ECheck.Location = New System.Drawing.Point(76, 31)
        Me.txtR1ECheck.Name = "txtR1ECheck"
        Me.txtR1ECheck.Size = New System.Drawing.Size(56, 20)
        Me.txtR1ECheck.TabIndex = 23
        Me.txtR1ECheck.Text = "0"
        '
        'lblBatchNum
        '
        Me.lblBatchNum.Location = New System.Drawing.Point(20, 71)
        Me.lblBatchNum.Name = "lblBatchNum"
        Me.lblBatchNum.Size = New System.Drawing.Size(48, 23)
        Me.lblBatchNum.TabIndex = 22
        Me.lblBatchNum.Text = "Batch #"
        '
        'lblEChecks
        '
        Me.lblEChecks.Location = New System.Drawing.Point(20, 39)
        Me.lblEChecks.Name = "lblEChecks"
        Me.lblEChecks.Size = New System.Drawing.Size(56, 23)
        Me.lblEChecks.TabIndex = 21
        Me.lblEChecks.Text = "E-Checks"
        '
        'lblECheckTotal
        '
        Me.lblECheckTotal.Location = New System.Drawing.Point(292, 7)
        Me.lblECheckTotal.Name = "lblECheckTotal"
        Me.lblECheckTotal.Size = New System.Drawing.Size(48, 23)
        Me.lblECheckTotal.TabIndex = 20
        Me.lblECheckTotal.Text = "Total"
        '
        'lblECheck3
        '
        Me.lblECheck3.Location = New System.Drawing.Point(220, 7)
        Me.lblECheck3.Name = "lblECheck3"
        Me.lblECheck3.Size = New System.Drawing.Size(56, 23)
        Me.lblECheck3.TabIndex = 19
        Me.lblECheck3.Text = "Register 3"
        '
        'lblECheck2
        '
        Me.lblECheck2.Location = New System.Drawing.Point(148, 7)
        Me.lblECheck2.Name = "lblECheck2"
        Me.lblECheck2.Size = New System.Drawing.Size(56, 23)
        Me.lblECheck2.TabIndex = 18
        Me.lblECheck2.Text = "Register 2"
        '
        'lblECheck1
        '
        Me.lblECheck1.Location = New System.Drawing.Point(68, 7)
        Me.lblECheck1.Name = "lblECheck1"
        Me.lblECheck1.Size = New System.Drawing.Size(64, 23)
        Me.lblECheck1.TabIndex = 17
        Me.lblECheck1.Text = "Register 1"
        '
        'Label7
        '
        Me.Label7.Location = New System.Drawing.Point(416, 48)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(88, 32)
        Me.Label7.TabIndex = 2
        Me.Label7.Text = "Date"
        '
        'txtDate
        '
        Me.txtDate.Location = New System.Drawing.Point(456, 48)
        Me.txtDate.Name = "txtDate"
        Me.txtDate.Size = New System.Drawing.Size(128, 20)
        Me.txtDate.TabIndex = 3
        Me.txtDate.Text = ""
        '
        'Label12
        '
        Me.Label12.Location = New System.Drawing.Point(424, 104)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(104, 24)
        Me.Label12.TabIndex = 4
        Me.Label12.Text = "Grand Total:"
        '
        'txtGrandTotal
        '
        Me.txtGrandTotal.Location = New System.Drawing.Point(424, 128)
        Me.txtGrandTotal.Name = "txtGrandTotal"
        Me.txtGrandTotal.Size = New System.Drawing.Size(160, 20)
        Me.txtGrandTotal.TabIndex = 5
        Me.txtGrandTotal.Text = "0"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(440, 168)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(112, 24)
        Me.Button1.TabIndex = 6
        Me.Button1.Text = "Button1"
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(616, 541)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.txtGrandTotal)
        Me.Controls.Add(Me.Label12)
        Me.Controls.Add(Me.txtDate)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.gbAutoDeposits)
        Me.Controls.Add(Me.gbManualDeposits)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.gbManualDeposits.ResumeLayout(False)
        Me.gbAutoDeposits.ResumeLayout(False)
        Me.gbDiscover.ResumeLayout(False)
        Me.gbVMC.ResumeLayout(False)
        Me.gbEChecks.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

    'Private Sub updateTotals()
    '    txtCurrencyTotal.Text = Convert.ToSingle(txtR1Currency.Text) + Convert.ToSingle(txtR2Currency.Text) + Convert.ToSingle(txtR3Currency.Text)
    '    txtCoinTotal.Text = Convert.ToSingle(txtR1Coins.Text) + Convert.ToSingle(txtR2Coins.Text) + Convert.ToSingle(txtR3Coins.Text)
    '    txtCoinTotal.Text = Convert.ToSingle(txtR1MChecks.Text) + Convert.ToSingle(txtR2MChecks.Text) + Convert.ToSingle(txtR3MChecks.Text)
    '    txtTotalsTotal.Text = Convert.ToSingle(txtR1Total.Text) + Convert.ToSingle(txtR2Total.Text) + Convert.ToSingle(txtR3Total.Text)

    '    txtECheckTotal.Text = Convert.ToSingle(txtR1ECheck.Text) + Convert.ToSingle(txtR2ECheck.Text) + Convert.ToSingle(txtR3ECheck.Text)

    '    txtR1VMTotal.Text = Convert.ToSingle(txtR1Visa.Text) + Convert.ToSingle(txtR1MC.Text)
    '    txtR2VMTotal.Text = Convert.ToSingle(txtR2Visa.Text) + Convert.ToSingle(txtR2MC.Text)
    '    txtR3VMTotal.Text = Convert.ToSingle(txtR3Visa.Text) + Convert.ToSingle(txtR3MC.Text)

    '    txtDiscoverTotal.Text = Convert.ToSingle(txtR1Discover.Text) + Convert.ToSingle(txtR2Discover.Text) + Convert.ToSingle(txtR3Discover.Text)

    '    txtGrandTotal.Text = Convert.ToSingle(txtTotalsTotal.Text) + Convert.ToSingle(txtECheckTotal.Text) + Convert.ToSingle(txtR1VMTotal.Text) + Convert.ToSingle(txtR2VMTotal.Text) + Convert.ToSingle(txtR3VMTotal.Text) + Convert.ToSingle(txtDiscoverTotal.Text)
    'End Sub

    Private Sub txtR1Currency_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1Currency.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR1Coins_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1Coins.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR1MChecks_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1MChecks.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR2Currency_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1Currency.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR2Coins_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1Coins.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR2MChecks_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1MChecks.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR3Currency_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1Currency.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR3Coins_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1Coins.LostFocus
        updateTotals()
    End Sub

    Private Sub txtR3MChecks_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtR1MChecks.LostFocus
        updateTotals()
    End Sub
    Private Sub updateTotals()
        txtR1Total.Text = FormatCurrency(Convert.ToSingle(txtR1Currency.Text) + Convert.ToSingle(txtR1Coins.Text) + Convert.ToSingle(txtR1MChecks.Text), 2)
        txtR2Total.Text = FormatCurrency(Convert.ToSingle(txtR2Currency.Text) + Convert.ToSingle(txtR2Coins.Text) + Convert.ToSingle(txtR2MChecks.Text), 2)
        txtR3Total.Text = FormatCurrency(Convert.ToSingle(txtR3Currency.Text) + Convert.ToSingle(txtR3Coins.Text) + Convert.ToSingle(txtR3MChecks.Text), 2)
        'txtTotalsTotal.Text = FormatCurrency(Convert.ToDouble(txtR1Total.Text) + Convert.ToDouble(txtR2Total.Text) + Convert.ToDouble(txtR3Total.Text), 2)
        txtCurrencyTotal.Text = FormatCurrency(Convert.ToSingle(txtR1Currency.Text) + Convert.ToSingle(txtR2Currency.Text) + Convert.ToSingle(txtR3Currency.Text), 2)
        txtCoinTotal.Text = FormatCurrency(Convert.ToSingle(txtR1Coins.Text) + Convert.ToSingle(txtR2Coins.Text) + Convert.ToSingle(txtR3Coins.Text), 2)
        txtMCheckTotal.Text = FormatCurrency(Convert.ToSingle(txtR1MChecks.Text) + Convert.ToSingle(txtR2MChecks.Text) + Convert.ToSingle(txtR3MChecks.Text), 2)
        txtECheckTotal.Text = FormatCurrency(Convert.ToSingle(txtR1ECheck.Text) + Convert.ToSingle(txtR2ECheck.Text) + Convert.ToSingle(txtR3ECheck.Text), 2)
        txtR1VMTotal.Text = FormatCurrency(Convert.ToSingle(txtR1Visa.Text) + Convert.ToSingle(txtR1MC.Text), 2)
        txtR2VMTotal.Text = FormatCurrency(Convert.ToSingle(txtR2Visa.Text) + Convert.ToSingle(txtR2MC.Text), 2)
        txtR3VMTotal.Text = FormatCurrency(Convert.ToSingle(txtR3Visa.Text) + Convert.ToSingle(txtR3MC.Text), 2)
        txtDiscoverTotal.Text = FormatCurrency(Convert.ToSingle(txtR1Discover.Text) + Convert.ToSingle(txtR2Discover.Text) + Convert.ToSingle(txtR3Discover.Text), 2)
    End Sub

    Private Sub txtR1ECheck_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1ECheck.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR2ECheck_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1ECheck.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR3ECheck_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1ECheck.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR1Visa_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1Visa.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR2Visa_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1Visa.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR3Visa_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1Visa.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR1MC_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1MC.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR2MC_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1MC.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR3MC_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1MC.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR1Discover_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1Discover.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR2Discover_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1Discover.TextChanged
        updateTotals()
    End Sub

    Private Sub txtR3Discover_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtR1Discover.TextChanged
        updateTotals()
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        updateTotals()
    End Sub
End Class
