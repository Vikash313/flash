package test;
class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}

public class DaemonThreadDemo
{
public static void main(String[] args) throws InterruptedException
{
	MyThread3 t=new MyThread3();
	t.setDaemon(true);
	t.start();
	System.out.println("End of main thread");
}
}
