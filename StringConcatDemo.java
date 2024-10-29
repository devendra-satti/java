import java.io.*;
import java.lang.String;

class StringConcatDemo
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="World";
		String s3=s1.concat(s2);
		System.out.println("The result of S1 concat S2 is "+s3);
		String s4="SasiSiteWelcomeHello";
		String s5=String.join(" ","Sasi","Site","Welcome","Hello");
		System.out.println("The result of S4 join S2 is "+s5);
		System.out.println("Result of s1+s2 is  "+(s1+s2+s3));
	}
}
