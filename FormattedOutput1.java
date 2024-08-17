import java.io.*;
public class FormattedOutput1
{
	public static void main(String args[])
	{
		String str="Adi Reddy";
		System.out.printf("The String value is   : %s\n",str);
		int x=512;
		System.out.printf("The Integer value is  : %d\n",x);
		double f=5.25412368;
		System.out.printf("The Decimal value is  : %f\n",f);
		System.out.printf("After Formatting to specific width the value is : %.4f\n",f);
		System.out.printf("After Formatting to rigth margin the value is   : %20.4f\n",f);
		System.out.printf("After Formatting to rigth margin the value is   : %020.4f\n",f);
	}
	
}
