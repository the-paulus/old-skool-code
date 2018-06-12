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

package comctl32.ImageList;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class ImageList extends com.ms.wfc.ui.AxHost
{
  private comctl32.IImageList _jcommem_ocx;
  private comctl32.ImageList.ImageListEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;


  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public ImageList()
  {
     super( "{58DA8D8F-9D6A-101B-AFC0-4210102A8DA7}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, comctl32.ImageListEvents.class);
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
        _jcommem_ocx = (comctl32.IImageList)(getOcx());
        _jcommem_eventmulticaster1 = new comctl32.ImageList.ImageListEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  public synchronized short getImageHeight()  {
     return _jcommem_ocx.getImageHeight();
  }


  public synchronized void setImageHeight(short psImageHeight)  {
     _jcommem_ocx.setImageHeight(psImageHeight);
  }


  public synchronized short getImageWidth()  {
     return _jcommem_ocx.getImageWidth();
  }


  public synchronized void setImageWidth(short psImageWidth)  {
     _jcommem_ocx.setImageWidth(psImageWidth);
  }


  public synchronized com.ms.wfc.ui.Color getMaskColor()  {
     return com.ms.wfc.ui.AxHost.getColorFromOleColor(_jcommem_ocx.getMaskColor());
  }


  public synchronized void setMaskColor(com.ms.wfc.ui.Color pclrMaskColor)  {
     _jcommem_ocx.setMaskColor(com.ms.wfc.ui.AxHost.getOleColorFromColor( pclrMaskColor ));
  }


  public synchronized boolean getUseMaskColor()  {
     return _jcommem_ocx.getUseMaskColor();
  }


  public synchronized void setUseMaskColor(boolean pbState)  {
     _jcommem_ocx.setUseMaskColor(pbState);
  }


  public synchronized comctl32.IImages getListImages()  {
     return _jcommem_ocx.getListImages();
  }


  public synchronized void setListImages(comctl32.IImages ppListImages)  {
     _jcommem_ocx.setListImages(ppListImages);
  }


  public synchronized int getHImageList()  {
     return _jcommem_ocx.getHImageList();
  }


  public synchronized void setHImageList(int phImageList)  {
     _jcommem_ocx.setHImageList(phImageList);
  }


  public synchronized com.ms.wfc.ui.Color getBackColor()  {
     return com.ms.wfc.ui.AxHost.getColorFromOleColor(_jcommem_ocx.getBackColor());
  }


  public synchronized void setBackColor(com.ms.wfc.ui.Color pclrBackColor)  {
     _jcommem_ocx.setBackColor(com.ms.wfc.ui.AxHost.getOleColorFromColor( pclrBackColor ));
  }


  public synchronized com.ms.wfc.ui.Image Overlay(Variant Key1, Variant Key2)  {
     return com.ms.wfc.ui.AxHost.getPictureFromIPictureDisp(_jcommem_ocx.Overlay(Key1, Key2));
  }


  /** @hidden */
  public synchronized void AboutBox()  {
     _jcommem_ocx.AboutBox();
  }



  //------------------------------------------------------------------------
  // These methods add and remove event handlers.
  //------------------------------------------------------------------------

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ImageHeightPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ImageList.ImageList.class, "imageHeight", short.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the height of a ListImage object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033471" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ImageWidthPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ImageList.ImageList.class, "imageWidth", short.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the width of ListImage objects in an ImageList control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033472" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo MaskColorPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ImageList.ImageList.class, "maskColor", com.ms.wfc.ui.Color.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value which determines the color to be transparent in ImageList graphical operations." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033473" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000003 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo UseMaskColorPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ImageList.ImageList.class, "useMaskColor", boolean.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets a value which determines if the ImageList control will use the MaskColor property." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x000336A8" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000007 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo hImageListPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ImageList.ImageList.class, "hImageList", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns a handle to an ImageList control." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033475" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000005 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo BackColorPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        comctl32.ImageList.ImageList.class, "backColor", com.ms.wfc.ui.Color.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/sets the background color used to display text and graphics in an object." ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\comctl1.hlp", "0x00033476" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0xFFFFFE0B ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, comctl32.ImageList.ImageList.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( ImageHeightPropertyInfo );
        props.add( ImageWidthPropertyInfo );
        props.add( MaskColorPropertyInfo );
        props.add( UseMaskColorPropertyInfo );
        props.add( hImageListPropertyInfo );
        props.add( BackColorPropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
     }
  }
}
