//TO FIND THE AREA OF A CIRCLE
import java.io.*;
import java.util.Scanner;


class CircleArea5
{
	double r;	
	CircleArea5()
	{
		r=0;  	
	}
	CircleArea5(double c)
	{
		r=c;
	}
	double area()		
	{
		return (22/7.0)*r*r;
	}
	void setCircle(double r) 	
	{
		this.r=r;			
	}
	
}
class CircleMain5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea5 ob1 = new CircleArea5();
		CircleArea5 ob2 = new CircleArea5(5);
		System.out.print("Enter Radius of the circle-1 : ");
		double radius=sc.nextDouble();
		ob1.setCircle(radius);
		System.out.println("Area of Circle-1 is : "+ob1.area());	
		System.out.println("Area of Circle-2 is : "+ob2.area());
	}
}
