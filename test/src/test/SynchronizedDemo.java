package test;

class Display
{
	public static synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning: ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread
{
Display1 d;
String name;
MyThread(Display1 d,String name)
{
	this.d=d;
	this.name=name;
}
public void run()
{
	d.wish(name);
}
}

class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Display1 d1=new Display1();
		Display1 d2=new Display1();
		MyThread t1 = new MyThread(d1,"Ashutosh Tiwari");
		MyThread t2 = new MyThread(d2,"Vikash Dubey");
		t1.start();
		t2.start();
	}
}