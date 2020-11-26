package test;
import java.util.concurrent.locks.ReentrantLock;

class MyThread6 extends Thread
{
static ReentrantLock l=new ReentrantLock();
MyThread6(String name)
{
	super(name);
}
public void run()
{
	if(l.tryLock())
	{
		System.out.println(Thread.currentThread().getName()+"....got lock and perfroming safe performance");
		try 
		{
		Thread.sleep(2000);	
		}
		catch(InterruptedException e) {}
		l.unlock();
	}
	else
	{
		System.out.println(Thread.currentThread().getName()+".....unable to get lock and hence performing alternative operations");
}
}
}

public class ReenterantLockDemo1 
{
	public static void main(String[] args) 
	{
		MyThread6 t1=new MyThread6("First Thread");
		MyThread6 t2=new MyThread6("Second Thread");
		t1.start();
		t2.start();

	}

}
