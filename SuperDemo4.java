import java.io.*;

class Point2D
{
	int x=0;
	int y=0;
	Point2D(int x ,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class Point3D extends Point2D
{
	int z;
	Point3D()
	{
		super(0,0);
		z=0;
	}
	Point3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
}

class SuperDemo4
{
	public static void main(String args[])
	{
		Point3D ob = new Point3D();
	}
}
