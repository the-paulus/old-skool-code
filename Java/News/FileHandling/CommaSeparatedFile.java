import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class CommaSeparatedFile
{
	private FileWriter m_filewriter;
	private FileReader m_filereader;
	private File m_file;
	private final boolean DEBUG = true;
	
	public CommaSeparatedFile(File file)
	{
		//~ try { 
			//~ m_filewriter = new FileWriter(file); 
		//~ } catch(IOException ioe) { 
			//~ System.out.println("file = null"); 
		//~ }
		
		//~ try {
			//~ m_filereader = new FileReader(file);
		m_file = file;
	}

	public CommaSeparatedFile(String filename)
	{
		//try { m_filewriter = new FileWriter( new File(filename) ); } catch(IOException ioe) { System.out.println("filename = " + filename);}
		m_file = new File(filename);
	}		
	
	public void writeCommaSeparatedFile(Collection ablist) throws IOException
	{
		ArrayList internal_list = null;
		BufferedWriter bufwriter = new BufferedWriter( new FileWriter(m_file) ); 
		String str = null;
		
		for( Iterator i = ablist.iterator() ; i.hasNext(); )
		{
			internal_list = (ArrayList)i.next();
			
			for( Iterator j = internal_list.iterator() ; j.hasNext() ; )
			{
				str = j.next() + ", ";
				
				if( DEBUG ) System.out.println(this.getClass() + "writeCommaSeparatedFile( ) - next item to be writen is " + str);
				
				bufwriter.write(str, 0, str.length()); 
			}
			
			bufwriter.newLine();
		}
		bufwriter.flush(); 
		bufwriter.close();
	}
	
	public AbstractCollection parseCommaSeparatedFile() throws IOException
	{
		ArrayList data_collection = new ArrayList();
		ArrayList field_collection = new ArrayList();
		LineNumberReader ln_reader = new LineNumberReader(new BufferedReader( new FileReader(m_file) ) );
		String line_data = ln_reader.readLine();
		String[] split_data = line_data.split(", ");
		
		
		while(line_data != null) {
			split_data = line_data.split(", ");
			data_collection.add(new ArrayList(Arrays.asList(split_data)));
			line_data = ln_reader.readLine();
		}
		ln_reader.close();
		return data_collection;
	}
	
	public Collection searchCommaSeparatedFile(String filter, boolean ignore_case, int max_returns) throws IOException
	{
		LineNumberReader ln_reader = new LineNumberReader(new BufferedReader( new FileReader(m_file) ) );
		ArrayList results = new ArrayList();
		String line_data = ln_reader.readLine();
		String[] split_data = line_data.split(", ");
		int idx = 0;
		
		while( line_data != null )
		{
			for(int i = 0; i < Arrays.asList(split_data).size(); i++)
				if( (idx = split_data[i].indexOf(filter,idx)) > 0 )
					results.add(new ArrayList(Arrays.asList(split_data)));
			line_data = ln_reader.readLine();
		}
		return results;		
	}
}
