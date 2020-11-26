package test;
import java.util.Arrays;

import java.util.*;

public class ArraysAsListDemo 
{

	public static void main(String[] args) 
	{
		String[] s = {"A","Z","B"};
		List l =  Arrays.asList(s);
		System.out.println(l);
		s[0] = "K";
		System.out.println(l);
		l.set(1, "L");
		for(String s1 : s)
		{
			System.out.println(s1);
		}

	}

}
