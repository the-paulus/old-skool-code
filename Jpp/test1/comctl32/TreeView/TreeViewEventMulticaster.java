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

package comctl32.TreeView;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

// Dispatch-only interface TreeViewEventMulticaster
class TreeViewEventMulticaster implements comctl32.ITreeViewEvents, com.ms.com.NoAutoScripting, com.ms.com.NoAutoMarshaling
{
  comctl32.TreeView.TreeView _jcom_parent;

  TreeViewEventMulticaster( comctl32.TreeView.TreeView _jcom_parent )
  {
     this._jcom_parent = _jcom_parent;
  }

  public void BeforeLabelEdit(short[] Cancel)
  {
     if( _jcom_parent.onBeforeLabelEdit != null) {
        _jcom_parent.onBeforeLabelEdit.invoke( _jcom_parent, new comctl32.TreeView.BeforeLabelEditEvent( Cancel ) );
     }
  }


  public void AfterLabelEdit(short[] Cancel, String[] NewString)
  {
     if( _jcom_parent.onAfterLabelEdit != null) {
        _jcom_parent.onAfterLabelEdit.invoke( _jcom_parent, new comctl32.TreeView.AfterLabelEditEvent( Cancel, NewString ) );
     }
  }


  public void Collapse(comctl32.Node Node)
  {
     if( _jcom_parent.onCollapse != null) {
        _jcom_parent.onCollapse.invoke( _jcom_parent, new comctl32.TreeView.CollapseEvent( Node ) );
     }
  }


  public void Expand(comctl32.Node Node)
  {
     if( _jcom_parent.onExpand != null) {
        _jcom_parent.onExpand.invoke( _jcom_parent, new comctl32.TreeView.ExpandEvent( Node ) );
     }
  }


  public void NodeClick(comctl32.Node Node)
  {
     if( _jcom_parent.onNodeClick != null) {
        _jcom_parent.onNodeClick.invoke( _jcom_parent, new comctl32.TreeView.NodeClickEvent( Node ) );
     }
  }


  public void KeyDown(short[] KeyCode, short Shift)
  {
     _jcom_parent.fireOnKeyDown(KeyCode, Shift);
  }


  public void KeyUp(short[] KeyCode, short Shift)
  {
     _jcom_parent.fireOnKeyUp(KeyCode, Shift);
  }


  public void KeyPress(short[] KeyAscii)
  {
     _jcom_parent.fireOnKeyPress(KeyAscii);
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


  public void Click()
  {
     _jcom_parent.fireOnClick();
  }


  public void DblClick()
  {
     _jcom_parent.fireOnDblClick();
  }


  public void OLEStartDrag(comctl32.DataObject[] Data, int[] AllowedEffects)
  {
     if( _jcom_parent.onOLEStartDrag != null) {
        _jcom_parent.onOLEStartDrag.invoke( _jcom_parent, new comctl32.TreeView.OLEStartDragEvent( Data, AllowedEffects ) );
     }
  }


  public void OLEGiveFeedback(int[] Effect, boolean[] DefaultCursors)
  {
     if( _jcom_parent.onOLEGiveFeedback != null) {
        _jcom_parent.onOLEGiveFeedback.invoke( _jcom_parent, new comctl32.TreeView.OLEGiveFeedbackEvent( Effect, DefaultCursors ) );
     }
  }


  public void OLESetData(comctl32.DataObject[] Data, short[] DataFormat)
  {
     if( _jcom_parent.onOLESetData != null) {
        _jcom_parent.onOLESetData.invoke( _jcom_parent, new comctl32.TreeView.OLESetDataEvent( Data, DataFormat ) );
     }
  }


  public void OLECompleteDrag(int[] Effect)
  {
     if( _jcom_parent.onOLECompleteDrag != null) {
        _jcom_parent.onOLECompleteDrag.invoke( _jcom_parent, new comctl32.TreeView.OLECompleteDragEvent( Effect ) );
     }
  }


  public void OLEDragOver(comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y, short[] State)
  {
     if( _jcom_parent.onOLEDragOver != null) {
        _jcom_parent.onOLEDragOver.invoke( _jcom_parent, new comctl32.TreeView.OLEDragOverEvent( Data, Effect, Button, Shift, x, y, State ) );
     }
  }


  public void OLEDragDrop(comctl32.DataObject[] Data, int[] Effect, short[] Button, short[] Shift, float[] x, float[] y)
  {
     if( _jcom_parent.onOLEDragDrop != null) {
        _jcom_parent.onOLEDragDrop.invoke( _jcom_parent, new comctl32.TreeView.OLEDragDropEvent( Data, Effect, Button, Shift, x, y ) );
     }
  }


}
