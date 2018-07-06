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

// Dual interface ISlider
/** @com.interface(iid=E6E17E86-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface ISlider extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="_Value", name2="get_Value", addFlagsVtable=4)
      @com.parameters([type=I4] return)
      @hidden */
  public int get_Value();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="_Value", name2="put_Value", addFlagsVtable=4)
      @com.parameters([in,type=I4] plValue)
      @hidden */
  public void set_Value(int plValue);

  /** @com.method(vtoffset=6, dispid=1, type=PROPGET, name="LargeChange", name2="getLargeChange", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getLargeChange();

  /** @com.method(vtoffset=7, dispid=1, type=PROPPUT, name="LargeChange", name2="putLargeChange", addFlagsVtable=4)
      @com.parameters([in,type=I4] plLargeChange) */
  public void setLargeChange(int plLargeChange);

  /** @com.method(vtoffset=8, dispid=2, type=PROPGET, name="SmallChange", name2="getSmallChange", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getSmallChange();

  /** @com.method(vtoffset=9, dispid=2, type=PROPPUT, name="SmallChange", name2="putSmallChange", addFlagsVtable=4)
      @com.parameters([in,type=I4] plSmallChange) */
  public void setSmallChange(int plSmallChange);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="Max", name2="getMax", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMax();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUT, name="Max", name2="putMax", addFlagsVtable=4)
      @com.parameters([in,type=I4] plMax) */
  public void setMax(int plMax);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="Min", name2="getMin", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMin();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUT, name="Min", name2="putMin", addFlagsVtable=4)
      @com.parameters([in,type=I4] plMin) */
  public void setMin(int plMin);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="Orientation", name2="getOrientation", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getOrientation();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUT, name="Orientation", name2="putOrientation", addFlagsVtable=4)
      @com.parameters([in,type=I4] pOrientation) */
  public void setOrientation(int pOrientation);

  /** @com.method(vtoffset=16, dispid=6, type=PROPGET, name="SelectRange", name2="getSelectRange", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSelectRange();

  /** @com.method(vtoffset=17, dispid=6, type=PROPPUT, name="SelectRange", name2="putSelectRange", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbSelectRange) */
  public void setSelectRange(boolean pbSelectRange);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="SelStart", name2="getSelStart", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getSelStart();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="SelStart", name2="putSelStart", addFlagsVtable=4)
      @com.parameters([in,type=I4] plSelStart) */
  public void setSelStart(int plSelStart);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="SelLength", name2="getSelLength", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getSelLength();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="SelLength", name2="putSelLength", addFlagsVtable=4)
      @com.parameters([in,type=I4] plSelLength) */
  public void setSelLength(int plSelLength);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="TickStyle", name2="getTickStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getTickStyle();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUT, name="TickStyle", name2="putTickStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] pTickStyle) */
  public void setTickStyle(int pTickStyle);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="TickFrequency", name2="getTickFrequency", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getTickFrequency();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUT, name="TickFrequency", name2="putTickFrequency", addFlagsVtable=4)
      @com.parameters([in,type=I4] plTickFrequency) */
  public void setTickFrequency(int plTickFrequency);

  /** @com.method(vtoffset=26, dispid=11, type=PROPGET, name="Value", name2="getValue", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getValue();

  /** @com.method(vtoffset=27, dispid=11, type=PROPPUT, name="Value", name2="putValue", addFlagsVtable=4)
      @com.parameters([in,type=I4] plValue) */
  public void setValue(int plValue);

  /** @com.method(vtoffset=28, dispid=12, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=29, dispid=12, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=31, dispid=13, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMousePointer();

  /** @com.method(vtoffset=32, dispid=13, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] psMousePointer) */
  public void setMousePointer(int psMousePointer);

  /** @com.method(vtoffset=33, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();

  /** @com.method(vtoffset=34, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=35, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getHWnd();

  /** @com.method(vtoffset=36, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public void setHWnd(int phWnd);

  /** @com.method(vtoffset=37, dispid=4294966792, type=PROPGET, name="BorderStyle", name2="getBorderStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getBorderStyle();

  /** @com.method(vtoffset=38, dispid=4294966792, type=PROPPUT, name="BorderStyle", name2="putBorderStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psBorderStyle) */
  public void setBorderStyle(int psBorderStyle);

  /** @com.method(vtoffset=39, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getOLEDropMode();

  /** @com.method(vtoffset=40, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=41, dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(vtoffset=42, dispid=14, type=METHOD, name="ClearSel", returntype=VOID)
      @com.parameters() */
  public void ClearSel();

  /** @com.method(vtoffset=43, dispid=4294966745, type=METHOD, name="DoClick", returntype=VOID)
      @com.parameters()
      @hidden */
  public void DoClick();

  /** @com.method(vtoffset=44, dispid=15, type=PROPGET, name="GetNumTicks", name2="getGetNumTicks", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getGetNumTicks();

  /** @com.method(vtoffset=45, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public void OLEDrag();

  /** @com.method(vtoffset=46, dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e86, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
