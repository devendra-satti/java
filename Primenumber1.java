import java.io.*;
import java.util.Scanner;

public class Primenumbers1
{
    public static void main(String args[])
    {
        int n;
        boolean res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a +ve integer to check whether it is prime or not : ");
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            res=true;
            if(n%i==0)
            {
             res=false;
             break;
            }
        }
        if(res)
            System.out.prinf("%d is a prime number",n);
        else
            System.out.prinf("%d is not a prime number",n);
    }
}
