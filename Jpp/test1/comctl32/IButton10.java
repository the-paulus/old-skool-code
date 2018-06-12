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

// Dispatch-only interface IButton10
/** @com.interface(iid=0713E953-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IButton10 extends IUnknown
{

  /** @com.method(dispid=2, name="Caption", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getCaption();


  /** @com.method(dispid=2, name="Caption", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setCaption(String newValue);


  /** @com.method(dispid=1, name="Tag", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getTag();


  /** @com.method(dispid=1, name="Tag", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setTag(String newValue);


  /** @com.method(dispid=3, name="Enabled", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();


  /** @com.method(dispid=3, name="Enabled", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setEnabled(boolean newValue);


  /** @com.method(dispid=4, name="Index", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getIndex();


  /** @com.method(dispid=4, name="Index", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setIndex(short newValue);


  /** @com.method(dispid=5, name="Key", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getKey();


  /** @com.method(dispid=5, name="Key", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setKey(String newValue);


  /** @com.method(dispid=6, name="ToolTipText", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getToolTipText();


  /** @com.method(dispid=6, name="ToolTipText", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setToolTipText(String newValue);


  /** @com.method(dispid=7, name="Visible", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getVisible();


  /** @com.method(dispid=7, name="Visible", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setVisible(boolean newValue);


  /** @com.method(dispid=8, name="Width", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getWidth();


  /** @com.method(dispid=8, name="Width", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setWidth(float newValue);


  /** @com.method(dispid=9, name="Height", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getHeight();


  /** @com.method(dispid=9, name="Height", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setHeight(float newValue);


  /** @com.method(dispid=10, name="Top", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getTop();


  /** @com.method(dispid=10, name="Top", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setTop(float newValue);


  /** @com.method(dispid=11, name="Left", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getLeft();


  /** @com.method(dispid=11, name="Left", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setLeft(float newValue);


  /** @com.method(dispid=12, name="Value", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getValue();


  /** @com.method(dispid=12, name="Value", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setValue(int newValue);


  /** @com.method(dispid=13, name="Style", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getStyle();


  /** @com.method(dispid=13, name="Style", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setStyle(int newValue);


  /** @com.method(dispid=14, name="Description", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getDescription();


  /** @com.method(dispid=14, name="Description", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setDescription(String newValue);


  /** @com.method(dispid=15, name="Image", type=PROPGET)
      @com.parameters([type=VARIANT] return) */
  public Variant getImage();


  /** @com.method(dispid=15, name="Image", type=PROPPUT)
      @com.parameters([in,type=VARIANT] newValue) */
  public void setImage(Variant newValue);


  /** @com.method(dispid=16, name="MixedState", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getMixedState();


  /** @com.method(dispid=16, name="MixedState", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setMixedState(boolean newValue);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e953, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
