class invalidAgeException extends Exception
{
	public invalidAgeException(String str)
	{
		super(str);
	}
}

public class TestCustomException1
{
	static void validate(int age) throws invalidAgeException
	{
		if(age<18)
		{
			throw new invalidAgeException("age is not valid to vote");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String args[])
	{
		try
		{
			validate(13);
		}
		catch(invalidAgeException ex)
		{
			System.out.println("caught throw exception");
			System.out.println("Exception occured : "+ex);
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("rest of the code...");
	}
}
