package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWordInDict {

	public static void main(String[] args) {
		
		String[] dict = {"cat", "dog", "red", "is", "am"};
		System.out.println("Original Dictionary is: "+Arrays.toString(dict));
		System.out.println("LOngest words of the above dictionary is: "+longestwords(dict));

	}
	
	public static ArrayList<String> longestwords(String[] dictionary){
	ArrayList<String> list = new ArrayList<String>();
	int longest_length = 0;
	
	for(String str : dictionary) {
		int length = str.length();
		if(length > longest_length) {
			longest_length = length;
			list.clear();
		}
		if(length == longest_length) {
			list.add(str);
		}
	}
	return list;

  }
}
