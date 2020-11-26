package test;

enum Beer
{
	KF,KO,RC,FO;
}

class Sarita
{

	public static void main(String[] args) 
	{
		Beer b = Beer.RC;
		switch(b)
		{
		case KF:
			System.out.println("It is children brand");
			break;
			
		case KO:
			System.out.println("It is too light");
			break;
			
		case RC:
			System.out.println("It is not that much kick");
			break;
			
		case FO:
			System.out.println("Buy one get one free");
			break;
			
		default:
			System.out.println("other brand");
		}

	}

}
