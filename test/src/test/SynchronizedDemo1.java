package test;

 class Corona
 {
	 public synchronized void wish(String name)
 {
	 ;;;;;;;;//1 lakh line of code
	 for(int i=0;i<10;i++)
	 {
		 System.out.print("Good Morning ");
		 try
		 {
			 Thread.sleep(2000);
		 }catch(InterruptedException e) {}
		 System.out.println(name);
	 }
	 ;;;;;;;;//1 lakh line of code
	 }
 }


class MyThreadC extends Thread
{
	Corona d;
	String name;
	MyThreadC(Corona d,String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}

class SynchronizedDemo1
{
	public static void main(String[] args)
	{
		Corona d= new Corona();
		MyThreadC t1 = new MyThreadC(d,"Dhoni");
		MyThreadC t2 = new MyThreadC(d,"Yuvraj");
		t1.start();
		t2.start();
	}
}