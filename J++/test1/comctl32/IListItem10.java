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

// Dispatch-only interface IListItem10
/** @com.interface(iid=0713E8AF-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IListItem10 extends IUnknown
{

  /** @com.method(dispid=1, name="Ghosted", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getGhosted();


  /** @com.method(dispid=1, name="Ghosted", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setGhosted(boolean newValue);


  /** @com.method(dispid=2, name="Height", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getHeight();


  /** @com.method(dispid=2, name="Height", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setHeight(float newValue);


  /** @com.method(dispid=3, name="Icon", type=PROPGET)
      @com.parameters([type=VARIANT] return) */
  public Variant getIcon();


  /** @com.method(dispid=3, name="Icon", type=PROPPUT)
      @com.parameters([in,type=VARIANT] newValue) */
  public void setIcon(Variant newValue);


  /** @com.method(dispid=4, name="Index", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getIndex();


  /** @com.method(dispid=4, name="Index", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setIndex(int newValue);


  /** @com.method(dispid=5, name="Key", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getKey();


  /** @com.method(dispid=5, name="Key", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setKey(String newValue);


  /** @com.method(dispid=6, name="Left", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getLeft();


  /** @com.method(dispid=6, name="Left", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setLeft(float newValue);


  /** @com.method(dispid=7, name="Selected", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSelected();


  /** @com.method(dispid=7, name="Selected", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setSelected(boolean newValue);


  /** @com.method(dispid=8, name="SmallIcon", type=PROPGET)
      @com.parameters([type=VARIANT] return) */
  public Variant getSmallIcon();


  /** @com.method(dispid=8, name="SmallIcon", type=PROPPUT)
      @com.parameters([in,type=VARIANT] newValue) */
  public void setSmallIcon(Variant newValue);


  /** @com.method(dispid=9, name="Tag", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getTag();


  /** @com.method(dispid=9, name="Tag", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setTag(String newValue);


  /** @com.method(dispid=10, name="Text", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getText();


  /** @com.method(dispid=10, name="Text", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setText(String newValue);


  /** @com.method(dispid=11, name="Top", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getTop();


  /** @com.method(dispid=11, name="Top", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setTop(float newValue);


  /** @com.method(dispid=12, name="Width", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getWidth();


  /** @com.method(dispid=12, name="Width", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setWidth(float newValue);

  /** @com.method(dispid=13, type=PROPGET, name="SubItems", name2="getSubItems", returntype=VOID)
      @com.parameters([in,type=I2] Index, [type=STRING] return) */
  public String getSubItems(short Index);

  /** @com.method(dispid=13, type=PROPPUT, name="SubItems", name2="putSubItems", returntype=VOID)
      @com.parameters([in,type=I2] Index, [in,type=STRING] _jcomparam_1) */
  public void setSubItems(short Index, String _jcomparam_1);

  /** @com.method(dispid=14, type=METHOD, name="CreateDragImage", returntype=VOID)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp CreateDragImage();

  /** @com.method(dispid=15, type=METHOD, name="EnsureVisible", returntype=VOID)
      @com.parameters([type=BOOLEAN] return) */
  public boolean EnsureVisible();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e8af, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
