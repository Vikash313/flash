package test;
import java.text.*;
import java.util.*;


public class NumberFormatDemo1
{

	public static void main(String[] args)
	{
		double d = 123456.789;
		Locale india = new Locale("pa","IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
		System.out.println("India Form is...:"+nf.format(d));
		
		NumberFormat nf1= NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US Form is...:"+nf1.format(d));
		
		NumberFormat nf2= NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK Form is...:"+nf2.format(d));

	}

}
