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

/** @com.class(classid=0713E8C3-850A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=8556BCD2-E01E-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public class ListImage implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IImage
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Index", name2="getIndex", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getIndex();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="Index", name2="putIndex", addFlagsVtable=4)
      @com.parameters([in,type=I2] psIndex) */
  public native void setIndex(short psIndex);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="Key", name2="getKey", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getKey();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrKey) */
  public native void setKey(String pbstrKey);

  /** @com.method(vtoffset=8, dispid=6, type=PROPGET, name="Tag", name2="getTag", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant getTag();

  /** @com.method(vtoffset=9, dispid=6, type=PROPPUT, name="Tag", name2="putTag", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvTag) */
  public native void setTag(Variant pvTag);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="Picture", name2="getPicture", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp getPicture();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUTREF, name="Picture", name2="putPicture", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppPictureDisp) */
  public native void setPicture(com.ms.wfc.ax.IPictureDisp ppPictureDisp);

  /** @com.method(vtoffset=12, dispid=4, type=METHOD, name="Draw", addFlagsVtable=4)
      @com.parameters([in,type=I4] hDC, [in,elementType=VARIANT,type=PTR] x, [in,elementType=VARIANT,type=PTR] y, [in,elementType=VARIANT,type=PTR] Style) */
  public native void Draw(int hDC, Variant x, Variant y, Variant Style);

  /** @com.method(vtoffset=13, dispid=5, type=METHOD, name="ExtractIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp ExtractIcon();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x8556bcd2, (short)0xe01e, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x713e8c3, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
