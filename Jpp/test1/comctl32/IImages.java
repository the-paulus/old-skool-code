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

// Dual interface IImages
/** @com.interface(iid=8556BCD0-E01E-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface IImages extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getCount();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="Count", name2="putCount", addFlagsVtable=4)
      @com.parameters([in,type=I2] psCount) */
  public void setCount(short psCount);

  /** @com.method(vtoffset=6, dispid=0, type=PROPGET, name="ControlDefault", name2="getControlDefault", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [iid=8556BCD2-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return)
      @hidden */
  public comctl32.IImage getControlDefault(Variant Index);

  /** @com.method(vtoffset=7, dispid=0, type=PROPPUTREF, name="ControlDefault", name2="putControlDefault", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,iid=8556BCD2-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppListImage)
      @hidden */
  public void setControlDefault(Variant Index, comctl32.IImage ppListImage);

  /** @com.method(vtoffset=8, dispid=2, type=METHOD, name="Add", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] Picture, [iid=8556BCD2-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IImage Add(Variant Index, Variant Key, Variant Picture);

  /** @com.method(vtoffset=9, dispid=3, type=METHOD, name="Clear", addFlagsVtable=4)
      @com.parameters() */
  public void Clear();

  /** @com.method(vtoffset=10, dispid=4, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [iid=8556BCD2-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IImage getItem(Variant Index);

  /** @com.method(vtoffset=11, dispid=4, type=PROPPUTREF, name="Item", name2="putItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,iid=8556BCD2-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] Item) */
  public void setItem(Variant Index, comctl32.IImage Item);

  /** @com.method(vtoffset=12, dispid=5, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index) */
  public void Remove(Variant Index);

  /** @com.method(vtoffset=13, dispid=4294967292, type=METHOD, name="_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return)
      @hidden */
  public Object _NewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x8556bcd0, (short)0xe01e, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
