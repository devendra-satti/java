import java.io.*;
import java.util.Scanner;

class SumofDigits1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,temp,r,sum=0;
        System.out.print("Enter an integer to find the sum of its digits : ");
        n=sc.nextInt();
        temp=n;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of the digits of "+temp+" is "+sum);
    }
}
