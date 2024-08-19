import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class CircleArea1
{
	double x,y;
	double r;
	double area()
	{
		return (22/7.0)*r*r;
	}
}
class CircleMain1
{
	public static void main(String args[])
	{
		CircleArea1 ca = new CircleArea1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter centre of the circle (x,y) : ");
		ca.x=sc.nextInt();
		ca.y=sc.nextInt();
		ca.r=Math.sqrt((ca.x*ca.x)+(ca.y*ca.y));
		System.out.println("Area of Circle is : "+ca.area());	
	}
}
