import java.applet.*;
import java.awt.*;

class PizzaPrices extends Applet
	{
	 Label titleLabel, priceLabel, toppingLabel, crustLabel, sizeLabel;
	 Panel toppingPanel, crustPanel, sizePanel;
	 TextField priceField;

	 Checkbox extraCheeseCB, pepperoniCB, sausageCB, onionCB,
				blackOliveCB, greenPepperCB, thinCB, regularCB,
					thickCB, smallCB, mediumCB, largeCB;

	 CheckboxGroup crustCBG, sizeCBG;

	 public void init()		
		{
		 //  Make the title lable
		 titleLabel = new Label( "PIZZA PRICES" );

		 //  Make the topping panel
		 toppingPanel = new Panel();
		 toppingPanel.setLayout( new GridLayout( 0, 1 ) );
		 toppingLabel = new Label( "Toppings" );
		 toppingLabel.setAlignment( Label.CENTER );
		 toppingPanel.add( toppingLabel );
		 extraCheeseCB = new Checkbox( "Extra Cheese" );
		 toppingPanel.add( extraCheeseCB );
		 pepperoniCB = new Checkbox( "Pepperoni" );
		 toppingPanel.add( pepperoniCB );
		 sausageCB = new Checkbox( "Sausage" );
		 toppingPanel.add( sausageCB );
		 onionCB = new Checkbox( "Onions" );
		 toppingPanel.add( onionCB );
		 blackOliveCB = new Checkbox( "Black Olives" );
		 toppingPanel.add( blackOliveCB );
		 greenPepperCB = new Checkbox( "Green Peppers" );
		 toppingPanel.add( greenPepperCB );

		 //  Make the crusts panel
		 crustPanel = new Panel();
		 crustPanel.setLayout( new GridLayout( 0, 1 ) );
		 crustLabel = new Label( "  Crusts" );
		 crustLabel.setAlignment( Label.LEFT );
		 crustPanel.add( crustLabel);
		 crustCBG = new CheckboxGroup();
		 thinCB = new Checkbox( "Thin Crust", crustCBG, false );
		 crustPanel.add( thinCB );
		 regularCB = new Checkbox( "Regular Crust", crustCBG, false );
		 crustPanel.add( regularCB );
		 thickCB = new Checkbox( "Thick Crust", crustCBG, false );
		 crustPanel.add( thickCB );

		 // Make the size panel
		 sizePanel = new Panel();
		 sizePanel.setLayout( new GridLayout( 0, 1 ) );
		 sizeLabel = new Label( "  Size" );
		 sizeLabel.setAlignment( Label.LEFT );
		 sizePanel.add( sizeLabel);
		 sizeCBG = new CheckboxGroup();		 
		 smallCB = new Checkbox( "Small", sizeCBG, false );
		 sizePanel.add( smallCB );
		 mediumCB = new Checkbox( "Medium", sizeCBG, false );
		 sizePanel.add( mediumCB );
		 largeCB = new Checkbox( "Large", sizeCBG, false );
		 sizePanel.add( largeCB );

		 // Make the bottom stuff
		 priceLabel = new Label( "Total:" );
		 priceLabel.setAlignment( Label.RIGHT );
		 priceField = new TextField(  "0.00", 10 );


		 //  Now put them together in another container using GridBagLayout
		 GridBagLayout PPLayout = new GridBagLayout();
		 GridBagConstraints itemConstraint = new GridBagConstraints();
		 setLayout( PPLayout );
		 itemConstraint.fill = GridBagConstraints.BOTH;
		 
		 // for title
		 itemConstraint.gridx = 1; itemConstraint.gridy = 0;
		 itemConstraint.gridwidth = 3; itemConstraint.gridheight = 1;
		 itemConstraint.weightx = 1.0; itemConstraint.weighty = 1.0;
		 PPLayout.setConstraints( titleLabel, itemConstraint );
		 add( titleLabel );

		 // for size
		 itemConstraint.gridx = 0; itemConstraint.gridy = 1;
		 itemConstraint.gridwidth = 1; itemConstraint.gridheight = 1;
		 itemConstraint.weightx = 1.0; itemConstraint.weighty = 1.0;
		 PPLayout.setConstraints( sizePanel, itemConstraint );
		 add( sizePanel );

		 // for crusts
		 itemConstraint.gridx = 1; itemConstraint.gridy = 1;
		 itemConstraint.gridwidth = 1; itemConstraint.gridheight = 1;
		 itemConstraint.weightx = 1.0; itemConstraint.weighty = 1.0;
		 PPLayout.setConstraints( crustPanel, itemConstraint );
		 add( crustPanel );

		 // for toppings
		 itemConstraint.gridx = 2; itemConstraint.gridy = 1;
		 itemConstraint.gridwidth = 1; itemConstraint.gridheight = 1;
		 itemConstraint.weightx = 1.0; itemConstraint.weighty = 1.0;
		 PPLayout.setConstraints( toppingPanel, itemConstraint );
		 add( toppingPanel );

		 // for "Total" label
		 itemConstraint.gridx = 1; itemConstraint.gridy = 2;
		 itemConstraint.gridwidth = 1; itemConstraint.gridheight = 1;
		 itemConstraint.weightx = 1.0; itemConstraint.weighty = 1.0;
		 PPLayout.setConstraints( priceLabel, itemConstraint );
		 add( priceLabel );

		 // for Total calculation
		 itemConstraint.gridx = 2; itemConstraint.gridy = 2;
		 itemConstraint.gridwidth = 1; itemConstraint.gridheight = 1;
		 itemConstraint.weightx = 1.0; itemConstraint.weighty = 0.25;
		 PPLayout.setConstraints( priceField, itemConstraint );
		 priceField.setEditable( false );
		 add( priceField );

		}  //  end of member method init

	public boolean action( Event buttonEvent, Object buttonObject )
		{
		 if( buttonEvent.target instanceof Checkbox )
			{
			 double price = 0.00;
			 double sizeFactor;

			 if( smallCB.getState() )
				{
				 price = 8.95;
				 sizeFactor = 1.00;
				}
			 else if( mediumCB.getState() )
				{
				 price = 10.95;
				 sizeFactor = 2.00;
				}
			 else
				{
				 price = 12.95;
				 sizeFactor = 3.00;
				 largeCB.setState( true );
				}

			 if( thinCB.getState() )
				price += 1.00;
			 else if( thickCB.getState() )
				price += 2.00;
			
			 if( extraCheeseCB.getState() )
				price = price + 0.50 * sizeFactor;
			 if( pepperoniCB.getState() )
				price = price + 0.60 * sizeFactor;
			 if( sausageCB.getState() )
				price = price + 0.60 * sizeFactor;
			 if( onionCB.getState() )
				price = price + 0.25 * sizeFactor;
			 if( blackOliveCB.getState() )
				price = price + 0.25 * sizeFactor;
			 if( greenPepperCB.getState() )
				price = price + 0.25 * sizeFactor;
		     priceField.setText( doubleToString( price, 6, 2 ) );
			}
		 else
			{
			 return super.action( buttonEvent, buttonObject );
			}

		 return true;
		}  //  end of member method action


	public boolean handleEvent( Event programEvent )
		{
		 if( programEvent.id == Event.WINDOW_DESTROY )
			{
			 System.exit( 0 );
			}
		 return super.handleEvent( programEvent );

		}  //  end of member method handleEvent

	public static String doubleToString( double testNum, int width, int precision )
		{
		 int MAXSHIFT = 12;

		 double inNum = testNum;
		 int decimalShift = 0, numWidth = 0, presentLoc, stringWidth;
		 char tempChar;
		 boolean negative = false;

		 if( inNum < 0 )
			{
			 negative = true;
			 inNum *= -1;
			}

		 while( inNum <= 1.0e12 )
			{
			 inNum = inNum * 10;
			 decimalShift++;
			}
		 Long tempLong = new Long( (long) inNum );
		 		
		 String workString = new String ( tempLong.toString() ); 
		 workString = workString + "000000000000";

		 StringBuffer StringBuf = new StringBuffer("");
		 presentLoc = MAXSHIFT - decimalShift + precision;

		 while( precision > 0 )
			{
			 tempChar = workString.charAt( decimalShift );
			 StringBuf.append( workString.charAt( presentLoc ) );
			 presentLoc--;  numWidth++;  precision--;
			}

		 StringBuf.append( '.' );
		 numWidth++;

		 if( ( testNum < 1 ) && ( testNum > 0 ) )
			{
			StringBuf.append( '0' );
			numWidth++;
			}

		 while( presentLoc >= 0 )
			{
			 StringBuf.append( workString.charAt( presentLoc ) );
			 numWidth++;  presentLoc--;
			}

		 if( negative )
			{
			 StringBuf.append( '-' );
			 numWidth++;
			}
		 
		 while( numWidth < width )
			{
			 StringBuf.append( ' ' );
			 numWidth++;
			}

		 stringWidth = StringBuf.length();
		 StringBuffer newStringBuf = new StringBuffer( "");

		 while( stringWidth-- > 0 )
			{
			 newStringBuf.append( StringBuf.charAt( stringWidth ) );
		    }
		 return newStringBuf.toString();
		}  //  end of method doubleToString

	}  //  end of class PizzaPrices
