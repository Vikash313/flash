package test;

import java.io.FileWriter;

public class FileWriterDemo
{

	public static void main(String[] args) throws Exception
	{
		FileWriter fw= new FileWriter("abc.txt",true);
		fw.write(100);
		fw.write("urga\nSoftwareSolutions");
		fw.write('\n');
		char[] ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();

	}

}
