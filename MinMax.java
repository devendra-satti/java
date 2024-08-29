import java.io.*;
import java.util.Scanner;

class MinMax
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements in the array : ");
	int n = sc.nextInt();
	System.out.print("Enter "+n+" elements of the array : " );
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	int min=arr[0],max=arr[0];
	for(int i=0;i<n;i++)
	{
		if(arr[i]<min)
			min=arr[i];
		if(arr[i]>max)
			max=arr[i];
	}
	System.out.println("In the given array, ");
	System.out.println("Min element of the array is "+min);
	System.out.println("Max element of the array is"+max);
	}
}

