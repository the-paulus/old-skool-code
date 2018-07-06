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

package comctl32.Toolbar;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class Toolbar extends com.ms.wfc.ui.AxHost
{
  private comctl32.IToolbar _jcommem_ocx;
  private comctl32.Toolbar.ToolbarEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  comctl32.Toolbar.ButtonClickHandler onButtonClick;
  com.ms.wfc.core.EventHandler onChange;
  comctl32.Toolbar.OLEStartDragHandler onOLEStartDrag;
  comctl32.Toolbar.OLEGiveFeedbackHandler onOLEGiveFeedback;
  comctl32.Toolbar.OLESetDataHandler onOLESetData;
  comctl32.Toolbar.OLECompleteDragHandler onOLECompleteDrag;
  comctl32.Toolbar.OLEDragOverHandler onOLEDragOver;
  comctl32.Toolbar.OLEDragDropHandler onOLEDragDrop;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public Toolbar()
  {
     super( "{612A8624-0FB3-11CE-8747-524153480004}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.IToolbarEvents.class);
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
        _jcommem_ocx = (comctl32.IToolbar)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.Toolbar.ToolbarEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  public synchronized int getAppearance()  {
     return _jcommem_ocx.getAppearance();
  }


  public synchronized void setAppearance(int pnAppearance)  {
     _jcommem_ocx.setAppearance(pnAppearance);
  }


  public synchronized boolean getAllowCustomize()  {
     return _jcommem_ocx.getAllowCustomize();
  }


  public synchronized void setAllowCustomize(boolean pbAllowCustomize)  {
     _jcommem_ocx.setAllowCustomize(pbAllowCustomize);
  }


  public synchronized comctl32.IButtons getButtons()  {
     return _jcommem_ocx.getButtons();
  }


  public synchronized void setButtons(comctl32.IButtons ppButtons)  {
     _jcommem_ocx.setButtons(ppButtons);
  }


  public synchronized comctl32.IControls getCtlControls()  {
     return _jcommem_ocx.getControls();
  }


  public synchronized boolean getEnabled()  {
     return _jcommem_ocx.getEnabled();
  }


  public synchronized void setEnabled(boolean pbEnabled)  {
     _jcommem_ocx.setEnabled(pbEnabled);
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

  public synchronized boolean getShowTips()  {
     return _jcommem_ocx.getShowTips();
  }


  public synchronized void setShowTips(boolean bShowTips)  {
     _jcommem_ocx.setShowTips(bShowTips);
  }


  public synchronized int getBorderStyle()  {
     return _jcommem_ocx.getBorderStyle();
  }


  public synchronized void setBorderStyle(int psBorderStyle)  {
     _jcommem_ocx.setBorderStyle(psBorderStyle);
  }


  public synchronized boolean getWrappable()  {
     return _jcommem_ocx.getWrappable();
  }


  public synchronized void setWrappable(boolean pbWrappable)  {
     _jcommem_ocx.setWrappable(pbWrappable);
  }


  public synchronized float getButtonHeight()  {
     return _jcommem_ocx.getButtonHeight();
  }


  public synchronized void setButtonHeight(float pfButtonHeight)  {
     _jcommem_ocx.setButtonHeight(pfButtonHeight);
  }


  public synchronized float getButtonWidth()  {
     return _jcommem_ocx.getButtonWidth();
  }


  public synchronized void setButtonWidth(float pfButtonWidth)  {
     _jcommem_ocx.setButtonWidth(pfButtonWidth);
  }


  public synchronized int getHelpContextID()  {
     return _jcommem_ocx.getHelpContextID();
  }


  public synchronized void setHelpContextID(int plHelpContextID)  {
     _jcommem_ocx.setHelpContextID(plHelpContextID);
  }


  public synchronized String getHelpFile()  {
     return _jcommem_ocx.getHelpFile();
  }


  public synchronized void setHelpFile(String pbstrHelpFile)  {
     _jcommem_ocx.setHelpFile(pbstrHelpFile);
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


  public synchronized void Customize()  {
     _jcommem_ocx.Customize();
  }


  public synchronized void SaveToolbar(String Key, String Subkey, String Value)  {
     _jcommem_ocx.SaveToolbar(Key, Subkey, Value);
  }


  public synchronized void RestoreToolbar(String Key, String Subkey, String Value)  {
     _jcommem_ocx.RestoreToolbar(Key, Subkey, Value);
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

  public synchronized void addOnButtonClick( comctl32.Toolbar.ButtonClickHandler handler ) {
     onButtonClick = (comctl32.Toolbar.ButtonClickHandler)com.ms.lang.Delegate.combine( onButtonClick, handler );
  }

  public synchronized void removeOnButtonClick( comctl32.Toolbar.ButtonClickHandler handler ) {
     onButtonClick = (comctl32.Toolbar.ButtonClickHandler)com.ms.lang.Delegate.remove( onButtonClick, handler );
  }

  public synchronized void addOnChange( com.ms.wfc.core.EventHandler handler ) {
     onChange = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.combine( onChange, handler );
  }

  public synchronized void removeOnChange( com.ms.wfc.core.EventHandler handler ) {
     onChange = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.remove( onChange, handler );
  }

  public synchronized void addOnOLEStartDrag( comctl32.Toolbar.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.Toolbar.OLEStartDragHandler)com.ms.lang.Delegate.combine( onOLEStartDrag, handler );
  }

  public synchronized void removeOnOLEStartDrag( comctl32.Toolbar.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.Toolbar.OLEStartDragHandler)com.ms.lang.Delegate.remove( onOLEStartDrag, handler );
  }

  public synchronized void addOnOLEGiveFeedback( comctl32.Toolbar.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.Toolbar.OLEGiveFeedbackHandler)com.ms.lang.Delegate.combine( onOLEGiveFeedback, handler );
  }

  public synchronized void removeOnOLEGiveFeedback( comctl32.Toolbar.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.Toolbar.OLEGiveFeedbackHandler)com.ms.lang.Delegate.remove( onOLEGiveFeedback, handler );
  }

  public synchronized void addOnOLESetData( comctl32.Toolbar.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.Toolbar.OLESetDataHandler)com.ms.lang.Delegate.combine( onOLESetData, handler );
  }

  public synchronized void removeOnOLESetData( comctl32.Toolbar.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.Toolbar.OLESetDataHandler)com.ms.lang.Delegate.remove( onOLESetData, handler );
  }

  public synchronized void addOnOLECompleteDrag( comctl32.Toolbar.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.Toolbar.OLECompleteDragHandler)com.ms.lang.Delegate.combine( onOLECompleteDrag, handler );
  }

  public synchronized void removeOnOLECompleteDrag( comctl32.Toolbar.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.Toolbar.OLECompleteDragHandler)com.ms.lang.Delegate.remove( onOLECompleteDrag, handler );
  }

  public synchronized void addOnOLEDragOver( comctl32.Toolbar.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.Toolbar.OLEDragOverHandler)com.ms.lang.Delegate.combine( onOLEDragOver, handler );
  }

  public synchronized void removeOnOLEDragOver( comctl32.Toolbar.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.Toolbar.OLEDragOverHandler)com.ms.lang.Delegate.remove( onOLEDragOver, handler );
  }

  public synchronized void addOnOLEDragDrop( comctl32.Toolbar.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.Toolbar.OLEDragDropHandler)com.ms.lang.Delegate.combine( onOLEDragDrop, handler );
  }

  public synchronized void removeOnOLEDragDrop( comctl32.Toolbar.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.Toolbar.OLEDragDropHandler)com.ms.lang.Delegate.remove( onOLEDragDrop, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo AppearancePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "appearance", comctl32.AppearanceConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether or not controls, Forms or an MDIForm are painted at run time with 3-D effects." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334E9" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDF8 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo AllowCustomizePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "allowCustomize", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value which determines if users can customize the Toolbar." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334EA" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo EnabledPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "enabled", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines whether a form or control can respond to user-generated events." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334EC" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFE ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hWndPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "hWnd", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to a form or control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334ED" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFD ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MouseIconPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "mouseIcon", com.ms.wfc.ui.Image.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Sets a custom mouse icon." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334EE" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000004 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MousePointerPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "mousePointer", comctl32.MousePointerConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the type of mouse pointer displayed when over part of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334EF" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ShowTipsPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "showTips", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Enables/disables ToolTips for tool buttons" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334F1" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000006 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo BorderStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "borderStyle", comctl32.BorderStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the border style" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334F2" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE08 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo WrappablePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "wrappable", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether buttons can be wrapped or not" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334F3" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000007 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ButtonHeightPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "buttonHeight", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the height of the buttons" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334F4" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000008 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ButtonWidthPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "buttonWidth", float.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the width of the buttons" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334F5" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000009 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo HelpContextIDPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "helpContextID", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Help context of topic to be displayed when inquiring help from Toolbar Customize dialog." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336AC" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000D ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo HelpFilePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "helpFile", String.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Help file to be used when inquiring help from Toolbar Customize dialog." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CA" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000E ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDropModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Toolbar.Toolbar.class, "OLEDropMode", comctl32.OLEDropConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drop target." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033692" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060F ) } );

     public static final com.ms.wfc.core.EventInfo ButtonClickEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "buttonClick", comctl32.Toolbar.ButtonClickHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when the user clicks on a Button object in a Toolbar control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334FB" ) } );

     public static final com.ms.wfc.core.EventInfo ChangeEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "change", com.ms.wfc.core.EventHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Generated after the end user customizes a Toolbar control\'s appearance using the Customize Toolbar dialog box." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000334FC" ) } );

     public static final com.ms.wfc.core.EventInfo OLEStartDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "OLEStartDrag", comctl32.Toolbar.OLEStartDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEStartDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CF" ) } );

     public static final com.ms.wfc.core.EventInfo OLEGiveFeedbackEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "OLEGiveFeedback", comctl32.Toolbar.OLEGiveFeedbackHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEGiveFeedback event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D0" ) } );

     public static final com.ms.wfc.core.EventInfo OLESetDataEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "OLESetData", comctl32.Toolbar.OLESetDataHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLESetData event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D1" ) } );

     public static final com.ms.wfc.core.EventInfo OLECompleteDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "OLECompleteDrag", comctl32.Toolbar.OLECompleteDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLECompleteDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D2" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragOverEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "OLEDragOver", comctl32.Toolbar.OLEDragOverHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragOver event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D3" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragDropEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Toolbar.Toolbar.class, "OLEDragDrop", comctl32.Toolbar.OLEDragDropHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragDrop event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D4" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.Toolbar.Toolbar.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( AppearancePropertyInfo );
        props.add( AllowCustomizePropertyInfo );
        props.add( EnabledPropertyInfo );
        props.add( hWndPropertyInfo );
        props.add( MouseIconPropertyInfo );
        props.add( MousePointerPropertyInfo );
        props.add( ShowTipsPropertyInfo );
        props.add( BorderStylePropertyInfo );
        props.add( WrappablePropertyInfo );
        props.add( ButtonHeightPropertyInfo );
        props.add( ButtonWidthPropertyInfo );
        props.add( HelpContextIDPropertyInfo );
        props.add( HelpFilePropertyInfo );
        props.add( OLEDropModePropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
        events.add( ButtonClickEventInfo );
        events.add( ChangeEventInfo );
        events.add( com.ms.wfc.ui.Control.ClassInfo.click );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseDown );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseMove );
        events.add( com.ms.wfc.ui.Control.ClassInfo.mouseUp );
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
