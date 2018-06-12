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

package comctl32;

import com.ms.com.*;
import com.ms.com.IUnknown;
import com.ms.com.Variant;

/** @com.class(classid=0713E8D2-850A-101B-AFC0-4210102A8DA7,DynamicCasts) 
    @com.interface(iid=E6E17E84-DF38-11CF-8E74-00A0C90F26F8, thread=AUTO, type=DUAL) */
public class ProgressBarRaw implements IUnknown,com.ms.com.NoAutoScripting,comctl32.IProgressBar
{
  /** @com.method(vtoffset=4, dispid=0, type=PROPGET, name="ControlDefault", name2="getControlDefault", addFlagsVtable=4)
      @com.parameters([type=R4] return)
      @hidden */
  public native float getControlDefault();

  /** @com.method(vtoffset=5, dispid=0, type=PROPPUT, name="ControlDefault", name2="putControlDefault", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfValue)
      @hidden */
  public native void setControlDefault(float pfValue);

  /** @com.method(vtoffset=6, dispid=1, type=PROPGET, name="Max", name2="getMax", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getMax();

  /** @com.method(vtoffset=7, dispid=1, type=PROPPUT, name="Max", name2="putMax", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfMax) */
  public native void setMax(float pfMax);

  /** @com.method(vtoffset=8, dispid=2, type=PROPGET, name="Min", name2="getMin", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getMin();

  /** @com.method(vtoffset=9, dispid=2, type=PROPPUT, name="Min", name2="putMin", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfMin) */
  public native void setMin(float pfMin);

  /** @com.method(vtoffset=10, dispid=3, type=PROPGET, name="MousePointer", name2="getMousePointer", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getMousePointer();

  /** @com.method(vtoffset=11, dispid=3, type=PROPPUT, name="MousePointer", name2="putMousePointer", addFlagsVtable=4)
      @com.parameters([in,type=I4] pMousePointers) */
  public native void setMousePointer(int pMousePointers);

  /** @com.method(vtoffset=12, dispid=4, type=PROPGET, name="MouseIcon", name2="getMouseIcon", addFlagsVtable=4)
      @com.parameters([iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] return) */
  public native com.ms.wfc.ax.IPictureDisp getMouseIcon();

  /** @com.method(vtoffset=13, dispid=4, type=PROPPUTREF, name="MouseIcon", name2="putMouseIcon", addFlagsVtable=4)
      @com.parameters([in,iid=7BF80981-BF32-101A-8BBB-00AA00300CAB,thread=AUTO,type=DISPATCH] ppPictureDisp) */
  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppPictureDisp);

  // setMouseIcon UNMAPPABLE: Name is a keyword or conflicts with another member.
  //  public native void setMouseIcon(com.ms.wfc.ax.IPictureDisp ppPictureDisp);

  /** @com.method(vtoffset=15, dispid=5, type=PROPGET, name="Value", name2="getValue", addFlagsVtable=4)
      @com.parameters([type=R4] return) */
  public native float getValue();

  /** @com.method(vtoffset=16, dispid=5, type=PROPPUT, name="Value", name2="putValue", addFlagsVtable=4)
      @com.parameters([in,type=R4] pfValue) */
  public native void setValue(float pfValue);

  /** @com.method(vtoffset=17, dispid=1551, type=PROPGET, name="OLEDropMode", name2="getOLEDropMode", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getOLEDropMode();

  /** @com.method(vtoffset=18, dispid=1551, type=PROPPUT, name="OLEDropMode", name2="putOLEDropMode", addFlagsVtable=4)
      @com.parameters([in,type=I4] psOLEDropMode) */
  public native void setOLEDropMode(int psOLEDropMode);

  /** @com.method(vtoffset=19, dispid=4294966776, type=PROPGET, name="Appearance", name2="getAppearance", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getAppearance();

  /** @com.method(vtoffset=20, dispid=4294966776, type=PROPPUT, name="Appearance", name2="putAppearance", addFlagsVtable=4)
      @com.parameters([in,type=I4] penumAppearances) */
  public native void setAppearance(int penumAppearances);

  /** @com.method(vtoffset=21, dispid=4294966792, type=PROPGET, name="BorderStyle", name2="getBorderStyle", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getBorderStyle();

  /** @com.method(vtoffset=22, dispid=4294966792, type=PROPPUT, name="BorderStyle", name2="putBorderStyle", addFlagsVtable=4)
      @com.parameters([in,type=I4] penumBorderStyles) */
  public native void setBorderStyle(int penumBorderStyles);

  /** @com.method(vtoffset=23, dispid=4294966782, type=PROPGET, name="Enabled", name2="getEnabled", addFlagsVtable=4)
      @com.parameters([type=BOOLEAN] return) */
  public native boolean getEnabled();

  /** @com.method(vtoffset=24, dispid=4294966782, type=PROPPUT, name="Enabled", name2="putEnabled", addFlagsVtable=4)
      @com.parameters([in,type=BOOLEAN] bEnabled) */
  public native void setEnabled(boolean bEnabled);

  /** @com.method(vtoffset=25, dispid=4294966781, type=PROPGET, name="hWnd", name2="gethWnd", addFlagsVtable=4)
      @com.parameters([type=I4] return) */
  public native int getHWnd();

  /** @com.method(vtoffset=26, dispid=1552, type=METHOD, name="OLEDrag", addFlagsVtable=4)
      @com.parameters() */
  public native void OLEDrag();

  /** @com.method(vtoffset=27, dispid=4294966744, type=METHOD, name="AboutBox", addFlagsVtable=4)
      @com.parameters()
      @hidden */
  public native void AboutBox();


  public static final com.ms.com._Guid iid = new com.ms.com._Guid((int)0xe6e17e84, (short)0xdf38, (short)0x11cf, (byte)0x8e, (byte)0x74, (byte)0x0, (byte)0xa0, (byte)0xc9, (byte)0xf, (byte)0x26, (byte)0xf8);

  public static final com.ms.com._Guid clsid = new com.ms.com._Guid((int)0x713e8d2, (short)0x850a, (short)0x101b, (byte)0xaf, (byte)0xc0, (byte)0x42, (byte)0x10, (byte)0x10, (byte)0x2a, (byte)0x8d, (byte)0xa7);
}
