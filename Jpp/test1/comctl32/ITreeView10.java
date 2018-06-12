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

// Dispatch-only interface ITreeView10
/** @com.interface(iid=0713E8A3-850A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface ITreeView10 extends IUnknown
{

  /** @com.method(dispid=1, name="DropHighlight", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.Node getDropHighlight();


  /** @com.method(dispid=1, name="DropHighlight", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setDropHighlight(comctl32.Node newValue);


  /** @com.method(dispid=2, name="HideSelection", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getHideSelection();


  /** @com.method(dispid=2, name="HideSelection", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setHideSelection(boolean newValue);


  /** @com.method(dispid=3, name="ImageList", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public comctl32.IImageList10 getImageList();


  /** @com.method(dispid=3, name="ImageList", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setImageList(comctl32.IImageList10 newValue);


  /** @com.method(dispid=4, name="Indentation", type=PROPGET)
      @com.parameters([type=R4] return) */
  public float getIndentation();


  /** @com.method(dispid=4, name="Indentation", type=PROPPUT)
      @com.parameters([in,type=R4] newValue) */
  public void setIndentation(float newValue);


  /** @com.method(dispid=5, name="LabelEdit", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getLabelEdit();


  /** @com.method(dispid=5, name="LabelEdit", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setLabelEdit(int newValue);


  /** @com.method(dispid=6, name="LineStyle", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getLineStyle();


  /** @com.method(dispid=6, name="LineStyle", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setLineStyle(int newValue);


  /** @com.method(dispid=7, name="MousePointer", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getMousePointer();


  /** @com.method(dispid=7, name="MousePointer", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setMousePointer(int newValue);


  /** @com.method(dispid=8, name="MouseIcon", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IPictureDisp getMouseIcon();


  /** @com.method(dispid=8, name="MouseIcon", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setMouseIcon(com.ms.wfc.ax.IPictureDisp newValue);


  /** @com.method(dispid=9, name="Nodes", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.Nodes getNodes();


  /** @com.method(dispid=9, name="Nodes", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setNodes(comctl32.Nodes newValue);


  /** @com.method(dispid=10, name="PathSeparator", type=PROPGET)
      @com.parameters([type=STRING] return) */
  public String getPathSeparator();


  /** @com.method(dispid=10, name="PathSeparator", type=PROPPUT)
      @com.parameters([in,type=STRING] newValue) */
  public void setPathSeparator(String newValue);


  /** @com.method(dispid=11, name="SelectedItem", type=PROPGET)
      @com.parameters([type=OBJECT] return) */
  public comctl32.Node getSelectedItem();


  /** @com.method(dispid=11, name="SelectedItem", type=PROPPUTREF)
      @com.parameters([in,type=OBJECT] newValue) */
  public void setSelectedItem(comctl32.Node newValue);


  /** @com.method(dispid=12, name="Sorted", type=PROPGET)
      @com.parameters([type=BOOLEAN] return) */
  public boolean getSorted();


  /** @com.method(dispid=12, name="Sorted", type=PROPPUT)
      @com.parameters([in,type=BOOLEAN] newValue) */
  public void setSorted(boolean newValue);


  /** @com.method(dispid=13, name="Style", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getStyle();


  /** @com.method(dispid=13, name="Style", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setStyle(int newValue);


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


  /** @com.method(dispid=4294966784, name="Font", type=PROPGET)
      @com.parameters([type=DISPATCH] return) */
  public com.ms.wfc.ax.IFontDisp getFont();


  /** @com.method(dispid=4294966784, name="Font", type=PROPPUTREF)
      @com.parameters([in,type=DISPATCH] newValue) */
  public void setFont(com.ms.wfc.ax.IFontDisp newValue);


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPGET)
      @com.parameters([type=I4] return) */
  public int getHWnd();


  /** @com.method(dispid=4294966781, name="hWnd", type=PROPPUT)
      @com.parameters([in,type=I4] newValue) */
  public void setHWnd(int newValue);

  /** @com.method(dispid=14, type=METHOD, name="HitTest", returntype=VOID)
      @com.parameters([in,type=R4] x, [in,type=R4] y, [type=OBJECT] return) */
  public comctl32.Node HitTest(float x, float y);

  /** @com.method(dispid=15, type=METHOD, name="GetVisibleCount", returntype=VOID)
      @com.parameters([type=I4] return) */
  public int GetVisibleCount();

  /** @com.method(dispid=16, type=METHOD, name="StartLabelEdit", returntype=VOID)
      @com.parameters() */
  public void StartLabelEdit();

  /** @com.method(dispid=4294966746, type=METHOD, name="Refresh", returntype=VOID)
      @com.parameters() */
  public void Refresh();

  /** @com.method(dispid=4294966744, type=METHOD, name="AboutBox", returntype=VOID)
      @com.parameters()
      @hidden */
  public void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x713e8a3, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
