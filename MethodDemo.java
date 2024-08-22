import java.io.*;
import java.util.Scanner;

public class MethodDemo
{
	int add(int x,int y)		
	{
		int z=x+y;
		return z;
	}
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		MethodDemo md= new MethodDemo();	
		System.out.print("Enter two integers for addition : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=md.add(a,b);			
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
}
