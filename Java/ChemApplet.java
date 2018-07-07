import java.awt.*;
import java.awt.event.*;
import java.applet.*;

#define ATOMIC_NUMBER 1
#define NAME 2
#define ATOMIC_MASS 3
#define SYMBOL 4
#define ELECTRON_CONFIGURATION 5
#define GROUP 6
#define TYPE 7

class ChemOptions extends Frame
{
   public ChemOptions()
     {
	setLayout(new GridLayout(7,1));
	add(chAtomicNumber = new CheckBox("Atomic Number"));
	add(chName = new CheckBox("Element Name"));
	add(chMass = new CheckBox("Atomic Mass"));
	add(chSymbol = new CheckBox("Symbol"));
	add(chElectron = new CheckBox("Electron Configuration"));
	add(chGroup = new CheckBox("Group"));
	add(chType = new CheckBox("Element Type"));
     }
   
   public boolean isItemChecked(int index)
     {
   switch(index)
	  {
	   case ATOMIC_NUMBER:
	     return chAtomicNumber.getState();
	     break;
	   case NAME:
	     return chName.getState();
	     break;
	   case ATOMIC_MASS:
	     return chMass.getState();
	     break;
	   case SYMBOL:
	     return chSymbol.getState();
	     break;
	   case ELECTRON_CONFIGURATION:
	     return chElectron.getState();
	     break;
   private CheckBox chAtomicNumber;
   private CheckBox chName;
   private CheckBox chMass;
   private CheckBox chSymbol;
   private CheckBox chElectron;
   private CheckBox chGroup;
   private CheckBox chType;
   private Label lblQuizOn;
}

public class ChemApplet extends Applet 
{
   public void init() 
     {
	setLayout(new GridLayout(2,1));
	add(new ChemOptions());
	add(new ChemElement());
     }
}
