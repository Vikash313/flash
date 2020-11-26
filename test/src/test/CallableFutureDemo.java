package test;

import java.util.concurrent.*;
class MyCallable implements Callable
{
	int num;
	MyCallable(int num)
	{
		this.num=num;
	}
	public Object call() throws Exception
	{
		System.out.println(Thread.currentThread().getName()+"is...responsible to  find su of first"+num+"numbers");
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}

public class CallableFutureDemo
{

	public static void main(String[] args) throws Exception
	{
		MyCallable[] jobs= { new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				new MyCallable(60) };
		ExecutorService Service=Executors.newFixedThreadPool(3);
		for(MyCallable job: jobs)
		{
			Future f=Service.submit(job);
			System.out.println(f.get());
		}
Service.shutdown();
	}

}
