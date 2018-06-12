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

// Dual interface ITab
/** @com.interface(iid=7791BA52-E020-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface ITab extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="_ObjectDefault", name2="get_ObjectDefault", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public String get_ObjectDefault();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="_ObjectDefault", name2="put_ObjectDefault", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrCaption)
      @hidden */
  public void set_ObjectDefault(String pbstrCaption);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="Caption", name2="getCaption", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getCaption();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="Caption", name2="putCaption", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrCaption) */
  public void setCaption(String pbstrCaption);

  /** @com.method(vtoffset=8, dispid=1, type=PROPGET, name="Tag", name2="getTag", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getTag();

  /** @com.method(vtoffset=9, dispid=1, type=PROPPUT, name="Tag", name2="putTag", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvTag) */
  public void setTag(Variant pvTag);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="Index", name2="getIndex", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getIndex();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUT, name="Index", name2="putIndex", addFlagsVtable=4)
      @com.parameters([in,type=I2] psIndex) */
  public void setIndex(short psIndex);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="Key", name2="getKey", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getKey();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrKey) */
  public void setKey(String pbstrKey);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="ToolTipText", name2="getToolTipText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getToolTipText();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUT, name="ToolTipText", name2="putToolTipText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrToolTipText) */
  public void setToolTipText(String pbstrToolTipText);

  /** @com.method(vtoffset=16, dispid=6, type=PROPGET, name="Width", name2="getWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getWidth();

  /** @com.method(vtoffset=17, dispid=6, type=PROPPUT, name="Width", name2="putWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfWidth) */
  public void setWidth(float pfWidth);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="Height", name2="getHeight", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getHeight();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="Height", name2="putHeight", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfHeight) */
  public void setHeight(float pfHeight);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="Top", name2="getTop", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getTop();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="Top", name2="putTop", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfTop) */
  public void setTop(float pfTop);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="Left", name2="getLeft", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getLeft();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUT, name="Left", name2="putLeft", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfLeft) */
  public void setLeft(float pfLeft);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="Selected", name2="getSelected", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSelected();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUT, name="Selected", name2="putSelected", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbSelected) */
  public void setSelected(boolean pbSelected);

  /** @com.method(vtoffset=26, dispid=11, type=PROPGET, name="Image", name2="getImage", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getImage();

  /** @com.method(vtoffset=27, dispid=11, type=PROPPUT, name="Image", name2="putImage", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvImage) */
  public void setImage(Variant pvImage);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x7791ba52, (short)0xe020, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
