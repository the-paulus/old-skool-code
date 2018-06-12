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

/** @com.class(classid=2334D2B2-713E-11CF-8AE5-00AA00C00905,DynamicCasts) 
    @com.interface(iid=2334D2B1-713E-11CF-8AE5-00AA00C00905, thread=AUTO, type=DUAL) */
public class DataObject implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IVBDataObject
{
  /** @com.method(vtoffset=4, dispid=1, type=METHOD, name="Clear", addFlagsVtable=4)
      @com.parameters() */
  public native void Clear();

  /** @com.method(vtoffset=5, dispid=2, type=METHOD, name="GetData", addFlagsVtable=4)
      @com.parameters([in,type=I2] sFormat, [type=VARIANT] return) */
  public native Variant GetData(short sFormat);

  /** @com.method(vtoffset=6, dispid=3, type=METHOD, name="GetFormat", addFlagsVtable=4)
      @com.parameters([in,type=I2] sFormat, [type=BOOLEAN] return) */
  public native boolean GetFormat(short sFormat);

  /** @com.method(vtoffset=7, dispid=4, type=METHOD, name="SetData", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] vValue, [in,type=VARIANT] vFormat) */
  public native void SetData(Variant vValue, Variant vFormat);

  /** @com.method(vtoffset=8, dispid=5, type=PROPGET, name="Files", name2="getFiles", addFlagsVtable=4)
      @com.parameters([iid=2334D2B3-713E-11CF-8AE5-00AA00C00905,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IVBDataObjectFiles getFiles();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2334d2b1, (short)0x713e, (short)0x11cf, (byte)0x8a, (byte)0xe5, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0xc0, (byte)0x9, (byte)0x5);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x2334d2b2, (short)0x713e, (short)0x11cf, (byte)0x8a, (byte)0xe5, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0xc0, (byte)0x9, (byte)0x5);
}
