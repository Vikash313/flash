package test;
enum Beer3
{
	KF(70), KO(80), RC(90), FO;
	int price;
	Beer3(int price)
	{
		this.price = price;
	}
	Beer3()
	{
		this.price = 65;
	}
	public int getPrice()
	{
		return price;
	}
	
}
public class Vicky1
{

	public static void main(String[] args)
	{
		Beer3[] b = Beer3.values();
		for(Beer3 b1 : b)
		{
			System.out.println(b1+"..."+b1.getPrice());
		}

	}

}
