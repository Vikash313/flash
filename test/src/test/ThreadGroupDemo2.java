package test;
class MyThread4 extends Thread
{
MyThread4(ThreadGroup g,String name)
{
	super(g,name);
}
public void run()
{
	System.out.println("Child Thread");
	try 
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {}
}
}
public class ThreadGroupDemo2 
{

	public static void main(String[] args) throws InterruptedException
	{
	ThreadGroup pg=new ThreadGroup("Child Thread");
	ThreadGroup cg=new ThreadGroup(pg,"Child Thread");
	MyThread4 t1=new MyThread4(pg,"Child Thread1");
	MyThread4 t2=new MyThread4(pg,"Child Thread2");
	t1.start();
	t2.start();
	System.out.println(pg.activeCount());
	System.out.println(pg.activeGroupCount());
	pg.list();
	Thread.sleep(10000);
	System.out.println(pg.activeCount());
	System.out.println(pg.activeGroupCount());
	pg.list();
		}

}
