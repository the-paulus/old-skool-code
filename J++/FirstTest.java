import java.awt.*;
import java.lang.*;

class FirstFrame extends JFrame
{  public FirstFrame()
   {  setTitle("FirstFrame");
      setSize(300, 200);
   }
}

public class FirstTest
{  public static void main(String[] args)
   {  JFrame frame = new FirstFrame();
      frame.show();  
   }
}

