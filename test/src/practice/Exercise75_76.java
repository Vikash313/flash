package practice;

public class Exercise75_76 {

	public static void main(String[] args) {
		
		int[] num_array1 = {10,30,20,-58,0,60,78,10};
		int[] num_array2 = {10,35,40,50,98,63,56,10};
		
		if(num_array1.length>=2 && num_array1.length>=2) {
		System.out.println(num_array1[0] == num_array2[0] && num_array1[num_array1.length-1] == num_array2[num_array2.length-1]);
		}
		else {
			System.out.println("the length is less than two");
		}

}
}
