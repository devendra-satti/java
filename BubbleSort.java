import java.io.*;
import java.util.Scanner;

class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];		
		System.out.print("Enter "+n+" elements into the array : " );
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("After Sorting,The Elements of the array are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
