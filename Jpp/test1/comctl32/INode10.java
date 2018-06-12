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

// Dispatch-only interface INode10
/** @com.interface(iid=0713E8A5-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface INode10 extends IUnknown
{

  /** @com.method(dispid=1, name="Child", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getChild();


  /** @com.method(dispid=1, name="Child", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setChild(Object newValue);


  /** @com.method(dispid=2, name="Children", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getChildren();


  /** @com.method(dispid=2, name="Children", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setChildren(short newValue);


  /** @com.method(dispid=3, name="Expanded", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getExpanded();


  /** @com.method(dispid=3, name="Expanded", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setExpanded(boolean newValue);


  /** @com.method(dispid=4, name="ExpandedImage", type=PROPGET)
      @com.parameters([type=VARIANT] return) */
  public Variant getExpandedImage();


  /** @com.method(dispid=4, name="ExpandedImage", type=PROPPUT)
      @com.parameters([in,type=VARIANT] newValue) */
  public void setExpandedImage(Variant newValue);


  /** @com.method(dispid=5, name="FirstSibling", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getFirstSibling();


  /** @com.method(dispid=5, name="FirstSibling", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setFirstSibling(Object newValue);


  /** @com.method(dispid=6, name="FullPath", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getFullPath();


  /** @com.method(dispid=6, name="FullPath", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setFullPath(String newValue);


  /** @com.method(dispid=7, name="Image", type=PROPGET)
      @com.parameters([type=VARIANT] return) */
  public Variant getImage();


  /** @com.method(dispid=7, name="Image", type=PROPPUT)
      @com.parameters([in,type=VARIANT] newValue) */
  public void setImage(Variant newValue);


  /** @com.method(dispid=8, name="Index", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getIndex();


  /** @com.method(dispid=8, name="Index", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setIndex(short newValue);


  /** @com.method(dispid=9, name="Key", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getKey();


  /** @com.method(dispid=9, name="Key", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setKey(String newValue);


  /** @com.method(dispid=10, name="LastSibling", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getLastSibling();


  /** @com.method(dispid=10, name="LastSibling", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setLastSibling(Object newValue);


  /** @com.method(dispid=11, name="Next", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getNext();


  /** @com.method(dispid=11, name="Next", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setNext(Object newValue);


  /** @com.method(dispid=12, name="Parent", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getParent();


  /** @com.method(dispid=12, name="Parent", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setParent(Object newValue);


  /** @com.method(dispid=13, name="Previous", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getPrevious();


  /** @com.method(dispid=13, name="Previous", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setPrevious(Object newValue);


  /** @com.method(dispid=14, name="Root", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public Object getRoot();


  /** @com.method(dispid=14, name="Root", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setRoot(Object newValue);


  /** @com.method(dispid=15, name="Selected", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSelected();


  /** @com.method(dispid=15, name="Selected", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setSelected(boolean newValue);


  /** @com.method(dispid=16, name="SelectedImage", type=PROPGET)
      @com.parameters([type=VARIANT] return) */
  public Variant getSelectedImage();


  /** @com.method(dispid=16, name="SelectedImage", type=PROPPUT)
      @com.parameters([in,type=VARIANT] newValue) */
  public void setSelectedImage(Variant newValue);


  /** @com.method(dispid=17, name="Sorted", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSorted();


  /** @com.method(dispid=17, name="Sorted", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setSorted(boolean newValue);


  /** @com.method(dispid=18, name="Tag", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getTag();


  /** @com.method(dispid=18, name="Tag", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setTag(String newValue);


  /** @com.method(dispid=19, name="Text", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getText();


  /** @com.method(dispid=19, name="Text", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setText(String newValue);


  /** @com.method(dispid=20, name="Visible", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getVisible();


  /** @com.method(dispid=20, name="Visible", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setVisible(boolean newValue);

  /** @com.method(dispid=21, type=METHOD, name="CreateDragImage", returntype=VOID)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp CreateDragImage();

  /** @com.method(dispid=22, type=METHOD, name="EnsureVisible", returntype=VOID)
      @com.parameters([type=BOOLEAN] return) */
  public boolean EnsureVisible();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e8a5, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
