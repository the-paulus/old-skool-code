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

/** @com.class(classid=58DA8D8A-9D6A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=F4D83600-895E-11D0-B0A6-000000000000, thread=AUTO, type=DUAL) */
public class ListViewRaw implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IListView
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Arrange", name2="getArrange", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getArrange();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="Arrange", name2="putArrange", addFlagsVtable=4)
      @com.parameters([in,type=I4] pArrange) */
  public native void setArrange(int pArrange);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="ColumnHeaders", name2="getColumnHeaders", addFlagsVtable=4)
      @com.parameters([iid=F4D83603-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IColumnHeaders getColumnHeaders();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="ColumnHeaders", name2="putColumnHeaders", addFlagsVtable=4)
      @com.parameters([in,iid=F4D83603-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] ppIColumnHeaders) */
  public native void setColumnHeaders(comctl32.IColumnHeaders ppIColumnHeaders);

  /** @com.method(vtoffset=8, dispid=3, type=PROPGET, name="DropHighlight", name2="getDropHighlight", addFlagsVtable=4)
      @com.parameters([iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IListItem getDropHighlight();

  /** @com.method(vtoffset=9, dispid=3, type=PROPPUTREF, name="DropHighlight", name2="putDropHighlight", addFlagsVtable=4)
      @com.parameters([in,iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] ppIListItem) */
  public native void setDropHighlight(comctl32.IListItem ppIListItem);

  /** @com.method(vtoffset=10, dispid=3, type=PROPPUT, name="DropHighlight", name2="putDropHighlight", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] ppIListItem) */
  public native void setDropHighlight(Variant ppIListItem);

  /** @com.method(vtoffset=11, dispid=4, type=PROPGET, name="HideColumnHeaders", name2="getHideColumnHeaders", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getHideColumnHeaders();

  /** @com.method(vtoffset=12, dispid=4, type=PROPPUT, name="HideColumnHeaders", name2="putHideColumnHeaders", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfHide) */
  public native void setHideColumnHeaders(boolean pfHide);

  /** @com.method(vtoffset=13, dispid=5, type=PROPGET, name="HideSelection", name2="getHideSelection", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getHideSelection();

  /** @com.method(vtoffset=14, dispid=5, type=PROPPUT, name="HideSelection", name2="putHideSelection", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfHide) */
  public native void setHideSelection(boolean pfHide);

  /** @com.method(vtoffset=15, dispid=6, type=PROPGET, name="Icons", name2="getIcons", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public native Object getIcons();

  /** @com.method(vtoffset=16, dispid=6, type=PROPPUTREF, name="Icons", name2="putIcons", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppIcons) */
  public native void setIcons(Object ppIcons);

  // setIcons UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setIcons(Object ppIcons);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="ListItems", name2="getListItems", addFlagsVtable=4)
      @com.parameters([iid=F4D83601-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IListItems getListItems();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="ListItems", name2="putListItems", addFlagsVtable=4)
      @com.parameters([in,iid=F4D83601-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] ppListItems) */
  public native void setListItems(comctl32.IListItems ppListItems);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="LabelEdit", name2="getLabelEdit", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getLabelEdit();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="LabelEdit", name2="putLabelEdit", addFlagsVtable=4)
      @com.parameters([in,type=I4] pRet) */
  public native void setLabelEdit(int pRet);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="LabelWrap", name2="getLabelWrap", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getLabelWrap();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUT, name="LabelWrap", name2="putLabelWrap", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public native void setLabelWrap(boolean pfOn);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=27, dispid=11, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getMousePointer();

  /** @com.method(vtoffset=28, dispid=11, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnIndex) */
  public native void setMousePointer(int pnIndex);

  /** @com.method(vtoffset=29, dispid=12, type=PROPGET, name="MultiSelect", name2="getMultiSelect", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getMultiSelect();

  /** @com.method(vtoffset=30, dispid=12, type=PROPPUT, name="MultiSelect", name2="putMultiSelect", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public native void setMultiSelect(boolean pfOn);

  /** @com.method(vtoffset=31, dispid=13, type=PROPGET, name="SelectedItem", name2="getSelectedItem", addFlagsVtable=4)
      @com.parameters([iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IListItem getSelectedItem();

  /** @com.method(vtoffset=32, dispid=13, type=PROPPUTREF, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] ppListItem) */
  public native void setSelectedItem(comctl32.IListItem ppListItem);

  /** @com.method(vtoffset=33, dispid=13, type=PROPPUT, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,elementType=VARIANT,type=PTR] ppListItem) */
  public native void setSelectedItem(Variant ppListItem);

  /** @com.method(vtoffset=34, dispid=14, type=PROPGET, name="SmallIcons", name2="getSmallIcons", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public native Object getSmallIcons();

  /** @com.method(vtoffset=35, dispid=14, type=PROPPUTREF, name="SmallIcons", name2="putSmallIcons", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppImageList) */
  public native void setSmallIcons(Object ppImageList);

  // setSmallIcons UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setSmallIcons(Object ppImageList);

  /** @com.method(vtoffset=37, dispid=15, type=PROPGET, name="Sorted", name2="getSorted", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getSorted();

  /** @com.method(vtoffset=38, dispid=15, type=PROPPUT, name="Sorted", name2="putSorted", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public native void setSorted(boolean pfOn);

  /** @com.method(vtoffset=39, dispid=16, type=PROPGET, name="SortKey", name2="getSortKey", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public native short getSortKey();

  /** @com.method(vtoffset=40, dispid=16, type=PROPPUT, name="SortKey", name2="putSortKey", addFlagsVtable=4)
      @com.parameters([in,type=I2] psKey) */
  public native void setSortKey(short psKey);

  /** @com.method(vtoffset=41, dispid=17, type=PROPGET, name="SortOrder", name2="getSortOrder", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getSortOrder();

  /** @com.method(vtoffset=42, dispid=17, type=PROPPUT, name="SortOrder", name2="putSortOrder", addFlagsVtable=4)
      @com.parameters([in,type=I4] pOrder) */
  public native void setSortOrder(int pOrder);

  /** @com.method(vtoffset=43, dispid=18, type=PROPGET, name="View", name2="getView", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getView();

  /** @com.method(vtoffset=44, dispid=18, type=PROPPUT, name="View", name2="putView", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnView) */
  public native void setView(int pnView);

  /** @com.method(vtoffset=45, dispid=1550, type=PROPGET, name="OLEDragMode", name2="getOLEDragMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getOLEDragMode();

  /** @com.method(vtoffset=46, dispid=1550, type=PROPPUT, name="OLEDragMode", name2="putOLEDragMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDragMode) */
  public native void setOLEDragMode(int psOLEDragMode);

  /** @com.method(vtoffset=47, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getOLEDropMode();

  /** @com.method(vtoffset=48, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public native void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=49, dispid=4294966776, type=PROPGET, name="Appearance", name2="getAppearance", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getAppearance();

  /** @com.method(vtoffset=50, dispid=4294966776, type=PROPPUT, name="Appearance", name2="putAppearance", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnAppearance) */
  public native void setAppearance(int pnAppearance);

  /** @com.method(vtoffset=51, dispid=4294966795, type=PROPGET, name="BackColor", name2="getBackColor", addFlagsVtable=4)
      @com.parameters([type=U4] return) */
  public native int getBackColor();

  /** @com.method(vtoffset=52, dispid=4294966795, type=PROPPUT, name="BackColor", name2="putBackColor", addFlagsVtable=4)
      @com.parameters([in,type=U4] pcrBack) */
  public native void setBackColor(int pcrBack);

  /** @com.method(vtoffset=53, dispid=4294966792, type=PROPGET, name="BorderStyle", name2="getBorderStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getBorderStyle();

  /** @com.method(vtoffset=54, dispid=4294966792, type=PROPPUT, name="BorderStyle", name2="putBorderStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnStyle) */
  public native void setBorderStyle(int pnStyle);

  /** @com.method(vtoffset=55, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getEnabled();

  /** @com.method(vtoffset=56, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfEnabled) */
  public native void setEnabled(boolean pfEnabled);

  /** @com.method(vtoffset=57, dispid=4294966784, type=PROPGET, name="Font", name2="getFont", addFlagsVtable=4)
      @com.parameters([iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IFontDisp getFont();

  /** @com.method(vtoffset=58, dispid=4294966784, type=PROPPUTREF, name="Font", name2="putFont", addFlagsVtable=4)
      @com.parameters([in,iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] ppFontDisp) */
  public native void setFont(com.ms.wfc.ax.IFontDisp ppFontDisp);

  /** @com.method(vtoffset=59, dispid=4294966783, type=PROPGET, name="ForeColor", name2="getForeColor", addFlagsVtable=4)
      @com.parameters([type=U4] return) */
  public native int getForeColor();

  /** @com.method(vtoffset=60, dispid=4294966783, type=PROPPUT, name="ForeColor", name2="putForeColor", addFlagsVtable=4)
      @com.parameters([in,type=U4] pcrFore) */
  public native void setForeColor(int pcrFore);

  /** @com.method(vtoffset=61, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getHWnd();

  /** @com.method(vtoffset=62, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public native void setHWnd(int phWnd);

  /** @com.method(vtoffset=63, dispid=19, type=METHOD, name="FindItem", addFlagsVtable=4)
      @com.parameters([in,type=STRING] sz, [in,elementType=VARIANT,type=PTR] Where, [in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] fPartial, [iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IListItem FindItem(String sz, Variant Where, Variant Index, Variant fPartial);

  /** @com.method(vtoffset=64, dispid=20, type=METHOD, name="GetFirstVisible", addFlagsVtable=4)
      @com.parameters([iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IListItem GetFirstVisible();

  /** @com.method(vtoffset=65, dispid=21, type=METHOD, name="HitTest", addFlagsVtable=4)
      @com.parameters([in,type=R4] x, [in,type=R4] y, [iid=F4D83602-895E-11D0-B0A6-000000000000,thread=AUTO,type=DISPATCH] return) */
  public native comctl32.IListItem HitTest(float x, float y);

  /** @com.method(vtoffset=66, dispid=22, type=METHOD, name="StartLabelEdit", addFlagsVtable=4)
      @com.parameters() */
  public native void StartLabelEdit();

  /** @com.method(vtoffset=67, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public native void OLEDrag();

  /** @com.method(vtoffset=68, dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public native void Refresh();

  /** @com.method(vtoffset=69, dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public native void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xf4d83600, (short)0x895e, (short)0x11d0, (byte)0xb0, (byte)0xa6, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0, (byte)0x0);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x58da8d8a, (short)0x9d6a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
