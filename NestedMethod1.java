import java.io.*;
import java.util.*;

class ABC
{
	int m,n;
	ABC(int x,int y)
	{
		m=x;
		n=y;
	}
	int largest()
	{
		if(m>=n)
			return m;
		else
			return n;
	}
	void display()
	{
		int large = largest();
		System.out.println("Largest value is "+ large);
	}
}

class NestedMethod1
{
	public static void main(String args[])
	{
		ABC nest = new ABC(10,20);
		nest.display();
	}
}
