package test;
import java.util.*;
import java.io.*;

public class PropertiesDemo 
{

	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "88888");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "updated by Durga SCJP demo class ");

	}

}
