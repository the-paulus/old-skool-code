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

package comctl32.TabStrip;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

// Dispatch-only interface TabStripEventMulticaster
class TabStripEventMulticaster implements comctl32.ITabStripEvents, com.ms.com.NoAutoScripting, com.ms.com.NoAutoMarshaling
{
  comctl32.TabStrip.TabStrip _jcom_parent;

  TabStripEventMulticaster( comctl32.TabStrip.TabStrip _jcom_parent )
  {
     this._jcom_parent = _jcom_parent;
  }

  public void Click()
  {
     _jcom_parent.fireOnClick();
  }


  public void KeyDown(short[] KeyCode, short Shift)
  {
     _jcom_parent.fireOnKeyDown(KeyCode, Shift);
  }


  public void KeyPress(short[] KeyAscii)
  {
     _jcom_parent.fireOnKeyPress(KeyAscii);
  }


  public void KeyUp(short[] KeyCode, short Shift)
  {
     _jcom_parent.fireOnKeyUp(KeyCode, Shift);
  }


  public void MouseDown(short Button, short Shift, int x, int y)
  {
     _jcom_parent.fireOnMouseDown(Button, Shift, x, y);
  }


  public void MouseMove(short Button, short Shift, int x, int y)
  {
     _jcom_parent.fireOnMouseMove(Button, Shift, x, y);
  }


  public void MouseUp(short Button, short Shift, int x, int y)
  {
     _jcom_parent.fireOnMouseUp(Button, Shift, x, y);
  }


  public void BeforeClick(short[] Cancel)
  {
     if( _jcom_parent.onBeforeClick != null) {
        _jcom_parent.onBeforeClick.invoke( _jcom_parent, new comctl32.TabStrip.BeforeClickEvent( Cancel ) );
     }
  }


  public void OLEStartDrag(comctl32.DataObject[] Data, int[] AllowedEffects)
  {
     if( _jcom_parent.onOLEStartDrag != null) {
        _jcom_parent.onOLEStartDrag.invoke( _jcom_parent, new comctl32.TabStrip.OLEStartDragEvent( Data, AllowedEffects ) );
     }
  }


  public void OLEGiveFeedback(int[] Effect, boolean[] DefaultCursors)
  {
     if( _jcom_parent.onOLEGiveFeedback != null) {
        _jcom_parent.onOLEGiveFeedback.invoke( _jcom_parent, new comctl32.TabStrip.OLEGiveFeedbackEvent( Effect, DefaultCursors ) );
     }
  }


  public void OLESetData(comctl32.DataObject[] Data, short[] DataFormat)
  {
     if( _jcom_parent.onOLESetData != null) {
        _jcom_parent.onOLESetData.invoke( _jcom_parent, new comctl32.TabStrip.OLESetDataEvent( Data, DataFormat ) );
     }
  }


  public void OLECompleteDrag(int[] Effect)
  {
     if( _jcom_parent.onOLECompleteDrag != null) {
        _jcom_parent.onOLECompleteDrag.invoke( _jcom_parent, new comctl32.TabStrip.OLECompleteDragEvent( Effect ) );
     }
  }


  public void OLEDragOver(comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y, short[] State)
  {
     if( _jcom_parent.onOLEDragOver != null) {
        _jcom_parent.onOLEDragOver.invoke( _jcom_parent, new comctl32.TabStrip.OLEDragOverEvent( Data, Effect, Button, Shift, x, y, State ) );
     }
  }


  public void OLEDragDrop(comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y)
  {
     if( _jcom_parent.onOLEDragDrop != null) {
        _jcom_parent.onOLEDragDrop.invoke( _jcom_parent, new comctl32.TabStrip.OLEDragDropEvent( Data, Effect, Button, Shift, x, y ) );
     }
  }


}
