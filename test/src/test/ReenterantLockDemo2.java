package test;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

class MyThread7 extends Thread
{
	static ReentrantLock l= new ReentrantLock();
	MyThread7(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
			try
			{
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+"...got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"...release lock");
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+"...unable to get lock and will try again");
				}
			}
			catch(Exception e) {}
		}
		while(true);
	}	
}
public class ReenterantLockDemo2 
{
	public static void main(String[] args)
	{
		MyThread7 t1=new MyThread7("First Thread");
		MyThread7 t2=new MyThread7("Second Thread");
		t1.start();
		t2.start();

	}

}
