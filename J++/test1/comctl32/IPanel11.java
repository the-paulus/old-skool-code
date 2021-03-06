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

// Dual interface IPanel11
/** @com.interface(iid=2C787A52-E01C-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface IPanel11 extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="_ObjectDefault", name2="get_ObjectDefault", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public String get_ObjectDefault();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="_ObjectDefault", name2="put_ObjectDefault", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText)
      @hidden */
  public void set_ObjectDefault(String pbstrText);

  /** @com.method(vtoffset=6, dispid=1, type=PROPGET, name="Alignment", name2="getAlignment", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getAlignment();

  /** @com.method(vtoffset=7, dispid=1, type=PROPPUT, name="Alignment", name2="putAlignment", addFlagsVtable=4)
      @com.parameters([in,type=I4] psAlignment) */
  public void setAlignment(int psAlignment);

  /** @com.method(vtoffset=8, dispid=2, type=PROPGET, name="AutoSize", name2="getAutoSize", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getAutoSize();

  /** @com.method(vtoffset=9, dispid=2, type=PROPPUT, name="AutoSize", name2="putAutoSize", addFlagsVtable=4)
      @com.parameters([in,type=I4] psAutoSize) */
  public void setAutoSize(int psAutoSize);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="Bevel", name2="getBevel", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getBevel();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUT, name="Bevel", name2="putBevel", addFlagsVtable=4)
      @com.parameters([in,type=I4] psBevel) */
  public void setBevel(int psBevel);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="Index", name2="getIndex", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getIndex();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUT, name="Index", name2="putIndex", addFlagsVtable=4)
      @com.parameters([in,type=I2] sIndex) */
  public void setIndex(short sIndex);

  /** @com.method(vtoffset=16, dispid=6, type=PROPGET, name="Key", name2="getKey", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getKey();

  /** @com.method(vtoffset=17, dispid=6, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrKey) */
  public void setKey(String pbstrKey);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="Left", name2="getLeft", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getLeft();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="Left", name2="putLeft", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfLeft) */
  public void setLeft(float pfLeft);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="MinWidth", name2="getMinWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getMinWidth();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="MinWidth", name2="putMinWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfMinWidth) */
  public void setMinWidth(float pfMinWidth);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="Picture", name2="getPicture", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getPicture();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUTREF, name="Picture", name2="putPicture", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppPicture) */
  public void setPicture(com.ms.wfc.ax.IPictureDisp ppPicture);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="Style", name2="getStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getStyle();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUT, name="Style", name2="putStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psStyle) */
  public void setStyle(int psStyle);

  /** @com.method(vtoffset=26, dispid=14, type=PROPGET, name="Tag", name2="getTag", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getTag();

  /** @com.method(vtoffset=27, dispid=14, type=PROPPUT, name="Tag", name2="putTag", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvTag) */
  public void setTag(Variant pvTag);

  /** @com.method(vtoffset=28, dispid=11, type=PROPGET, name="Text", name2="getText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getText();

  /** @com.method(vtoffset=29, dispid=11, type=PROPPUT, name="Text", name2="putText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText) */
  public void setText(String pbstrText);

  /** @com.method(vtoffset=30, dispid=15, type=PROPGET, name="ToolTipText", name2="getToolTipText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getToolTipText();

  /** @com.method(vtoffset=31, dispid=15, type=PROPPUT, name="ToolTipText", name2="putToolTipText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrToolTipText) */
  public void setToolTipText(String pbstrToolTipText);

  /** @com.method(vtoffset=32, dispid=12, type=PROPGET, name="Visible", name2="getVisible", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getVisible();

  /** @com.method(vtoffset=33, dispid=12, type=PROPPUT, name="Visible", name2="putVisible", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbVisible) */
  public void setVisible(boolean pbVisible);

  /** @com.method(vtoffset=34, dispid=13, type=PROPGET, name="Width", name2="getWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getWidth();

  /** @com.method(vtoffset=35, dispid=13, type=PROPPUT, name="Width", name2="putWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfWidth) */
  public void setWidth(float pfWidth);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x2c787a52, (short)0xe01c, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
