package practice;

import java.util.Arrays;

public class Exercise154 {

	public static void main(String[] args) {
		
		boolean[][] array = {{true,false,true},{false,true,false}};
		
		int row_length = array.length;
		int column_length = array[0].length;
		
		for(int i = 0; i < row_length; i++) {
			for(int j = 0; j < column_length; j++) {
				
			if(array[i][j] == true) {
				System.out.println("t");
			}
			else {
				System.out.println("f");
			}
			
		}

	}

	}
}