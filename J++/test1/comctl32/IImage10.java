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

// Dispatch-only interface IImage10
/** @com.interface(iid=58DA8D95-9D6A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IImage10 extends IUnknown
{

  /** @com.method(dispid=1, name="Index", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getIndex();


  /** @com.method(dispid=1, name="Index", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setIndex(short newValue);


  /** @com.method(dispid=2, name="Key", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getKey();


  /** @com.method(dispid=2, name="Key", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setKey(String newValue);


  /** @com.method(dispid=3, name="Picture", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getPicture();


  /** @com.method(dispid=3, name="Picture", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setPicture(com.ms.wfc.ax.IPictureDisp newValue);

  /** @com.method(dispid=4, type=METHOD, name="Draw", returntype=VOID)
      @com.parameters([in,type=I4] hDC, [in,elementType=VARIANT,type=PTR] x, [in,elementType=VARIANT,type=PTR] y, [in,elementType=VARIANT,type=PTR] Style) */
  public void Draw(int hDC, Variant x, Variant y, Variant Style);

  /** @com.method(dispid=5, type=METHOD, name="ExtractIcon", returntype=VOID)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp ExtractIcon();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x58da8d95, (short)0x9d6a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
