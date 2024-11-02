
import java.io.*;

public class ThreadRunnableDemo implements Runnable
{
	public void run()
	{
		System.out.println("Thread is created & executed");
	}
	public static void main(String args[])
	{
		ThreadRunnableDemo ob = new ThreadRunnableDemo();
		Thread t = new Thread(ob);
		t.start();
	}
}

