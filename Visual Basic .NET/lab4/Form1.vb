' VB.NET DBAS Lab 4
' Functions and Subroutines and Passing Parameters Lab
' Created by Jacob Thornberry

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
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents Button3 As System.Windows.Forms.Button
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents TextBox1 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox2 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox3 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox4 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox5 As System.Windows.Forms.TextBox
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label
        Me.Button1 = New System.Windows.Forms.Button
        Me.Button2 = New System.Windows.Forms.Button
        Me.Button3 = New System.Windows.Forms.Button
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.Label5 = New System.Windows.Forms.Label
        Me.TextBox1 = New System.Windows.Forms.TextBox
        Me.TextBox2 = New System.Windows.Forms.TextBox
        Me.TextBox3 = New System.Windows.Forms.TextBox
        Me.TextBox4 = New System.Windows.Forms.TextBox
        Me.TextBox5 = New System.Windows.Forms.TextBox
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(112, 8)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(416, 23)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Functions and Subroutines and Passing Parameters"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(16, 48)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(232, 23)
        Me.Button1.TabIndex = 1
        Me.Button1.Text = "Convert Celsius to Fahrenheit (Subroutine)"
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(16, 96)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(232, 23)
        Me.Button2.TabIndex = 2
        Me.Button2.Text = "Convert Celsius to Fahrenheit (Function)"
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(16, 144)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(232, 23)
        Me.Button3.TabIndex = 3
        Me.Button3.Text = "Ask Moe"
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(288, 48)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(144, 23)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "Temperature in Celsius"
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(288, 72)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(144, 23)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "Temperature in Fahrenheit"
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(288, 96)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(144, 23)
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "Temperature in Celsius"
        '
        'Label5
        '
        Me.Label5.Location = New System.Drawing.Point(288, 120)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(144, 23)
        Me.Label5.TabIndex = 7
        Me.Label5.Text = "Temperature in Fahrenheit"
        '
        'TextBox1
        '
        Me.TextBox1.Location = New System.Drawing.Point(440, 48)
        Me.TextBox1.Name = "TextBox1"
        Me.TextBox1.Size = New System.Drawing.Size(152, 20)
        Me.TextBox1.TabIndex = 8
        Me.TextBox1.Text = ""
        '
        'TextBox2
        '
        Me.TextBox2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.TextBox2.Location = New System.Drawing.Point(440, 72)
        Me.TextBox2.Name = "TextBox2"
        Me.TextBox2.ReadOnly = True
        Me.TextBox2.Size = New System.Drawing.Size(152, 20)
        Me.TextBox2.TabIndex = 9
        Me.TextBox2.Text = ""
        '
        'TextBox3
        '
        Me.TextBox3.Location = New System.Drawing.Point(440, 96)
        Me.TextBox3.Name = "TextBox3"
        Me.TextBox3.Size = New System.Drawing.Size(152, 20)
        Me.TextBox3.TabIndex = 10
        Me.TextBox3.Text = ""
        '
        'TextBox4
        '
        Me.TextBox4.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.TextBox4.Location = New System.Drawing.Point(440, 120)
        Me.TextBox4.Name = "TextBox4"
        Me.TextBox4.ReadOnly = True
        Me.TextBox4.Size = New System.Drawing.Size(152, 20)
        Me.TextBox4.TabIndex = 11
        Me.TextBox4.Text = ""
        '
        'TextBox5
        '
        Me.TextBox5.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.TextBox5.Location = New System.Drawing.Point(440, 144)
        Me.TextBox5.Name = "TextBox5"
        Me.TextBox5.ReadOnly = True
        Me.TextBox5.Size = New System.Drawing.Size(152, 20)
        Me.TextBox5.TabIndex = 12
        Me.TextBox5.Text = ""
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(600, 221)
        Me.Controls.Add(Me.TextBox5)
        Me.Controls.Add(Me.TextBox4)
        Me.Controls.Add(Me.TextBox3)
        Me.Controls.Add(Me.TextBox2)
        Me.Controls.Add(Me.TextBox1)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label1)
        Me.MaximizeBox = False
        Me.Name = "Form1"
        Me.Text = "Lab 4"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        If TextBox1.Text = "" Then
            MessageBox.Show("Enter a Celsius temperature.")
            Exit Sub
        End If
        Dim Fahrenheit As Double
        Dim Celsius As Double = TextBox1.Text
        convertToFahrenheit(Celsius, Fahrenheit)
        TextBox2.Text = Fahrenheit
    End Sub

    Sub convertToFahrenheit(ByVal Celsius As Double, ByRef Fahrenheit As Double)
        Fahrenheit = Celsius * 9
        Fahrenheit /= 5
        Fahrenheit += 32
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        If TextBox3.Text = "" Then
            MessageBox.Show("Enter a Celsius temperature.")
            Exit Sub
        End If
        Dim Fahrenheit As Double
        Dim celsius As Double = TextBox3.Text
        Fahrenheit = ConvertFahrenheit(celsius)
        TextBox4.Text = Fahrenheit
    End Sub

    Function ConvertFahrenheit(ByVal celsius As Double)
        Dim fahrenheit As Double

        fahrenheit = celsius * 9
        fahrenheit /= 5
        fahrenheit += 32

        Return fahrenheit

    End Function

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        askMoe()
    End Sub

    Sub askMoe()
        Dim secret As Double
        secret = 2
        askLarry(secret)
        TextBox5.Text = secret
    End Sub

    Sub askLarry(ByRef secret As Double)
        secret = 4
        askCurley(secret)
    End Sub

    Sub askCurley(ByVal secret As Double)
        secret = 3.333333
    End Sub

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub
End Class