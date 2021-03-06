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

// Dual interface IStatusBar
/** @com.interface(iid=E6E17E88-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface IStatusBar extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="SimpleText", name2="getSimpleText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getSimpleText();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="SimpleText", name2="putSimpleText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrSimpleText) */
  public void setSimpleText(String pbstrSimpleText);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="Style", name2="getStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getStyle();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="Style", name2="putStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psStyle) */
  public void setStyle(int psStyle);

  /** @com.method(vtoffset=8, dispid=3, type=PROPGET, name="Panels", name2="getPanels", addFlagsVtable=4)
      @com.parameters([iid=2C787A50-E01C-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IPanels getPanels();

  /** @com.method(vtoffset=9, dispid=3, type=PROPPUTREF, name="Panels", name2="putPanels", addFlagsVtable=4)
      @com.parameters([in,iid=2C787A50-E01C-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppPanels) */
  public void setPanels(comctl32.IPanels ppPanels);

  /** @com.method(vtoffset=10, dispid=4, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMousePointer();

  /** @com.method(vtoffset=11, dispid=4, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] psMousePointer) */
  public void setMousePointer(int psMousePointer);

  /** @com.method(vtoffset=12, dispid=5, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=13, dispid=5, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=15, dispid=7, type=PROPGET, name="ShowTips", name2="getShowTips", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getShowTips();

  /** @com.method(vtoffset=16, dispid=7, type=PROPPUT, name="ShowTips", name2="putShowTips", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] bShowTips) */
  public void setShowTips(boolean bShowTips);

  /** @com.method(vtoffset=17, dispid=6, type=PROPGET, name="PanelProperties", name2="getPanelProperties", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public String getPanelProperties();

  /** @com.method(vtoffset=18, dispid=6, type=PROPPUT, name="PanelProperties", name2="putPanelProperties", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrPanelProperties)
      @hidden */
  public void setPanelProperties(String pbstrPanelProperties);

  /** @com.method(vtoffset=19, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getOLEDropMode();

  /** @com.method(vtoffset=20, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=21, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();

  /** @com.method(vtoffset=22, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=23, dispid=4294966784, type=PROPGET, name="Font", name2="getFont", addFlagsVtable=4)
      @com.parameters([iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IFontDisp getFont();

  /** @com.method(vtoffset=24, dispid=4294966784, type=PROPPUTREF, name="Font", name2="putFont", addFlagsVtable=4)
      @com.parameters([in,iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] ppFont) */
  public void setFont(com.ms.wfc.ax.IFontDisp ppFont);

  /** @com.method(vtoffset=25, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getHWnd();

  /** @com.method(vtoffset=26, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public void setHWnd(int phWnd);

  /** @com.method(vtoffset=27, dispid=4294966746, type=METHOD, name="Refresh", addFlagsVtable=4)
      @com.parameters() */
  public void Refresh();

  /** @com.method(vtoffset=28, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public void OLEDrag();

  /** @com.method(vtoffset=29, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e88, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
