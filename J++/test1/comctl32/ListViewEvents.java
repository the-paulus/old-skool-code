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

// Dispatch-only interface ListViewEvents
/** @com.interface(iid=58DA8D8C-9D6A-101B-AFC0-4210102A8DA7, thread=AUTO, type=DISPATCH) */
public interface ListViewEvents extends IUnknown
{
  /** @com.method(dispid=1, type=METHOD, name="BeforeLabelEdit", returntype=VOID)
      @com.parameters([in,elementType=I2,type=ARRAY] Cancel) */
  public void BeforeLabelEdit(short[] Cancel);

  /** @com.method(dispid=2, type=METHOD, name="AfterLabelEdit", returntype=VOID)
      @com.parameters([in,elementType=I2,type=ARRAY] Cancel, [in,elementType=STRING,type=ARRAY] NewString) */
  public void AfterLabelEdit(short[] Cancel, String[] NewString);

  /** @com.method(dispid=3, type=METHOD, name="ColumnClick", returntype=VOID)
      @com.parameters([in,type=OBJECT] ColumnHeader) */
  public void ColumnClick(comctl32.ColumnHeader ColumnHeader);

  /** @com.method(dispid=4, type=METHOD, name="ItemClick", returntype=VOID)
      @com.parameters([in,type=OBJECT] Item) */
  public void ItemClick(comctl32.ListItem Item);

  /** @com.method(dispid=4294966694, type=METHOD, name="KeyDown", returntype=VOID)
      @com.parameters([in,elementType=I2,type=ARRAY] KeyCode, [in,type=I2] Shift) */
  public void KeyDown(short[] KeyCode, short Shift);

  /** @com.method(dispid=4294966692, type=METHOD, name="KeyUp", returntype=VOID)
      @com.parameters([in,elementType=I2,type=ARRAY] KeyCode, [in,type=I2] Shift) */
  public void KeyUp(short[] KeyCode, short Shift);

  /** @com.method(dispid=4294966693, type=METHOD, name="KeyPress", returntype=VOID)
      @com.parameters([in,elementType=I2,type=ARRAY] KeyAscii) */
  public void KeyPress(short[] KeyAscii);

  /** @com.method(dispid=4294966691, type=METHOD, name="MouseDown", returntype=VOID)
      @com.parameters([in,type=I2] Button, [in,type=I2] Shift, [in,type=I4] x, [in,type=I4] y) */
  public void MouseDown(short Button, short Shift, int x, int y);

  /** @com.method(dispid=4294966690, type=METHOD, name="MouseMove", returntype=VOID)
      @com.parameters([in,type=I2] Button, [in,type=I2] Shift, [in,type=I4] x, [in,type=I4] y) */
  public void MouseMove(short Button, short Shift, int x, int y);

  /** @com.method(dispid=4294966689, type=METHOD, name="MouseUp", returntype=VOID)
      @com.parameters([in,type=I2] Button, [in,type=I2] Shift, [in,type=I4] x, [in,type=I4] y) */
  public void MouseUp(short Button, short Shift, int x, int y);

  /** @com.method(dispid=4294966696, type=METHOD, name="Click", returntype=VOID)
      @com.parameters() */
  public void Click();

  /** @com.method(dispid=4294966695, type=METHOD, name="DblClick", returntype=VOID)
      @com.parameters() */
  public void DblClick();

  /** @com.method(dispid=1550, type=METHOD, name="OLEStartDrag", returntype=VOID)
      @com.parameters([in,out,elementType=OBJECT,type=ARRAY] Data, [in,out,elementType=I4,type=ARRAY] AllowedEffects) */
  public void OLEStartDrag(comctl32.DataObject[] Data, int[] AllowedEffects);

  /** @com.method(dispid=1551, type=METHOD, name="OLEGiveFeedback", returntype=VOID)
      @com.parameters([in,out,elementType=I4,type=ARRAY] Effect, [in,out,elementType=BOOLEAN,type=ARRAY] DefaultCursors) */
  public void OLEGiveFeedback(int[] Effect, boolean[] DefaultCursors);

  /** @com.method(dispid=1552, type=METHOD, name="OLESetData", returntype=VOID)
      @com.parameters([in,out,elementType=OBJECT,type=ARRAY] Data, [in,out,elementType=I2,type=ARRAY] DataFormat) */
  public void OLESetData(comctl32.DataObject[] Data, short[] DataFormat);

  /** @com.method(dispid=1553, type=METHOD, name="OLECompleteDrag", returntype=VOID)
      @com.parameters([in,out,elementType=I4,type=ARRAY] Effect) */
  public void OLECompleteDrag(int[] Effect);

  /** @com.method(dispid=1554, type=METHOD, name="OLEDragOver", returntype=VOID)
      @com.parameters([in,out,elementType=OBJECT,type=ARRAY] Data, [in,out,elementType=I4,type=ARRAY] Effect, [in,out,elementType=I2,type=ARRAY] Button, [in,out,elementType=I2,type=ARRAY] Shift, [in,out,elementType=R4,type=ARRAY] x, [in,out,elementType=R4,type=ARRAY] y, [in,out,elementType=I2,type=ARRAY] State) */
  public void OLEDragOver(comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y, short[] State);

  /** @com.method(dispid=1555, type=METHOD, name="OLEDragDrop", returntype=VOID)
      @com.parameters([in,out,elementType=OBJECT,type=ARRAY] Data, [in,out,elementType=I4,type=ARRAY] Effect, [in,out,elementType=I2,type=ARRAY] Button, [in,out,elementType=I2,type=ARRAY] Shift, [in,out,elementType=R4,type=ARRAY] x, [in,out,elementType=R4,type=ARRAY] y) */
  public void OLEDragDrop(comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x58da8d8c, (short)0x9d6a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
