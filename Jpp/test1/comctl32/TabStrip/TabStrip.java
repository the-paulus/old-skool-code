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

public class TabStrip extends com.ms.wfc.ui.AxHost
{
  private comctl32.ITabStrip _jcommem_ocx;
  private comctl32.TabStrip.TabStripEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  comctl32.TabStrip.BeforeClickHandler onBeforeClick;
  comctl32.TabStrip.OLEStartDragHandler onOLEStartDrag;
  comctl32.TabStrip.OLEGiveFeedbackHandler onOLEGiveFeedback;
  comctl32.TabStrip.OLESetDataHandler onOLESetData;
  comctl32.TabStrip.OLECompleteDragHandler onOLECompleteDrag;
  comctl32.TabStrip.OLEDragOverHandler onOLEDragOver;
  comctl32.TabStrip.OLEDragDropHandler onOLEDragDrop;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public TabStrip()
  {
     super( "{9ED94440-E5E8-101B-B9B5-444553540000}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.ITabStripEvents.class);
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
        _jcommem_ocx = (comctl32.ITabStrip)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.TabStrip.TabStripEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  public synchronized comctl32.ITabs getTabs()  {
     return _jcommem_ocx.getTabs();
  }


  public synchronized void setTabs(comctl32.ITabs ppTabs)  {
     _jcommem_ocx.setTabs(ppTabs);
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


  public synchronized void setFont(com.ms.wfc.ui.Font ppFontDisp)  {
     _jcommem_ocx.setFont(com.ms.wfc.ui.AxHost.getIFontDispFromFont( ppFontDisp ));
  }


  public synchronized int getHWnd()  {
     return _jcommem_ocx.getHWnd();
  }


  public synchronized void setHWnd(int phWnd)  {
     _jcommem_ocx.setHWnd(phWnd);
  }


  public synchronized com.ms.wfc.ui.Image getMouseIcon()  {
     return com.ms.wfc.ui.AxHost.getPictureFromIPictureDisp(_jcommem_ocx.getMouseIcon());
  }


  public synchronized void setMouseIcon(com.ms.wfc.ui.Image ppMouseIcon)  {
     _jcommem_ocx.setMouseIcon(com.ms.wfc.ui.AxHost.getIPictureDispFromPicture( ppMouseIcon ));
  }


  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setMouseIcon(com.ms.wfc.ui.Image ppMouseIcon)

  public synchronized boolean getMultiRow()  {
     return _jcommem_ocx.getMultiRow();
  }


  public synchronized void setMultiRow(boolean pbMultiRow)  {
     _jcommem_ocx.setMultiRow(pbMultiRow);
  }


  public synchronized int getStyle()  {
     return _jcommem_ocx.getStyle();
  }


  public synchronized void setStyle(int psStyle)  {
     _jcommem_ocx.setStyle(psStyle);
  }


  public synchronized short getTabFixedWidth()  {
     return _jcommem_ocx.getTabFixedWidth();
  }


  public synchronized void setTabFixedWidth(short psTabFixedWidth)  {
     _jcommem_ocx.setTabFixedWidth(psTabFixedWidth);
  }


  public synchronized int getTabWidthStyle()  {
     return _jcommem_ocx.getTabWidthStyle();
  }


  public synchronized void setTabWidthStyle(int psTabWidthStyle)  {
     _jcommem_ocx.setTabWidthStyle(psTabWidthStyle);
  }


  public synchronized float getClientTop()  {
     return _jcommem_ocx.getClientTop();
  }


  public synchronized void setClientTop(float pfClientTop)  {
     _jcommem_ocx.setClientTop(pfClientTop);
  }


  public synchronized float getClientLeft()  {
     return _jcommem_ocx.getClientLeft();
  }


  public synchronized void setClientLeft(float pfClientLeft)  {
     _jcommem_ocx.setClientLeft(pfClientLeft);
  }


  public synchronized float getClientHeight()  {
     return _jcommem_ocx.getClientHeight();
  }


  public synchronized void setClientHeight(float pfClientHeight)  {
     _jcommem_ocx.setClientHeight(pfClientHeight);
  }


  public synchronized float getClientWidth()  {
     return _jcommem_ocx.getClientWidth();
  }


  public synchronized void setClientWidth(float pfClientWidth)  {
     _jcommem_ocx.setClientWidth(pfClientWidth);
  }


  public synchronized int getMousePointer()  {
     return _jcommem_ocx.getMousePointer();
  }


  public synchronized void setMousePointer(int psMousePointer)  {
     _jcommem_ocx.setMousePointer(psMousePointer);
  }


  public synchronized Object getImageList()  {
     return _jcommem_ocx.getImageList();
  }


  public synchronized void setImageList(Object ppImageList)  {
     _jcommem_ocx.setImageList(ppImageList);
  }


  // setImageList UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public synchronized void setImageList(Object ppImageList)

  public synchronized short getTabFixedHeight()  {
     return _jcommem_ocx.getTabFixedHeight();
  }


  public synchronized void setTabFixedHeight(short psTabFixedHeight)  {
     _jcommem_ocx.setTabFixedHeight(psTabFixedHeight);
  }


  public synchronized boolean getShowTips()  {
     return _jcommem_ocx.getShowTips();
  }


  public synchronized void setShowTips(boolean pbShowTips)  {
     _jcommem_ocx.setShowTips(pbShowTips);
  }


  public synchronized comctl32.ITab getSelectedItem()  {
     return _jcommem_ocx.getSelectedItem();
  }


  public synchronized void setSelectedItem(comctl32.ITab ppSelectedItem)  {
     _jcommem_ocx.setSelectedItem(ppSelectedItem);
  }


  public synchronized void setSelectedItem(Variant ppSelectedItem)  {
     _jcommem_ocx.setSelectedItem(ppSelectedItem);
  }


  public synchronized int getOLEDropMode()  {
     return _jcommem_ocx.getOLEDropMode();
  }


  public synchronized void setOLEDropMode(int psOLEDropMode)  {
     _jcommem_ocx.setOLEDropMode(psOLEDropMode);
  }


  public synchronized void Refresh()  {
     _jcommem_ocx.Refresh();
  }


  public synchronized void OLEDrag()  {
     _jcommem_ocx.OLEDrag();
  }


  /** @hidden */
  public synchronized void AboutBox()  {
     _jcommem_ocx.AboutBox();
  }



  //------------------------------------------------------------------------
  // These methods add and remove event handlers.
  //------------------------------------------------------------------------

  public synchronized void addOnBeforeClick( comctl32.TabStrip.BeforeClickHandler handler ) {
     onBeforeClick = (comctl32.TabStrip.BeforeClickHandler)com.ms.lang.Delegate.combine( onBeforeClick, handler );
  }

  public synchronized void removeOnBeforeClick( comctl32.TabStrip.BeforeClickHandler handler ) {
     onBeforeClick = (comctl32.TabStrip.BeforeClickHandler)com.ms.lang.Delegate.remove( onBeforeClick, handler );
  }

  public synchronized void addOnOLEStartDrag( comctl32.TabStrip.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.TabStrip.OLEStartDragHandler)com.ms.lang.Delegate.combine( onOLEStartDrag, handler );
  }

  public synchronized void removeOnOLEStartDrag( comctl32.TabStrip.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.TabStrip.OLEStartDragHandler)com.ms.lang.Delegate.remove( onOLEStartDrag, handler );
  }

  public synchronized void addOnOLEGiveFeedback( comctl32.TabStrip.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.TabStrip.OLEGiveFeedbackHandler)com.ms.lang.Delegate.combine( onOLEGiveFeedback, handler );
  }

  public synchronized void removeOnOLEGiveFeedback( comctl32.TabStrip.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.TabStrip.OLEGiveFeedbackHandler)com.ms.lang.Delegate.remove( onOLEGiveFeedback, handler );
  }

  public synchronized void addOnOLESetData( comctl32.TabStrip.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.TabStrip.OLESetDataHandler)com.ms.lang.Delegate.combine( onOLESetData, handler );
  }

  public synchronized void removeOnOLESetData( comctl32.TabStrip.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.TabStrip.OLESetDataHandler)com.ms.lang.Delegate.remove( onOLESetData, handler );
  }

  public synchronized void addOnOLECompleteDrag( comctl32.TabStrip.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.TabStrip.OLECompleteDragHandler)com.ms.lang.Delegate.combine( onOLECompleteDrag, handler );
  }

  public synchronized void removeOnOLECompleteDrag( comctl32.TabStrip.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.TabStrip.OLECompleteDragHandler)com.ms.lang.Delegate.remove( onOLECompleteDrag, handler );
  }

  public synchronized void addOnOLEDragOver( comctl32.TabStrip.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.TabStrip.OLEDragOverHandler)com.ms.lang.Delegate.combine( onOLEDragOver, handler );
  }

  public synchronized void removeOnOLEDragOver( comctl32.TabStrip.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.TabStrip.OLEDragOverHandler)com.ms.lang.Delegate.remove( onOLEDragOver, handler );
  }

  public synchronized void addOnOLEDragDrop( comctl32.TabStrip.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.TabStrip.OLEDragDropHandler)com.ms.lang.Delegate.combine( onOLEDragDrop, handler );
  }

  public synchronized void removeOnOLEDragDrop( comctl32.TabStrip.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.TabStrip.OLEDragDropHandler)com.ms.lang.Delegate.remove( onOLEDragDrop, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo EnabledPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "enabled", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines whether a form or control can respond to user-generated events." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003349C" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFE ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo FontPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "font", com.ms.wfc.ui.Font.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a Font object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003349D" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE00 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hWndPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "hWnd", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to a form or control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003349E" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFD ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MouseIconPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "mouseIcon", com.ms.wfc.ui.Image.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Sets a custom mouse icon." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003349F" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000005 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MultiRowPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "multiRow", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value indicating whether the control can display more than one row of tabs." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A0" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo StylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "style", comctl32.TabStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the style appearance (tab or button) of a TabStrip control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A1" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000006 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo TabFixedWidthPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "tabFixedWidth", short.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a fixed height of a TabStrip control, but only if the TabWidthStyle is set to tabFixed." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A2" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000007 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo TabWidthStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "tabWidthStyle", comctl32.TabWidthStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the width and justification of all tabs in a TabStrip control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A3" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000008 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ClientTopPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "clientTop", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns the top coordinate of the internal area of the control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A4" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000009 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ClientLeftPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "clientLeft", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns the left coordinate of the internal area of the control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A5" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000A ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ClientHeightPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "clientHeight", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns the height of the internal area of the control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A6" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000B ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ClientWidthPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "clientWidth", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns the width of the internal area of the control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A7" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000C ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MousePointerPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "mousePointer", comctl32.MousePointerConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the type of mouse pointer displayed when over part of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334A8" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo TabFixedHeightPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "tabFixedHeight", short.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a fixed height of a TabStrip control, but only if the TabWidthStyle is set to tabFixed." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334AA" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000E ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ShowTipsPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "showTips", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Enables/disables the Tooltip text" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334AB" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000003 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDropModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.TabStrip.TabStrip.class, "OLEDropMode", comctl32.OLEDropConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drop target." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033692" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060F ) } );

     public static final com.ms.wfc.core.EventInfo BeforeClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "beforeClick", comctl32.TabStrip.BeforeClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Generated when a Tab object is clicked, or the tab\'s Value setting has been changed. Used to check parameters before actually generating a Click event." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334B5" ) } );

     public static final com.ms.wfc.core.EventInfo OLEStartDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "OLEStartDrag", comctl32.TabStrip.OLEStartDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEStartDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CF" ) } );

     public static final com.ms.wfc.core.EventInfo OLEGiveFeedbackEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "OLEGiveFeedback", comctl32.TabStrip.OLEGiveFeedbackHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEGiveFeedback event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D0" ) } );

     public static final com.ms.wfc.core.EventInfo OLESetDataEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "OLESetData", comctl32.TabStrip.OLESetDataHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLESetData event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D1" ) } );

     public static final com.ms.wfc.core.EventInfo OLECompleteDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "OLECompleteDrag", comctl32.TabStrip.OLECompleteDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLECompleteDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D2" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragOverEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "OLEDragOver", comctl32.TabStrip.OLEDragOverHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragOver event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D3" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragDropEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.TabStrip.TabStrip.class, "OLEDragDrop", comctl32.TabStrip.OLEDragDropHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragDrop event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D4" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.TabStrip.TabStrip.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( EnabledPropertyInfo );
        props.add( FontPropertyInfo );
        props.add( hWndPropertyInfo );
        props.add( MouseIconPropertyInfo );
        props.add( MultiRowPropertyInfo );
        props.add( StylePropertyInfo );
        props.add( TabFixedWidthPropertyInfo );
        props.add( TabWidthStylePropertyInfo );
        props.add( ClientTopPropertyInfo );
        props.add( ClientLeftPropertyInfo );
        props.add( ClientHeightPropertyInfo );
        props.add( ClientWidthPropertyInfo );
        props.add( MousePointerPropertyInfo );
        props.add( TabFixedHeightPropertyInfo );
        props.add( ShowTipsPropertyInfo );
        props.add( OLEDropModePropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
        events.add( com.ms.wfc.ui.Control.ClassInfo.click );
        events.add( com.ms.wfc.ui.Control.ClassInfo.keyDown );
        events.add( com.ms.wfc.ui.Control.ClassInfo.keyPress );
        events.add( com.ms.wfc.ui.Control.ClassInfo.keyUp );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseDown );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseMove );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseUp );
        events.add( BeforeClickEventInfo );
        events.add( OLEStartDragEventInfo );
        events.add( OLEGiveFeedbackEventInfo );
        events.add( OLESetDataEventInfo );
        events.add( OLECompleteDragEventInfo );
        events.add( OLEDragOverEventInfo );
        events.add( OLEDragDropEventInfo );
     }
  }
}
