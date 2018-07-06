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

// Dispatch-only interface IToolbar10
/** @com.interface(iid=612A8625-0FB3-11CE-8747-524153480004, thread=AUTO, type=DISPATCH) */
public interface IToolbar10 extends IUnknown
{

  /** @com.method(dispid=2, name="AllowCustomize", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getAllowCustomize();


  /** @com.method(dispid=2, name="AllowCustomize", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setAllowCustomize(boolean newValue);


  /** @com.method(dispid=3, name="Buttons", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getButtons();


  /** @com.method(dispid=3, name="Buttons", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setButtons(Object newValue);


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


  /** @com.method(dispid=4, name="MouseIcon", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();


  /** @com.method(dispid=4, name="MouseIcon", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp newValue);


  /** @com.method(dispid=1, name="MousePointer", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMousePointer();


  /** @com.method(dispid=1, name="MousePointer", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMousePointer(int newValue);


  /** @com.method(dispid=5, name="ImageList", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public comctl32.IImageList10 getImageList();


  /** @com.method(dispid=5, name="ImageList", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setImageList(comctl32.IImageList10 newValue);


  /** @com.method(dispid=6, name="ShowTips", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getShowTips();


  /** @com.method(dispid=6, name="ShowTips", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setShowTips(boolean newValue);


  /** @com.method(dispid=4294966792, name="BorderStyle", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getBorderStyle();


  /** @com.method(dispid=4294966792, name="BorderStyle", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setBorderStyle(short newValue);


  /** @com.method(dispid=7, name="Wrappable", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getWrappable();


  /** @com.method(dispid=7, name="Wrappable", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setWrappable(boolean newValue);


  /** @com.method(dispid=8, name="ButtonHeight", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getButtonHeight();


  /** @com.method(dispid=8, name="ButtonHeight", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setButtonHeight(float newValue);


  /** @com.method(dispid=9, name="ButtonWidth", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getButtonWidth();


  /** @com.method(dispid=9, name="ButtonWidth", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setButtonWidth(float newValue);

  /** @com.method(dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(dispid=10, type=METHOD, name="Customize", returntype=VOID)
      @com.parameters() */
  public void Customize();

  /** @com.method(dispid=11, type=METHOD, name="SaveToolbar", returntype=VOID)
      @com.parameters([in,type=STRING] Key, [in,type=STRING] Subkey, [in,type=STRING] Value) */
  public void SaveToolbar(String Key, String Subkey, String Value);

  /** @com.method(dispid=12, type=METHOD, name="RestoreToolbar", returntype=VOID)
      @com.parameters([in,type=STRING] Key, [in,type=STRING] Subkey, [in,type=STRING] Value) */
  public void RestoreToolbar(String Key, String Subkey, String Value);

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x612a8625, (short)0xfb3, (short)0x11ce, (byte)0x87, (byte)0x47, (byte)0x52, (byte)0x41, (byte)0x53, (byte)0x48, (byte)0x0, (byte)0x4);
}
