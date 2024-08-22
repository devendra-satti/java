import java.io.*;
import java.util.Scanner;

public class MethodDemo1
{
    int x,y,z;
	int add(int x,int y)		
	{
		z=x+y;
		return z;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MethodDemo md= new MethodDemo();	
		System.out.print("Enter two integers for addition : ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =md.add(a,b);			
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
}
