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

// Dispatch-only interface ITabs10
/** @com.interface(iid=0713E791-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface ITabs10 extends IUnknown
{

  /** @com.method(dispid=1, name="Count", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getCount();


  /** @com.method(dispid=1, name="Count", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setCount(short newValue);

  /** @com.method(dispid=0, type=PROPGET, name="ControlDefault", name2="getControlDefault", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [type=DISPATCH] return)
      @hidden */
  public Object getControlDefault(Variant Index);

  /** @com.method(dispid=0, type=PROPPUT, name="ControlDefault", name2="putControlDefault", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,type=DISPATCH] _jcomparam_1)
      @hidden */
  public void setControlDefault(Variant Index, Object _jcomparam_1);

  /** @com.method(dispid=2, type=PROPGET, name="Item", name2="getItem", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [type=DISPATCH] return) */
  public Object getItem(Variant Index);

  /** @com.method(dispid=2, type=PROPPUT, name="Item", name2="putItem", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,type=DISPATCH] _jcomparam_1) */
  public void setItem(Variant Index, Object _jcomparam_1);

  /** @com.method(dispid=3, type=METHOD, name="Remove", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index) */
  public void Remove(Variant Index);

  /** @com.method(dispid=4, type=METHOD, name="Clear", returntype=VOID)
      @com.parameters() */
  public void Clear();

  /** @com.method(dispid=5, type=METHOD, name="Add", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] Key, [in,elementType=VARIANT,type=PTR] Caption, [in,elementType=VARIANT,type=PTR] Image, [type=DISPATCH] return) */
  public Object Add(Variant Index, Variant Key, Variant Caption, Variant Image);

  /** @com.method(dispid=4294967292, type=METHOD, name="_NewEnum", returntype=VOID)
      @com.parameters([type=DISPATCH] return)
      @hidden */
  public Object _NewEnum();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e791, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
