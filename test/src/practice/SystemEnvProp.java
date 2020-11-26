package practice;

public class SystemEnvProp {

	public static void main(String[] args) {
		
		System.out.println("Current system environment:");
		   System.out.println(System.getenv());
		 
		   System.out.println("Current system properties:");
		     System.out.println(System.getProperties());
		     
		     System.out.println("System security interface:");
			   System.out.println(System.getSecurityManager());
			   
			   System.out.println("Environment variable path:");
			     System.out.println(System.getenv("PATH"));
			     
			  System.out.println("Environment variable temp:");
			     System.out.println(System.getenv("TEMP"));
			     
			  System.out.println("Environment variable username:");
			     System.out.println(System.getenv("USERNAME"));





		

	}

}
