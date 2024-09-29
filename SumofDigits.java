import java.io.*;
import java.util.Scanner;

class SumofDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n,sum=0,temp;
        System.out.print("Enter an integer to find the sum of its digits : ");
        m=sc.nextInt();
        temp=m;
        do
        {
			sum=0;
            while(m>0)
			{
				n=m%10;
				sum=sum+n;
				m=m/10;
			}
			m=sum;
        }while(sum>9);
        System.out.println("Sum of digits :  "+sum);
    }
}
