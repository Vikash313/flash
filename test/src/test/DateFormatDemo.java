package test;
import java.util.*;
import java.text.*;

public class DateFormatDemo {

	public static void main(String[] args)
	{
	   System.out.println("Full form is....:"+DateFormat.getDateInstance(0,Locale.US).format(new Date()));
	   System.out.println("Long form is....:"+DateFormat.getDateInstance(1,Locale.US).format(new Date()));
	   System.out.println("Medium form is....:"+DateFormat.getDateInstance(2,Locale.US).format(new Date()));
	   System.out.println("Short form is....:"+DateFormat.getDateInstance(3,Locale.US).format(new Date()));

	}

}
