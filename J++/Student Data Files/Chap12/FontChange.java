import java.applet.Applet;
import java.awt.*;

public class FontChange extends Applet
{
  Font myFont;
  FontMetrics myFontMetrics;

  public FontChange()
  {
  } // end of constructor MyApplet

  public void init()
  {
    resize( 200, 200 );

    myFont = new Font( "Times New Roman", Font.ITALIC, 36 );
  } // end of method init

  public void paint( Graphics graphOut )
  {
    String momString = new String( "Hi Mom!" );
    graphOut.setFont( myFont );

    graphOut.drawString( momString, 50, 50 );

    myFont = new Font( "Arial", Font.BOLD, 14);
    graphOut.setFont( myFont );
    myFontMetrics = getFontMetrics( myFont );

    graphOut.drawString( "String width is: "
			+ myFontMetrics.stringWidth( momString ), 50, 100 );
    graphOut.drawString( "String height is: "
			+ myFontMetrics.getHeight(), 50, 125 );
  } // end of method paint
} // end of class FontChange

