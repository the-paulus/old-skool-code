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

// Dispatch-only interface ISlider10
/** @com.interface(iid=373FF7F1-EB8B-11CD-8820-08002B2F4F5A, thread=AUTO, type=DISPATCH) */
public interface ISlider10 extends IUnknown
{

  /** @com.method(dispid=1, name="LargeChange", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getLargeChange();


  /** @com.method(dispid=1, name="LargeChange", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setLargeChange(int newValue);


  /** @com.method(dispid=2, name="SmallChange", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getSmallChange();


  /** @com.method(dispid=2, name="SmallChange", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setSmallChange(int newValue);


  /** @com.method(dispid=3, name="Max", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMax();


  /** @com.method(dispid=3, name="Max", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMax(int newValue);


  /** @com.method(dispid=4, name="Min", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMin();


  /** @com.method(dispid=4, name="Min", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMin(int newValue);


  /** @com.method(dispid=5, name="Orientation", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getOrientation();


  /** @com.method(dispid=5, name="Orientation", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setOrientation(int newValue);


  /** @com.method(dispid=6, name="SelectRange", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSelectRange();


  /** @com.method(dispid=6, name="SelectRange", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setSelectRange(boolean newValue);


  /** @com.method(dispid=7, name="SelStart", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getSelStart();


  /** @com.method(dispid=7, name="SelStart", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setSelStart(int newValue);


  /** @com.method(dispid=8, name="SelLength", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getSelLength();


  /** @com.method(dispid=8, name="SelLength", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setSelLength(int newValue);


  /** @com.method(dispid=9, name="TickStyle", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getTickStyle();


  /** @com.method(dispid=9, name="TickStyle", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setTickStyle(int newValue);


  /** @com.method(dispid=10, name="TickFrequency", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getTickFrequency();


  /** @com.method(dispid=10, name="TickFrequency", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setTickFrequency(int newValue);


  /** @com.method(dispid=11, name="Value", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getValue();


  /** @com.method(dispid=11, name="Value", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setValue(int newValue);


  /** @com.method(dispid=12, name="MouseIcon", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();


  /** @com.method(dispid=12, name="MouseIcon", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp newValue);


  /** @com.method(dispid=13, name="MousePointer", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMousePointer();


  /** @com.method(dispid=13, name="MousePointer", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMousePointer(int newValue);


  /** @com.method(dispid=4294966782, name="Enabled", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();


  /** @com.method(dispid=4294966782, name="Enabled", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setEnabled(boolean newValue);


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getHWnd();


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setHWnd(int newValue);


  /** @com.method(dispid=4294966792, name="BorderStyle", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getBorderStyle();


  /** @com.method(dispid=4294966792, name="BorderStyle", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setBorderStyle(short newValue);

  /** @com.method(dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(dispid=14, type=METHOD, name="ClearSel", returntype=VOID)
      @com.parameters() */
  public void ClearSel();

  /** @com.method(dispid=4294966745, type=METHOD, name="DoClick", returntype=VOID)
      @com.parameters() */
  public void DoClick();

  /** @com.method(dispid=15, type=METHOD, name="GetNumTicks", returntype=VOID)
      @com.parameters([type=I4] return) */
  public int GetNumTicks();

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x373ff7f1, (short)0xeb8b, (short)0x11cd, (byte)0x88, (byte)0x20, (byte)0x8, (byte)0x0, (byte)0x2b, (byte)0x2f, (byte)0x4f, (byte)0x5a);
}
