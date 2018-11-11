import javax.swing.JOptionPane;

public class MyClass 
{
   /*
    * 1)Operates at the "Blue print level."     \
    * 2)Doesn't need an object. **important**   |- (Static)
    * 3)Can only call other static methods.     /
    */
   public static void main(String args[])
   {
      for(int ctr=0; ctr < 10; ctr++)
      {
         System.out.println("Line number:" + " " + ctr);
      }
      System.out.print("End of loop");
      JOptionPane.showMessageDialog(null,
                                    "Welcome\nto\nJava\nProgramming!");
      System.exit(0);
   }
}
