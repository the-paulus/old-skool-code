//Paul Lyon
//exercise 3.16
//2/3/03

import java.awt.Graphics;
import javax.swing.*;

public class Exercise316 extends JApplet {

   public void paint( Graphics g ) {
      super.paint ( g );
      
      g.drawRect(15, 10, 270, 20);
      
      g.drawOval(15, 10, 270, 20);
      
      g.dispose();
   }
}