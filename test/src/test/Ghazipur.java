package test;

 class Ghazipur
 {
String name;
int rollno;
Ghazipur(String name, int rollno)
{
	this.name =name;
	this.rollno= rollno;
}
public String toString()
{
	//return name+"...."+rollno;
	return"This is the Ghazipur with the name:"+name+" and Rollno:"+rollno;
}
	public static void main(String[] args)
	{
		Ghazipur g1=new Ghazipur("Vikash",101);
		Ghazipur g2=new Ghazipur("Ashutosh",102);
		System.out.println(g1);
		System.out.println(g1.toString());
		System.out.println(g2);

	}

}
