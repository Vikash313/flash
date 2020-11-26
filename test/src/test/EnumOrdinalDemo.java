package test;

enum Beer1
{
	KF,KO,RC,FO;
}
class EnumOrdinalDemo
{

	public static void main(String[] args) 
	{
		Beer1[] b = Beer1.values();
		for(Beer1 b1 : b)
		{
			System.out.println(b1+"......"+b1.ordinal());
		}

	}

}
