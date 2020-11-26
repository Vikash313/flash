package test;
import java.util.*;

public class ListIteratorDemo
{

	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add("Balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator Itr = l.listIterator();
		while(Itr.hasNext())
		{
			String s = (String)Itr.next();
			
			if(s.equals("venki"))
			{
				Itr.remove();
			}
			else if(s.equals("nag"))
			{
				Itr.add("Chaitu");
			}
			else if(s.equals("chiru"))
			{
				Itr.set("charan");
			}
		}
		System.out.println(l);

	}

}
