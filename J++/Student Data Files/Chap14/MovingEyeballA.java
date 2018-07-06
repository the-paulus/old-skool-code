import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MovingEyeballA extends Applet implements Runnable,
                                                      MouseListener
{
  private Thread  MovingEyeballThread = null;
  private boolean smile;

  //  The next two lines implement double buffering 
  //  to prevent flickering
  Graphics        OffScreenGraphics;
  Image           OffScreenImage;

  public MovingEyeballA()
  {
    smile = true;
  }

  public void init()
  {
    // add ourselves as a listener for mouse events
    this.addMouseListener(this);

    resize(300, 300);
    OffScreenImage = createImage(this.getSize().width,
                                 this.getSize().height);
    OffScreenGraphics = OffScreenImage.getGraphics();
  } // end of method init

  public void paint(Graphics paintGraphics)
  {
    paintGraphics.drawOval(0,0,290,290);
    paintGraphics.drawOval(65,70,55,35);
    paintGraphics.drawOval(170,70,55,35);
    paintGraphics.drawLine(145,120,120,150);
    paintGraphics.drawLine(120,150,150,150);
		 
    if( smile )
    {
      paintGraphics.drawArc( 50,100,190,150,180,180 );       // smile
    } // end of if smile
    else
    {
      paintGraphics.drawArc(50,175,190,100,180,-180);  // frown 
    }
  } // end of method paint

  public void update(Graphics updateGraphics)
  {
    OffScreenGraphics.clearRect(0,0, this.getSize().width,
                                     this.getSize().height);
    paint(OffScreenGraphics);
    updateGraphics.drawImage(OffScreenImage, 0, 0, this);
  } // end of method update

  public void start()
  {
    if(MovingEyeballThread == null)
    {
      MovingEyeballThread = new Thread(this);
      MovingEyeballThread.start();
    }
  } // end of method start
	
  public void stop()
  {
    if(MovingEyeballThread != null)
    {
      MovingEyeballThread.stop();
      MovingEyeballThread = null;
    }
  } // end of method stop

  public void run()
  {
    while(true)
    {
      try
      {
        repaint();
        Thread.sleep(50);
      }
      catch(InterruptedException e)
      {
        stop();
      }
    } // end of while
  } // end of method run

  
  // mouse events

  public void mouseEntered(MouseEvent e)
  {
    smile = true;
  }

  public void mouseExited(MouseEvent e)
  {
    smile = false;
  }

  // unused methods from the MouseListener interface
  public void mouseClicked(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e){}
} // end of class MovingEyeballa
