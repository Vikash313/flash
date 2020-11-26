package test;
import java.util.concurrent.*;
class PrintJob implements Runnable
{
String name;
PrintJob(String name)
{
	this.name=name;
}
public void run()
{
	System.out.println(name+"...Job Started by Thread:"+Thread.currentThread().getName());
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {}
	System.out.println(name+"...Job Completed by Thread:"+Thread.currentThread().getName());
}
}

public class ExecutorDemo
{

	public static void main(String[] args)
	{
PrintJob[]Jobs= { new PrintJob("durga"),
		new PrintJob("Ravi"),
		new PrintJob("Shiva"),
		new PrintJob("Pawan"),
		new PrintJob("Suresh"),
		new PrintJob("Anil") };
ExecutorService Service=Executors.newFixedThreadPool(1);
for(PrintJob job: Jobs)
{
	Service.submit(job);
}
Service.shutdown();
	}

}
