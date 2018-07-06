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

// Dispatch-only interface ITabStrip10
/** @com.interface(iid=9ED94441-E5E8-101B-B9B5-444553540000, thread=AUTO, type=DISPATCH) */
public interface ITabStrip10 extends IUnknown
{

  /** @com.method(dispid=4, name="Tabs", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getTabs();


  /** @com.method(dispid=4, name="Tabs", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setTabs(Object newValue);


  /** @com.method(dispid=4294966782, name="Enabled", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();


  /** @com.method(dispid=4294966782, name="Enabled", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setEnabled(boolean newValue);


  /** @com.method(dispid=4294966784, name="Font", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IFontDisp getFont();


  /** @com.method(dispid=4294966784, name="Font", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setFont(com.ms.wfc.ax.IFontDisp newValue);


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getHWnd();


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setHWnd(int newValue);


  /** @com.method(dispid=5, name="MouseIcon", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();


  /** @com.method(dispid=5, name="MouseIcon", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp newValue);


  /** @com.method(dispid=1, name="MultiRow", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getMultiRow();


  /** @com.method(dispid=1, name="MultiRow", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setMultiRow(boolean newValue);


  /** @com.method(dispid=6, name="Style", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getStyle();


  /** @com.method(dispid=6, name="Style", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setStyle(int newValue);


  /** @com.method(dispid=7, name="TabFixedWidth", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getTabFixedWidth();


  /** @com.method(dispid=7, name="TabFixedWidth", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setTabFixedWidth(short newValue);


  /** @com.method(dispid=8, name="TabWidthStyle", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getTabWidthStyle();


  /** @com.method(dispid=8, name="TabWidthStyle", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setTabWidthStyle(int newValue);


  /** @com.method(dispid=9, name="ClientTop", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getClientTop();


  /** @com.method(dispid=9, name="ClientTop", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setClientTop(float newValue);


  /** @com.method(dispid=10, name="ClientLeft", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getClientLeft();


  /** @com.method(dispid=10, name="ClientLeft", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setClientLeft(float newValue);


  /** @com.method(dispid=11, name="ClientHeight", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getClientHeight();


  /** @com.method(dispid=11, name="ClientHeight", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setClientHeight(float newValue);


  /** @com.method(dispid=12, name="ClientWidth", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getClientWidth();


  /** @com.method(dispid=12, name="ClientWidth", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setClientWidth(float newValue);


  /** @com.method(dispid=2, name="MousePointer", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMousePointer();


  /** @com.method(dispid=2, name="MousePointer", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMousePointer(int newValue);


  /** @com.method(dispid=13, name="ImageList", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getImageList();


  /** @com.method(dispid=13, name="ImageList", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setImageList(Object newValue);


  /** @com.method(dispid=14, name="TabFixedHeight", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getTabFixedHeight();


  /** @com.method(dispid=14, name="TabFixedHeight", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setTabFixedHeight(short newValue);


  /** @com.method(dispid=3, name="ShowTips", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getShowTips();


  /** @com.method(dispid=3, name="ShowTips", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setShowTips(boolean newValue);


  /** @com.method(dispid=15, name="SelectedItem", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getSelectedItem();


  /** @com.method(dispid=15, name="SelectedItem", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setSelectedItem(Object newValue);

  /** @com.method(dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x9ed94441, (short)0xe5e8, (short)0x101b, (byte)0xb9, (byte)0xb5, (byte)0x44, (byte)0x45, (byte)0x53, (byte)0x54, (byte)0x0, (byte)0x0);
}
