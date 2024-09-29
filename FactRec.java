import java.io.*;
import java.util.*;

class FactRec
{
	int Factorial(int n) 
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*Factorial(n-1);
		}
	}
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		FactRec ob = new FactRec();
		System.out.print("Enter a number  : ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is "+ob.Factorial(num));
	}
}
