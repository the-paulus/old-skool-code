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

public class ErrorEvent extends com.ms.wfc.core.Event
{
  public final short Number;
  public final String[] Description;
  public final int Scode;
  public final String Source;
  public final String HelpFile;
  public final int HelpContext;
  public final boolean[] CancelDisplay;

  public ErrorEvent( short Number, String[] Description, int Scode, String Source, String HelpFile, int HelpContext, boolean[] CancelDisplay )
  {
     this.Number = Number;
     this.Description = Description;
     this.Scode = Scode;
     this.Source = Source;
     this.HelpFile = HelpFile;
     this.HelpContext = HelpContext;
     this.CancelDisplay = CancelDisplay;
  }
}

