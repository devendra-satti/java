//JAVA PROGRAM TO DISPLAY PRIME NUMBERS IN A GIVEN RANGE
import java.io.*;
import java.util.Scanner;

class Primenumbers
{
	public static void main(String args[])
	{
		int start,end;
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter range to display Prime numbers");
		System.out.print("Enter Start value(+ve) : ");
		start=sc.nextInt();
		System.out.print("Enter End value(+ve)   : ");
		end=sc.nextInt();
		System.out.print("\nTHE PRIME NUMBERS FROM "+start+" TO "+end+" ARE : ");
		for(int i=start;i<=end;i++)
		{
			result=true;
			if(i==0 || i==1)
				continue;
			for(int j=2;j<i;j++)
			{
					if(i%j==0)
					{
						result=false;
						break;
					}
			}
			if(result)
				System.out.print(i+" ");
		}
		System.out.print("\n");
		
	}
}
