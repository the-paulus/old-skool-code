import java.applet.*;
import java.awt.*;

public class JavaAnimation extends Applet implements Runnable
{
  private Thread  AnimationThread = null;

  private final int              IMG_BOX_WIDTH = 200;
  private final int              IMG_BOX_HEIGHT = 200;
  private final int              IMG_BOX_X_LOC = 50;
  private final int              IMG_BOX_Y_LOC = 50;
  private final int              NUM_IMAGES = 9;
  private final int              SLEEP_TIME = 75;  // reducing sleep time
  private final String   DIR_NAME = "images/";     // speeds up rotation
											

  // image file names
  String fileNameArray[] = {"ball1.gif", "ball2.gif", "ball3.gif",
                            "ball4.gif", "ball5.gif", "ball6.gif",
                            "ball7.gif", "ball8.gif", "ball9.gif" };
  private Graphics       GraphicsOut;            // graphics context object
  private Image          ImageArray[];
  private int            currentImageCount;
  private boolean        imagesLoaded;

  public JavaAnimation()
  {
    imagesLoaded = false;
    currentImageCount = 0;
  } // end of constructor JavaAnimation

  public void init()
  {
    resize( IMG_BOX_WIDTH, IMG_BOX_HEIGHT );
  } // end of member method init

  private void displayImage(Graphics displayGraphics)
  {
    if( imagesLoaded )
    {
      displayGraphics.clearRect( IMG_BOX_X_LOC, IMG_BOX_Y_LOC,
                                 IMG_BOX_WIDTH, IMG_BOX_HEIGHT );
      displayGraphics.drawImage( ImageArray[currentImageCount],
                                 IMG_BOX_X_LOC, IMG_BOX_Y_LOC, null );
    }
    else
    {
      return;
    }
  } // end of member method displayImage

  private void loadImages()
  {
    int fileNameCtr;
    int imageTest;

    if( !imagesLoaded )
    {
      repaint();
      GraphicsOut = getGraphics();
      ImageArray = new Image[NUM_IMAGES];
      MediaTracker imageTracker = new MediaTracker( this );

      for( fileNameCtr = 0; fileNameCtr < NUM_IMAGES; fileNameCtr++ )
      {
        ImageArray[ fileNameCtr ] = getImage( getDocumentBase(),
                                              DIR_NAME + fileNameArray[ fileNameCtr ] );
        imageTracker.addImage( ImageArray[ fileNameCtr ], 0 );
      } // end of for loop

      try
      {
        imageTracker.waitForAll();
        imagesLoaded = !imageTracker.isErrorAny();
      }
      catch( InterruptedException IE )
      {
        System.err.println( IE );
      }

      if( !imagesLoaded )
      {
        GraphicsOut.drawString( "ERROR:  Images not loaded", 25, 75 );
        stop();
        return;
      }
    } // end of if !imagesLoaded
  } // end of method load images

  private void rotateImage()
  {
    while(true)
    {
      try
      {
        displayImage( GraphicsOut );
        currentImageCount++;
        if( currentImageCount == NUM_IMAGES )
          currentImageCount = 0;

        Thread.sleep( SLEEP_TIME );
      }
      catch( InterruptedException IE )
      {
        System.err.println( IE );
        stop();
      }
    }
  } // end of method rotateImage

  public void paint( Graphics paintGraphics )
  {
    if( imagesLoaded )
    {
      displayImage( paintGraphics );
    }
    else
    {
      paintGraphics.drawString( "STATUS:  Loading images", 25, 20 );
    } 
  } // end of member method paint

  public void start()
  {
    if( AnimationThread == null )
    {
      AnimationThread = new Thread( this );
      AnimationThread.start();
    }
  } // end of member method start
	
  public void stop()
  {
    if( AnimationThread != null )
    { 
      AnimationThread.stop();
      AnimationThread = null;
    }
  } // end of member method stop

   public void run()
   {
      setBackground( Color.white );   
      loadImages();
      repaint();
      rotateImage();
   } // end of overridden Thread method run
} // end of class JavaAnimation
