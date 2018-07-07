import java.util.*;
import java.text.*;
import java.awt.event.*;

/**
The class that connects the driver class to the databse class.

@author Paul Lyon
@version %I%
*/
public class MasterController
{
	private NewsDB news_database;

	/**
		Constructs a new instance of MasterController.
	*/
	public MasterController()
	{
		news_database = new NewsDB();
	}
	
	/**
		Processes data depending on event. The events are defined in {@link NewsConstants}.
		<p>
		Example:
		<p>
		<code> ArrayList returned_data = 
	public ArrayList processEvent(int event, ArrayList data)
	{
		switch(event)
		{
			case NewsConstants.ADD_EVENT:
				news_database.createNewsItem((String)data.get(NewsConstants.ID_FIELD), (String)data.get(NewsConstants.HEADLINE_FIELD), (String)data.get(NewsConstants.DATE_FIELD), (String)data.get(NewsConstants.BODY_FIELD));
				break;
			case NewsConstants.EDIT_EVENT:
				news_database.editNewsItem((String)data.get(NewsConstants.ID_FIELD), (String)data.get(NewsConstants.HEADLINE_FIELD), (String)data.get(NewsConstants.DATE_FIELD), (String)data.get(NewsConstants.BODY_FIELD));
				break;
			case NewsConstants.DELETE_EVENT:
				news_database.deleteNewsItemByID((String)data.get(NewsConstants.ID_FIELD));
				break;
			case NewsConstants.RETRIEVE_EVENT:
				return (ArrayList) news_database.getNewsItemByID( (String)data.get(NewsConstants.ID_FIELD) );
				//break;
			default:
				return data;
		}
		
		return data;
	}
			
	/*public void addEntry(String _id, String _headline, String _date, String _body)
	{
		if(isDebugable())
		{
			System.out.println("MasterController.addEntry(" + _id + ", " + _headline + ", " + _date + ", " + _body + ")");
			news_database.createNewsItem(_id, _headline, _date, _body);
			printEntry(_id);
		} else {
			news_database.createNewsItem(_id, _headline, _date, _body);
		}
	}
	
	public void editEntry(String _id, String _headline, String _date, String _body)
	{
		if(isDebugable())
		{
			news_database.editNewsItem(_id, _headline, _date, _body);
			System.out.println("MasterController.editEntry(" + _id + ", " + _headline + ", " + _date + ", " + _body + ")");
			printEntry(_id);
		} else {
			news_database.editNewsItem(_id, _headline, _date, _body);
		}
	}
	
	public void deleteEntry(String _id)
	{
		if(isDebugable())
		{
			news_database.deleteNewsItemByID(_id);
			System.out.println("MasterController.deleteEntry( " + _id + " )");
			printEntry(_id);
		} else {
			news_database.deleteNewsItemByID(_id);
		}
	}
	
	public ArrayList retrieveEntry(String _id)
	{
		System.out.println( news_database.getNewsItemByID( _id ));
		return (ArrayList) news_database.getNewsItemByID( _id );
	}
	
	private void printEntry(String _id)
	{
		ArrayList al = null;
		try {
			al = retrieveEntry(_id);
		} catch(NullPointerException npe) {
			System.out.println("Entry not found.");
		}
		if(al == null)
			System.out.println("No record found");
		else{
		System.out.println("***** DB Entry: " + _id + " *****");
		System.out.println("ID:       \t" + al.get(0));
		System.out.println("Headline: \t" + al.get(1));
		System.out.println("Date:     \t" + al.get(2));
		System.out.println("Body:     \t" + al.get(3));
		}
	}
	
	public ArrayList searchByID(String _id)
	{
	}
	
	public ArrayList searchByHeadline(String _headline)
	{
	}
	
	public ArrayList searchByDate(String _date)
	{
	}
	
	public ArrayList searchByKeywordsInBody(String _keywords)
	{
	}*/
}
