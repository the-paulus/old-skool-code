import java.awt.*;
import java.applet.*;

class CircleSlider extends Applet
	{
	 private final int	INITIAL_COLOR_VALUE = 128;
	 private final int	VISIBLE_BAR_PART = 8;
	 private final int	MIN_COLOR_VALUE = 0;
	 private final int	MAX_COLOR_VALUE = 255;
	 private final int	INITIAL_ARC_VALUE = 180;
	 private final int	MIN_ARC_VALUE = 0;
	 private final int	MAX_ARC_VALUE = 360;

	 private Scrollbar redScrollbar, greenScrollbar,
											blueScrollbar, arcScrollbar;
	 private int	xArcCenter, yArcCenter, xImageStart,
									yImageStart, arcDiameter, angleToArc;

	 public void init()
		{
		 resize( 300, 300 );
		 setLayout( new BorderLayout() );
		 
		 redScrollbar = new Scrollbar( Scrollbar.VERTICAL, INITIAL_COLOR_VALUE,
							VISIBLE_BAR_PART, MIN_COLOR_VALUE, MAX_COLOR_VALUE );
		 add( "West", redScrollbar );

		 greenScrollbar = new Scrollbar( Scrollbar.HORIZONTAL, INITIAL_COLOR_VALUE,
							VISIBLE_BAR_PART, MIN_COLOR_VALUE, MAX_COLOR_VALUE );
		 add( "South", greenScrollbar );

		 blueScrollbar = new Scrollbar( Scrollbar.VERTICAL, INITIAL_COLOR_VALUE,
							VISIBLE_BAR_PART, MIN_COLOR_VALUE, MAX_COLOR_VALUE );
		 add( "East", blueScrollbar );

		 arcScrollbar = new Scrollbar( Scrollbar.HORIZONTAL, INITIAL_ARC_VALUE,
							VISIBLE_BAR_PART, MIN_ARC_VALUE, MAX_ARC_VALUE );
		 add( "North", arcScrollbar );

		}  //  end of member method init

	public void paint( Graphics paintGraphics )
		{
		 int redness = MAX_COLOR_VALUE - redScrollbar.getValue();
		 int greenness = greenScrollbar.getValue();
		 int blueness = MAX_COLOR_VALUE - blueScrollbar.getValue();
		 Color newColor = new Color( redness, greenness, blueness );

		 paintGraphics.setColor( newColor );

		 arcDiameter = (int) ( 0.75 * CircleSlider.size().width );

		 xArcCenter = ( CircleSlider.size().width / 2 )
													- ( arcDiameter / 2 );
		 yArcCenter = ( CircleSlider.size().height / 2 )
													- ( arcDiameter / 2 );

		 angleToArc = arcScrollbar.getValue();
		 
		 paintGraphics.fillArc( xArcCenter, yArcCenter, arcDiameter, arcDiameter,
											90, angleToArc );

		}  //  end of member method paint

	 public boolean handleEvent( Event sliderEvent )
		{
		 if( sliderEvent.id == Event.WINDOW_DESTROY )
				{
				 System.exit( 0 );
				}
		 else
			{
			 switch( sliderEvent.id )
				{
				 case Event.SCROLL_ABSOLUTE:
				 case Event.SCROLL_LINE_DOWN:
				 case Event.SCROLL_LINE_UP:
				 case Event.SCROLL_PAGE_DOWN:
				 case Event.SCROLL_PAGE_UP:
						repaint();
						break;
			     default:
					  return super.handleEvent( sliderEvent );
				}
			}
		 return true;
	
		}  //  end of member method handleEvent

	}  //  end of class CircleSlider
