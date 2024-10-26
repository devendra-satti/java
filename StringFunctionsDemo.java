import java.io.*;
import java.lang.*;

class StringFunctionsDemo
{
	public static void main(String args[])
	{
		String s1="Welcome";
		String s2= new String("Welcome");
		String s3="Wel";
		boolean x=s1.equals(s2);
		System.out.println("S1 and S2 are equal : "+x);
		x=s1.equals(s3);
		System.out.println("S1 and S3 are equal : "+x);
		System.out.println("The character at 4th position in S1 is : "+s1.charAt(3));
		System.out.println("Length of S1 is : "+s1.length());
		System.out.println("S1 in uppercase is : "+s1.toUpperCase());
		System.out.println("The substring from index 2 to 5 in S1 : "+s1.substring(2,5));
		System.out.println("The index of 'c' in S2 : "+s2.indexOf('c'));
		System.out.println("After concatinating S1 and S3 is : "+s1.concat(s3));
		System.out.println("After concatinating S3 and S1 is : "+s3.concat(s1));
		System.out.println("S1 contains S3 : "+s1.contains(s3));
		System.out.println("S3 contains S1 : "+s3.contains(s1));
	}
	
}
