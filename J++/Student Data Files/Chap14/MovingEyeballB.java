import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MovingEyeballB extends Applet implements Runnable,
                                                      MouseMotionListener,
                                                      MouseListener
{
  private Thread    MovingEyeballThread = null;
  private int       globalX;
  private int       globalY;
  private boolean   smile;

  //  The next two lines implement double buffering
  //  to prevent flickering
  Graphics          OffScreenGraphics;
  Image             OffScreenImage;

  public MovingEyeballB()
  {
    smile = true;
  }

  public void init()
  {
    this.addMouseListener(this);
    this.addMouseMotionListener(this);

    resize(300, 300);
    OffScreenImage = createImage(this.getSize().width, this.getSize().height);
    OffScreenGraphics = OffScreenImage.getGraphics();
    globalX = 250;
    globalY = 200;
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
      if(globalX > 0 && globalX < 65
         && globalY > 70 && globalY < 105)
      {
        paintGraphics.fillOval(67,77,20,20);     //  middle left area, 
        paintGraphics.fillOval(172,77,20,20);    //  eyes on left of eyeball
      }  
      else if(globalX > 120 && globalX < 170
              && globalY > 70 && globalY < 105)
      {
        paintGraphics.fillOval (99,77,20,20);    // middle center,
        paintGraphics.fillOval (172,77,20,20);     // eyes crossed
      }  
      else if( ( globalY > 70 && globalY < 105 )
               && ( ( globalX > 65 && globalX < 120 )
               || ( globalX > 170 && globalX < 225 ) ) )
      {
        paintGraphics.fillOval(82,77,20,20);     // mouse over eyeball,
        paintGraphics.fillOval(187,77,20,20);    // eyes straight
      }  
      else if(globalX > 225 && globalX < 300 && globalY > 70
               && globalY < 105)
      {
        paintGraphics.fillOval(99,77,20,20);     // middle right,
        paintGraphics.fillOval(204,77,20,20);    // eyes on right of eyeball
      }
      else if(globalX > 0 && globalX < 92
              && globalY > 0 && globalY < 70)
      {
        paintGraphics.fillOval(69,73,20,20);     // top left,
        paintGraphics.fillOval(174,73,20,20);    // eyes on top left of eyeball
      }
      else if(globalX > 92 && globalX < 195
              && globalY > 0 && globalY < 70)
      {
        paintGraphics.fillOval(82,72,20,20);     // top center,
        paintGraphics.fillOval(187,72,20,20);    // eyes on top of eyeball
      }
      else if(globalX > 195 && globalX < 300
              && globalY > 0 && globalY < 70)
      {
        paintGraphics.fillOval(97,73,20,20);     // top right,
        paintGraphics.fillOval(202,73,20,20);    // eyes on top right of eyeball
      }
      else if(globalX > 0 && globalX < 92
               && globalY > 105 && globalY < 300)
      {
        paintGraphics.fillOval(69,80,20,20);     // bottom left,
        paintGraphics.fillOval(174,80,20,20);    // eyes on bottom left of eyeball
      }
      else if(globalX > 92 && globalX < 195
              && globalY > 105 && globalY < 300)
      {
        paintGraphics.fillOval( 82, 84, 20, 20 );  // bottom center,
        paintGraphics.fillOval( 187, 84, 20, 20 ); // eyes on bottom of eyeball
      }
      else if(globalX > 195 && globalX < 300
              && globalY > 105 && globalY < 300)
      {
        paintGraphics.fillOval(97,80,20,20);  // bottom right,
        paintGraphics.fillOval(202,80,20,20); // eyes on bottom right of eyeball
      }
    } // end of if smile
    else
    {
      paintGraphics.drawArc(50,175,190,100,180,-180);  // frown 
    }
  } // end of method paint

  public void update(Graphics paintGraphics)
  {
    OffScreenGraphics.clearRect(0,0, this.getSize().width, this.getSize().height);
    paint(OffScreenGraphics);
    paintGraphics.drawImage(OffScreenImage, 0, 0, this);
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

  // MouseMotion Listener Methods

  public void mouseDragged(MouseEvent e) {}
  public void mouseMoved(MouseEvent e)
  {
    globalX = e.getX();
    globalY = e.getY();
    repaint();
  }

  // Mouse Listener
  public void mouseEntered(MouseEvent e)
  {
    smile = true;
  }

  public void mouseExited(MouseEvent e)
  {
    smile = false;
  }

  public void mouseClicked(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
} // end of class MovingEyeballb
