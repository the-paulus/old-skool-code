//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\PROGRAM FILES\MICROSOFT VISUAL STUDIO\VJ98\jactivex.exe" /wfc /t "C:\PROGRAM FILES\MICROSOFT VISUAL STUDIO\VJ98\wfc.jnf" /w /xi /X:rkc /l "C:\WINDOWS\TEMP\jvcB182.TMP" /nologo /d "M:\Jpp\test1" "C:\WINDOWS\SYSTEM\MSWINSCK.OCX")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package mswinsck.Winsock;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

// Dispatch-only interface WinsockEventMulticaster
class WinsockEventMulticaster implements mswinsck.DMSWinsockControlEvents, com.ms.com.NoAutoScripting, com.ms.com.NoAutoMarshaling
{
  mswinsck.Winsock.Winsock _jcom_parent;

  WinsockEventMulticaster( mswinsck.Winsock.Winsock _jcom_parent )
  {
     this._jcom_parent = _jcom_parent;
  }

  public void Error(short Number, String[] Description, int Scode, String Source, String HelpFile, int HelpContext, boolean[] CancelDisplay)
  {
     if( _jcom_parent.onError != null) {
        _jcom_parent.onError.invoke( _jcom_parent, new mswinsck.Winsock.ErrorEvent( Number, Description, Scode, Source, HelpFile, HelpContext, CancelDisplay ) );
     }
  }


  public void DataArrival(int bytesTotal)
  {
     if( _jcom_parent.onDataArrival != null) {
        _jcom_parent.onDataArrival.invoke( _jcom_parent, new mswinsck.Winsock.DataArrivalEvent( bytesTotal ) );
     }
  }


  public void Connect()
  {
     if( _jcom_parent.onConnect != null) {
        _jcom_parent.onConnect.invoke( _jcom_parent, com.ms.wfc.core.Event.EMPTY );
     }
  }


  public void ConnectionRequest(int requestID)
  {
     if( _jcom_parent.onConnectionRequest != null) {
        _jcom_parent.onConnectionRequest.invoke( _jcom_parent, new mswinsck.Winsock.ConnectionRequestEvent( requestID ) );
     }
  }


  public void Close()
  {
     if( _jcom_parent.onClose != null) {
        _jcom_parent.onClose.invoke( _jcom_parent, com.ms.wfc.core.Event.EMPTY );
     }
  }


  public void SendProgress(int bytesSent, int bytesRemaining)
  {
     if( _jcom_parent.onSendProgress != null) {
        _jcom_parent.onSendProgress.invoke( _jcom_parent, new mswinsck.Winsock.SendProgressEvent( bytesSent, bytesRemaining ) );
     }
  }


  public void SendComplete()
  {
     if( _jcom_parent.onSendComplete != null) {
        _jcom_parent.onSendComplete.invoke( _jcom_parent, com.ms.wfc.core.Event.EMPTY );
     }
  }


}
