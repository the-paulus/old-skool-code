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

// Dispatch-only interface IListView10
/** @com.interface(iid=58DA8D8B-9D6A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface IListView10 extends IUnknown
{

  /** @com.method(dispid=1, name="Arrange", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getArrange();


  /** @com.method(dispid=1, name="Arrange", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setArrange(int newValue);


  /** @com.method(dispid=2, name="ColumnHeaders", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.ColumnHeaders getColumnHeaders();


  /** @com.method(dispid=2, name="ColumnHeaders", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setColumnHeaders(comctl32.ColumnHeaders newValue);


  /** @com.method(dispid=3, name="DropHighlight", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.ListItem getDropHighlight();


  /** @com.method(dispid=3, name="DropHighlight", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setDropHighlight(comctl32.ListItem newValue);


  /** @com.method(dispid=4, name="HideColumnHeaders", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getHideColumnHeaders();


  /** @com.method(dispid=4, name="HideColumnHeaders", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setHideColumnHeaders(boolean newValue);


  /** @com.method(dispid=5, name="HideSelection", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getHideSelection();


  /** @com.method(dispid=5, name="HideSelection", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setHideSelection(boolean newValue);


  /** @com.method(dispid=6, name="Icons", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public comctl32.IImageList getIcons();


  /** @com.method(dispid=6, name="Icons", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setIcons(comctl32.IImageList newValue);


  /** @com.method(dispid=7, name="ListItems", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.ListItems getListItems();


  /** @com.method(dispid=7, name="ListItems", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setListItems(comctl32.ListItems newValue);


  /** @com.method(dispid=8, name="LabelEdit", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getLabelEdit();


  /** @com.method(dispid=8, name="LabelEdit", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setLabelEdit(int newValue);


  /** @com.method(dispid=9, name="LabelWrap", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getLabelWrap();


  /** @com.method(dispid=9, name="LabelWrap", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setLabelWrap(boolean newValue);


  /** @com.method(dispid=10, name="MouseIcon", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();


  /** @com.method(dispid=10, name="MouseIcon", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp newValue);


  /** @com.method(dispid=11, name="MousePointer", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMousePointer();


  /** @com.method(dispid=11, name="MousePointer", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMousePointer(int newValue);


  /** @com.method(dispid=12, name="MultiSelect", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getMultiSelect();


  /** @com.method(dispid=12, name="MultiSelect", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setMultiSelect(boolean newValue);


  /** @com.method(dispid=13, name="SelectedItem", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.ListItem getSelectedItem();


  /** @com.method(dispid=13, name="SelectedItem", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setSelectedItem(comctl32.ListItem newValue);


  /** @com.method(dispid=14, name="SmallIcons", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public comctl32.IImageList getSmallIcons();


  /** @com.method(dispid=14, name="SmallIcons", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setSmallIcons(comctl32.IImageList newValue);


  /** @com.method(dispid=15, name="Sorted", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSorted();


  /** @com.method(dispid=15, name="Sorted", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setSorted(boolean newValue);


  /** @com.method(dispid=16, name="SortKey", type=PROPGET)
      @com.parameters([type=I2] return) */
  public short getSortKey();


  /** @com.method(dispid=16, name="SortKey", type=PROPPUT)
      @com.parameters([in,type=I2] newValue) */
  public void setSortKey(short newValue);


  /** @com.method(dispid=17, name="SortOrder", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getSortOrder();


  /** @com.method(dispid=17, name="SortOrder", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setSortOrder(int newValue);


  /** @com.method(dispid=18, name="View", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getView();


  /** @com.method(dispid=18, name="View", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setView(int newValue);


  /** @com.method(dispid=4294966776, name="Appearance", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getAppearance();


  /** @com.method(dispid=4294966776, name="Appearance", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setAppearance(int newValue);


  /** @com.method(dispid=4294966795, name="BackColor", type=PROPGET)
      @com.parameters([type=U4] return) */
  public int getBackColor();


  /** @com.method(dispid=4294966795, name="BackColor", type=PROPPUT)
      @com.parameters([in,type=U4] newValue) */
  public void setBackColor(int newValue);


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


  /** @com.method(dispid=4294966784, name="Font", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IFontDisp getFont();


  /** @com.method(dispid=4294966784, name="Font", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setFont(com.ms.wfc.ax.IFontDisp newValue);


  /** @com.method(dispid=4294966783, name="ForeColor", type=PROPGET)
      @com.parameters([type=U4] return) */
  public int getForeColor();


  /** @com.method(dispid=4294966783, name="ForeColor", type=PROPPUT)
      @com.parameters([in,type=U4] newValue) */
  public void setForeColor(int newValue);


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getHWnd();


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setHWnd(int newValue);

  /** @com.method(dispid=19, type=METHOD, name="FindItem", returntype=VOID)
      @com.parameters([in,type=STRING] sz, [in,elementType=VARIANT,type=PTR] Where, [in,elementType=VARIANT,type=PTR] Index, [in,elementType=VARIANT,type=PTR] fPartial, [type=OBJECT] return) */
  public comctl32.ListItem FindItem(String sz, Variant Where, Variant Index, Variant fPartial);

  /** @com.method(dispid=20, type=METHOD, name="GetFirstVisible", returntype=VOID)
      @com.parameters([type=OBJECT] return) */
  public comctl32.ListItem GetFirstVisible();

  /** @com.method(dispid=21, type=METHOD, name="HitTest", returntype=VOID)
      @com.parameters([in,type=R4] x, [in,type=R4] y, [type=OBJECT] return) */
  public comctl32.ListItem HitTest(float x, float y);

  /** @com.method(dispid=22, type=METHOD, name="StartLabelEdit", returntype=VOID)
      @com.parameters() */
  public void StartLabelEdit();

  /** @com.method(dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x58da8d8b, (short)0x9d6a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
