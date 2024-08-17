import java.io.*;
import java.text.DecimalFormat;
public class FormattedOutput2
{
	public static void main(String args[])
	{
		double x=123.45678;
		System.out.printf("The number is : %f\n",x);
		DecimalFormat df=new DecimalFormat("####");
		System.out.println("With Fractional part,the number is    : "+x);
		System.out.println("Without Fractional part,the number is : "+df.format(x));
		df=new DecimalFormat("#.##");
		System.out.println("Formatted number with precision is    : "+df.format(x));
		df=new DecimalFormat("$####,###.##");
		System.out.println("After Formatting,the value is         : "+df.format(x));
	}
}
