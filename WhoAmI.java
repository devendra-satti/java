import java.io.*;

class A
{
	void callMe()
	{
		System.out.println("I am from A");
	}
}

class B extends A
{
	void callMe()
	{
		System.out.println("I am from B");
	}
}

class WhoAmI
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		a1.callMe();
		a2.callMe();
		b.callMe();
	}
}
