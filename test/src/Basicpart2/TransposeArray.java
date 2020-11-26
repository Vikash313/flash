package Basicpart2;

public class TransposeArray {

	public static void main(String[] args) {
		
		
		int[][] twodm = {{10,20,30},{40,50,60}};
		
		System.out.println("Originl Array:");
		print_array(twodm);
		System.out.println("After changing the rows and column: ");
		transpose(twodm);
		
	}
		
		private static void transpose(int[][] twodm) {
		
		int[][] newtwodm = new int[twodm[0].length][twodm.length];
		
		for(int i = 0; i < twodm.length; i++) {
			for(int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}

		print_array(newtwodm);

	}

		private static void print_array(int[][] twodm) {
			
			for(int i = 0; i < twodm.length; i++) {
				for(int j = 0; j < twodm[0].length; j++) {
					System.out.println(twodm[i][j]);
				}
				System.out.println();
			}
			
		}

}
