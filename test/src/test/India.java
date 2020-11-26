package test;

class India 
{
public void m1()
{
	int x=10;
	class Inner
	{
		public void m2()
		{
			System.out.println(x);
		}
	}
	Inner i=new Inner();
	i.m2();
}
	public static void main(String[] args)
	{
		India i=new India();
i.m1();
	}

}
