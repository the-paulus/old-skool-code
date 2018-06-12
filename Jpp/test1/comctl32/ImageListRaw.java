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

/** @com.class(classid=58DA8D8F-9D6A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=E6E17E80-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public class ImageListRaw implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IImageList
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="ImageHeight", name2="getImageHeight", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getImageHeight();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="ImageHeight", name2="putImageHeight", addFlagsVtable=4)
      @com.parameters([in,type=I2] psImageHeight) */
  public native void setImageHeight(short psImageHeight);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="ImageWidth", name2="getImageWidth", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getImageWidth();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="ImageWidth", name2="putImageWidth", addFlagsVtable=4)
      @com.parameters([in,type=I2] psImageWidth) */
  public native void setImageWidth(short psImageWidth);

  /** @com.method(vtoffset=8, dispid=3, type=PROPGET, name="MaskColor", name2="getMaskColor", addFlagsVtable=4)
      @com.parameters([type=U4] return) */
  public native int getMaskColor();

  /** @com.method(vtoffset=9, dispid=3, type=PROPPUT, name="MaskColor", name2="putMaskColor", addFlagsVtable=4)
      @com.parameters([in,type=U4] pclrMaskColor) */
  public native void setMaskColor(int pclrMaskColor);

  /** @com.method(vtoffset=10, dispid=7, type=PROPGET, name="UseMaskColor", name2="getUseMaskColor", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getUseMaskColor();

  /** @com.method(vtoffset=11, dispid=7, type=PROPPUT, name="UseMaskColor", name2="putUseMaskColor", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbState) */
  public native void setUseMaskColor(boolean pbState);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="ListImages", name2="getListImages", addFlagsVtable=4)
      @com.parameters([iid=8556BCD0-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IImages getListImages();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUTREF, name="ListImages", name2="putListImages", addFlagsVtable=4)
      @com.parameters([in,iid=8556BCD0-E01E-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppListImages) */
  public native void setListImages(comctl32.IImages ppListImages);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="hImageList", name2="gethImageList", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getHImageList();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUT, name="hImageList", name2="puthImageList", addFlagsVtable=4)
      @com.parameters([in,type=I4] phImageList) */
  public native void setHImageList(int phImageList);

  /** @com.method(vtoffset=16, dispid=4294966795, type=PROPGET, name="BackColor", name2="getBackColor", addFlagsVtable=4)
      @com.parameters([type=U4] return) */
  public native int getBackColor();

  /** @com.method(vtoffset=17, dispid=4294966795, type=PROPPUT, name="BackColor", name2="putBackColor", addFlagsVtable=4)
      @com.parameters([in,type=U4] pclrBackColor) */
  public native void setBackColor(int pclrBackColor);

  /** @com.method(vtoffset=18, dispid=6, type=METHOD, name="Overlay", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] Key1, [in,elementType=VARIANT,type=PTR] Key2, [iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp Overlay(Variant Key1, Variant Key2);

  /** @com.method(vtoffset=19, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public native void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e80, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x58da8d8f, (short)0x9d6a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
