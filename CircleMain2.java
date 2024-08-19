import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class CircleArea2
{
	double r;
	double area()
	{
		return (22/7.0)*r*r;
	}
}
class CircleMain2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea2 ca1 = new CircleArea2();
		CircleArea2 ca2 = new CircleArea2();
		System.out.print("Enter Radius of the circle-1 : ");
		ca1.r=sc.nextDouble();
		System.out.print("Enter Radius of the circle-2 : ");
		ca2.r=sc.nextDouble();
		System.out.println("Area of Circle-1 is : "+ca1.area());	
		System.out.println("Area of Circle-2 is : "+ca2.area());
	}
}
