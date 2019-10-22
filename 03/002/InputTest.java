

import java.io.*;

public class InputTest
{
	public static void main(String[] args)
	{
		int c;
		InputStream in = null;
		try
		{
			in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while((c = in.read()) >= 0)
			{
				System.out.print((char)c);
			}
			
		} catch (IOException e){e.printStackTrace();}
	}
}