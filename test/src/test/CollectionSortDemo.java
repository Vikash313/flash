package test;
import java.util.*;

public class CollectionSortDemo
{

	public static void main(String[] args) 
	{
		ArrayList l  = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));
		//l.add(null);
		System.out.println("Before Sorting:"+ l);
		Collections.sort(l);
		System.out.println("After Sorting:"+ l);
		

	}

}
