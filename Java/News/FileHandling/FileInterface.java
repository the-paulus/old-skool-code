import java.io.*;

abstract class FileInterface
{
	public abstract String[] parse(Reader reader, boolean ignore_case);
	public abstract void write(Writer writer, boolean ignore_case);
	public abstract String[] filter(String filter, boolean ignore_case, int max_returns);
}
