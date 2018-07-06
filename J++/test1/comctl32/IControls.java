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

package comctl32;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

// Dual interface IControls
/** @com.interface(iid=EC0AB1C0-6CAB-11CF-8998-00AA00688B10, thread=AUTO, type=DUAL) */
public interface IControls extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getCount();

  /** @com.method(vtoffset=5, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,type=I4] Index, [iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public Object getItem(int Index);

  /** @com.method(vtoffset=6, dispid=4294967292, type=METHOD, name="_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return)
      @hidden */
  public IUnknown _NewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xec0ab1c0, (short)0x6cab, (short)0x11cf, (byte)0x89, (byte)0x98, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0x68, (byte)0x8b, (byte)0x10);
}
