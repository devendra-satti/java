//COPY CONSTRUCTOR DEMO
import java.io.*;
import java.util.*;
class CircleArea7
{
    double r;
    CircleArea7()
    {
        r=0;
    }
    CircleArea7(double r)
    {
        this.r=r;
    }
    CircleArea7(CircleArea7 c)
    {
        this.r=c.r;
    }
    double area()
    {
        return (22/7.0)*r*r;
    }
    double area(double x)
    {
        return (22/7.0)*r*r;
    }
    void setCircle(double r)
    {
        this.r=r;
    }
}

class CircleMain7
{
	public static void main(String[] args) 
	{
		CircleArea7 c1 = new CircleArea7();
		CircleArea7 c2 = new CircleArea7(5.5);
		CircleArea7 c3 = new CircleArea7(c2);
		Scanner sc = new Scanner (System.in);
		System.out.println("Area of first circle is "+c1.area());
		System.out.println("Area of Second circle with radius 5.5  is "+c2.area());
		System.out.println("Area of third circle with copy constructor of c2 is "+c3.area());
		System.out.print("Enter radius of Circle to find area : ");
		double radius = sc.nextDouble();
		c1.setCircle(radius);
		System.out.println("Area of circle is "+c3.area(radius));
		System.out.println("Area of circle is "+c1.area());
		
	}
}
