import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class RectangleArea1
{
	double l,b;
	double area()
	{
		return l*b;
	}
}
class RectangleMain1
{
	public static void main(String args[])
	{
		RectangleArea1 ra = new RectangleArea1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth values of a Rectangle : ");
		ra.l=sc.nextDouble();
		ra.b=sc.nextDouble();
		System.out.println("Area of Rectangle is : "+ra.area());	
	}
}
