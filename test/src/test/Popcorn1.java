package test;

class PopCorn
{
	public void taste()
	{
		System.out.println("salty");
	}
}

class Popcorn1 
{

	public static void main(String[] args) 
	{
		PopCorn p=new PopCorn()
				{
			public void taste()
			{
				System.out.println("spicy");
			}
				};
				p.taste();
				PopCorn p1=new PopCorn();
				p1.taste();
				
				PopCorn p2=new PopCorn()
				{
					public void taste()
					{
						System.out.println("sweet");
					}
				};
				p2.taste();
				System.out.println(p.getClass().getName());
				System.out.println(p1.getClass().getName());
				System.out.println(p2.getClass().getName());

	}

}
