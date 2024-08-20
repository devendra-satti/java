import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class CircleArea
{
	double r;
	double area()		
	{
		return (22/7.0)*r*r;
	}
	void setCircle(double r) 	
	{
		this.r=r;		
	}
	
}
class CircleMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea ob1 = new CircleArea();
		CircleArea ob2 = new CircleArea();
		System.out.print("Enter Radius of the circle-1 : ");
		double radius1=sc.nextDouble();
		System.out.print("Enter Radius of the circle-2 : ");
		double radius2=sc.nextDouble();
		ob1.setCircle(radius1);
		ob2.setCircle(radius2);
		System.out.println("Area of Circle-1 is : "+ob1.area());	
		System.out.println("Area of Circle-2 is : "+ob2.area());
	}
}
