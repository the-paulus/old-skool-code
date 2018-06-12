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

/** @com.class(classid=0713E8A2-850A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=E6E17E8E-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public class TreeViewRaw implements IUnknown,com.ms.com.NoAutoScripting,comctl32.ITreeView
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="DropHighlight", name2="getDropHighlight", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.INode getDropHighlight();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUTREF, name="DropHighlight", name2="putDropHighlight", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppNode) */
  public native void setDropHighlight(comctl32.INode ppNode);

  /** @com.method(vtoffset=6, dispid=1, type=PROPPUT, name="DropHighlight", name2="putDropHighlight", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] ppNode) */
  public native void setDropHighlight(Variant ppNode);

  /** @com.method(vtoffset=7, dispid=2, type=PROPGET, name="HideSelection", name2="getHideSelection", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getHideSelection();

  /** @com.method(vtoffset=8, dispid=2, type=PROPPUT, name="HideSelection", name2="putHideSelection", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbHideSelection) */
  public native void setHideSelection(boolean pbHideSelection);

  /** @com.method(vtoffset=9, dispid=3, type=PROPGET, name="ImageList", name2="getImageList", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public native Object getImageList();

  /** @com.method(vtoffset=10, dispid=3, type=PROPPUTREF, name="ImageList", name2="putImageList", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppImageList) */
  public native void setImageList(Object ppImageList);

  // setImageList UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setImageList(Object ppImageList);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="Indentation", name2="getIndentation", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getIndentation();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUT, name="Indentation", name2="putIndentation", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfIndentation) */
  public native void setIndentation(float pfIndentation);

  /** @com.method(vtoffset=14, dispid=5, type=PROPGET, name="LabelEdit", name2="getLabelEdit", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getLabelEdit();

  /** @com.method(vtoffset=15, dispid=5, type=PROPPUT, name="LabelEdit", name2="putLabelEdit", addFlagsVtable=4)
      @com.parameters([in,type=I4] psLabelEdit) */
  public native void setLabelEdit(int psLabelEdit);

  /** @com.method(vtoffset=16, dispid=6, type=PROPGET, name="LineStyle", name2="getLineStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getLineStyle();

  /** @com.method(vtoffset=17, dispid=6, type=PROPPUT, name="LineStyle", name2="putLineStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psLineStyle) */
  public native void setLineStyle(int psLineStyle);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getMousePointer();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] psMousePointer) */
  public native void setMousePointer(int psMousePointer);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=23, dispid=9, type=PROPGET, name="Nodes", name2="getNodes", addFlagsVtable=4)
      @com.parameters([iid=7791BA60-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.INodes getNodes();

  /** @com.method(vtoffset=24, dispid=9, type=PROPPUTREF, name="Nodes", name2="putNodes", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA60-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppNode) */
  public native void setNodes(comctl32.INodes ppNode);

  /** @com.method(vtoffset=25, dispid=10, type=PROPGET, name="PathSeparator", name2="getPathSeparator", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public native String getPathSeparator();

  /** @com.method(vtoffset=26, dispid=10, type=PROPPUT, name="PathSeparator", name2="putPathSeparator", addFlagsVtable=4)
      @com.parameters([in,type=STRING] pbstrPathSeparator) */
  public native void setPathSeparator(String pbstrPathSeparator);

  /** @com.method(vtoffset=27, dispid=11, type=PROPGET, name="SelectedItem", name2="getSelectedItem", addFlagsVtable=4)
      @com.parameters([iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.INode getSelectedItem();

  /** @com.method(vtoffset=28, dispid=11, type=PROPPUTREF, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppNode) */
  public native void setSelectedItem(comctl32.INode ppNode);

  /** @com.method(vtoffset=29, dispid=11, type=PROPPUT, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] ppNode) */
  public native void setSelectedItem(Variant ppNode);

  /** @com.method(vtoffset=30, dispid=12, type=PROPGET, name="Sorted", name2="getSorted", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getSorted();

  /** @com.method(vtoffset=31, dispid=12, type=PROPPUT, name="Sorted", name2="putSorted", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbSorted) */
  public native void setSorted(boolean pbSorted);

  /** @com.method(vtoffset=32, dispid=13, type=PROPGET, name="Style", name2="getStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getStyle();

  /** @com.method(vtoffset=33, dispid=13, type=PROPPUT, name="Style", name2="putStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psStyle) */
  public native void setStyle(int psStyle);

  /** @com.method(vtoffset=34, dispid=1550, type=PROPGET, name="OLEDragMode", name2="getOLEDragMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getOLEDragMode();

  /** @com.method(vtoffset=35, dispid=1550, type=PROPPUT, name="OLEDragMode", name2="putOLEDragMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDragMode) */
  public native void setOLEDragMode(int psOLEDragMode);

  /** @com.method(vtoffset=36, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getOLEDropMode();

  /** @com.method(vtoffset=37, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public native void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=38, dispid=4294966776, type=PROPGET, name="Appearance", name2="getAppearance", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getAppearance();

  /** @com.method(vtoffset=39, dispid=4294966776, type=PROPPUT, name="Appearance", name2="putAppearance", addFlagsVtable=4)
      @com.parameters([in,type=I4] psAppearance) */
  public native void setAppearance(int psAppearance);

  /** @com.method(vtoffset=40, dispid=4294966792, type=PROPGET, name="BorderStyle", name2="getBorderStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getBorderStyle();

  /** @com.method(vtoffset=41, dispid=4294966792, type=PROPPUT, name="BorderStyle", name2="putBorderStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] psBorderStyle) */
  public native void setBorderStyle(int psBorderStyle);

  /** @com.method(vtoffset=42, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getEnabled();

  /** @com.method(vtoffset=43, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pbEnabled) */
  public native void setEnabled(boolean pbEnabled);

  /** @com.method(vtoffset=44, dispid=4294966784, type=PROPGET, name="Font", name2="getFont", addFlagsVtable=4)
      @com.parameters([iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IFontDisp getFont();

  /** @com.method(vtoffset=45, dispid=4294966784, type=PROPPUT, name="Font", name2="putFont", addFlagsVtable=4)
      @com.parameters([in,iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] ppFont) */
  public native void setFont(com.ms.wfc.ax.IFontDisp ppFont);

  // setFont UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setFont(com.ms.wfc.ax.IFontDisp ppFont);

  /** @com.method(vtoffset=47, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getHWnd();

  /** @com.method(vtoffset=48, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public native void setHWnd(int phWnd);

  /** @com.method(vtoffset=49, dispid=14, type=METHOD, name="HitTest", addFlagsVtable=4)
      @com.parameters([in,type=R4] x, [in,type=R4] y, [iid=7791BA62-E020-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.INode HitTest(float x, float y);

  /** @com.method(vtoffset=50, dispid=15, type=METHOD, name="GetVisibleCount", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int GetVisibleCount();

  /** @com.method(vtoffset=51, dispid=16, type=METHOD, name="StartLabelEdit", addFlagsVtable=4)
      @com.parameters() */
  public native void StartLabelEdit();

  /** @com.method(vtoffset=52, dispid=4294966746, type=METHOD, name="Refresh", addFlagsVtable=4)
      @com.parameters() */
  public native void Refresh();

  /** @com.method(vtoffset=53, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public native void AboutBox();

  /** @com.method(vtoffset=54, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public native void OLEDrag();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e8e, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x713e8a2, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
