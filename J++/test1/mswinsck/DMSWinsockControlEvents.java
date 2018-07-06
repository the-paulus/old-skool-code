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

package mswinsck;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

// Dispatch-only interface DMSWinsockControlEvents
/** @com.interface(iid=248DD893-BB45-11CF-9ABC-0080C7E7B78D, thread=AUTO, type=DISPATCH) */
public interface DMSWinsockControlEvents extends IUnknown
{
  /** @com.method(dispid=6, type=METHOD, name="Error", returntype=VOID)
      @com.parameters([in,type=I2] Number, [in,elementType=STRING,type=ARRAY] Description, [in,type=I4] Scode, [in,type=STRING] Source, [in,type=STRING] HelpFile, [in,type=I4] HelpContext, [in,elementType=BOOLEAN,type=ARRAY] CancelDisplay) */
  public void Error(short Number, String[] Description, int Scode, String Source, String HelpFile, int HelpContext, boolean[] CancelDisplay);

  /** @com.method(dispid=0, type=METHOD, name="DataArrival", returntype=VOID)
      @com.parameters([in,type=I4] bytesTotal) */
  public void DataArrival(int bytesTotal);

  /** @com.method(dispid=1, type=METHOD, name="Connect", returntype=VOID)
      @com.parameters() */
  public void Connect();

  /** @com.method(dispid=2, type=METHOD, name="ConnectionRequest", returntype=VOID)
      @com.parameters([in,type=I4] requestID) */
  public void ConnectionRequest(int requestID);

  /** @com.method(dispid=5, type=METHOD, name="Close", returntype=VOID)
      @com.parameters() */
  public void Close();

  /** @com.method(dispid=3, type=METHOD, name="SendProgress", returntype=VOID)
      @com.parameters([in,type=I4] bytesSent, [in,type=I4] bytesRemaining) */
  public void SendProgress(int bytesSent, int bytesRemaining);

  /** @com.method(dispid=4, type=METHOD, name="SendComplete", returntype=VOID)
      @com.parameters() */
  public void SendComplete();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x248dd893, (short)0xbb45, (short)0x11cf, (byte)0x9a, (byte)0xbc, (byte)0x0, (byte)0x80, (byte)0xc7, (byte)0xe7, (byte)0xb7, (byte)0x8d);
}
