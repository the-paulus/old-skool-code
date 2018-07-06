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

// Dispatch-only interface IProgressBar10
/** @com.interface(iid=0713E8D0-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IProgressBar10 extends IUnknown
{

  /** @com.method(dispid=1, name="Max", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getMax();


  /** @com.method(dispid=1, name="Max", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setMax(float newValue);


  /** @com.method(dispid=2, name="Min", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getMin();


  /** @com.method(dispid=2, name="Min", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setMin(float newValue);


  /** @com.method(dispid=3, name="MousePointer", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMousePointer();


  /** @com.method(dispid=3, name="MousePointer", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMousePointer(int newValue);


  /** @com.method(dispid=4, name="MouseIcon", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();


  /** @com.method(dispid=4, name="MouseIcon", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp newValue);


  /** @com.method(dispid=5, name="Value", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getValue();


  /** @com.method(dispid=5, name="Value", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setValue(float newValue);


  /** @com.method(dispid=4294966776, name="Appearance", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getAppearance();


  /** @com.method(dispid=4294966776, name="Appearance", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setAppearance(int newValue);


  /** @com.method(dispid=4294966792, name="BorderStyle", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getBorderStyle();


  /** @com.method(dispid=4294966792, name="BorderStyle", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setBorderStyle(int newValue);


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

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e8d0, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
