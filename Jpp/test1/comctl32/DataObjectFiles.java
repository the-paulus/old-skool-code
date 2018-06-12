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

/** @com.class(classid=2334D2B4-713E-11CF-8AE5-00AA00C00905,DynamicCasts) 
    @com.interface(iid=2334D2B3-713E-11CF-8AE5-00AA00C00905, thread=AUTO, type=DUAL) */
public class DataObjectFiles implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IVBDataObjectFiles
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,type=I4] lIndex, [type=STRING] return) */
  public native String getItem(int lIndex);

  /** @com.method(vtoffset=5, dispid=1, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getCount();

  /** @com.method(vtoffset=6, dispid=2, type=METHOD, name="Add", addFlagsVtable=4)
      @com.parameters([in,type=STRING] bstrFilename, [in,type=VARIANT] vIndex) */
  public native void Add(String bstrFilename, Variant vIndex);

  /** @com.method(vtoffset=7, dispid=3, type=METHOD, name="Clear", addFlagsVtable=4)
      @com.parameters() */
  public native void Clear();

  /** @com.method(vtoffset=8, dispid=4, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] vIndex) */
  public native void Remove(Variant vIndex);

  /** @com.method(vtoffset=9, dispid=4294967292, type=METHOD, name="_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return)
      @hidden */
  public native IUnknown _NewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2334d2b3, (short)0x713e, (short)0x11cf, (byte)0x8a, (byte)0xe5, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0xc0, (byte)0x9, (byte)0x5);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x2334d2b4, (short)0x713e, (short)0x11cf, (byte)0x8a, (byte)0xe5, (byte)0x0, (byte)0xaa, (byte)0x0, (byte)0xc0, (byte)0x9, (byte)0x5);
}
