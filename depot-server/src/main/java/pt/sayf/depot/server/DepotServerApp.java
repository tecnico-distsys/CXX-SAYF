package pt.sayf.depot.server;


public class DepotServerApp {

	
	public static void main(String[] args) {
			
		
		System.out.println(DepotServerApp.class.getSimpleName());
		
		// receive and print arguments
		System.out.printf("Received %d arguments%n", args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.printf("arg[%d] = %s%n", i, args[i]);
		}
	}
	
}
