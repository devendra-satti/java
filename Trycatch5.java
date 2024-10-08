import java.io.*;

class Trycatch5
{
	public static void main(String args[])
	{
		try
		{
			throw new IOException();
		}
		
		catch(IOException ioe)
		{
			System.out.println("IOException caught "+ioe);
		}
		
	}
}
