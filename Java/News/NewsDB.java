import java.util.*;
import java.text.*;
/**
An Object containing News Stories.
@author Paul Lyon
@version %I%,%G%
*/
class NewsDB
{
	/* 
	is where the data is actually stored.
	*/
	private Hashtable db = new Hashtable();
	
	/*public static final int ID = 0;
	public static final int HEADLINE = 1;
	public static final int DATE = 2;
	public static final int BODY = 3;*/
	
     /**
		Creates a new NewsDB object.
	*/
     public NewsDB()
     {
		//Just create the stupid thing.
     }
		
		
     /**
	 *	Creates a new NewsDB while using the data passed to create the first record. The ID can be any unique key which separates the entry from the others.
	 *	<p>
	 *  <b>Example:</b>
	 *  <p>
	 *  <code>NewsDB news_database = new NewsDB("id001", "Java Rules the World", Calendar.getInstance().getTime(), "Sun Microsystems announced today that they now hold 100% of the server market");</code>
	 *  <p>
	 *	id001 -- <i>Articles ID ({@link String}</i>
	 *  Java Rules World -- <i>The headline.</i>
	 *  <code>Calendar.getInstance().getTime()</code> -- <i>sets the articles release date to the current date and time.</i>
	 *  Sun Microsystems announced today that they now hold 100% of the server market -- <i>the article itself.</i>
	 *
	 *	@param _id The identification string of the news entry.
	 *	@param _healine The headline of the news article.
	 *	@param _date The date of the news article.
	 *	@param _bodytext The news article itself.
	 *
	 *  @see Date
	 *  @see Calendar
	 *  @see GregorianCalendar
	 *  @see TimeZone
	 *  @see DateFormat
	 */
     public NewsDB(String _id, String _headline, String _date, String _bodytext)
     {
		NewsItem item = new NewsItem(_id, _headline, toDate(_date), _bodytext);
		try {
			db.put(_id, item);
		} catch (NullPointerException npe) {
			System.out.println("Error can not add NULL");
		}	
	}
		
	/**
		Returns the {@link Enumeration} of all the articles in the NewsDB instance.
		
		@return Enumeration		
		@see Enumeration
	*/
	public Enumeration getEnum()
	{
		return db.elements();
	}
		
	/**
		Converts a {@link String} to a {@link Date}.
		@return Date
		@param _str_date The value to convert to a {@link Date} object.
		@return Date
		@see String
		@see Date
	*/
	private static Date toDate(String _str_date)
	{
		Date ret_date = null;
		//System.out.println("Argument Passed: " + _str_date);
		try { 
			DateFormat df = DateFormat.getDateTimeInstance();			
			ret_date = df.parse(_str_date);
		} catch (ParseException pare) { 
			System.out.println("Argument Passed: " +_str_date);
		} 
		System.out.println("----" + ret_date);
		return ret_date;
  	}
	
		
	/**
		Creates and adds another news entry to the data base. createNewsItem works the same way as {@link NewsDB(String _id, String _headline, String _date, String _bodytext)} except it does not return anything.
		<p>
		<b>Example:</b>
		<p>
		id001 -- <i>Articles ID ({@link String}</i>
	    Java Rules World -- <i>The headline.</i>
	    <code>Calendar.getInstance().getTime()</code> -- <i>sets the articles release date to the current date and time.</i>
	    Sun Microsystems announced today that they now hold 100% of the server market -- <i>the article itself.</i>
	  
	  	@param _id The identification string of the news entry.
	  	@param _healine The headline of the news article.
	  	@param _date The date of the news article.
	  	@param _bodytext The news article itself.
		
		@see NewsDB(String _id, String _headline, String _date, String _bodytext)
		@see Date
	    @see Calendar
	    @see GregorianCalendar
	    @see TimeZone
	    @see DateFormat
	*/
	public void createNewsItem(String _id, String _headline, String _date, String _bodytext)
	{
		NewsItem item = null;
				
		if(_id.equals(""))
			throw new NullPointerException("ID is required.");
		if(_headline.equals(""))
			throw new NullPointerException("Headline is required.");
		if(_bodytext.equals(""))
			throw new NullPointerException("Body is required.");
		if(_date.equals(""))
			throw new NullPointerException("Date is required.");
			
		if( getNewsItemByID(_id) == null ) 
		{
			System.out.println("hi-oh!");	
			item = new NewsItem(_id, _headline, toDate(_date), _bodytext);
		} else {
			// Throw dupilcate exception //item = new NewsItem(new String(_id + _date), _headline, _bodytext, toDate(_date));
		}
		
		try {
			db.put(_id, item);
		} catch ( NullPointerException npe) {
			System.out.println("Error can not add NULL");
		}
	}
		
		
	//Name: createNewsItem
	//Return Type: public void
	//Parameters: int
	//Descriptions: removes a single entry.
	public void deleteNewsItemByID(String _id)
	{
		db.remove(_id);
	}
		
	//Name: createHeadLine
	//Return Type: public void
	//Parameters: int, String, String, Calendar
	//Descriptions: Creates a new NewsVector and adds a new Element to it.
	public void editNewsItem(String _id, String _headline, String _date, String _bodytext)
	{
		NewsItem item = null;
		
		if( db.containsKey(_id) )
		{
			item = (NewsItem) db.get(_id);
			if( item.getHeadLine().compareTo(_headline) != 0 )
				item.setHeadLine(_headline);
			if( item.getBodyText().compareTo(_bodytext) != 0 )
				item.setbodytext(_bodytext);
			db.remove(item.getID());
			db.put(item.getID(), item);
		}
	}
		
	//Name: getNewsItemByHeadline
	//Return Type: public Object
	//Parameters: String
	//Descriptions: Searches the Vector's Items for Items that have the feild equal to _headline
      public ArrayList getNewsItemByHeadline(String _headline)
	 {
	     NewsItem item;
            
     	for( Enumeration e = db.elements(); e.hasMoreElements();)
		{
			item = (NewsItem)e.nextElement();
			if(_headline.equals(item.getHeadLine()))	
				return toStringArray(item);
           } 
           
           return null;
       }
        
     //Name: getNewsItemByDate
	//Return Type: public ArrayList
	//Parameters: String
	//Description: finds a record by matching the parameter to the date field and returns an ArrayList of NewsItem if found.
	public ArrayList getNewsItemByDate(String _date)
     {
            NewsItem item;
            Date d = toDate(_date);
		  
            for( Enumeration e = db.elements(); e.hasMoreElements();)
			{
				item = (NewsItem)e.nextElement();
                if(d.equals(item.getNewsDate()))
                    return toStringArray(item);
            }
			return null;
        }
       
	//Name: toStringArray
	//Return Type: public ArrayList
	//Parameters: NewsItem
	//Description: returns a NewsItem Object as an ArrayList
	private ArrayList toStringArray(NewsItem _newsItem)
		{
			ArrayList alist = new ArrayList();
			
			alist.add(NewsConstants.ID_FIELD, _newsItem.getID());
			alist.add(NewsConstants.HEADLINE_FIELD, _newsItem.getHeadLine());
			alist.add(NewsConstants.DATE_FIELD, _newsItem.getNewsDate());
			alist.add(NewsConstants.BODY_FIELD, _newsItem.getBodyText());
			
			return alist;
		}
		
		//Name: getNewsItemByID
		//Return Type: public ArrayList
		//Parameters: int
		//Descriptions: Search the Vector's Item's ID feild for _id
        public ArrayList getNewsItemByID(String _id)
		{
			NewsItem item = null;
	
			for( Enumeration e = db.elements(); e.hasMoreElements();)
			{
				item = (NewsItem)e.nextElement();
				if(_id.equals(item.getID()))
					return toStringArray(item);
			}
			return null;
		}
}
