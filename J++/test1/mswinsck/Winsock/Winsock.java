//
// Auto-generated using JActiveX.EXE 5.00.2918
//   ("C:\PROGRAM FILES\MICROSOFT VISUAL STUDIO\VJ98\jactivex.exe" /wfc /t "C:\PROGRAM FILES\MICROSOFT VISUAL STUDIO\VJ98\wfc.jnf" /w /xi /X:rkc /l "C:\WINDOWS\TEMP\jvcB182.TMP" /nologo /d "M:\Jpp\test1" "C:\WINDOWS\SYSTEM\MSWINSCK.OCX")
//
// WARNING: Do not remove the comments that include "@com" directives.
// This source file must be compiled by a @com-aware compiler.
// If you are using the Microsoft Visual J++ compiler, you must use
// version 1.02.3920 or later. Previous versions will not issue an error
// but will not generate COM-enabled class files.
//

package mswinsck.Winsock;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

public class Winsock extends com.ms.wfc.ui.AxHost
{
  private mswinsck.IMSWinsockControl _jcommem_ocx;
  private mswinsck.Winsock.WinsockEventMulticaster _jcommem_eventmulticaster1;
  private com.ms.com.ConnectionPointCookie _jcommem_cookie1;

  mswinsck.Winsock.ErrorHandler onError;
  mswinsck.Winsock.DataArrivalHandler onDataArrival;
  com.ms.wfc.core.EventHandler onConnect;
  mswinsck.Winsock.ConnectionRequestHandler onConnectionRequest;
  com.ms.wfc.core.EventHandler onClose;
  mswinsck.Winsock.SendProgressHandler onSendProgress;
  com.ms.wfc.core.EventHandler onSendComplete;

  //------------------------------------------------------------------------
  // Constructors
  //------------------------------------------------------------------------

  public Winsock()
  {
     super( "{248DD896-BB45-11CF-9ABC-0080C7E7B78D}" );
     super.setAboutBoxDelegate( new com.ms.wfc.ui.AxHost.AboutBoxDelegate( this.AboutBox ) );
  }

  //------------------------------------------------------------------------
  // These methods override com.ms.wfc.ui.AxHost methods.
  //------------------------------------------------------------------------

  protected synchronized void createSink()
  {
     try
     {
        _jcommem_cookie1 = new com.ms.com.ConnectionPointCookie(_jcommem_ocx, _jcommem_eventmulticaster1, mswinsck.DMSWinsockControlEvents.class);
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
        _jcommem_ocx = (mswinsck.IMSWinsockControl)(getOcx());
        _jcommem_eventmulticaster1 = new mswinsck.Winsock.WinsockEventMulticaster( this );
     }
     catch( Exception _jcom_e )
     {
     }
  }

  //------------------------------------------------------------------------
  // These methods invoke methods directly on the ActiveX Control.
  //------------------------------------------------------------------------

  /** @hidden */
  public synchronized void AboutBox()  {
     _jcommem_ocx.AboutBox();
  }


  public synchronized int getProtocol()  {
     return _jcommem_ocx.getProtocol();
  }


  public synchronized void setProtocol(int Protocol)  {
     _jcommem_ocx.setProtocol(Protocol);
  }


  public synchronized String getRemoteHostIP()  {
     return _jcommem_ocx.getRemoteHostIP();
  }


  public synchronized String getLocalHostName()  {
     return _jcommem_ocx.getLocalHostName();
  }


  public synchronized String getLocalIP()  {
     return _jcommem_ocx.getLocalIP();
  }


  public synchronized int getSocketHandle()  {
     return _jcommem_ocx.getSocketHandle();
  }


  /** @hidden */
  public synchronized String get_RemoteHost()  {
     return _jcommem_ocx.get_RemoteHost();
  }


  /** @hidden */
  public synchronized void set_RemoteHost(String RemoteHost)  {
     _jcommem_ocx.set_RemoteHost(RemoteHost);
  }


  public synchronized int getRemotePort()  {
     return _jcommem_ocx.getRemotePort();
  }


  public synchronized void setRemotePort(int RemotePort)  {
     _jcommem_ocx.setRemotePort(RemotePort);
  }


  public synchronized int getLocalPort()  {
     return _jcommem_ocx.getLocalPort();
  }


  public synchronized void setLocalPort(int LocalPort)  {
     _jcommem_ocx.setLocalPort(LocalPort);
  }


  public synchronized short getState()  {
     return _jcommem_ocx.getState();
  }


  public synchronized int getBytesReceived()  {
     return _jcommem_ocx.getBytesReceived();
  }


  public synchronized void Connect(Variant RemoteHost, Variant RemotePort)  {
     _jcommem_ocx.Connect(RemoteHost, RemotePort);
  }


  public synchronized void Listen()  {
     _jcommem_ocx.Listen();
  }


  public synchronized void Accept(int requestID)  {
     _jcommem_ocx.Accept(requestID);
  }


  public synchronized void SendData(Variant data)  {
     _jcommem_ocx.SendData(data);
  }


  public synchronized void GetData(Variant data, Variant type, Variant maxLen)  {
     _jcommem_ocx.GetData(data, type, maxLen);
  }


  public synchronized void PeekData(Variant data, Variant type, Variant maxLen)  {
     _jcommem_ocx.PeekData(data, type, maxLen);
  }


  public synchronized void Close()  {
     _jcommem_ocx.Close();
  }


  public synchronized void Bind(Variant LocalPort, Variant LocalIP)  {
     _jcommem_ocx.Bind(LocalPort, LocalIP);
  }


  public synchronized String getRemoteHost()  {
     return _jcommem_ocx.getRemoteHost();
  }


  public synchronized void setRemoteHost(String RemoteHost)  {
     _jcommem_ocx.setRemoteHost(RemoteHost);
  }



  //------------------------------------------------------------------------
  // These methods add and remove event handlers.
  //------------------------------------------------------------------------

  public synchronized void addOnError( mswinsck.Winsock.ErrorHandler handler ) {
     onError = (mswinsck.Winsock.ErrorHandler)com.ms.lang.Delegate.combine( onError, handler );
  }

  public synchronized void removeOnError( mswinsck.Winsock.ErrorHandler handler ) {
     onError = (mswinsck.Winsock.ErrorHandler)com.ms.lang.Delegate.remove( onError, handler );
  }

  public synchronized void addOnDataArrival( mswinsck.Winsock.DataArrivalHandler handler ) {
     onDataArrival = (mswinsck.Winsock.DataArrivalHandler)com.ms.lang.Delegate.combine( onDataArrival, handler );
  }

  public synchronized void removeOnDataArrival( mswinsck.Winsock.DataArrivalHandler handler ) {
     onDataArrival = (mswinsck.Winsock.DataArrivalHandler)com.ms.lang.Delegate.remove( onDataArrival, handler );
  }

  public synchronized void addOnConnect( com.ms.wfc.core.EventHandler handler ) {
     onConnect = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.combine( onConnect, handler );
  }

  public synchronized void removeOnConnect( com.ms.wfc.core.EventHandler handler ) {
     onConnect = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.remove( onConnect, handler );
  }

  public synchronized void addOnConnectionRequest( mswinsck.Winsock.ConnectionRequestHandler handler ) {
     onConnectionRequest = (mswinsck.Winsock.ConnectionRequestHandler)com.ms.lang.Delegate.combine( onConnectionRequest, handler );
  }

  public synchronized void removeOnConnectionRequest( mswinsck.Winsock.ConnectionRequestHandler handler ) {
     onConnectionRequest = (mswinsck.Winsock.ConnectionRequestHandler)com.ms.lang.Delegate.remove( onConnectionRequest, handler );
  }

  public synchronized void addOnClose( com.ms.wfc.core.EventHandler handler ) {
     onClose = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.combine( onClose, handler );
  }

  public synchronized void removeOnClose( com.ms.wfc.core.EventHandler handler ) {
     onClose = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.remove( onClose, handler );
  }

  public synchronized void addOnSendProgress( mswinsck.Winsock.SendProgressHandler handler ) {
     onSendProgress = (mswinsck.Winsock.SendProgressHandler)com.ms.lang.Delegate.combine( onSendProgress, handler );
  }

  public synchronized void removeOnSendProgress( mswinsck.Winsock.SendProgressHandler handler ) {
     onSendProgress = (mswinsck.Winsock.SendProgressHandler)com.ms.lang.Delegate.remove( onSendProgress, handler );
  }

  public synchronized void addOnSendComplete( com.ms.wfc.core.EventHandler handler ) {
     onSendComplete = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.combine( onSendComplete, handler );
  }

  public synchronized void removeOnSendComplete( com.ms.wfc.core.EventHandler handler ) {
     onSendComplete = (com.ms.wfc.core.EventHandler)com.ms.lang.Delegate.remove( onSendComplete, handler );
  }

  //---------------------------------------------------------------------------
  // This class provides information about the control's events and properties.
  //---------------------------------------------------------------------------

  public static class ClassInfo extends com.ms.wfc.ui.AxHost.ClassInfo
  {
     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo ProtocolPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        mswinsck.Winsock.Winsock.class, "protocol", mswinsck.ProtocolConstants.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets the socket protocol" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005303F" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000003 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo RemotePortPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        mswinsck.Winsock.Winsock.class, "remotePort", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets the port to be connected to on the remote computer" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005302C" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000001 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo LocalPortPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        mswinsck.Winsock.Winsock.class, "localPort", int.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets the port used on the local computer" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005302D" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x00000002 ) } );

     public static final com.ms.wfc.ui.AxHost.AxPropertyInfo RemoteHostPropertyInfo = new com.ms.wfc.ui.AxHost.AxPropertyInfo(
        mswinsck.Winsock.Winsock.class, "remoteHost", String.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Returns/Sets the name used to identify the remote computer" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005302B" ),
           com.ms.wfc.core.PersistableAttribute.NO,
           new com.ms.wfc.ui.AxHost.DispidAttribute( 0x0000000A ) } );

     public static final com.ms.wfc.core.EventInfo ErrorEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "error", mswinsck.Winsock.ErrorHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Error occurred" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x00053048" ) } );

     public static final com.ms.wfc.core.EventInfo DataArrivalEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "dataArrival", mswinsck.Winsock.DataArrivalHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when data has been received from the remote computer" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x00053049" ) } );

     public static final com.ms.wfc.core.EventInfo ConnectEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "connect", com.ms.wfc.core.EventHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs connect operation is completed" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005304A" ) } );

     public static final com.ms.wfc.core.EventInfo ConnectionRequestEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "connectionRequest", mswinsck.Winsock.ConnectionRequestHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when a remote client is attempting to connect" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005304B" ) } );

     public static final com.ms.wfc.core.EventInfo CloseEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "close", com.ms.wfc.core.EventHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs when the connection has been closed" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005304C" ) } );

     public static final com.ms.wfc.core.EventInfo SendProgressEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "sendProgress", mswinsck.Winsock.SendProgressHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs during process of sending data" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005304D" ) } );

     public static final com.ms.wfc.core.EventInfo SendCompleteEventInfo = new com.ms.wfc.core.EventInfo(
        mswinsck.Winsock.Winsock.class, "sendComplete", com.ms.wfc.core.EventHandler.class,
        new com.ms.wfc.core.MemberAttribute[] { 
           new com.ms.wfc.core.DescriptionAttribute( "Occurs after a send operation has completed" ),
           new com.ms.wfc.core.HelpAttribute( "C:\\WINDOWS\\HELP\\MSWNSK98.chm", "0x0005304E" ) } );

     public void getAttributes( com.ms.wfc.core.IAttributes attrs )
     {
        com.ms.wfc.ui.AxHost.getClientAttributes( this, mswinsck.Winsock.Winsock.class, attrs );
     }

     public void getProperties( com.ms.wfc.core.IProperties props )
     {
        super.getProperties( props );
        props.add( ProtocolPropertyInfo );
        props.add( RemotePortPropertyInfo );
        props.add( LocalPortPropertyInfo );
        props.add( RemoteHostPropertyInfo );
     }

     public void getEvents( com.ms.wfc.core.IEvents events )
     {
        super.getEvents( events );
        events.add( ErrorEventInfo );
        events.add( DataArrivalEventInfo );
        events.add( ConnectEventInfo );
        events.add( ConnectionRequestEventInfo );
        events.add( CloseEventInfo );
        events.add( SendProgressEventInfo );
        events.add( SendCompleteEventInfo );
     }
  }
}
