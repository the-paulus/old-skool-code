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

// Dual interface INode
/** @com.interface(iid=7791BA62-E020-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface INode extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="_ObjectDefault", name2="get_ObjectDefault", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public String get_ObjectDefault();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="_ObjectDefault", name2="put_ObjectDefault", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrText)
      @hidden */
  public void set_ObjectDefault(String pbstrText);

  /** @com.method(vtoffset=6, dispid=1, type=PROPGET, name="Child", name2="getChild", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getChild();

  /** @com.method(vtoffset=7, dispid=1, type=PROPPUTREF, name="Child", name2="putChild", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppChild) */
  public void setChild(comctl32.INode ppChild);

  /** @com.method(vtoffset=8, dispid=2, type=PROPGET, name="Children", name2="getChildren", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getChildren();

  /** @com.method(vtoffset=9, dispid=2, type=PROPPUT, name="Children", name2="putChildren", addFlagsVtable=4)
      @com.parameters([in,type=I2] psChildren) */
  public void setChildren(short psChildren);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="Expanded", name2="getExpanded", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getExpanded();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUT, name="Expanded", name2="putExpanded", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbExpanded) */
  public void setExpanded(boolean pbExpanded);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="ExpandedImage", name2="getExpandedImage", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getExpandedImage();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUT, name="ExpandedImage", name2="putExpandedImage", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pExpandedImage) */
  public void setExpandedImage(Variant pExpandedImage);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="FirstSibling", name2="getFirstSibling", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getFirstSibling();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUTREF, name="FirstSibling", name2="putFirstSibling", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppFirstSibling) */
  public void setFirstSibling(comctl32.INode ppFirstSibling);

  /** @com.method(vtoffset=16, dispid=6, type=PROPGET, name="FullPath", name2="getFullPath", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getFullPath();

  /** @com.method(vtoffset=17, dispid=6, type=PROPPUT, name="FullPath", name2="putFullPath", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrFullPath) */
  public void setFullPath(String pbstrFullPath);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="Image", name2="getImage", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getImage();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="Image", name2="putImage", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pImage) */
  public void setImage(Variant pImage);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="Index", name2="getIndex", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getIndex();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="Index", name2="putIndex", addFlagsVtable=4)
      @com.parameters([in,type=I2] psIndex) */
  public void setIndex(short psIndex);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="Key", name2="getKey", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getKey();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUT, name="Key", name2="putKey", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrKey) */
  public void setKey(String pbstrKey);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="LastSibling", name2="getLastSibling", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getLastSibling();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUTREF, name="LastSibling", name2="putLastSibling", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppLastSibling) */
  public void setLastSibling(comctl32.INode ppLastSibling);

  /** @com.method(vtoffset=26, dispid=11, type=PROPGET, name="Next", name2="getNext", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getNext();

  /** @com.method(vtoffset=27, dispid=11, type=PROPPUTREF, name="Next", name2="putNext", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppNext) */
  public void setNext(comctl32.INode ppNext);

  /** @com.method(vtoffset=28, dispid=12, type=PROPGET, name="Parent", name2="getParent", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getParent();

  /** @com.method(vtoffset=29, dispid=12, type=PROPPUTREF, name="Parent", name2="putParent", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppParent) */
  public void setParent(comctl32.INode ppParent);

  /** @com.method(vtoffset=30, dispid=13, type=PROPGET, name="Previous", name2="getPrevious", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getPrevious();

  /** @com.method(vtoffset=31, dispid=13, type=PROPPUTREF, name="Previous", name2="putPrevious", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppPrevious) */
  public void setPrevious(comctl32.INode ppPrevious);

  /** @com.method(vtoffset=32, dispid=14, type=PROPGET, name="Root", name2="getRoot", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.INode getRoot();

  /** @com.method(vtoffset=33, dispid=14, type=PROPPUTREF, name="Root", name2="putRoot", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppRoot) */
  public void setRoot(comctl32.INode ppRoot);

  /** @com.method(vtoffset=34, dispid=15, type=PROPGET, name="Selected", name2="getSelected", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSelected();

  /** @com.method(vtoffset=35, dispid=15, type=PROPPUT, name="Selected", name2="putSelected", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbSelected) */
  public void setSelected(boolean pbSelected);

  /** @com.method(vtoffset=36, dispid=16, type=PROPGET, name="SelectedImage", name2="getSelectedImage", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getSelectedImage();

  /** @com.method(vtoffset=37, dispid=16, type=PROPPUT, name="SelectedImage", name2="putSelectedImage", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pSelectedImage) */
  public void setSelectedImage(Variant pSelectedImage);

  /** @com.method(vtoffset=38, dispid=17, type=PROPGET, name="Sorted", name2="getSorted", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSorted();

  /** @com.method(vtoffset=39, dispid=17, type=PROPPUT, name="Sorted", name2="putSorted", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbSorted) */
  public void setSorted(boolean pbSorted);

  /** @com.method(vtoffset=40, dispid=18, type=PROPGET, name="Tag", name2="getTag", addFlagsVtable=4)
      @com.parameters([type=VARIANT] return) */
  public Variant getTag();

  /** @com.method(vtoffset=41, dispid=18, type=PROPPUT, name="Tag", name2="putTag", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] pvTag) */
  public void setTag(Variant pvTag);

  /** @com.method(vtoffset=42, dispid=19, type=PROPGET, name="Text", name2="getText", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getText();

  /** @com.method(vtoffset=43, dispid=19, type=PROPPUT, name="Text", name2="putText", addFlagsVtable=4)
      @com.parameters([in,type=STRING] bstrText) */
  public void setText(String bstrText);

  /** @com.method(vtoffset=44, dispid=20, type=PROPGET, name="Visible", name2="getVisible", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getVisible();

  /** @com.method(vtoffset=45, dispid=20, type=PROPPUT, name="Visible", name2="putVisible", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbVisible) */
  public void setVisible(boolean pbVisible);

  /** @com.method(vtoffset=46, dispid=21, type=METHOD, name="CreateDragImage", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp CreateDragImage();

  /** @com.method(vtoffset=47, dispid=22, type=METHOD, name="EnsureVisible", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean EnsureVisible();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x7791ba62, (short)0xe020, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
