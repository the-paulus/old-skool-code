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

// Dispatch-only interface IImageList10
/** @com.interface(iid=58DA8D90-9D6A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IImageList10 extends IUnknown
{

  /** @com.method(dispid=1, name="ImageHeight", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getImageHeight();


  /** @com.method(dispid=1, name="ImageHeight", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setImageHeight(short newValue);


  /** @com.method(dispid=2, name="ImageWidth", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getImageWidth();


  /** @com.method(dispid=2, name="ImageWidth", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setImageWidth(short newValue);


  /** @com.method(dispid=3, name="MaskColor", type=PROPGET)
      @com.parameters([type=U4] return) */
  public int getMaskColor();


  /** @com.method(dispid=3, name="MaskColor", type=PROPPUT)
      @com.parameters([in,type=U4] newValue) */
  public void setMaskColor(int newValue);


  /** @com.method(dispid=4, name="ListImages", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.ListImages getListImages();


  /** @com.method(dispid=4, name="ListImages", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setListImages(comctl32.ListImages newValue);


  /** @com.method(dispid=5, name="hImageList", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getHImageList();


  /** @com.method(dispid=5, name="hImageList", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setHImageList(int newValue);


  /** @com.method(dispid=4294966795, name="BackColor", type=PROPGET)
      @com.parameters([type=U4] return) */
  public int getBackColor();


  /** @com.method(dispid=4294966795, name="BackColor", type=PROPPUT)
      @com.parameters([in,type=U4] newValue) */
  public void setBackColor(int newValue);

  /** @com.method(dispid=6, type=METHOD, name="Overlay", returntype=VOID)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key1, [in,elementType=VARIANT,type=PTR] Key2, [type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp Overlay(Variant Key1, Variant Key2);

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x58da8d90, (short)0x9d6a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
