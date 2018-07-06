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
    Friend WithEvents lblTitle As System.Windows.Forms.Label
    Friend WithEvents lblTempCelSub As System.Windows.Forms.Label
    Friend WithEvents lblTempFahSub As System.Windows.Forms.Label
    Friend WithEvents lblTemCelFun As System.Windows.Forms.Label
    Friend WithEvents lblTempFahFunc As System.Windows.Forms.Label
    Friend WithEvents btnConvertFunc As System.Windows.Forms.Button
    Friend WithEvents btnConvSub As System.Windows.Forms.Button
    Friend WithEvents lblOutSub As System.Windows.Forms.Label
    Friend WithEvents lblFahFun As System.Windows.Forms.Label
    Friend WithEvents txtCelSub As System.Windows.Forms.TextBox
    Friend WithEvents txtTempCelFun As System.Windows.Forms.TextBox
    Friend WithEvents btnAskMoe As System.Windows.Forms.Button
    Friend WithEvents lblAskMoe As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblTitle = New System.Windows.Forms.Label
        Me.lblTempCelSub = New System.Windows.Forms.Label
        Me.lblTempFahSub = New System.Windows.Forms.Label
        Me.lblTemCelFun = New System.Windows.Forms.Label
        Me.lblTempFahFunc = New System.Windows.Forms.Label
        Me.btnConvertFunc = New System.Windows.Forms.Button
        Me.btnConvSub = New System.Windows.Forms.Button
        Me.lblOutSub = New System.Windows.Forms.Label
        Me.lblFahFun = New System.Windows.Forms.Label
        Me.txtCelSub = New System.Windows.Forms.TextBox
        Me.txtTempCelFun = New System.Windows.Forms.TextBox
        Me.btnAskMoe = New System.Windows.Forms.Button
        Me.lblAskMoe = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'lblTitle
        '
        Me.lblTitle.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTitle.Location = New System.Drawing.Point(16, 8)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(448, 48)
        Me.lblTitle.TabIndex = 0
        Me.lblTitle.Text = "Function, Subroutines and Passing Parameters"
        Me.lblTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblTempCelSub
        '
        Me.lblTempCelSub.Location = New System.Drawing.Point(216, 64)
        Me.lblTempCelSub.Name = "lblTempCelSub"
        Me.lblTempCelSub.Size = New System.Drawing.Size(128, 23)
        Me.lblTempCelSub.TabIndex = 1
        Me.lblTempCelSub.Text = "Temperature in Celcius:"
        '
        'lblTempFahSub
        '
        Me.lblTempFahSub.Location = New System.Drawing.Point(216, 96)
        Me.lblTempFahSub.Name = "lblTempFahSub"
        Me.lblTempFahSub.Size = New System.Drawing.Size(136, 23)
        Me.lblTempFahSub.TabIndex = 2
        Me.lblTempFahSub.Text = "Temerature in Fahrenheit:"
        '
        'lblTemCelFun
        '
        Me.lblTemCelFun.Location = New System.Drawing.Point(216, 128)
        Me.lblTemCelFun.Name = "lblTemCelFun"
        Me.lblTemCelFun.Size = New System.Drawing.Size(128, 23)
        Me.lblTemCelFun.TabIndex = 3
        Me.lblTemCelFun.Text = "Temperature in Celcius:"
        '
        'lblTempFahFunc
        '
        Me.lblTempFahFunc.Location = New System.Drawing.Point(216, 160)
        Me.lblTempFahFunc.Name = "lblTempFahFunc"
        Me.lblTempFahFunc.Size = New System.Drawing.Size(136, 23)
        Me.lblTempFahFunc.TabIndex = 4
        Me.lblTempFahFunc.Text = "Temerature in Fahrenheit:"
        '
        'btnConvertFunc
        '
        Me.btnConvertFunc.Location = New System.Drawing.Point(16, 136)
        Me.btnConvertFunc.Name = "btnConvertFunc"
        Me.btnConvertFunc.Size = New System.Drawing.Size(184, 24)
        Me.btnConvertFunc.TabIndex = 5
        Me.btnConvertFunc.Text = "Convert Using a Function"
        '
        'btnConvSub
        '
        Me.btnConvSub.Location = New System.Drawing.Point(16, 72)
        Me.btnConvSub.Name = "btnConvSub"
        Me.btnConvSub.Size = New System.Drawing.Size(184, 23)
        Me.btnConvSub.TabIndex = 6
        Me.btnConvSub.Text = "Convert Using a Subroutine"
        '
        'lblOutSub
        '
        Me.lblOutSub.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblOutSub.Location = New System.Drawing.Point(352, 96)
        Me.lblOutSub.Name = "lblOutSub"
        Me.lblOutSub.Size = New System.Drawing.Size(100, 16)
        Me.lblOutSub.TabIndex = 7
        Me.lblOutSub.Text = "0"
        '
        'lblFahFun
        '
        Me.lblFahFun.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFahFun.Location = New System.Drawing.Point(352, 160)
        Me.lblFahFun.Name = "lblFahFun"
        Me.lblFahFun.Size = New System.Drawing.Size(100, 16)
        Me.lblFahFun.TabIndex = 8
        Me.lblFahFun.Text = "0"
        '
        'txtCelSub
        '
        Me.txtCelSub.Location = New System.Drawing.Point(352, 64)
        Me.txtCelSub.Name = "txtCelSub"
        Me.txtCelSub.TabIndex = 9
        Me.txtCelSub.Text = "0"
        '
        'txtTempCelFun
        '
        Me.txtTempCelFun.Location = New System.Drawing.Point(352, 120)
        Me.txtTempCelFun.Name = "txtTempCelFun"
        Me.txtTempCelFun.TabIndex = 10
        Me.txtTempCelFun.Text = "0"
        '
        'btnAskMoe
        '
        Me.btnAskMoe.Location = New System.Drawing.Point(16, 192)
        Me.btnAskMoe.Name = "btnAskMoe"
        Me.btnAskMoe.Size = New System.Drawing.Size(184, 24)
        Me.btnAskMoe.TabIndex = 11
        Me.btnAskMoe.Text = "Ask Moe"
        '
        'lblAskMoe
        '
        Me.lblAskMoe.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblAskMoe.Location = New System.Drawing.Point(352, 192)
        Me.lblAskMoe.Name = "lblAskMoe"
        Me.lblAskMoe.Size = New System.Drawing.Size(100, 16)
        Me.lblAskMoe.TabIndex = 12
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(480, 266)
        Me.Controls.Add(Me.lblAskMoe)
        Me.Controls.Add(Me.btnAskMoe)
        Me.Controls.Add(Me.txtTempCelFun)
        Me.Controls.Add(Me.txtCelSub)
        Me.Controls.Add(Me.lblFahFun)
        Me.Controls.Add(Me.lblOutSub)
        Me.Controls.Add(Me.btnConvSub)
        Me.Controls.Add(Me.btnConvertFunc)
        Me.Controls.Add(Me.lblTempFahFunc)
        Me.Controls.Add(Me.lblTemCelFun)
        Me.Controls.Add(Me.lblTempFahSub)
        Me.Controls.Add(Me.lblTempCelSub)
        Me.Controls.Add(Me.lblTitle)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub ConvertCelciusSubroutine(ByVal celcius As Double, ByRef fahrenheit As Double)
        fahrenheit = celcius * 9 / 5 + 32
    End Sub

    Private Function ConvertCelciusFunction(ByVal celcius As Double) As Double
        Return celcius * 9 / 5 + 32
    End Function

    Private Sub btnConvSub_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnConvSub.Click
        Dim Celcius As Double
        Dim Fahrenheit As Double

        If IsNumeric(txtCelSub.Text) = False Then
            MsgBox("Hey! I only accept numeric values!", MsgBoxStyle.OKOnly, "Error")
            Exit Sub
        Else
            Celcius = Val(txtCelSub.Text)
            Fahrenheit = Val(lblOutSub.Text)
            ConvertCelciusSubroutine(Celcius, Fahrenheit)
            lblOutSub.Text = Fahrenheit
        End If
    End Sub

    Private Sub AskMoe(ByRef secret_number As Double)
        secret_number = 2
        AskLarry(secret_number)
    End Sub

    Private Sub AskLarry(ByRef secret_number As Double)
        secret_number = 4
        AskCurley(secret_number)
    End Sub

    Private Sub AskCurley(ByVal secret_number As Double)
        secret_number = 3.333333
        MsgBox("The value that would be displayed is four because this subroutine (AskCurley) does not modify the variable directly. It only modifies a copy.")
    End Sub

    Private Sub btnConvertFunc_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnConvertFunc.Click
        Dim celcius As Double
        Dim fahrenheit As Double

        If IsNumeric(txtTempCelFun.Text) = False Then
            MsgBox("Hey! I only accept numeric values!", MsgBoxStyle.OKOnly, "Error")
            Exit Sub
        Else
            celcius = txtTempCelFun.Text
            fahrenheit = ConvertCelciusFunction(celcius)
            lblFahFun.Text = fahrenheit
        End If
    End Sub

    Private Sub btnAskMoe_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAskMoe.Click
        Dim secret_number As Double
        AskMoe(secret_number)
        lblAskMoe.Text = secret_number
    End Sub
End Class
