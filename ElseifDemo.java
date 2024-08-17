import java.io.*;
import java.util.Scanner;
class ElseifDemo
{
	public static void main(String args[])
	{
		int sm1,sm2,sm3,sm4,sm5;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks of 5 Subjects : ");
		sm1=sc.nextInt();
		sm2=sc.nextInt();
		sm3=sc.nextInt();
		sm4=sc.nextInt();
		sm5=sc.nextInt();
		avg=(sm1+sm2+sm3+sm4+sm5)/5.0;
		System.out.println("Student average is "+avg);
		if(avg>=80)
		{
			System.out.println("Student passed in Distinction");
		}
		else if(avg>=70 && avg<80)
		{
			System.out.println("Student passed in First class");
		}
		else if(avg>=50 && avg<70)
		{
			System.out.println("Student passed in Second class");
		}
		else if(avg>40 && avg<50)
		{
			System.out.println("Student passed in third class");
		}
		else
		{
			System.out.println("Student Failed...");
		}
	}
}
