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

// Dual interface IToolbar
/** @com.interface(iid=E6E17E8C-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface IToolbar extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=4294966776, type=PROPGET, name="Appearance", name2="getAppearance", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getAppearance();

  /** @com.method(vtoffset=5, dispid=4294966776, type=PROPPUT, name="Appearance", name2="putAppearance", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnAppearance) */
  public void setAppearance(int pnAppearance);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="AllowCustomize", name2="getAllowCustomize", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getAllowCustomize();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="AllowCustomize", name2="putAllowCustomize", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbAllowCustomize) */
  public void setAllowCustomize(boolean pbAllowCustomize);

  /** @com.method(vtoffset=8, dispid=3, type=PROPGET, name="Buttons", name2="getButtons", addFlagsVtable=4)
      @com.parameters([iid=7791BA40-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IButtons getButtons();

  /** @com.method(vtoffset=9, dispid=3, type=PROPPUTREF, name="Buttons", name2="putButtons", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA40-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppButtons) */
  public void setButtons(comctl32.IButtons ppButtons);

  /** @com.method(vtoffset=10, dispid=15, type=PROPGET, name="Controls", name2="getControls", addFlagsVtable=4)
      @com.parameters([iid=EC0AB1C0-6CAB-11CF-8998-00AA00688B10,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IControls getControls();

  /** @com.method(vtoffset=11, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();

  /** @com.method(vtoffset=12, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=13, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getHWnd();

  /** @com.method(vtoffset=14, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public void setHWnd(int phWnd);

  /** @com.method(vtoffset=15, dispid=4, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=16, dispid=4, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=18, dispid=1, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMousePointer();

  /** @com.method(vtoffset=19, dispid=1, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] psMousePointer) */
  public void setMousePointer(int psMousePointer);

  /** @com.method(vtoffset=20, dispid=5, type=PROPGET, name="ImageList", name2="getImageList", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public Object getImageList();

  /** @com.method(vtoffset=21, dispid=5, type=PROPPUT, name="ImageList", name2="putImageList", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppImageList) */
  public void setImageList(Object ppImageList);

  // setImageList UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setImageList(Object ppImageList);

  /** @com.method(vtoffset=23, dispid=6, type=PROPGET, name="ShowTips", name2="getShowTips", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getShowTips();

  /** @com.method(vtoffset=24, dispid=6, type=PROPPUT, name="ShowTips", name2="putShowTips", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] bShowTips) */
  public void setShowTips(boolean bShowTips);

  /** @com.method(vtoffset=25, dispid=4294966792, type=PROPGET, name="BorderStyle", name2="getBorderStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getBorderStyle();

  /** @com.method(vtoffset=26, dispid=4294966792, type=PROPPUT, name="BorderStyle", name2="putBorderStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psBorderStyle) */
  public void setBorderStyle(int psBorderStyle);

  /** @com.method(vtoffset=27, dispid=7, type=PROPGET, name="Wrappable", name2="getWrappable", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getWrappable();

  /** @com.method(vtoffset=28, dispid=7, type=PROPPUT, name="Wrappable", name2="putWrappable", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbWrappable) */
  public void setWrappable(boolean pbWrappable);

  /** @com.method(vtoffset=29, dispid=8, type=PROPGET, name="ButtonHeight", name2="getButtonHeight", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getButtonHeight();

  /** @com.method(vtoffset=30, dispid=8, type=PROPPUT, name="ButtonHeight", name2="putButtonHeight", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfButtonHeight) */
  public void setButtonHeight(float pfButtonHeight);

  /** @com.method(vtoffset=31, dispid=9, type=PROPGET, name="ButtonWidth", name2="getButtonWidth", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public float getButtonWidth();

  /** @com.method(vtoffset=32, dispid=9, type=PROPPUT, name="ButtonWidth", name2="putButtonWidth", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfButtonWidth) */
  public void setButtonWidth(float pfButtonWidth);

  /** @com.method(vtoffset=33, dispid=13, type=PROPGET, name="HelpContextID", name2="getHelpContextID", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getHelpContextID();

  /** @com.method(vtoffset=34, dispid=13, type=PROPPUT, name="HelpContextID", name2="putHelpContextID", addFlagsVtable=4)
      @com.parameters([in,type=I4] plHelpContextID) */
  public void setHelpContextID(int plHelpContextID);

  /** @com.method(vtoffset=35, dispid=14, type=PROPGET, name="HelpFile", name2="getHelpFile", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getHelpFile();

  /** @com.method(vtoffset=36, dispid=14, type=PROPPUT, name="HelpFile", name2="putHelpFile", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrHelpFile) */
  public void setHelpFile(String pbstrHelpFile);

  /** @com.method(vtoffset=37, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getOLEDropMode();

  /** @com.method(vtoffset=38, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=39, dispid=4294966746, type=METHOD, name="Refresh", addFlagsVtable=4)
      @com.parameters() */
  public void Refresh();

  /** @com.method(vtoffset=40, dispid=10, type=METHOD, name="Customize", addFlagsVtable=4)
      @com.parameters() */
  public void Customize();

  /** @com.method(vtoffset=41, dispid=11, type=METHOD, name="SaveToolbar", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Key, [in,type=STRING] Subkey, [in,type=STRING] Value) */
  public void SaveToolbar(String Key, String Subkey, String Value);

  /** @com.method(vtoffset=42, dispid=12, type=METHOD, name="RestoreToolbar", addFlagsVtable=4)
      @com.parameters([in,type=STRING] Key, [in,type=STRING] Subkey, [in,type=STRING] Value) */
  public void RestoreToolbar(String Key, String Subkey, String Value);

  /** @com.method(vtoffset=43, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public void OLEDrag();

  /** @com.method(vtoffset=44, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e8c, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
