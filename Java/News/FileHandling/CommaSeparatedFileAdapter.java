public class CommaSeparatedFileAdapter implements FileInterface
{
	CommaSeparatedFile csf;
	
	public CommaSeparatedFileAdapter(File file)
	{
		csf = CommaSeparatedFile(file);
	}
	
	public CommaSeparatedFileAdapter(String filename)
	{
		csf = new CommaSeparatedFile(filename);
	}
	
	public abstract AbstractList parse(FileReader reader)
	{
	}
	
	public abstract void write(AbstractList data)
	{
	}
	
	public abstract AbstractList filter(String filter, boolean ignore_case, int max_returns)
	{
	}
		
}
