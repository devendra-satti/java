import java.io.*;
class FinalDemo
{
	final int speedlimit=80;	
	void run()
	{
		speedlimit=120;
	}
	public static void main(String args[])
	{
		FinalDemo fd= new FinalDemo();
		fd.run();
	}
}
