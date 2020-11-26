package test;
import java.lang.reflect.*;

public class Train
{

	public static void main(String[] args)
	{
		int count=0;
		Object o= new String("Durga");
		Class c=o.getClass();
		System.out.println("Fully qualified name of class: "+c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("Methods Information");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The Number of methods: "+count);
	}

}
