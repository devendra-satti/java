import java.io.*;
import java.lang.*;

class ImmutableStringDemo
{
	public static void main(String args[])
	{
		String s="SASI";
		s.concat("SITE");
		System.out.println("After concatinating S1 and S2 : "+s);
		s = "ADI REDDY";
		s=s.concat("SATTI");
		System.out.println("After concatinating S1 and S2: "+s);
	}
}
