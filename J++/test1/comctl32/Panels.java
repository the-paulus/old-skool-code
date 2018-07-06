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

/** @com.class(classid=0713E89E-850A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=2C787A50-E01C-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public class Panels implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IPanels
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Count", name2="getCount", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getCount();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="Count", name2="putCount", addFlagsVtable=4)
      @com.parameters([in,type=I2] sCount) */
  public native void setCount(short sCount);

  /** @com.method(vtoffset=6, dispid=0, type=PROPGET, name="ControlDefault", name2="getControlDefault", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [iid=6E1B5150-DB62-11D0-A0D8-0080C7E7B78D,thread=AUTO,type=DISPATCH] return)
      @hidden */
  public native comctl32.IPanel getControlDefault(Variant Index);

  /** @com.method(vtoffset=7, dispid=0, type=PROPPUTREF, name="ControlDefault", name2="putControlDefault", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,iid=6E1B5150-DB62-11D0-A0D8-0080C7E7B78D,thread=AUTO,type=DISPATCH] ppPanel)
      @hidden */
  public native void setControlDefault(Variant Index, comctl32.IPanel ppPanel);

  /** @com.method(vtoffset=8, dispid=2, type=METHOD, name="Add", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] Text, [in,elementType=VARIANT,type=PTR] Style, [in,elementType=VARIANT,type=PTR] Picture, [iid=6E1B5150-DB62-11D0-A0D8-0080C7E7B78D,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IPanel Add(Variant Index, Variant Key, Variant Text, Variant Style, Variant Picture);

  /** @com.method(vtoffset=9, dispid=3, type=METHOD, name="Clear", addFlagsVtable=4)
      @com.parameters() */
  public native void Clear();

  /** @com.method(vtoffset=10, dispid=4, type=PROPGET, name="Item", name2="getItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [iid=6E1B5150-DB62-11D0-A0D8-0080C7E7B78D,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IPanel getItem(Variant Index);

  /** @com.method(vtoffset=11, dispid=4, type=PROPPUTREF, name="Item", name2="putItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,iid=6E1B5150-DB62-11D0-A0D8-0080C7E7B78D,thread=AUTO,type=DISPATCH] ppPanel) */
  public native void setItem(Variant Index, comctl32.IPanel ppPanel);

  /** @com.method(vtoffset=12, dispid=5, type=METHOD, name="Remove", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index) */
  public native void Remove(Variant Index);

  /** @com.method(vtoffset=13, dispid=4294967292, type=METHOD, name="_NewEnum", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return)
      @hidden */
  public native Object _NewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2c787a50, (short)0xe01c, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x713e89e, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
