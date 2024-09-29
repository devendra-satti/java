import java.io.*;
import java.util.*;

class GcdRec
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter 2 numbers for calculating GCD : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
	}
	public static int gcd(int x , int y)
	{
		if(y==0)
		{
			return x;
		}
		else
		{
			return gcd(y,x%y);
		}
	}
}
