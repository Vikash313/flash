package practice;
import java.util.Scanner;
import java.io.File;

public class SizeOfFIle {

	public static void main(String[] args) {
		
		String pathFile = "D:\\java study material";
		File file = new File(pathFile);
		if(file.exists()) {
			System.out.println(file.getAbsolutePath()+ ":"+file.length());
			
		}
		  System.out.println("D:\\java study material  : " + new File("abc.txt").length() + " bytes");

		

	}

}
