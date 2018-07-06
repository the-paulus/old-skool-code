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

// Dual interface IListView11
/** @com.interface(iid=E6E17E82-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public interface IListView11 extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=1, type=PROPGET, name="Arrange", name2="getArrange", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getArrange();

  /** @com.method(vtoffset=5, dispid=1, type=PROPPUT, name="Arrange", name2="putArrange", addFlagsVtable=4)
      @com.parameters([in,type=I4] pArrange) */
  public void setArrange(int pArrange);

  /** @com.method(vtoffset=6, dispid=2, type=PROPGET, name="ColumnHeaders", name2="getColumnHeaders", addFlagsVtable=4)
      @com.parameters([iid=BF877894-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IColumnHeaders11 getColumnHeaders();

  /** @com.method(vtoffset=7, dispid=2, type=PROPPUT, name="ColumnHeaders", name2="putColumnHeaders", addFlagsVtable=4)
      @com.parameters([in,iid=BF877894-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppIColumnHeaders) */
  public void setColumnHeaders(comctl32.IColumnHeaders11 ppIColumnHeaders);

  /** @com.method(vtoffset=8, dispid=3, type=PROPGET, name="DropHighlight", name2="getDropHighlight", addFlagsVtable=4)
      @com.parameters([iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IListItem11 getDropHighlight();

  /** @com.method(vtoffset=9, dispid=3, type=PROPPUTREF, name="DropHighlight", name2="putDropHighlight", addFlagsVtable=4)
      @com.parameters([in,iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppIListItem) */
  public void setDropHighlight(comctl32.IListItem11 ppIListItem);

  // setDropHighlight UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setDropHighlight(comctl32.IListItem11 ppIListItem);

  /** @com.method(vtoffset=11, dispid=4, type=PROPGET, name="HideColumnHeaders", name2="getHideColumnHeaders", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getHideColumnHeaders();

  /** @com.method(vtoffset=12, dispid=4, type=PROPPUT, name="HideColumnHeaders", name2="putHideColumnHeaders", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfHide) */
  public void setHideColumnHeaders(boolean pfHide);

  /** @com.method(vtoffset=13, dispid=5, type=PROPGET, name="HideSelection", name2="getHideSelection", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getHideSelection();

  /** @com.method(vtoffset=14, dispid=5, type=PROPPUT, name="HideSelection", name2="putHideSelection", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfHide) */
  public void setHideSelection(boolean pfHide);

  /** @com.method(vtoffset=15, dispid=6, type=PROPGET, name="Icons", name2="getIcons", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public Object getIcons();

  /** @com.method(vtoffset=16, dispid=6, type=PROPPUTREF, name="Icons", name2="putIcons", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppIcons) */
  public void setIcons(Object ppIcons);

  // setIcons UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setIcons(Object ppIcons);

  /** @com.method(vtoffset=18, dispid=7, type=PROPGET, name="ListItems", name2="getListItems", addFlagsVtable=4)
      @com.parameters([iid=BF877890-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IListItems11 getListItems();

  /** @com.method(vtoffset=19, dispid=7, type=PROPPUT, name="ListItems", name2="putListItems", addFlagsVtable=4)
      @com.parameters([in,iid=BF877890-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppListItems) */
  public void setListItems(comctl32.IListItems11 ppListItems);

  /** @com.method(vtoffset=20, dispid=8, type=PROPGET, name="LabelEdit", name2="getLabelEdit", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getLabelEdit();

  /** @com.method(vtoffset=21, dispid=8, type=PROPPUT, name="LabelEdit", name2="putLabelEdit", addFlagsVtable=4)
      @com.parameters([in,type=I4] pRet) */
  public void setLabelEdit(int pRet);

  /** @com.method(vtoffset=22, dispid=9, type=PROPGET, name="LabelWrap", name2="getLabelWrap", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getLabelWrap();

  /** @com.method(vtoffset=23, dispid=9, type=PROPPUT, name="LabelWrap", name2="putLabelWrap", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public void setLabelWrap(boolean pfOn);

  /** @com.method(vtoffset=24, dispid=10, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=25, dispid=10, type=PROPPUT, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppMouseIcon) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppMouseIcon);

  /** @com.method(vtoffset=27, dispid=11, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getMousePointer();

  /** @com.method(vtoffset=28, dispid=11, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnIndex) */
  public void setMousePointer(int pnIndex);

  /** @com.method(vtoffset=29, dispid=12, type=PROPGET, name="MultiSelect", name2="getMultiSelect", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getMultiSelect();

  /** @com.method(vtoffset=30, dispid=12, type=PROPPUT, name="MultiSelect", name2="putMultiSelect", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public void setMultiSelect(boolean pfOn);

  /** @com.method(vtoffset=31, dispid=13, type=PROPGET, name="SelectedItem", name2="getSelectedItem", addFlagsVtable=4)
      @com.parameters([iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IListItem11 getSelectedItem();

  /** @com.method(vtoffset=32, dispid=13, type=PROPPUTREF, name="SelectedItem", name2="putSelectedItem", addFlagsVtable=4)
      @com.parameters([in,iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] ppListItem) */
  public void setSelectedItem(comctl32.IListItem11 ppListItem);

  // setSelectedItem UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setSelectedItem(comctl32.IListItem11 ppListItem);

  /** @com.method(vtoffset=34, dispid=14, type=PROPGET, name="SmallIcons", name2="getSmallIcons", addFlagsVtable=4)
      @com.parameters([iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] return) */
  public Object getSmallIcons();

  /** @com.method(vtoffset=35, dispid=14, type=PROPPUTREF, name="SmallIcons", name2="putSmallIcons", addFlagsVtable=4)
      @com.parameters([in,iid=00020400-0000-0000-C000-000000000046,thread=AUTO,type=DISPATCH] ppImageList) */
  public void setSmallIcons(Object ppImageList);

  // setSmallIcons UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public void setSmallIcons(Object ppImageList);

  /** @com.method(vtoffset=37, dispid=15, type=PROPGET, name="Sorted", name2="getSorted", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSorted();

  /** @com.method(vtoffset=38, dispid=15, type=PROPPUT, name="Sorted", name2="putSorted", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfOn) */
  public void setSorted(boolean pfOn);

  /** @com.method(vtoffset=39, dispid=16, type=PROPGET, name="SortKey", name2="getSortKey", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getSortKey();

  /** @com.method(vtoffset=40, dispid=16, type=PROPPUT, name="SortKey", name2="putSortKey", addFlagsVtable=4)
      @com.parameters([in,type=I2] psKey) */
  public void setSortKey(short psKey);

  /** @com.method(vtoffset=41, dispid=17, type=PROPGET, name="SortOrder", name2="getSortOrder", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getSortOrder();

  /** @com.method(vtoffset=42, dispid=17, type=PROPPUT, name="SortOrder", name2="putSortOrder", addFlagsVtable=4)
      @com.parameters([in,type=I4] pOrder) */
  public void setSortOrder(int pOrder);

  /** @com.method(vtoffset=43, dispid=18, type=PROPGET, name="View", name2="getView", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getView();

  /** @com.method(vtoffset=44, dispid=18, type=PROPPUT, name="View", name2="putView", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnView) */
  public void setView(int pnView);

  /** @com.method(vtoffset=45, dispid=1550, type=PROPGET, name="OLEDragMode", name2="getOLEDragMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getOLEDragMode();

  /** @com.method(vtoffset=46, dispid=1550, type=PROPPUT, name="OLEDragMode", name2="putOLEDragMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDragMode) */
  public void setOLEDragMode(int psOLEDragMode);

  /** @com.method(vtoffset=47, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getOLEDropMode();

  /** @com.method(vtoffset=48, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=49, dispid=4294966776, type=PROPGET, name="Appearance", name2="getAppearance", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getAppearance();

  /** @com.method(vtoffset=50, dispid=4294966776, type=PROPPUT, name="Appearance", name2="putAppearance", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnAppearance) */
  public void setAppearance(int pnAppearance);

  /** @com.method(vtoffset=51, dispid=4294966795, type=PROPGET, name="BackColor", name2="getBackColor", addFlagsVtable=4)
      @com.parameters([type=U4] return) */
  public int getBackColor();

  /** @com.method(vtoffset=52, dispid=4294966795, type=PROPPUT, name="BackColor", name2="putBackColor", addFlagsVtable=4)
      @com.parameters([in,type=U4] pcrBack) */
  public void setBackColor(int pcrBack);

  /** @com.method(vtoffset=53, dispid=4294966792, type=PROPGET, name="BorderStyle", name2="getBorderStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getBorderStyle();

  /** @com.method(vtoffset=54, dispid=4294966792, type=PROPPUT, name="BorderStyle", name2="putBorderStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] pnStyle) */
  public void setBorderStyle(int pnStyle);

  /** @com.method(vtoffset=55, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getEnabled();

  /** @com.method(vtoffset=56, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] pfEnabled) */
  public void setEnabled(boolean pfEnabled);

  /** @com.method(vtoffset=57, dispid=4294966784, type=PROPGET, name="Font", name2="getFont", addFlagsVtable=4)
      @com.parameters([iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public com.ms.wfc.ax.IFontDisp getFont();

  /** @com.method(vtoffset=58, dispid=4294966784, type=PROPPUTREF, name="Font", name2="putFont", addFlagsVtable=4)
      @com.parameters([in,iid=BEF6E003-A874-101A-8BBA-00AA00300CAB,thread=AUTO,type=DISPATCH] ppFontDisp) */
  public void setFont(com.ms.wfc.ax.IFontDisp ppFontDisp);

  /** @com.method(vtoffset=59, dispid=4294966783, type=PROPGET, name="ForeColor", name2="getForeColor", addFlagsVtable=4)
      @com.parameters([type=U4] return) */
  public int getForeColor();

  /** @com.method(vtoffset=60, dispid=4294966783, type=PROPPUT, name="ForeColor", name2="putForeColor", addFlagsVtable=4)
      @com.parameters([in,type=U4] pcrFore) */
  public void setForeColor(int pcrFore);

  /** @com.method(vtoffset=61, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getHWnd();

  /** @com.method(vtoffset=62, dispid=4294966781, type=PROPPUT, name="hWnd", name2="puthWnd", addFlagsVtable=4)
      @com.parameters([in,type=I4] phWnd) */
  public void setHWnd(int phWnd);

  /** @com.method(vtoffset=63, dispid=19, type=METHOD, name="FindItem", addFlagsVtable=4)
      @com.parameters([in,type=STRING] sz, [in,elementType=VARIANT,type=PTR] Where, [in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] fPartial, [iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IListItem11 FindItem(String sz, Variant Where, Variant Index, Variant fPartial);

  /** @com.method(vtoffset=64, dispid=20, type=METHOD, name="GetFirstVisible", addFlagsVtable=4)
      @com.parameters([iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IListItem11 GetFirstVisible();

  /** @com.method(vtoffset=65, dispid=21, type=METHOD, name="HitTest", addFlagsVtable=4)
      @com.parameters([in,type=R4] x, [in,type=R4] y, [iid=BF877892-E026-11CF-8E74-00A0C90F26F8,thread=AUTO,type=DISPATCH] return) */
  public comctl32.IListItem11 HitTest(float x, float y);

  /** @com.method(vtoffset=66, dispid=22, type=METHOD, name="StartLabelEdit", addFlagsVtable=4)
      @com.parameters() */
  public void StartLabelEdit();

  /** @com.method(vtoffset=67, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public void OLEDrag();

  /** @com.method(vtoffset=68, dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(vtoffset=69, dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e82, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);
}
