import java.io.*;
import java.util.*;
import java.lang.reflect.*;
	
public class FileTestingClass
{
	private static CommaSeparatedFile csf = new CommaSeparatedFile( new File("test.txt") );
	
	public static void main(String[] args)
	{
		ArrayList entry_one = new ArrayList();
		ArrayList entry_two = new ArrayList();
		ArrayList testArrayList = new ArrayList();
		ArrayList al = new ArrayList();
		ArrayList r = new ArrayList();
		entry_one.add("001");
		entry_one.add("Entry 1");
		entry_one.add("10/31/2003");
		entry_one.add("Entry 1 is 001 and the date is 10/31/2003");
		
		entry_two.add("002");
		entry_two.add("Entry 2");
		entry_two.add("06/14/1998");
		entry_two.add("Entry 2 is 002 and the date is 06/14/1998");
		
		testArrayList.add(entry_one);
		testArrayList.add(entry_two);
		
		try { csf.writeCommaSeparatedFile(testArrayList); } catch(IOException ioe) {System.out.println(ioe.getStackTrace());}
		try { al = (ArrayList)csf.parseCommaSeparatedFile(); } catch(IOException ioe) { System.out.println(ioe.getStackTrace());}
		try { r = (ArrayList)csf.searchCommaSeparatedFile("001", false, 0); } catch(IOException ioe) { System.out.println(ioe.getStackTrace());}
		for(int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));
		for( Iterator i = r.iterator(); i.hasNext(); )
			System.out.println( i.next().toString());
	}
}
