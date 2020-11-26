package practice;

public class UniqueChar {

	public static void main(String[] args) {
		int result = 0;
		 
		String str = "xyz";
		System.out.println("Original String is : "+str);
		
		char[] chars = str.toCharArray();
		
		for(int i= 1; i<chars.length; i++) {
			if(chars[i] == chars[i - 1]) 
				System.out.println(String.valueOf(false));
			else 
				result = 1;	
		}
		if(result == 1)
			System.out.println(String.valueOf(true));

	}

}
