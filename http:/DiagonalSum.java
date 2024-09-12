import java.io.*;
import java.util.*;

class DiagonalSum
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter " + r*c + " elements into the matrix: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		if(r!=c)
		{
			System.out.println("Please enter a square matrix");
		}
		else
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(i==j)
					{
						sum=sum+arr[i][j];					
					}
				}
			}
			System.out.println("Sum of principal diagonal elememts is "+sum);
		}
	}
}
