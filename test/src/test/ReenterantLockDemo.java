package test;

import java.util.concurrent.locks.ReentrantLock;

class Display1
{
	ReentrantLock l=new ReentrantLock();
public void wish(String name)
{
	l.lock();
	for(int i=0;i<10;i++)
	{
		System.out.println("Good Morning: ");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println(name);
	}
	l.unlock();
}
}

class MyThread5 extends Thread
{
	Display1 d;
	String name;
	MyThread5(Display1 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class ReenterantLockDemo
{
	public static void main(String[] args)
	{
		Display1 d= new Display1();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Yuvraj");
		t1.start();
		t2.start();
	}
}