import java.applet.*;
import java.awt.*;

public class Alt_ButtonBanner extends Applet implements Runnable
{
  private Thread bannerThread = null;
  
  String bannerString;
  int bannerLength;
  int moveLength;
  int startStringChar;
  int presentLoc, RightEdge;

  Button bannerButton = new Button( "Banner" );
  Alt_ButtonBanner target = this;

  public void init()
  {
    resize( RightEdge, 300 );
    add(bannerButton);

  } // end of method init
  
  public Alt_ButtonBanner()
  {
    bannerString = new String( "This is my Banner" );
    startStringChar = 0;
    presentLoc = RightEdge = 400;  //  width of frame set here
    bannerLength = bannerString.length();
    moveLength = 5;
  } // end of constructor ButtonBanner

  private void displayBanner( Graphics outGraph )
  {
    String outString =
    new String( bannerString.substring( startStringChar, bannerLength ) );
    outGraph.drawString( outString, presentLoc, 50 );
  }

  public void start()
  {
    if( bannerThread == null )
    {
      bannerThread = new Thread( this );
      bannerThread.start();
    }
  } // end of member method start
	
  public void stop()
  {
    if( bannerThread != null )
    {
      bannerThread.stop();
      bannerThread = null;
    }
  } // end of member method stop

  public void run()
  {
    Graphics runGraph = getGraphics();
    while(true)
    {
      repaint();
      try
      {
        if( presentLoc >= 0 )
        {
          presentLoc -= moveLength;
        }
        else if( ++startStringChar == bannerLength )
        {
          startStringChar = 0;
          presentLoc = RightEdge;
        }

        displayBanner( runGraph );
        Thread.sleep( 100 );
      }
      catch(InterruptedException IE)
      {
        System.err.println( IE );
        System.exit( -1 );
      }
    }
  } // end of overridden Thread member run
	
  public void paint( Graphics paintGraph )
  {
    Rectangle bannerRect = paintGraph.getClipBounds();
		
    paintGraph.clearRect( bannerRect.x, bannerRect.y, bannerRect.width, bannerRect.height);
    displayBanner( paintGraph);
  } // end of member method paint

  
	
  public boolean action(Event event, Object obj)
      {
		Object myTarget = event.target;
		if (myTarget instanceof Button)
			{
			if(bannerThread == null)
				{
				bannerThread = new Thread(target);
				bannerThread.start();
			    }
			else
				{
				bannerThread.stop();
				bannerThread = null;
				}
			return true;
			}
		return false;
      }
	

  } // end of class Alt_ButtonBanner
