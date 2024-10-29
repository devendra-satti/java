import java.io.*;
import java.lang.String;

class StringComparisionDemo
{
	public static void main(String args[])
	{
		String s1="Sasi";
		String s2="Site";
		String s3="SASI";
		String s4="SITE";
		String s5="Sasi";
		String s6="SASISITE";
		System.out.println("S1 equals S2 returns : "+ s1.equals(s2));
		System.out.println("S3 equals S5 returns : "+ s3.equals(s5));
		System.out.println("S3 equals S5 returns : "+ s3.equalsIgnoreCase(s5));
		System.out.println("S1 compareTo S2 returns : "+ s1.compareTo(s2));
		System.out.println("S3 compareTo S5 returns : "+ s3.compareTo(s5));
		System.out.println("S5 compareTo S6 returns : "+ s5.compareTo(s6));
		System.out.println("S1==S2 returns : "+ (s1==s2));
		System.out.println("S3==S5 returns : "+ (s3==s5));
	}
}
