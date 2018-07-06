Imports System.Management
Imports System.IO
Imports System
Public Class MPCBackupUtilLib
    Public Shared Function GetAvalibleDrives() As Collection
        Dim diskclass As New System.Management.ManagementClass("Win32_LogicalDisk")
        Dim disks As System.Management.ManagementObjectCollection
        Dim disk As System.Management.ManagementObject
        Dim disksenum As System.Management.ManagementObjectCollection.ManagementObjectEnumerator
        Dim disk_array As Collection

        diskenum = New System.Management.ManagementObjectCollection.ManagementObjectEnumerator
        'disksenum = disks.GetEnumerator()

        While disks.GetEnumerator().MoveNext 'disksenum.MoveNext
            disk = disksenum.Current
            disk_array.Add(disk.Properties("Name"))
            Console.WriteLine("{0}", disk.Properties("Name"))
        End While
        Return disk_array
    End Function
End Class
