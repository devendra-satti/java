import java.io.*;

class MultipleExceptions
{
	public static void main(String args[])
	{
		int a=5,b=0,c;
		int arr[] = new int[5];
		String str = null;
		try
		{
			c=a/b;
			arr[10]=200;
			System.out.println("Length of the string  is " +str.length());
			throw new IOException();
		}
		catch(NullPointerException np)
		{
			System.out.println("NullPointerException caught : "+ np);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException caught : "+ ae);
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught : "+x);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
