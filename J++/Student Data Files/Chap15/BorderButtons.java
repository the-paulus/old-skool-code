import java.applet.*;
import java.awt.*;

class BorderButtons extends Applet
	{
	 Button buttonOne, buttonTwo, buttonThree, buttonFour;
	 Label outLabel;

	 public void init()
		{
		 setLayout( new BorderLayout() );

		 buttonOne = new Button( "Button One" );
		 buttonTwo = new Button( "Button Two" );
		 buttonThree = new Button( "Button Three" );
		 buttonFour = new Button( "Button Four" );

		 outLabel = new Label( "No Buttons Selected Yet" );

		 add( "North", buttonOne );
		 add( "East", buttonTwo );
		 add( "South", buttonThree );
		 add( "West", buttonFour );
		 add( "Center", outLabel );

		}  //  end of member method init

	 public boolean action( Event buttonEvent, Object buttonObject )
		{
		 if( buttonEvent.target.equals( buttonOne ) )
			outLabel.setText( "Button One was Selected" );
		 else if( buttonEvent.target.equals( buttonTwo ) )
			outLabel.setText( "Button Two was Selected" );
		 else if( buttonEvent.target.equals( buttonThree ) )
			outLabel.setText( "Button Three was Selected" );
		 else if( buttonEvent.target.equals( buttonFour ) )
			outLabel.setText( "Button Four was Selected" );
		 else
			super.action( buttonEvent, buttonObject );

		return true;
		}  //  end of member method action

	}  //  end of class BorderButtons
