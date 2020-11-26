package practice;

public class Matrix {

	public static void main(String[] args) {
		
		int target = 3;
		int[][] matrix = new int[3][3];
		
		for(int row = 0; row < 3; row++) 
			for(int col = 0; col < 3; col++) 
				matrix[row][col] = (1 + row * 3 + col);
			
		System.out.println("Matrix is: ");
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.print(Boolean.toString(searchMatrix(matrix,target)));
	}
	
	   public static boolean searchMatrix(int[][] matrix, int target){
	
	       if(matrix.length == 0) 
	    	   return false;
	       
	       int m = matrix.length;
	       int n = matrix[0].length;
	       
	       int lower = 0;
	       int higher = m*n-1;
	       
	       while(lower <= higher) {
	    	   int mid = (lower + higher) >> 1;
	    	   int val = matrix[mid / n][mid % n];
	    	   
	    	   if(val == target) {
	    	   return true;
	    	   }
	    	   if(val < target) {
	    		   lower = mid + 1;
	    	   }
	    	   else {
	    		   higher = mid - 1;
	    	   }
	       }
	       
	       return false;



}
}
