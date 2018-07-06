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

/** @com.class(classid=0713E8C5-850A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=F4D83602-895E-11D0-B0A6-000000000000, thread=AUTO, type=DUAL) */
public class ListItem implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IListItem
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="Default", name2="getDefault", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public native String getDefault();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="Default", name2="putDefault", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText)
      @hidden */
  public native void setDefault(String pbstrText);

  /** @com.method(vtoffset=6, dispid=10, type=PROPGET, name="Text", name2="getText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getText();

  /** @com.method(vtoffset=7, dispid=10, type=PROPPUT, name="Text", name2="putText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText) */
  public native void setText(String pbstrText);

  /** @com.method(vtoffset=8, dispid=1, type=PROPGET, name="Ghosted", name2="getGhosted", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getGhosted();

  /** @com.method(vtoffset=9, dispid=1, type=PROPPUT, name="Ghosted", name2="putGhosted", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public native void setGhosted(boolean pfOn);

  /** @com.method(vtoffset=10, dispid=2, type=PROPGET, name="Height", name2="getHeight", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getHeight();

  /** @com.method(vtoffset=11, dispid=2, type=PROPPUT, name="Height", name2="putHeight", addFlagsVtable=4)
      @com.parameters([in,type=R4] pflHeight) */
  public native void setHeight(float pflHeight);

  /** @com.method(vtoffset=12, dispid=3, type=PROPGET, name="Icon", name2="getIcon", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant getIcon();

  /** @com.method(vtoffset=13, dispid=3, type=PROPPUT, name="Icon", name2="putIcon", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pnIndex) */
  public native void setIcon(Variant pnIndex);

  /** @com.method(vtoffset=14, dispid=4, type=PROPGET, name="Index", name2="getIndex", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getIndex();

  /** @com.method(vtoffset=15, dispid=4, type=PROPPUT, name="Index", name2="putIndex", addFlagsVtable=4)
      @com.parameters([in,type=I4] plIndex) */
  public native void setIndex(int plIndex);

  /** @com.method(vtoffset=16, dispid=5, type=PROPGET, name="Key", name2="getKey", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getKey();

  /** @com.method(vtoffset=17, dispid=5, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrKey) */
  public native void setKey(String pbstrKey);

  /** @com.method(vtoffset=18, dispid=6, type=PROPGET, name="Left", name2="getLeft", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getLeft();

  /** @com.method(vtoffset=19, dispid=6, type=PROPPUT, name="Left", name2="putLeft", addFlagsVtable=4)
      @com.parameters([in,type=R4] pflLeft) */
  public native void setLeft(float pflLeft);

  /** @com.method(vtoffset=20, dispid=7, type=PROPGET, name="Selected", name2="getSelected", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getSelected();

  /** @com.method(vtoffset=21, dispid=7, type=PROPPUT, name="Selected", name2="putSelected", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public native void setSelected(boolean pfOn);

  /** @com.method(vtoffset=22, dispid=8, type=PROPGET, name="SmallIcon", name2="getSmallIcon", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant getSmallIcon();

  /** @com.method(vtoffset=23, dispid=8, type=PROPPUT, name="SmallIcon", name2="putSmallIcon", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pnIndex) */
  public native void setSmallIcon(Variant pnIndex);

  /** @com.method(vtoffset=24, dispid=9, type=PROPGET, name="Tag", name2="getTag", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public native Variant getTag();

  /** @com.method(vtoffset=25, dispid=9, type=PROPPUT, name="Tag", name2="putTag", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvTag) */
  public native void setTag(Variant pvTag);

  /** @com.method(vtoffset=26, dispid=11, type=PROPGET, name="Top", name2="getTop", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getTop();

  /** @com.method(vtoffset=27, dispid=11, type=PROPPUT, name="Top", name2="putTop", addFlagsVtable=4)
      @com.parameters([in,type=R4] pflTop) */
  public native void setTop(float pflTop);

  /** @com.method(vtoffset=28, dispid=12, type=PROPGET, name="Width", name2="getWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getWidth();

  /** @com.method(vtoffset=29, dispid=12, type=PROPPUT, name="Width", name2="putWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pflWidth) */
  public native void setWidth(float pflWidth);

  /** @com.method(vtoffset=30, dispid=13, type=PROPGET, name="SubItems", name2="getSubItems", addFlagsVtable=4)
      @com.parameters([in,type=I2] Index, [type=STRING] return) */
  public native String getSubItems(short Index);

  /** @com.method(vtoffset=31, dispid=13, type=PROPPUT, name="SubItems", name2="putSubItems", addFlagsVtable=4)
      @com.parameters([in,type=I2] Index, [in,type=STRING] pbstrItem) */
  public native void setSubItems(short Index, String pbstrItem);

  /** @com.method(vtoffset=32, dispid=14, type=METHOD, name="CreateDragImage", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp CreateDragImage();

  /** @com.method(vtoffset=33, dispid=15, type=METHOD, name="EnsureVisible", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean EnsureVisible();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xf4d83602, (short)0x895e, (short)0x11d0, (byte)0xb0, (byte)0xa6, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x713e8c5, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
