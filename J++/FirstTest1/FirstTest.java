
import java.awt.*;
import java.lang.*;

class FirstFrame extends Frame
{  public FirstFrame()
   {  setTitle("FirstFrame");
      setSize(300, 200);
   }
}

public class FirstTest
{  public static void main(String[] args)
   {  Frame frame = new FirstFrame();
      frame.show();  
   }
}

