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

/** @com.class(classid=9ED94440-E5E8-101B-B9B5-444553540000,DynamicCasts) 
    @com.interface(iid=E6E17E8A-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public class TabStripRaw implements IUnknown,com.ms.com.NoAutoScripting,comctl32.ITabStrip
{
  /** @com.method(vtoffset=4, dispid=4, type=PROPGET, name="Tabs", name2="getTabs", addFlagsVtable=4)
      @com.parameters([iid=7791BA50-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.ITabs getTabs();

  /** @com.method(vtoffset=5, dispid=4, type=PROPPUTREF, name="Tabs", name2="putTabs", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA50-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppTabs) */
  public native void setTabs(comctl32.ITabs ppTabs);

  /** @com.method(vtoffset=6, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getEnabled();

  /** @com.method(vtoffset=7, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public native void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=8, dispid=4294966784, type=PROPGET, name="Font", name2="getFont", addFlagsVtable=4)
      @com.parameters([iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IFontDisp getFont();

  /** @com.method(vtoffset=9, dispid=4294966784, type=PROPPUTREF, name="Font", name2="putFont", addFlagsVtable=4)
      @com.parameters([in,iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] ppFontDisp) */
  public native void setFont(com.ms.wfc.ax.IFontDisp ppFontDisp);

  /** @com.method(vtoffset=10, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getHWnd();

  /** @com.method(vtoffset=11, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public native void setHWnd(int phWnd);

  /** @com.method(vtoffset=12, dispid=5, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=13, dispid=5, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=15, dispid=1, type=PROPGET, name="MultiRow", name2="getMultiRow", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getMultiRow();

  /** @com.method(vtoffset=16, dispid=1, type=PROPPUT, name="MultiRow", name2="putMultiRow", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbMultiRow) */
  public native void setMultiRow(boolean pbMultiRow);

  /** @com.method(vtoffset=17, dispid=6, type=PROPGET, name="Style", name2="getStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getStyle();

  /** @com.method(vtoffset=18, dispid=6, type=PROPPUT, name="Style", name2="putStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psStyle) */
  public native void setStyle(int psStyle);

  /** @com.method(vtoffset=19, dispid=7, type=PROPGET, name="TabFixedWidth", name2="getTabFixedWidth", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getTabFixedWidth();

  /** @com.method(vtoffset=20, dispid=7, type=PROPPUT, name="TabFixedWidth", name2="putTabFixedWidth", addFlagsVtable=4)
      @com.parameters([in,type=I2] psTabFixedWidth) */
  public native void setTabFixedWidth(short psTabFixedWidth);

  /** @com.method(vtoffset=21, dispid=8, type=PROPGET, name="TabWidthStyle", name2="getTabWidthStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getTabWidthStyle();

  /** @com.method(vtoffset=22, dispid=8, type=PROPPUT, name="TabWidthStyle", name2="putTabWidthStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psTabWidthStyle) */
  public native void setTabWidthStyle(int psTabWidthStyle);

  /** @com.method(vtoffset=23, dispid=9, type=PROPGET, name="ClientTop", name2="getClientTop", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getClientTop();

  /** @com.method(vtoffset=24, dispid=9, type=PROPPUT, name="ClientTop", name2="putClientTop", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfClientTop) */
  public native void setClientTop(float pfClientTop);

  /** @com.method(vtoffset=25, dispid=10, type=PROPGET, name="ClientLeft", name2="getClientLeft", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getClientLeft();

  /** @com.method(vtoffset=26, dispid=10, type=PROPPUT, name="ClientLeft", name2="putClientLeft", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfClientLeft) */
  public native void setClientLeft(float pfClientLeft);

  /** @com.method(vtoffset=27, dispid=11, type=PROPGET, name="ClientHeight", name2="getClientHeight", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getClientHeight();

  /** @com.method(vtoffset=28, dispid=11, type=PROPPUT, name="ClientHeight", name2="putClientHeight", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfClientHeight) */
  public native void setClientHeight(float pfClientHeight);

  /** @com.method(vtoffset=29, dispid=12, type=PROPGET, name="ClientWidth", name2="getClientWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getClientWidth();

  /** @com.method(vtoffset=30, dispid=12, type=PROPPUT, name="ClientWidth", name2="putClientWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfClientWidth) */
  public native void setClientWidth(float pfClientWidth);

  /** @com.method(vtoffset=31, dispid=2, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getMousePointer();

  /** @com.method(vtoffset=32, dispid=2, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] psMousePointer) */
  public native void setMousePointer(int psMousePointer);

  /** @com.method(vtoffset=33, dispid=13, type=PROPGET, name="ImageList", name2="getImageList", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public native Object getImageList();

  /** @com.method(vtoffset=34, dispid=13, type=PROPPUT, name="ImageList", name2="putImageList", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppImageList) */
  public native void setImageList(Object ppImageList);

  // setImageList UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setImageList(Object ppImageList);

  /** @com.method(vtoffset=36, dispid=14, type=PROPGET, name="TabFixedHeight", name2="getTabFixedHeight", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getTabFixedHeight();

  /** @com.method(vtoffset=37, dispid=14, type=PROPPUT, name="TabFixedHeight", name2="putTabFixedHeight", addFlagsVtable=4)
      @com.parameters([in,type=I2] psTabFixedHeight) */
  public native void setTabFixedHeight(short psTabFixedHeight);

  /** @com.method(vtoffset=38, dispid=3, type=PROPGET, name="ShowTips", name2="getShowTips", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getShowTips();

  /** @com.method(vtoffset=39, dispid=3, type=PROPPUT, name="ShowTips", name2="putShowTips", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbShowTips) */
  public native void setShowTips(boolean pbShowTips);

  /** @com.method(vtoffset=40, dispid=15, type=PROPGET, name="SelectedItem", name2="getSelectedItem", addFlagsVtable=4)
      @com.parameters([iid=7791BA52-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.ITab getSelectedItem();

  /** @com.method(vtoffset=41, dispid=15, type=PROPPUTREF, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA52-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppSelectedItem) */
  public native void setSelectedItem(comctl32.ITab ppSelectedItem);

  /** @com.method(vtoffset=42, dispid=15, type=PROPPUT, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] ppSelectedItem) */
  public native void setSelectedItem(Variant ppSelectedItem);

  /** @com.method(vtoffset=43, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getOLEDropMode();

  /** @com.method(vtoffset=44, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public native void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=45, dispid=4294966746, type=METHOD, name="Refresh", addFlagsVtable=4)
      @com.parameters() */
  public native void Refresh();

  /** @com.method(vtoffset=46, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public native void OLEDrag();

  /** @com.method(vtoffset=47, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public native void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e8a, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x9ed94440, (short)0xe5e8, (short)0x101b, (byte)0xb9, (byte)0xb5, (byte)0x44, (byte)0x45, (byte)0x53, (byte)0x54, (byte)0x0, (byte)0x0);
}
