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

package comctl32.ListView;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class ListView extends com.ms.wfc.ui.AxHost
{
  private comctl32.IListView _jcommem_ocx;
  private comctl32.ListView.ListViewEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  comctl32.ListView.BeforeLabelEditHandler onBeforeLabelEdit;
  comctl32.ListView.AfterLabelEditHandler onAfterLabelEdit;
  comctl32.ListView.ColumnClickHandler onColumnClick;
  comctl32.ListView.ItemClickHandler onItemClick;
  comctl32.ListView.OLEStartDragHandler onOLEStartDrag;
  comctl32.ListView.OLEGiveFeedbackHandler onOLEGiveFeedback;
  comctl32.ListView.OLESetDataHandler onOLESetData;
  comctl32.ListView.OLECompleteDragHandler onOLECompleteDrag;
  comctl32.ListView.OLEDragOverHandler onOLEDragOver;
  comctl32.ListView.OLEDragDropHandler onOLEDragDrop;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public ListView()
  {
     super( "{58DA8D8A-9D6A-101B-AFC0-4210102A8DA7}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.ListViewEvents.class);
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
        _jcommem_ocx = (comctl32.IListView)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.ListView.ListViewEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  public synchronized int getArrange()  {
     return _jcommem_ocx.getArrange();
  }


  public synchronized void setArrange(int pArrange)  {
     _jcommem_ocx.setArrange(pArrange);
  }


  public synchronized comctl32.IColumnHeaders getColumnHeaders()  {
     return _jcommem_ocx.getColumnHeaders();
  }


  public synchronized void setColumnHeaders(comctl32.IColumnHeaders ppIColumnHeaders)  {
     _jcommem_ocx.setColumnHeaders(ppIColumnHeaders);
  }


  public synchronized comctl32.IListItem getDropHighlight()  {
     return _jcommem_ocx.getDropHighlight();
  }


  public synchronized void setDropHighlight(comctl32.IListItem ppIListItem)  {
     _jcommem_ocx.setDropHighlight(ppIListItem);
  }


  public synchronized void setDropHighlight(Variant ppIListItem)  {
     _jcommem_ocx.setDropHighlight(ppIListItem);
  }


  public synchronized boolean getHideColumnHeaders()  {
     return _jcommem_ocx.getHideColumnHeaders();
  }


  public synchronized void setHideColumnHeaders(boolean pfHide)  {
     _jcommem_ocx.setHideColumnHeaders(pfHide);
  }


  public synchronized boolean getHideSelection()  {
     return _jcommem_ocx.getHideSelection();
  }


  public synchronized void setHideSelection(boolean pfHide)  {
     _jcommem_ocx.setHideSelection(pfHide);
  }


  public synchronized Object getIcons()  {
     return _jcommem_ocx.getIcons();
  }


  public synchronized void setIcons(Object ppIcons)  {
     _jcommem_ocx.setIcons(ppIcons);
  }


  // setIcons UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setIcons(Object ppIcons)

  public synchronized comctl32.IListItems getListItems()  {
     return _jcommem_ocx.getListItems();
  }


  public synchronized void setListItems(comctl32.IListItems ppListItems)  {
     _jcommem_ocx.setListItems(ppListItems);
  }


  public synchronized int getLabelEdit()  {
     return _jcommem_ocx.getLabelEdit();
  }


  public synchronized void setLabelEdit(int pRet)  {
     _jcommem_ocx.setLabelEdit(pRet);
  }


  public synchronized boolean getLabelWrap()  {
     return _jcommem_ocx.getLabelWrap();
  }


  public synchronized void setLabelWrap(boolean pfOn)  {
     _jcommem_ocx.setLabelWrap(pfOn);
  }


  public synchronized com.ms.wfc.ui.Image getMouseIcon()  {
     return com.ms.wfc.ui.AxHost.getPictureFromIPictureDisp(_jcommem_ocx.getMouseIcon());
  }


  public synchronized void setMouseIcon(com.ms.wfc.ui.Image ppMouseIcon)  {
     _jcommem_ocx.setMouseIcon(com.ms.wfc.ui.AxHost.getIPictureDispFromPicture( ppMouseIcon ));
  }


  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setMouseIcon(com.ms.wfc.ui.Image ppMouseIcon)

  public synchronized int getMousePointer()  {
     return _jcommem_ocx.getMousePointer();
  }


  public synchronized void setMousePointer(int pnIndex)  {
     _jcommem_ocx.setMousePointer(pnIndex);
  }


  public synchronized boolean getMultiSelect()  {
     return _jcommem_ocx.getMultiSelect();
  }


  public synchronized void setMultiSelect(boolean pfOn)  {
     _jcommem_ocx.setMultiSelect(pfOn);
  }


  public synchronized comctl32.IListItem getSelectedItem()  {
     return _jcommem_ocx.getSelectedItem();
  }


  public synchronized void setSelectedItem(comctl32.IListItem ppListItem)  {
     _jcommem_ocx.setSelectedItem(ppListItem);
  }


  public synchronized void setSelectedItem(Variant ppListItem)  {
     _jcommem_ocx.setSelectedItem(ppListItem);
  }


  public synchronized Object getSmallIcons()  {
     return _jcommem_ocx.getSmallIcons();
  }


  public synchronized void setSmallIcons(Object ppImageList)  {
     _jcommem_ocx.setSmallIcons(ppImageList);
  }


  // setSmallIcons UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setSmallIcons(Object ppImageList)

  public synchronized boolean getSorted()  {
     return _jcommem_ocx.getSorted();
  }


  public synchronized void setSorted(boolean pfOn)  {
     _jcommem_ocx.setSorted(pfOn);
  }


  public synchronized short getSortKey()  {
     return _jcommem_ocx.getSortKey();
  }


  public synchronized void setSortKey(short psKey)  {
     _jcommem_ocx.setSortKey(psKey);
  }


  public synchronized int getSortOrder()  {
     return _jcommem_ocx.getSortOrder();
  }


  public synchronized void setSortOrder(int pOrder)  {
     _jcommem_ocx.setSortOrder(pOrder);
  }


  public synchronized int getView()  {
     return _jcommem_ocx.getView();
  }


  public synchronized void setView(int pnView)  {
     _jcommem_ocx.setView(pnView);
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


  public synchronized void setAppearance(int pnAppearance)  {
     _jcommem_ocx.setAppearance(pnAppearance);
  }


  public synchronized com.ms.wfc.ui.Color getBackColor()  {
     return com.ms.wfc.ui.AxHost.getColorFromOleColor(_jcommem_ocx.getBackColor());
  }


  public synchronized void setBackColor(com.ms.wfc.ui.Color pcrBack)  {
     _jcommem_ocx.setBackColor(com.ms.wfc.ui.AxHost.getOleColorFromColor( pcrBack ));
  }


  public synchronized int getBorderStyle()  {
     return _jcommem_ocx.getBorderStyle();
  }


  public synchronized void setBorderStyle(int pnStyle)  {
     _jcommem_ocx.setBorderStyle(pnStyle);
  }


  public synchronized boolean getEnabled()  {
     return _jcommem_ocx.getEnabled();
  }


  public synchronized void setEnabled(boolean pfEnabled)  {
     _jcommem_ocx.setEnabled(pfEnabled);
  }


  public synchronized com.ms.wfc.ui.Font getFont()  {
     return com.ms.wfc.ui.AxHost.getFontFromIFontDisp(_jcommem_ocx.getFont());
  }


  public synchronized void setFont(com.ms.wfc.ui.Font ppFontDisp)  {
     _jcommem_ocx.setFont(com.ms.wfc.ui.AxHost.getIFontDispFromFont( ppFontDisp ));
  }


  public synchronized com.ms.wfc.ui.Color getForeColor()  {
     return com.ms.wfc.ui.AxHost.getColorFromOleColor(_jcommem_ocx.getForeColor());
  }


  public synchronized void setForeColor(com.ms.wfc.ui.Color pcrFore)  {
     _jcommem_ocx.setForeColor(com.ms.wfc.ui.AxHost.getOleColorFromColor( pcrFore ));
  }


  public synchronized int getHWnd()  {
     return _jcommem_ocx.getHWnd();
  }


  public synchronized void setHWnd(int phWnd)  {
     _jcommem_ocx.setHWnd(phWnd);
  }


  public synchronized comctl32.IListItem FindItem(String sz, Variant Where, Variant Index, Variant fPartial)  {
     return _jcommem_ocx.FindItem(sz, Where, Index, fPartial);
  }


  public synchronized comctl32.IListItem GetFirstVisible()  {
     return _jcommem_ocx.GetFirstVisible();
  }


  public synchronized comctl32.IListItem HitTest(float x, float y)  {
     return _jcommem_ocx.HitTest(x, y);
  }


  public synchronized void StartLabelEdit()  {
     _jcommem_ocx.StartLabelEdit();
  }


  public synchronized void OLEDrag()  {
     _jcommem_ocx.OLEDrag();
  }


  public synchronized void Refresh()  {
     _jcommem_ocx.Refresh();
  }


  /** @hidden */
  public synchronized void AboutBox()  {
     _jcommem_ocx.AboutBox();
  }



  //------------------------------------------------------------------------
  // These methods add and remove event handlers.
  //------------------------------------------------------------------------

  public synchronized void addOnBeforeLabelEdit( comctl32.ListView.BeforeLabelEditHandler handler ) {
     onBeforeLabelEdit = (comctl32.ListView.BeforeLabelEditHandler)com.ms.lang.Delegate.combine( onBeforeLabelEdit, handler );
  }

  public synchronized void removeOnBeforeLabelEdit( comctl32.ListView.BeforeLabelEditHandler handler ) {
     onBeforeLabelEdit = (comctl32.ListView.BeforeLabelEditHandler)com.ms.lang.Delegate.remove( onBeforeLabelEdit, handler );
  }

  public synchronized void addOnAfterLabelEdit( comctl32.ListView.AfterLabelEditHandler handler ) {
     onAfterLabelEdit = (comctl32.ListView.AfterLabelEditHandler)com.ms.lang.Delegate.combine( onAfterLabelEdit, handler );
  }

  public synchronized void removeOnAfterLabelEdit( comctl32.ListView.AfterLabelEditHandler handler ) {
     onAfterLabelEdit = (comctl32.ListView.AfterLabelEditHandler)com.ms.lang.Delegate.remove( onAfterLabelEdit, handler );
  }

  public synchronized void addOnColumnClick( comctl32.ListView.ColumnClickHandler handler ) {
     onColumnClick = (comctl32.ListView.ColumnClickHandler)com.ms.lang.Delegate.combine( onColumnClick, handler );
  }

  public synchronized void removeOnColumnClick( comctl32.ListView.ColumnClickHandler handler ) {
     onColumnClick = (comctl32.ListView.ColumnClickHandler)com.ms.lang.Delegate.remove( onColumnClick, handler );
  }

  public synchronized void addOnItemClick( comctl32.ListView.ItemClickHandler handler ) {
     onItemClick = (comctl32.ListView.ItemClickHandler)com.ms.lang.Delegate.combine( onItemClick, handler );
  }

  public synchronized void removeOnItemClick( comctl32.ListView.ItemClickHandler handler ) {
     onItemClick = (comctl32.ListView.ItemClickHandler)com.ms.lang.Delegate.remove( onItemClick, handler );
  }

  public synchronized void addOnOLEStartDrag( comctl32.ListView.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.ListView.OLEStartDragHandler)com.ms.lang.Delegate.combine( onOLEStartDrag, handler );
  }

  public synchronized void removeOnOLEStartDrag( comctl32.ListView.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.ListView.OLEStartDragHandler)com.ms.lang.Delegate.remove( onOLEStartDrag, handler );
  }

  public synchronized void addOnOLEGiveFeedback( comctl32.ListView.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.ListView.OLEGiveFeedbackHandler)com.ms.lang.Delegate.combine( onOLEGiveFeedback, handler );
  }

  public synchronized void removeOnOLEGiveFeedback( comctl32.ListView.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.ListView.OLEGiveFeedbackHandler)com.ms.lang.Delegate.remove( onOLEGiveFeedback, handler );
  }

  public synchronized void addOnOLESetData( comctl32.ListView.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.ListView.OLESetDataHandler)com.ms.lang.Delegate.combine( onOLESetData, handler );
  }

  public synchronized void removeOnOLESetData( comctl32.ListView.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.ListView.OLESetDataHandler)com.ms.lang.Delegate.remove( onOLESetData, handler );
  }

  public synchronized void addOnOLECompleteDrag( comctl32.ListView.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.ListView.OLECompleteDragHandler)com.ms.lang.Delegate.combine( onOLECompleteDrag, handler );
  }

  public synchronized void removeOnOLECompleteDrag( comctl32.ListView.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.ListView.OLECompleteDragHandler)com.ms.lang.Delegate.remove( onOLECompleteDrag, handler );
  }

  public synchronized void addOnOLEDragOver( comctl32.ListView.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.ListView.OLEDragOverHandler)com.ms.lang.Delegate.combine( onOLEDragOver, handler );
  }

  public synchronized void removeOnOLEDragOver( comctl32.ListView.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.ListView.OLEDragOverHandler)com.ms.lang.Delegate.remove( onOLEDragOver, handler );
  }

  public synchronized void addOnOLEDragDrop( comctl32.ListView.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.ListView.OLEDragDropHandler)com.ms.lang.Delegate.combine( onOLEDragDrop, handler );
  }

  public synchronized void removeOnOLEDragDrop( comctl32.ListView.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.ListView.OLEDragDropHandler)com.ms.lang.Delegate.remove( onOLEDragDrop, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ArrangePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "arrange", comctl32.ListArrangeConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets how the icons in a ListView control\'s Icon or SmallIcon view are arranged." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033599" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo HideColumnHeadersPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "hideColumnHeaders", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether or not a ListView control\'s column headers are hidden in Report view." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003359C" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000004 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo HideSelectionPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "hideSelection", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Determines whether the selected item will display as selected when the ListView loses focus" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003359D" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000005 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo LabelEditPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "labelEdit", comctl32.ListLabelEditConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines if a user can edit the label of a ListItem or Node object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A0" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000008 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo LabelWrapPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "labelWrap", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns or sets a value that determines if labels are wrapped when the ListView is in Icon view." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A1" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000009 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MouseIconPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "mouseIcon", com.ms.wfc.ui.Image.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Sets a custom mouse icon." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A2" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000A ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MousePointerPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "mousePointer", comctl32.MousePointerConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the type of mouse pointer displayed when over part of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A3" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000B ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MultiSelectPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "multiSelect", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value indicating whether a user can make multiple selections in the ListView control and how the multiple selections can be made." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A4" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000C ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SortedPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "sorted", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Indicates whether the elements of a control are automatically sorted alphabetically." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A7" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000F ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SortKeyPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "sortKey", short.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the current sort key." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A8" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000010 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SortOrderPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "sortOrder", comctl32.ListSortOrderConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether or not the ListItems will be sorted in ascending or descending order." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335A9" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000011 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ViewPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "view", comctl32.ListViewConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the current view of the ListView control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335AA" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000012 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDragModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "OLEDragMode", comctl32.OLEDragConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drag/drop source, and whether this process is started automatically or under programmatic control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033691" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060E ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDropModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "OLEDropMode", comctl32.OLEDropConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drop target." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033692" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060F ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo AppearancePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "appearance", comctl32.AppearanceConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether or not controls, Forms or an MDIForm are painted at run time with 3-D effects." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335AB" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDF8 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo BackColorPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "backColor", com.ms.wfc.ui.Color.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the background color used to display text and graphics in an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335AC" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE0B ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo BorderStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "borderStyle", comctl32.BorderStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the border style for an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335AD" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE08 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo EnabledPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "enabled", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines whether a form or control can respond to user-generated events." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335AE" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFE ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo FontPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "font", com.ms.wfc.ui.Font.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a Font object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335AF" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE00 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ForeColorPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "foreColor", com.ms.wfc.ui.Color.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the background color used to display text and graphics in an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335B0" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFF ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hWndPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ListView.ListView.class, "hWnd", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to a form or control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335B1" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFD ) } );

     public static final com.ms.wfc.core.EventInfo BeforeLabelEditEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "beforeLabelEdit", comctl32.ListView.BeforeLabelEditHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a user attempts to edit the label of the currently selected ListItem or Node object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335B7" ) } );

     public static final com.ms.wfc.core.EventInfo AfterLabelEditEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "afterLabelEdit", comctl32.ListView.AfterLabelEditHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs after a user edits the label of the currently selected Node or ListItem object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335B8" ) } );

     public static final com.ms.wfc.core.EventInfo ColumnClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "columnClick", comctl32.ListView.ColumnClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a ColumnHeader object in a ListView control is clicked." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335B9" ) } );

     public static final com.ms.wfc.core.EventInfo ItemClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "itemClick", comctl32.ListView.ItemClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a ListItem object is clicked or selected" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335BA" ) } );

     public static final com.ms.wfc.core.EventInfo OLEStartDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "OLEStartDrag", comctl32.ListView.OLEStartDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEStartDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CF" ) } );

     public static final com.ms.wfc.core.EventInfo OLEGiveFeedbackEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "OLEGiveFeedback", comctl32.ListView.OLEGiveFeedbackHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEGiveFeedback event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D0" ) } );

     public static final com.ms.wfc.core.EventInfo OLESetDataEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "OLESetData", comctl32.ListView.OLESetDataHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLESetData event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D1" ) } );

     public static final com.ms.wfc.core.EventInfo OLECompleteDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "OLECompleteDrag", comctl32.ListView.OLECompleteDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLECompleteDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D2" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragOverEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "OLEDragOver", comctl32.ListView.OLEDragOverHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragOver event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D3" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragDropEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.ListView.ListView.class, "OLEDragDrop", comctl32.ListView.OLEDragDropHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragDrop event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D4" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.ListView.ListView.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( ArrangePropertyInfo );
        props.add( HideColumnHeadersPropertyInfo );
        props.add( HideSelectionPropertyInfo );
        props.add( LabelEditPropertyInfo );
        props.add( LabelWrapPropertyInfo );
        props.add( MouseIconPropertyInfo );
        props.add( MousePointerPropertyInfo );
        props.add( MultiSelectPropertyInfo );
        props.add( SortedPropertyInfo );
        props.add( SortKeyPropertyInfo );
        props.add( SortOrderPropertyInfo );
        props.add( ViewPropertyInfo );
        props.add( OLEDragModePropertyInfo );
        props.add( OLEDropModePropertyInfo );
        props.add( AppearancePropertyInfo );
        props.add( BackColorPropertyInfo );
        props.add( BorderStylePropertyInfo );
        props.add( EnabledPropertyInfo );
        props.add( FontPropertyInfo );
        props.add( ForeColorPropertyInfo );
        props.add( hWndPropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
        events.add( BeforeLabelEditEventInfo );
        events.add( AfterLabelEditEventInfo );
        events.add( ColumnClickEventInfo );
        events.add( ItemClickEventInfo );
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
