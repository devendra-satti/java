import java.io.*;
import java.util.Scanner;

class Primenumbers1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check it is prime (or) not : ");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
			
		if(isPrime==true)
			System.out.print(num+" is a prime number");
		else
			System.out.print(num+" is not a prime number");
		
	}
}
