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
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		MethodDemo md= new MethodDemo();	
		System.out.print("Enter two integers for addition : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=md.add(x,y);			
		System.out.println("Sum of "+x+" and "+y+" is "+z);
	}
}
