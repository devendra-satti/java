import java.io.*;
import java.util.Scanner;
class Evenodd
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.print("Enter an integer to check whether it is even or odd: ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is a Even number");
		}
		else
		{
			System.out.println(num+" is a Odd number");
		}
	}
}
