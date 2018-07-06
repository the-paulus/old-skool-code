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

public class TreeView extends com.ms.wfc.ui.AxHost
{
  private comctl32.ITreeView _jcommem_ocx;
  private comctl32.TreeView.TreeViewEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  comctl32.TreeView.BeforeLabelEditHandler onBeforeLabelEdit;
  comctl32.TreeView.AfterLabelEditHandler onAfterLabelEdit;
  comctl32.TreeView.CollapseHandler onCollapse;
  comctl32.TreeView.ExpandHandler onExpand;
  comctl32.TreeView.NodeClickHandler onNodeClick;
  comctl32.TreeView.OLEStartDragHandler onOLEStartDrag;
  comctl32.TreeView.OLEGiveFeedbackHandler onOLEGiveFeedback;
  comctl32.TreeView.OLESetDataHandler onOLESetData;
  comctl32.TreeView.OLECompleteDragHandler onOLECompleteDrag;
  comctl32.TreeView.OLEDragOverHandler onOLEDragOver;
  comctl32.TreeView.OLEDragDropHandler onOLEDragDrop;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public TreeView()
  {
     super( "{0713E8A2-850A-101B-AFC0-4210102A8DA7}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.ITreeViewEvents.class);
     }
     catch( Throwable _jcom_t )
     {
     }
  }

  protected synchronized void detachSink()
  {
     try
     {
        _jcommem_cookie1.disconnect();
        _jcommem_cookie1 = null;
     }
     catch( Throwable _jcom_t )
     {
     }
  }

  protected synchronized void attachInterfaces()
  {
     try
     {
        _jcommem_ocx = (comctl32.ITreeView)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.TreeView.TreeViewEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  public synchronized comctl32.INode getDropHighlight()  {
     return _jcommem_ocx.getDropHighlight();
  }


  public synchronized void setDropHighlight(comctl32.INode ppNode)  {
     _jcommem_ocx.setDropHighlight(ppNode);
  }


  public synchronized void setDropHighlight(Variant ppNode)  {
     _jcommem_ocx.setDropHighlight(ppNode);
  }


  public synchronized boolean getHideSelection()  {
     return _jcommem_ocx.getHideSelection();
  }


  public synchronized void setHideSelection(boolean pbHideSelection)  {
     _jcommem_ocx.setHideSelection(pbHideSelection);
  }


  public synchronized Object getImageList()  {
     return _jcommem_ocx.getImageList();
  }


  public synchronized void setImageList(Object ppImageList)  {
     _jcommem_ocx.setImageList(ppImageList);
  }


  // setImageList UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setImageList(Object ppImageList)

  public synchronized float getIndentation()  {
     return _jcommem_ocx.getIndentation();
  }


  public synchronized void setIndentation(float pfIndentation)  {
     _jcommem_ocx.setIndentation(pfIndentation);
  }


  public synchronized int getLabelEdit()  {
     return _jcommem_ocx.getLabelEdit();
  }


  public synchronized void setLabelEdit(int psLabelEdit)  {
     _jcommem_ocx.setLabelEdit(psLabelEdit);
  }


  public synchronized int getLineStyle()  {
     return _jcommem_ocx.getLineStyle();
  }


  public synchronized void setLineStyle(int psLineStyle)  {
     _jcommem_ocx.setLineStyle(psLineStyle);
  }


  public synchronized int getMousePointer()  {
     return _jcommem_ocx.getMousePointer();
  }


  public synchronized void setMousePointer(int psMousePointer)  {
     _jcommem_ocx.setMousePointer(psMousePointer);
  }


  public synchronized com.ms.wfc.ui.Image getMouseIcon()  {
     return com.ms.wfc.ui.AxHost.getPictureFromIPictureDisp(_jcommem_ocx.getMouseIcon());
  }


  public synchronized void setMouseIcon(com.ms.wfc.ui.Image ppMouseIcon)  {
     _jcommem_ocx.setMouseIcon(com.ms.wfc.ui.AxHost.getIPictureDispFromPicture( ppMouseIcon ));
  }


  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setMouseIcon(com.ms.wfc.ui.Image ppMouseIcon)

  public synchronized comctl32.INodes getNodes()  {
     return _jcommem_ocx.getNodes();
  }


  public synchronized void setNodes(comctl32.INodes ppNode)  {
     _jcommem_ocx.setNodes(ppNode);
  }


  public synchronized String getPathSeparator()  {
     return _jcommem_ocx.getPathSeparator();
  }


  public synchronized void setPathSeparator(String pbstrPathSeparator)  {
     _jcommem_ocx.setPathSeparator(pbstrPathSeparator);
  }


  public synchronized comctl32.INode getSelectedItem()  {
     return _jcommem_ocx.getSelectedItem();
  }


  public synchronized void setSelectedItem(comctl32.INode ppNode)  {
     _jcommem_ocx.setSelectedItem(ppNode);
  }


  public synchronized void setSelectedItem(Variant ppNode)  {
     _jcommem_ocx.setSelectedItem(ppNode);
  }


  public synchronized boolean getSorted()  {
     return _jcommem_ocx.getSorted();
  }


  public synchronized void setSorted(boolean pbSorted)  {
     _jcommem_ocx.setSorted(pbSorted);
  }


  public synchronized int getStyle()  {
     return _jcommem_ocx.getStyle();
  }


  public synchronized void setStyle(int psStyle)  {
     _jcommem_ocx.setStyle(psStyle);
  }


  public synchronized int getOLEDragMode()  {
     return _jcommem_ocx.getOLEDragMode();
  }


  public synchronized void setOLEDragMode(int psOLEDragMode)  {
     _jcommem_ocx.setOLEDragMode(psOLEDragMode);
  }


  public synchronized int getOLEDropMode()  {
     return _jcommem_ocx.getOLEDropMode();
  }


  public synchronized void setOLEDropMode(int psOLEDropMode)  {
     _jcommem_ocx.setOLEDropMode(psOLEDropMode);
  }


  public synchronized int getAppearance()  {
     return _jcommem_ocx.getAppearance();
  }


  public synchronized void setAppearance(int psAppearance)  {
     _jcommem_ocx.setAppearance(psAppearance);
  }


  public synchronized int getBorderStyle()  {
     return _jcommem_ocx.getBorderStyle();
  }


  public synchronized void setBorderStyle(int psBorderStyle)  {
     _jcommem_ocx.setBorderStyle(psBorderStyle);
  }


  public synchronized boolean getEnabled()  {
     return _jcommem_ocx.getEnabled();
  }


  public synchronized void setEnabled(boolean pbEnabled)  {
     _jcommem_ocx.setEnabled(pbEnabled);
  }


  public synchronized com.ms.wfc.ui.Font getFont()  {
     return com.ms.wfc.ui.AxHost.getFontFromIFontDisp(_jcommem_ocx.getFont());
  }


  public synchronized void setFont(com.ms.wfc.ui.Font ppFont)  {
     _jcommem_ocx.setFont(com.ms.wfc.ui.AxHost.getIFontDispFromFont( ppFont ));
  }


  // setFont UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setFont(com.ms.wfc.ui.Font ppFont)

  public synchronized int getHWnd()  {
     return _jcommem_ocx.getHWnd();
  }


  public synchronized void setHWnd(int phWnd)  {
     _jcommem_ocx.setHWnd(phWnd);
  }


  public synchronized comctl32.INode HitTest(float x, float y)  {
     return _jcommem_ocx.HitTest(x, y);
  }


  public synchronized int GetVisibleCount()  {
     return _jcommem_ocx.GetVisibleCount();
  }


  public synchronized void StartLabelEdit()  {
     _jcommem_ocx.StartLabelEdit();
  }


  public synchronized void Refresh()  {
     _jcommem_ocx.Refresh();
  }


  /** @hidden */
  public synchronized void AboutBox()  {
     _jcommem_ocx.AboutBox();
  }


  public synchronized void OLEDrag()  {
     _jcommem_ocx.OLEDrag();
  }



  //------------------------------------------------------------------------
  // These methods add and remove event handlers.
  //------------------------------------------------------------------------

  public synchronized void addOnBeforeLabelEdit( comctl32.TreeView.BeforeLabelEditHandler handler ) {
     onBeforeLabelEdit = (comctl32.TreeView.BeforeLabelEditHandler)com.ms.lang.Delegate.combine( onBeforeLabelEdit, handler );
  }

  public synchronized void removeOnBeforeLabelEdit( comctl32.TreeView.BeforeLabelEditHandler handler ) {
     onBeforeLabelEdit = (comctl32.TreeView.BeforeLabelEditHandler)com.ms.lang.Delegate.remove( onBeforeLabelEdit, handler );
  }

  public synchronized void addOnAfterLabelEdit( comctl32.TreeView.AfterLabelEditHandler handler ) {
     onAfterLabelEdit = (comctl32.TreeView.AfterLabelEditHandler)com.ms.lang.Delegate.combine( onAfterLabelEdit, handler );
  }

  public synchronized void removeOnAfterLabelEdit( comctl32.TreeView.AfterLabelEditHandler handler ) {
     onAfterLabelEdit = (comctl32.TreeView.AfterLabelEditHandler)com.ms.lang.Delegate.remove( onAfterLabelEdit, handler );
  }

  public synchronized void addOnCollapse( comctl32.TreeView.CollapseHandler handler ) {
     onCollapse = (comctl32.TreeView.CollapseHandler)com.ms.lang.Delegate.combine( onCollapse, handler );
  }

  public synchronized void removeOnCollapse( comctl32.TreeView.CollapseHandler handler ) {
     onCollapse = (comctl32.TreeView.CollapseHandler)com.ms.lang.Delegate.remove( onCollapse, handler );
  }

  public synchronized void addOnExpand( comctl32.TreeView.ExpandHandler handler ) {
     onExpand = (comctl32.TreeView.ExpandHandler)com.ms.lang.Delegate.combine( onExpand, handler );
  }

  public synchronized void removeOnExpand( comctl32.TreeView.ExpandHandler handler ) {
     onExpand = (comctl32.TreeView.ExpandHandler)com.ms.lang.Delegate.remove( onExpand, handler );
  }

  public synchronized void addOnNodeClick( comctl32.TreeView.NodeClickHandler handler ) {
     onNodeClick = (comctl32.TreeView.NodeClickHandler)com.ms.lang.Delegate.combine( onNodeClick, handler );
  }

  public synchronized void removeOnNodeClick( comctl32.TreeView.NodeClickHandler handler ) {
     onNodeClick = (comctl32.TreeView.NodeClickHandler)com.ms.lang.Delegate.remove( onNodeClick, handler );
  }

  public synchronized void addOnOLEStartDrag( comctl32.TreeView.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.TreeView.OLEStartDragHandler)com.ms.lang.Delegate.combine( onOLEStartDrag, handler );
  }

  public synchronized void removeOnOLEStartDrag( comctl32.TreeView.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.TreeView.OLEStartDragHandler)com.ms.lang.Delegate.remove( onOLEStartDrag, handler );
  }

  public synchronized void addOnOLEGiveFeedback( comctl32.TreeView.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.TreeView.OLEGiveFeedbackHandler)com.ms.lang.Delegate.combine( onOLEGiveFeedback, handler );
  }

  public synchronized void removeOnOLEGiveFeedback( comctl32.TreeView.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.TreeView.OLEGiveFeedbackHandler)com.ms.lang.Delegate.remove( onOLEGiveFeedback, handler );
  }

  public synchronized void addOnOLESetData( comctl32.TreeView.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.TreeView.OLESetDataHandler)com.ms.lang.Delegate.combine( onOLESetData, handler );
  }

  public synchronized void removeOnOLESetData( comctl32.TreeView.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.TreeView.OLESetDataHandler)com.ms.lang.Delegate.remove( onOLESetData, handler );
  }

  public synchronized void addOnOLECompleteDrag( comctl32.TreeView.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.TreeView.OLECompleteDragHandler)com.ms.lang.Delegate.combine( onOLECompleteDrag, handler );
  }

  public synchronized void removeOnOLECompleteDrag( comctl32.TreeView.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.TreeView.OLECompleteDragHandler)com.ms.lang.Delegate.remove( onOLECompleteDrag, handler );
  }

  public synchronized void addOnOLEDragOver( comctl32.TreeView.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.TreeView.OLEDragOverHandler)com.ms.lang.Delegate.combine( onOLEDragOver, handler );
  }

  public synchronized void removeOnOLEDragOver( comctl32.TreeView.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.TreeView.OLEDragOverHandler)com.ms.lang.Delegate.remove( onOLEDragOver, handler );
  }

  public synchronized void addOnOLEDragDrop( comctl32.TreeView.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.TreeView.OLEDragDropHandler)com.ms.lang.Delegate.combine( onOLEDragDrop, handler );
  }

  public synchronized void removeOnOLEDragDrop( comctl32.TreeView.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.TreeView.OLEDragDropHandler)com.ms.lang.Delegate.remove( onOLEDragDrop, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo HideSelectionPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "hideSelection", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Determines whether the selected item will display as selected when the TreeView loses focus" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003353F" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo IndentationPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "indentation", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the width of the indentation for a TreeView control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033541" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000004 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo LabelEditPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "labelEdit", comctl32.LabelEditConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines if a user can edit the label of a ListItem or Node object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033542" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000005 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo LineStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "lineStyle", comctl32.TreeLineStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the style of lines displayed between Node objects." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033543" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000006 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MousePointerPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "mousePointer", comctl32.MousePointerConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the type of mouse pointer displayed when over part of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033544" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000007 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MouseIconPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "mouseIcon", com.ms.wfc.ui.Image.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Sets a custom mouse icon." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033545" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000008 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo PathSeparatorPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "pathSeparator", String.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the delimiter string used for the path returned by the FullPath property." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033547" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000A ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SortedPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "sorted", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Indicates whether the elements of a control are automatically sorted alphabetically." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033549" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000C ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo StylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "style", comctl32.TreeStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Displays a hierarchical list of Node objects, each of which consists of a label and an optional bitmap." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003354A" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000D ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDragModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "OLEDragMode", comctl32.OLEDragConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drag/drop source, and whether this process is started automatically or under programmatic control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033691" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060E ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDropModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "OLEDropMode", comctl32.OLEDropConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drop target." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033692" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060F ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo AppearancePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "appearance", comctl32.AppearanceConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether or not controls, Forms or an MDIForm are painted at run time with 3-D effects." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003354B" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDF8 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo BorderStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "borderStyle", comctl32.BorderStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the border style for an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003354C" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE08 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo EnabledPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "enabled", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines whether a form or control can respond to user-generated events." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003354D" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFE ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo FontPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "font", com.ms.wfc.ui.Font.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a Font object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003354E" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE00 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hWndPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TreeView.TreeView.class, "hWnd", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to a form or control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003354F" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFD ) } );

     public static final com.ms.wfc.core.EventInfo BeforeLabelEditEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "beforeLabelEdit", comctl32.TreeView.BeforeLabelEditHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a user attempts to edit the label of the currently selected ListItem or Node object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033554" ) } );

     public static final com.ms.wfc.core.EventInfo AfterLabelEditEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "afterLabelEdit", comctl32.TreeView.AfterLabelEditHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs after a user edits the label of the currently selected Node or ListItem object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033555" ) } );

     public static final com.ms.wfc.core.EventInfo CollapseEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "collapse", comctl32.TreeView.CollapseHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Generated when any Node object in a TreeView control is collapsed." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033556" ) } );

     public static final com.ms.wfc.core.EventInfo ExpandEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "expand", comctl32.TreeView.ExpandHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a Node object in a TreeView control is expanded; that is, when its child nodes become visible." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033557" ) } );

     public static final com.ms.wfc.core.EventInfo NodeClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "nodeClick", comctl32.TreeView.NodeClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a Node object is clicked." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033558" ) } );

     public static final com.ms.wfc.core.EventInfo OLEStartDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "OLEStartDrag", comctl32.TreeView.OLEStartDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEStartDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CF" ) } );

     public static final com.ms.wfc.core.EventInfo OLEGiveFeedbackEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "OLEGiveFeedback", comctl32.TreeView.OLEGiveFeedbackHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEGiveFeedback event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D0" ) } );

     public static final com.ms.wfc.core.EventInfo OLESetDataEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "OLESetData", comctl32.TreeView.OLESetDataHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLESetData event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D1" ) } );

     public static final com.ms.wfc.core.EventInfo OLECompleteDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "OLECompleteDrag", comctl32.TreeView.OLECompleteDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLECompleteDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D2" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragOverEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "OLEDragOver", comctl32.TreeView.OLEDragOverHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragOver event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D3" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragDropEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TreeView.TreeView.class, "OLEDragDrop", comctl32.TreeView.OLEDragDropHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragDrop event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D4" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.TreeView.TreeView.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( HideSelectionPropertyInfo );
        props.add( IndentationPropertyInfo );
        props.add( LabelEditPropertyInfo );
        props.add( LineStylePropertyInfo );
        props.add( MousePointerPropertyInfo );
        props.add( MouseIconPropertyInfo );
        props.add( PathSeparatorPropertyInfo );
        props.add( SortedPropertyInfo );
        props.add( StylePropertyInfo );
        props.add( OLEDragModePropertyInfo );
        props.add( OLEDropModePropertyInfo );
        props.add( AppearancePropertyInfo );
        props.add( BorderStylePropertyInfo );
        props.add( EnabledPropertyInfo );
        props.add( FontPropertyInfo );
        props.add( hWndPropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
        events.add( BeforeLabelEditEventInfo );
        events.add( AfterLabelEditEventInfo );
        events.add( CollapseEventInfo );
        events.add( ExpandEventInfo );
        events.add( NodeClickEventInfo );
        events.add( com.ms.wfc.ui.Control.ClassInfo.keyDown );
        events.add( com.ms.wfc.ui.Control.ClassInfo.keyUp );
        events.add( com.ms.wfc.ui.Control.ClassInfo.keyPress );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseDown );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseMove );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseUp );
        events.add( com.ms.wfc.ui.Control.ClassInfo.click );
        events.add( com.ms.wfc.ui.Control.ClassInfo.doubleClick );
        events.add( OLEStartDragEventInfo );
        events.add( OLEGiveFeedbackEventInfo );
        events.add( OLESetDataEventInfo );
        events.add( OLECompleteDragEventInfo );
        events.add( OLEDragOverEventInfo );
        events.add( OLEDragDropEventInfo );
     }
  }
}
