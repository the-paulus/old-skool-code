//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\PROGRAM FILES\MICROSOFT VISUAL STUDIO\VJ98\jactivex.exe" /wfc /t "C:\PROGRAM FILES\MICROSOFT VISUAL STUDIO\VJ98\wfc.jnf" /w /xi /X:rkc /l "C:\WINDOWS\TEMP\jvcD2D5.TMP" /nologo /d "M:\Jpp\test1" "C:\WINDOWS\SYSTEM\COMCTL32.OCX")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package comctl32.Toolbar;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class OLEDragOverEvent extends com.ms.wfc.core.Event
{
  public final comctl32.DataObject[] Data;
  public final int[] Effect;
  public final short[] Button;
  public final short[] Shift;
  public final float[] x;
  public final float[] y;
  public final short[] State;

  public OLEDragOverEvent( comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y, short[] State )
  {
     this.Data = Data;
     this.Effect = Effect;
     this.Button = Button;
     this.Shift = Shift;
     this.x = x;
     this.y = y;
     this.State = State;
  }
}

