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

/** @com.class(classid=0713E89F-850A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=6E1B5150-DB62-11D0-A0D8-0080C7E7B78D, thread=AUTO, type=DUAL) */
public class Panel implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IPanel
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="_ObjectDefault", name2="get_ObjectDefault", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public native String get_ObjectDefault();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="_ObjectDefault", name2="put_ObjectDefault", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText)
      @hidden */
  public native void set_ObjectDefault(String pbstrText);

  /** @com.method(vtoffset=6, dispid=1, type=PROPGET, name="Alignment", name2="getAlignment", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getAlignment();

  /** @com.method(vtoffset=7, dispid=1, type=PROPPUT, name="Alignment", name2="putAlignment", addFlagsVtable=4)
      @com.parameters([in,type=I4] psAlignment) */
  public native void setAlignment(int psAlignment);

  /** @com.method(vtoffset=8, dispid=2, type=PROPGET, name="AutoSize", name2="getAutoSize", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getAutoSize();

  /** @com.method(vtoffset=9, dispid=2, type=PROPPUT, name="AutoSize", name2="putAutoSize", addFlagsVtable=4)
      @com.parameters([in,type=I4] psAutoSize) */
  public native void setAutoSize(int psAutoSize);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="Bevel", name2="getBevel", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getBevel();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUT, name="Bevel", name2="putBevel", addFlagsVtable=4)
      @com.parameters([in,type=I4] psBevel) */
  public native void setBevel(int psBevel);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getEnabled();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public native void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="Index", name2="getIndex", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getIndex();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUT, name="Index", name2="putIndex", addFlagsVtable=4)
      @com.parameters([in,type=I2] sIndex) */
  public native void setIndex(short sIndex);

  /** @com.method(vtoffset=16, dispid=6, type=PROPGET, name="Key", name2="getKey", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getKey();

  /** @com.method(vtoffset=17, dispid=6, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrKey) */
  public native void setKey(String pbstrKey);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="Left", name2="getLeft", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getLeft();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="Left", name2="putLeft", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfLeft) */
  public native void setLeft(float pfLeft);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="MinWidth", name2="getMinWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getMinWidth();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="MinWidth", name2="putMinWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfMinWidth) */
  public native void setMinWidth(float pfMinWidth);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="Picture", name2="getPicture", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp getPicture();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUTREF, name="Picture", name2="putPicture", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppPicture) */
  public native void setPicture(com.ms.wfc.ax.IPictureDisp ppPicture);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="Style", name2="getStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getStyle();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUT, name="Style", name2="putStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psStyle) */
  public native void setStyle(int psStyle);

  /** @com.method(vtoffset=26, dispid=14, type=PROPGET, name="Tag", name2="getTag", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant getTag();

  /** @com.method(vtoffset=27, dispid=14, type=PROPPUT, name="Tag", name2="putTag", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvTag) */
  public native void setTag(Variant pvTag);

  /** @com.method(vtoffset=28, dispid=11, type=PROPGET, name="Text", name2="getText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getText();

  /** @com.method(vtoffset=29, dispid=11, type=PROPPUT, name="Text", name2="putText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText) */
  public native void setText(String pbstrText);

  /** @com.method(vtoffset=30, dispid=15, type=PROPGET, name="ToolTipText", name2="getToolTipText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getToolTipText();

  /** @com.method(vtoffset=31, dispid=15, type=PROPPUT, name="ToolTipText", name2="putToolTipText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrToolTipText) */
  public native void setToolTipText(String pbstrToolTipText);

  /** @com.method(vtoffset=32, dispid=12, type=PROPGET, name="Visible", name2="getVisible", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getVisible();

  /** @com.method(vtoffset=33, dispid=12, type=PROPPUT, name="Visible", name2="putVisible", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbVisible) */
  public native void setVisible(boolean pbVisible);

  /** @com.method(vtoffset=34, dispid=13, type=PROPGET, name="Width", name2="getWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getWidth();

  /** @com.method(vtoffset=35, dispid=13, type=PROPPUT, name="Width", name2="putWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfWidth) */
  public native void setWidth(float pfWidth);

  // setPicture UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setPicture(com.ms.wfc.ax.IPictureDisp ppPicture);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x6e1b5150, (short)0xdb62, (short)0x11d0, (byte)0xa0, (byte)0xd8, (byte)0x0, (byte)0x80, (byte)0xc7, (byte)0xe7, (byte)0xb7, (byte)0x8d);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x713e89f, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
