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

package comctl32.StatusBar;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class StatusBar extends com.ms.wfc.ui.AxHost
{
  private comctl32.IStatusBar _jcommem_ocx;
  private comctl32.StatusBar.StatusBarEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  comctl32.StatusBar.PanelClickHandler onPanelClick;
  comctl32.StatusBar.PanelDblClickHandler onPanelDblClick;
  comctl32.StatusBar.OLEStartDragHandler onOLEStartDrag;
  comctl32.StatusBar.OLEGiveFeedbackHandler onOLEGiveFeedback;
  comctl32.StatusBar.OLESetDataHandler onOLESetData;
  comctl32.StatusBar.OLECompleteDragHandler onOLECompleteDrag;
  comctl32.StatusBar.OLEDragOverHandler onOLEDragOver;
  comctl32.StatusBar.OLEDragDropHandler onOLEDragDrop;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public StatusBar()
  {
     super( "{6B7E638F-850A-101B-AFC0-4210102A8DA7}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.IStatusBarEvents.class);
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
        _jcommem_ocx = (comctl32.IStatusBar)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.StatusBar.StatusBarEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  public synchronized String getSimpleText()  {
     return _jcommem_ocx.getSimpleText();
  }


  public synchronized void setSimpleText(String pbstrSimpleText)  {
     _jcommem_ocx.setSimpleText(pbstrSimpleText);
  }


  public synchronized int getStyle()  {
     return _jcommem_ocx.getStyle();
  }


  public synchronized void setStyle(int psStyle)  {
     _jcommem_ocx.setStyle(psStyle);
  }


  public synchronized comctl32.IPanels getPanels()  {
     return _jcommem_ocx.getPanels();
  }


  public synchronized void setPanels(comctl32.IPanels ppPanels)  {
     _jcommem_ocx.setPanels(ppPanels);
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

  public synchronized boolean getShowTips()  {
     return _jcommem_ocx.getShowTips();
  }


  public synchronized void setShowTips(boolean bShowTips)  {
     _jcommem_ocx.setShowTips(bShowTips);
  }


  /** @hidden */
  public synchronized String getPanelProperties()  {
     return _jcommem_ocx.getPanelProperties();
  }


  /** @hidden */
  public synchronized void setPanelProperties(String pbstrPanelProperties)  {
     _jcommem_ocx.setPanelProperties(pbstrPanelProperties);
  }


  public synchronized int getOLEDropMode()  {
     return _jcommem_ocx.getOLEDropMode();
  }


  public synchronized void setOLEDropMode(int psOLEDropMode)  {
     _jcommem_ocx.setOLEDropMode(psOLEDropMode);
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


  public synchronized int getHWnd()  {
     return _jcommem_ocx.getHWnd();
  }


  public synchronized void setHWnd(int phWnd)  {
     _jcommem_ocx.setHWnd(phWnd);
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

  public synchronized void addOnPanelClick( comctl32.StatusBar.PanelClickHandler handler ) {
     onPanelClick = (comctl32.StatusBar.PanelClickHandler)com.ms.lang.Delegate.combine( onPanelClick, handler );
  }

  public synchronized void removeOnPanelClick( comctl32.StatusBar.PanelClickHandler handler ) {
     onPanelClick = (comctl32.StatusBar.PanelClickHandler)com.ms.lang.Delegate.remove( onPanelClick, handler );
  }

  public synchronized void addOnPanelDblClick( comctl32.StatusBar.PanelDblClickHandler handler ) {
     onPanelDblClick = (comctl32.StatusBar.PanelDblClickHandler)com.ms.lang.Delegate.combine( onPanelDblClick, handler );
  }

  public synchronized void removeOnPanelDblClick( comctl32.StatusBar.PanelDblClickHandler handler ) {
     onPanelDblClick = (comctl32.StatusBar.PanelDblClickHandler)com.ms.lang.Delegate.remove( onPanelDblClick, handler );
  }

  public synchronized void addOnOLEStartDrag( comctl32.StatusBar.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.StatusBar.OLEStartDragHandler)com.ms.lang.Delegate.combine( onOLEStartDrag, handler );
  }

  public synchronized void removeOnOLEStartDrag( comctl32.StatusBar.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.StatusBar.OLEStartDragHandler)com.ms.lang.Delegate.remove( onOLEStartDrag, handler );
  }

  public synchronized void addOnOLEGiveFeedback( comctl32.StatusBar.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.StatusBar.OLEGiveFeedbackHandler)com.ms.lang.Delegate.combine( onOLEGiveFeedback, handler );
  }

  public synchronized void removeOnOLEGiveFeedback( comctl32.StatusBar.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.StatusBar.OLEGiveFeedbackHandler)com.ms.lang.Delegate.remove( onOLEGiveFeedback, handler );
  }

  public synchronized void addOnOLESetData( comctl32.StatusBar.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.StatusBar.OLESetDataHandler)com.ms.lang.Delegate.combine( onOLESetData, handler );
  }

  public synchronized void removeOnOLESetData( comctl32.StatusBar.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.StatusBar.OLESetDataHandler)com.ms.lang.Delegate.remove( onOLESetData, handler );
  }

  public synchronized void addOnOLECompleteDrag( comctl32.StatusBar.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.StatusBar.OLECompleteDragHandler)com.ms.lang.Delegate.combine( onOLECompleteDrag, handler );
  }

  public synchronized void removeOnOLECompleteDrag( comctl32.StatusBar.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.StatusBar.OLECompleteDragHandler)com.ms.lang.Delegate.remove( onOLECompleteDrag, handler );
  }

  public synchronized void addOnOLEDragOver( comctl32.StatusBar.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.StatusBar.OLEDragOverHandler)com.ms.lang.Delegate.combine( onOLEDragOver, handler );
  }

  public synchronized void removeOnOLEDragOver( comctl32.StatusBar.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.StatusBar.OLEDragOverHandler)com.ms.lang.Delegate.remove( onOLEDragOver, handler );
  }

  public synchronized void addOnOLEDragDrop( comctl32.StatusBar.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.StatusBar.OLEDragDropHandler)com.ms.lang.Delegate.combine( onOLEDragDrop, handler );
  }

  public synchronized void removeOnOLEDragDrop( comctl32.StatusBar.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.StatusBar.OLEDragDropHandler)com.ms.lang.Delegate.remove( onOLEDragDrop, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SimpleTextPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "simpleText", String.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the text displayed when a StatusBar control\'s Style property is set to Simple." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335EC" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo StylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "style", comctl32.SbarStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the the single (simple) or multiple panel style" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335ED" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MousePointerPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "mousePointer", comctl32.MousePointerConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the type of mouse pointer displayed when over part of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335EF" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000004 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MouseIconPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "mouseIcon", com.ms.wfc.ui.Image.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Sets a custom mouse icon." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335F0" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000005 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ShowTipsPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "showTips", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Enables/disables ToolTips for panels" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336A9" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000007 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDropModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "OLEDropMode", comctl32.OLEDropConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drop target." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033692" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060F ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo EnabledPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "enabled", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines whether a form or control can respond to user-generated events" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335F2" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFE ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo FontPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "font", com.ms.wfc.ui.Font.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a Font object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335F3" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE00 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hWndPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.StatusBar.StatusBar.class, "hWnd", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to a form or control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335F4" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFD ) } );

     public static final com.ms.wfc.core.EventInfo PanelClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "panelClick", comctl32.StatusBar.PanelClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Similar to the standard Click event, but the PanelClick event occurs when a user presses and then releases a mouse button over any of the StatusBar control\'s Panel objects." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335F6" ) } );

     public static final com.ms.wfc.core.EventInfo PanelDblClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "panelDblClick", comctl32.StatusBar.PanelDblClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Similar to the standard DblClick Event, the PanelDblClick occurs when a user presses and then releases a mouse button twice over a StatusBar control\'s Panel object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000335F7" ) } );

     public static final com.ms.wfc.core.EventInfo OLEStartDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "OLEStartDrag", comctl32.StatusBar.OLEStartDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEStartDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CF" ) } );

     public static final com.ms.wfc.core.EventInfo OLEGiveFeedbackEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "OLEGiveFeedback", comctl32.StatusBar.OLEGiveFeedbackHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEGiveFeedback event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D0" ) } );

     public static final com.ms.wfc.core.EventInfo OLESetDataEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "OLESetData", comctl32.StatusBar.OLESetDataHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLESetData event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D1" ) } );

     public static final com.ms.wfc.core.EventInfo OLECompleteDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "OLECompleteDrag", comctl32.StatusBar.OLECompleteDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLECompleteDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D2" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragOverEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "OLEDragOver", comctl32.StatusBar.OLEDragOverHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragOver event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D3" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragDropEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.StatusBar.StatusBar.class, "OLEDragDrop", comctl32.StatusBar.OLEDragDropHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragDrop event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D4" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.StatusBar.StatusBar.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( SimpleTextPropertyInfo );
        props.add( StylePropertyInfo );
        props.add( MousePointerPropertyInfo );
        props.add( MouseIconPropertyInfo );
        props.add( ShowTipsPropertyInfo );
        props.add( OLEDropModePropertyInfo );
        props.add( EnabledPropertyInfo );
        props.add( FontPropertyInfo );
        props.add( hWndPropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
        events.add( PanelClickEventInfo );
        events.add( PanelDblClickEventInfo );
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
