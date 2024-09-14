import java.io.*;
import java.util.*;

class MatrixMultiplication
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order of matrix-1: ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.print("Enter order of matrix-2: ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int b[][]=new int[r2][c2];
		if(c1!=r2)
		{
			System.out.println("Matrix Multiplication is not possible!\nOrder of matrices does n't match each other.");
			System.exit(0);   
		}
		else	
		{
			System.out.println("Enter " + r1*c1 + " elements into the matrix -1 : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter " + r2*c2 + " elements into the matrix -2 : ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			int c[][] = new int[r1][c2];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					c[i][j] = 0;
					for(int k=0;k<c1;k++) 
					{
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
				}
			}
			System.out.println("After Multiplication,the resultant matrix is : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
