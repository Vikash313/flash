package practice;

import java.util.Arrays;

public class Exercise101 {

	public static void main(String[] args) {
		
		int[] array_nums = {10,11,10,30,45,20,33,53};
		System.out.println("Array is: "+Arrays.toString(array_nums));
		int ctr1 = 0;
		int ctr2 = 0;
		
		for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] == 10)
				ctr1++;
		}
        System.out.println("Number of 10s is: "+ctr1);
        
        for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] == 20)
				ctr2++;
		}
        System.out.println("Number of 20s is: "+ctr2);
        
        System.out.println(String.valueOf(ctr1>ctr2));
        
        /*if(ctr1 > ctr2) {
          System.out.println(true);
         }
        else
         System.out.println(false);*/
	}

}
