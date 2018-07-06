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

package mswinsck;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

// Dual interface IMSWinsockControl
/** @com.interface(iid=248DD892-BB45-11CF-9ABC-0080C7E7B78D, thread=AUTO, type=DUAL) */
public interface IMSWinsockControl extends IUnknown
{
  /** @com.method(vtoffset=4, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public void AboutBox();

  /** @com.method(vtoffset=5, dispid=3, type=PROPGET, name="Protocol", name2="getProtocol", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getProtocol();

  /** @com.method(vtoffset=6, dispid=3, type=PROPPUT, name="Protocol", name2="putProtocol", addFlagsVtable=4)
      @com.parameters([in,type=I4] Protocol) */
  public void setProtocol(int Protocol);

  /** @com.method(vtoffset=7, dispid=4, type=PROPGET, name="RemoteHostIP", name2="getRemoteHostIP", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getRemoteHostIP();

  /** @com.method(vtoffset=8, dispid=5, type=PROPGET, name="LocalHostName", name2="getLocalHostName", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getLocalHostName();

  /** @com.method(vtoffset=9, dispid=6, type=PROPGET, name="LocalIP", name2="getLocalIP", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getLocalIP();

  /** @com.method(vtoffset=10, dispid=7, type=PROPGET, name="SocketHandle", name2="getSocketHandle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getSocketHandle();

  /** @com.method(vtoffset=11, dispid=0, type=PROPGET, name="_RemoteHost", name2="get_RemoteHost", addFlagsVtable=4)
      @com.parameters([type=STRING] return)
      @hidden */
  public String get_RemoteHost();

  /** @com.method(vtoffset=12, dispid=0, type=PROPPUT, name="_RemoteHost", name2="put_RemoteHost", addFlagsVtable=4)
      @com.parameters([in,type=STRING] RemoteHost)
      @hidden */
  public void set_RemoteHost(String RemoteHost);

  /** @com.method(vtoffset=13, dispid=1, type=PROPGET, name="RemotePort", name2="getRemotePort", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getRemotePort();

  /** @com.method(vtoffset=14, dispid=1, type=PROPPUT, name="RemotePort", name2="putRemotePort", addFlagsVtable=4)
      @com.parameters([in,type=I4] RemotePort) */
  public void setRemotePort(int RemotePort);

  /** @com.method(vtoffset=15, dispid=2, type=PROPGET, name="LocalPort", name2="getLocalPort", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getLocalPort();

  /** @com.method(vtoffset=16, dispid=2, type=PROPPUT, name="LocalPort", name2="putLocalPort", addFlagsVtable=4)
      @com.parameters([in,type=I4] LocalPort) */
  public void setLocalPort(int LocalPort);

  /** @com.method(vtoffset=17, dispid=8, type=PROPGET, name="State", name2="getState", addFlagsVtable=4)
      @com.parameters([type=I2] return) */
  public short getState();

  /** @com.method(vtoffset=18, dispid=9, type=PROPGET, name="BytesReceived", name2="getBytesReceived", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public int getBytesReceived();

  /** @com.method(vtoffset=19, dispid=64, type=METHOD, name="Connect", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] RemoteHost, [in,type=VARIANT] RemotePort) */
  public void Connect(Variant RemoteHost, Variant RemotePort);

  /** @com.method(vtoffset=20, dispid=65, type=METHOD, name="Listen", addFlagsVtable=4)
      @com.parameters() */
  public void Listen();

  /** @com.method(vtoffset=21, dispid=66, type=METHOD, name="Accept", addFlagsVtable=4)
      @com.parameters([in,type=I4] requestID) */
  public void Accept(int requestID);

  /** @com.method(vtoffset=22, dispid=67, type=METHOD, name="SendData", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] data) */
  public void SendData(Variant data);

  /** @com.method(vtoffset=23, dispid=68, type=METHOD, name="GetData", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] data, [in,type=VARIANT] type, [in,type=VARIANT] maxLen) */
  public void GetData(Variant data, Variant type, Variant maxLen);

  /** @com.method(vtoffset=24, dispid=69, type=METHOD, name="PeekData", addFlagsVtable=4)
      @com.parameters([in,out,elementType=VARIANT,type=PTR] data, [in,type=VARIANT] type, [in,type=VARIANT] maxLen) */
  public void PeekData(Variant data, Variant type, Variant maxLen);

  /** @com.method(vtoffset=25, dispid=70, type=METHOD, name="Close", addFlagsVtable=4)
      @com.parameters() */
  public void Close();

  /** @com.method(vtoffset=26, dispid=71, type=METHOD, name="Bind", addFlagsVtable=4)
      @com.parameters([in,type=VARIANT] LocalPort, [in,type=VARIANT] LocalIP) */
  public void Bind(Variant LocalPort, Variant LocalIP);

  /** @com.method(vtoffset=27, dispid=10, type=PROPGET, name="RemoteHost", name2="getRemoteHost", addFlagsVtable=4)
      @com.parameters([type=STRING] return) */
  public String getRemoteHost();

  /** @com.method(vtoffset=28, dispid=10, type=PROPPUT, name="RemoteHost", name2="putRemoteHost", addFlagsVtable=4)
      @com.parameters([in,type=STRING] RemoteHost) */
  public void setRemoteHost(String RemoteHost);


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0x248dd892, (short)0xbb45, (short)0x11cf, (byte)0x9a, (byte)0xbc, (byte)0x0, (byte)0x80, (byte)0xc7, (byte)0xe7, (byte)0xb7, (byte)0x8d);
}
