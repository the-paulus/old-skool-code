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

// Dispatch-only interface IColumnHeader10
/** @com.interface(iid=0713E8B1-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IColumnHeader10 extends IUnknown
{

  /** @com.method(dispid=1, name="Alignment", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getAlignment();


  /** @com.method(dispid=1, name="Alignment", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setAlignment(int newValue);


  /** @com.method(dispid=2, name="Index", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getIndex();


  /** @com.method(dispid=2, name="Index", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setIndex(short newValue);


  /** @com.method(dispid=3, name="Key", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getKey();


  /** @com.method(dispid=3, name="Key", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setKey(String newValue);


  /** @com.method(dispid=4, name="Left", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getLeft();


  /** @com.method(dispid=4, name="Left", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setLeft(float newValue);


  /** @com.method(dispid=5, name="SubItemIndex", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getSubItemIndex();


  /** @com.method(dispid=5, name="SubItemIndex", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setSubItemIndex(short newValue);


  /** @com.method(dispid=6, name="Tag", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getTag();


  /** @com.method(dispid=6, name="Tag", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setTag(String newValue);


  /** @com.method(dispid=7, name="Text", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getText();


  /** @com.method(dispid=7, name="Text", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setText(String newValue);


  /** @com.method(dispid=8, name="Width", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getWidth();


  /** @com.method(dispid=8, name="Width", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setWidth(float newValue);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e8b1, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
