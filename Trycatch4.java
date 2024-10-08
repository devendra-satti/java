import java.io.*;

class Trycatch4
{
	public static void main(String args[])
	{
		int a=5,b=0,c;
		try
		{
			c=a/b;
			System.out.println("Value of c is "+c);
		}
		
		catch(IOException ioe)
		{
			System.out.println("IOException caught "+ioe);
		}
		
	}
}
