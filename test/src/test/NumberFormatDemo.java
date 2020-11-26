package test;
import java.text.*;
import java.util.*;

public class NumberFormatDemo 
{

	public static void main(String[] args)
	{
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Italy Form is...:"+nf.format(d));

	}

}
