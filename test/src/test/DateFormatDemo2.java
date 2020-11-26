package test;
import java.text.*;
import java.util.*;


public class DateFormatDemo2 
{

	public static void main(String[] args) 
	{
		DateFormat us = DateFormat.getDateTimeInstance(0,0,Locale.US);
		System.out.println("US style is:" +us.format(new Date()));
	}

}
