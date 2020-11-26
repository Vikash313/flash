package test;

 class Cat1
{
int j=20;
Cat1(int j)
{
	this.j=j;
}
class Dog implements Cloneable
{
	Cat1 c;
	int i;
	Dog(Cat1 c,int i)
	{
		this.c=c;
		this.i=i;
	}
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
}
class ShallowCloning
{
public  void main(String[] args) throws CloneNotSupportedException
	{
Cat1 c=new Cat1(20);
Dog d1=new Dog(c,10);
System.out.println(d1.i+"....."+d1.c.j);
Dog d2=(Dog)d1.clone();
d2.i=888;
d2.c.j=999;
System.out.println(d1.i+"....."+d1.c.j);
	}

}
}
