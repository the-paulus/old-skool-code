import java.util.*;
import java.text.*;
/**
@author Paul Lyon
@version %I%
*/
public class NewsItem extends Object
{
	/**
	The identification string of the news entry
	*/
	private String id;
	/**
	The headline of the news article.
	*/
	private String headline;
	/**
	The news article itself.
	*/
	private String bodytext;
	/**
	The date of the news article.
	*/
	private Date newsdate;

	/**
		Creates an Instance of NewsItem with the containing the data passed
		
		@param _id The identification string of the news entry.
	 	@param _healine The headline of the news article.
	 	@param _date The date of the news article.
	 	@param _bodytext The news article itself.
		@see String
		@see Date
	*/
	public NewsItem(String _id, String _headline, Date _newsdate, String _bodytext)
	{
		id = _id;
		headline = _headline;
		bodytext = _bodytext;
		newsdate = _newsdate;
	}

	/**
	Constructs a new instance of NewsItem.
	*/
	public NewsItem( )
	{
	}

	/**
		Sets the {@link id} of a NewsItem Object.
		
		@param _id The identification string of the news entry.
	*/
	public void setID(String _id)
	{
		id = _id;
	}

	/**
		Sets the {@link headline} of a NewsItem Object.
		
		@param _headline The headline of the news article.
	*/
	public void setHeadLine(String _headline)
	{
		headline = _headline;
	}

	/**
		Sets the {@link bodytext} of a NewsItem Object.
		
		@param _bodytext The news article itself.
	*/
	public void setbodytext(String _bodytext)
	{
		bodytext = _bodytext;
	}

	/**
		Sets the {@link newsdate} of a NewsItem Object.
		@param _newsdate The date of the news article.
	*/
	public void setNewsDate(Date _newsdate)
	{
		newsdate = _newsdate;
	}

	/**
		Returns the ID of the news article.
		@return a string with the articles ID.
	*/
	public String getID( )
	{
		return id;
	}

	/**
		Returns the headline of the news article.
		@return a string with the article headline.
	*/
	public String getHeadLine( )
	{
		return (String)headline;
	}

	/**
		Returns the body of the article.
		@return a string containing just the body of the article.
	*/
	public String getBodyText( )
	{
		return bodytext;
	}

	/**
		Returns the date of when the article was published.
		@return a Date object containing when the article was published.
	*/
	public Date getNewsDate( )
	{
		return newsdate;
	}
	
	public void printContents( )
	{
		System.out.println("ID:\t\t" + getID());
		System.out.println("Headline:\t\t"+ getHeadLine());
		System.out.println("Date:\t\t"+getNewsDate());
		System.out.println("Body:\t\t"+getBodyText());
	}
}
