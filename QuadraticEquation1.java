import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class QuadraticEquation1
{
	public static void main(String args[])
	{
		double a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.print("Coefficient a: ");
		a=obj.nextDouble();
		System.out.print("Coefficient b: ");
		b=obj.nextDouble();
		System.out.print("Coefficient c: ");
		c=obj.nextDouble();

		double d=b*b-4*a*c;
		double r1=(-b+Math.sqrt(d))/(2*a) , r2=(-b-Math.sqrt(d))/(2*a);
		if(d>0)
		{
			System.out.println("The roots are real and distinct");
			System.out.print("Root1: "+r1);
			System.out.println(" Root2: "+r2);
		}
		else if(d==0)
		{
			System.out.println("The roots are real and equal");
			System.out.println("Root: "+r1);
		}
		else
			System.out.println("The roots are imaginary");
	}
}
