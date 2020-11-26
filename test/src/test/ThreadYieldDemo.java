package test;
class MyThreadDemo extends Thread
{
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
			Thread.yield();
		}

	}

}

class ThreadYieldDemo extends MyThreadDemo
{
	public static void main(String[] args) 
	{
		MyThreadDemo t=new MyThreadDemo();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}
	}
}