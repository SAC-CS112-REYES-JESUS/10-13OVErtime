
import java.util.Scanner;
import java.util.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;
public class PrintF {

	
	public static void main( String[] args)
	{
	/*	String name = "Jesus r";
		int x = 5;
		
		Scanner input = new Scanner ( System.in);
		
		
		System.out.println("My name is Jesus");
		System.out.printf("My name is%10s and this is the number %d\n", name,x);// 40000000004
		System.out.print("Hello");
		
	*/
		
		
		System.out.format("Local time here is %1$tT\n", Calendar.getInstance());
		System.out.format("Local time: %tT\n", Calendar.getInstance());
		
		Calendar c = new GregorianCalendar(1994,DECEMBER, 21);
		Calendar z = new GregorianCalendar(2000,MAY,13);
		
		String s = String.format("Dukes Birthday: %1$tm %1$te, %1$tY "
				+ "This is my bd: %2tm %2$te,%2$tY", c,z);
		
		System.out.print(s);
		
	}
		
}
