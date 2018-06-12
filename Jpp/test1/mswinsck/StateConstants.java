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

// Enum: StateConstants

public class StateConstants extends com.ms.wfc.core.Enum
{
  public static final short sckClosed = 0;
  public static final short sckOpen = 1;
  public static final short sckListening = 2;
  public static final short sckConnectionPending = 3;
  public static final short sckResolvingHost = 4;
  public static final short sckHostResolved = 5;
  public static final short sckConnecting = 6;
  public static final short sckConnected = 7;
  public static final short sckClosing = 8;
  public static final short sckError = 9;
}
