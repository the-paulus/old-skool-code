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

package comctl32.Slider;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class Slider extends com.ms.wfc.ui.AxHost
{
  private comctl32.ISlider _jcommem_ocx;
  private comctl32.Slider.SliderEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  com.ms.wfc.core.EventHandler onScroll;
  com.ms.wfc.core.EventHandler onChange;
  comctl32.Slider.OLEStartDragHandler onOLEStartDrag;
  comctl32.Slider.OLEGiveFeedbackHandler onOLEGiveFeedback;
  comctl32.Slider.OLESetDataHandler onOLESetData;
  comctl32.Slider.OLECompleteDragHandler onOLECompleteDrag;
  comctl32.Slider.OLEDragOverHandler onOLEDragOver;
  comctl32.Slider.OLEDragDropHandler onOLEDragDrop;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public Slider()
  {
     super( "{373FF7F0-EB8B-11CD-8820-08002B2F4F5A}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.ISliderEvents.class);
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
        _jcommem_ocx = (comctl32.ISlider)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.Slider.SliderEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  /** @hidden */
  public synchronized int get_Value()  {
     return _jcommem_ocx.get_Value();
  }


  /** @hidden */
  public synchronized void set_Value(int plValue)  {
     _jcommem_ocx.set_Value(plValue);
  }


  public synchronized int getLargeChange()  {
     return _jcommem_ocx.getLargeChange();
  }


  public synchronized void setLargeChange(int plLargeChange)  {
     _jcommem_ocx.setLargeChange(plLargeChange);
  }


  public synchronized int getSmallChange()  {
     return _jcommem_ocx.getSmallChange();
  }


  public synchronized void setSmallChange(int plSmallChange)  {
     _jcommem_ocx.setSmallChange(plSmallChange);
  }


  public synchronized int getMax()  {
     return _jcommem_ocx.getMax();
  }


  public synchronized void setMax(int plMax)  {
     _jcommem_ocx.setMax(plMax);
  }


  public synchronized int getMin()  {
     return _jcommem_ocx.getMin();
  }


  public synchronized void setMin(int plMin)  {
     _jcommem_ocx.setMin(plMin);
  }


  public synchronized int getOrientation()  {
     return _jcommem_ocx.getOrientation();
  }


  public synchronized void setOrientation(int pOrientation)  {
     _jcommem_ocx.setOrientation(pOrientation);
  }


  public synchronized boolean getSelectRange()  {
     return _jcommem_ocx.getSelectRange();
  }


  public synchronized void setSelectRange(boolean pbSelectRange)  {
     _jcommem_ocx.setSelectRange(pbSelectRange);
  }


  public synchronized int getSelStart()  {
     return _jcommem_ocx.getSelStart();
  }


  public synchronized void setSelStart(int plSelStart)  {
     _jcommem_ocx.setSelStart(plSelStart);
  }


  public synchronized int getSelLength()  {
     return _jcommem_ocx.getSelLength();
  }


  public synchronized void setSelLength(int plSelLength)  {
     _jcommem_ocx.setSelLength(plSelLength);
  }


  public synchronized int getTickStyle()  {
     return _jcommem_ocx.getTickStyle();
  }


  public synchronized void setTickStyle(int pTickStyle)  {
     _jcommem_ocx.setTickStyle(pTickStyle);
  }


  public synchronized int getTickFrequency()  {
     return _jcommem_ocx.getTickFrequency();
  }


  public synchronized void setTickFrequency(int plTickFrequency)  {
     _jcommem_ocx.setTickFrequency(plTickFrequency);
  }


  public synchronized int getValue()  {
     return _jcommem_ocx.getValue();
  }


  public synchronized void setValue(int plValue)  {
     _jcommem_ocx.setValue(plValue);
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


  public synchronized int getBorderStyle()  {
     return _jcommem_ocx.getBorderStyle();
  }


  public synchronized void setBorderStyle(int psBorderStyle)  {
     _jcommem_ocx.setBorderStyle(psBorderStyle);
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


  public synchronized void ClearSel()  {
     _jcommem_ocx.ClearSel();
  }


  /** @hidden */
  public synchronized void DoClick()  {
     _jcommem_ocx.DoClick();
  }


  public synchronized int getGetNumTicks()  {
     return _jcommem_ocx.getGetNumTicks();
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

  public synchronized void addOnScroll( com.ms.wfc.core.EventHandler handler ) {
     onScroll = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.combine( onScroll, handler );
  }

  public synchronized void removeOnScroll( com.ms.wfc.core.EventHandler handler ) {
     onScroll = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.remove( onScroll, handler );
  }

  public synchronized void addOnChange( com.ms.wfc.core.EventHandler handler ) {
     onChange = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.combine( onChange, handler );
  }

  public synchronized void removeOnChange( com.ms.wfc.core.EventHandler handler ) {
     onChange = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.remove( onChange, handler );
  }

  public synchronized void addOnOLEStartDrag( comctl32.Slider.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.Slider.OLEStartDragHandler)com.ms.lang.Delegate.combine( onOLEStartDrag, handler );
  }

  public synchronized void removeOnOLEStartDrag( comctl32.Slider.OLEStartDragHandler handler ) {
     onOLEStartDrag = (comctl32.Slider.OLEStartDragHandler)com.ms.lang.Delegate.remove( onOLEStartDrag, handler );
  }

  public synchronized void addOnOLEGiveFeedback( comctl32.Slider.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.Slider.OLEGiveFeedbackHandler)com.ms.lang.Delegate.combine( onOLEGiveFeedback, handler );
  }

  public synchronized void removeOnOLEGiveFeedback( comctl32.Slider.OLEGiveFeedbackHandler handler ) {
     onOLEGiveFeedback = (comctl32.Slider.OLEGiveFeedbackHandler)com.ms.lang.Delegate.remove( onOLEGiveFeedback, handler );
  }

  public synchronized void addOnOLESetData( comctl32.Slider.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.Slider.OLESetDataHandler)com.ms.lang.Delegate.combine( onOLESetData, handler );
  }

  public synchronized void removeOnOLESetData( comctl32.Slider.OLESetDataHandler handler ) {
     onOLESetData = (comctl32.Slider.OLESetDataHandler)com.ms.lang.Delegate.remove( onOLESetData, handler );
  }

  public synchronized void addOnOLECompleteDrag( comctl32.Slider.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.Slider.OLECompleteDragHandler)com.ms.lang.Delegate.combine( onOLECompleteDrag, handler );
  }

  public synchronized void removeOnOLECompleteDrag( comctl32.Slider.OLECompleteDragHandler handler ) {
     onOLECompleteDrag = (comctl32.Slider.OLECompleteDragHandler)com.ms.lang.Delegate.remove( onOLECompleteDrag, handler );
  }

  public synchronized void addOnOLEDragOver( comctl32.Slider.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.Slider.OLEDragOverHandler)com.ms.lang.Delegate.combine( onOLEDragOver, handler );
  }

  public synchronized void removeOnOLEDragOver( comctl32.Slider.OLEDragOverHandler handler ) {
     onOLEDragOver = (comctl32.Slider.OLEDragOverHandler)com.ms.lang.Delegate.remove( onOLEDragOver, handler );
  }

  public synchronized void addOnOLEDragDrop( comctl32.Slider.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.Slider.OLEDragDropHandler)com.ms.lang.Delegate.combine( onOLEDragDrop, handler );
  }

  public synchronized void removeOnOLEDragDrop( comctl32.Slider.OLEDragDropHandler handler ) {
     onOLEDragDrop = (comctl32.Slider.OLEDragDropHandler)com.ms.lang.Delegate.remove( onOLEDragDrop, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo LargeChangePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "largeChange", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the increment value when the PageDown or PageUp key is pressed." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003350B" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SmallChangePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "smallChange", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the increment value when the left or right arrow key is pressed." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003350C" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MaxPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "max", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the maximum value of a control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003350D" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000003 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MinPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "min", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the minimum value of a control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003350E" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000004 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OrientationPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "orientation", comctl32.OrientationConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the orientation of a Slider control, horizontal or vertical." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003350F" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000005 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SelectRangePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "selectRange", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets whether or not a Slider control can have a select range." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033510" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000006 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SelStartPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "selStart", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the value where a selection starts." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033511" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000007 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo SelLengthPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "selLength", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the length of a selection." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033512" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000008 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo TickStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "tickStyle", comctl32.TickStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets where ticks appear on a Slider control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033513" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000009 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo TickFrequencyPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "tickFrequency", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the ratio of ticks on a Slider control; 1tick every n increments." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033514" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000A ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ValuePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "value", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the value of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033515" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000B ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MouseIconPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "mouseIcon", com.ms.wfc.ui.Image.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Sets a custom mouse icon." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033516" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000C ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MousePointerPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "mousePointer", comctl32.MousePointerConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the type of mouse pointer displayed when over part of an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033517" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000D ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo EnabledPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "enabled", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value that determines whether a form or control can respond to user-generated events." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033518" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFE ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hWndPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "hWnd", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to a form or control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033519" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFDFD ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo BorderStylePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "borderStyle", comctl32.BorderStyleConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the border style for an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x0003351A" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE08 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo OLEDropModePropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.Slider.Slider.class, "OLEDropMode", comctl32.OLEDropConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets whether this control can act as an OLE drop target." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033692" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000060F ) } );

     public static final com.ms.wfc.core.EventInfo ScrollEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "scroll", com.ms.wfc.core.EventHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Slider scroll event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033526" ) } );

     public static final com.ms.wfc.core.EventInfo ChangeEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "change", com.ms.wfc.core.EventHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Indicates that the contents of a control have changed." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033527" ) } );

     public static final com.ms.wfc.core.EventInfo OLEStartDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "OLEStartDrag", comctl32.Slider.OLEStartDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEStartDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336CF" ) } );

     public static final com.ms.wfc.core.EventInfo OLEGiveFeedbackEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "OLEGiveFeedback", comctl32.Slider.OLEGiveFeedbackHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEGiveFeedback event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D0" ) } );

     public static final com.ms.wfc.core.EventInfo OLESetDataEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "OLESetData", comctl32.Slider.OLESetDataHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLESetData event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D1" ) } );

     public static final com.ms.wfc.core.EventInfo OLECompleteDragEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "OLECompleteDrag", comctl32.Slider.OLECompleteDragHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLECompleteDrag event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D2" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragOverEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "OLEDragOver", comctl32.Slider.OLEDragOverHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragOver event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D3" ) } );

     public static final com.ms.wfc.core.EventInfo OLEDragDropEventInfo = new com.ms.wfc.core.EventInfo(
        comctl32.Slider.Slider.class, "OLEDragDrop", comctl32.Slider.OLEDragDropHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "OLEDragDrop event" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336D4" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.Slider.Slider.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( LargeChangePropertyInfo );
        props.add( SmallChangePropertyInfo );
        props.add( MaxPropertyInfo );
        props.add( MinPropertyInfo );
        props.add( OrientationPropertyInfo );
        props.add( SelectRangePropertyInfo );
        props.add( SelStartPropertyInfo );
        props.add( SelLengthPropertyInfo );
        props.add( TickStylePropertyInfo );
        props.add( TickFrequencyPropertyInfo );
        props.add( ValuePropertyInfo );
        props.add( MouseIconPropertyInfo );
        props.add( MousePointerPropertyInfo );
        props.add( EnabledPropertyInfo );
        props.add( hWndPropertyInfo );
        props.add( BorderStylePropertyInfo );
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
        events.add( ScrollEventInfo );
        events.add( ChangeEventInfo );
        events.add( OLEStartDragEventInfo );
        events.add( OLEGiveFeedbackEventInfo );
        events.add( OLESetDataEventInfo );
        events.add( OLECompleteDragEventInfo );
        events.add( OLEDragOverEventInfo );
        events.add( OLEDragDropEventInfo );
     }
  }
}
