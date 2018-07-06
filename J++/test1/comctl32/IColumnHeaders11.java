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

// Dual interface IColumnHeaders11
/** @com.interface(iid=BF877894-E026-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface IColumnHeaders11 extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getCount();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="Count", name2="putCount", addFlagsVtable=4)
      @com.parameters([in,type=I4] plCount) */
  public void setCount(int plCount);

  /** @com.method(vtoffset=6, dispid=0, type=PROPGET, name="ControlDefault", name2="getControlDefault", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [iid=BF877896-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return)
      @hidden */
  public comctl32.IColumnHeader11 getControlDefault(Variant Index);

  /** @com.method(vtoffset=7, dispid=2, type=METHOD, name="Add", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] Text, [in,elementType=VARIANT,type=PTR] Width, [in,elementType=VARIANT,type=PTR] Alignment, [iid=BF877896-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IColumnHeader11 Add(Variant Index, Variant Key, Variant Text, Variant Width, Variant Alignment);

  /** @com.method(vtoffset=8, dispid=3, type=METHOD, name="Clear", addFlagsVtable=4)
      @com.parameters() */
  public void Clear();

  /** @com.method(vtoffset=9, dispid=4, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [iid=BF877896-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IColumnHeader11 getItem(Variant Index);

  /** @com.method(vtoffset=10, dispid=5, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index) */
  public void Remove(Variant Index);

  /** @com.method(vtoffset=11, dispid=4294967292, type=METHOD, name="_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00000000-0000-0000-C000-000000000046,thread=AUTO,type=OBJECT] return) */
  public IUnknown _NewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xbf877894, (short)0xe026, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
