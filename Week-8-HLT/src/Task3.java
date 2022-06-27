
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    
		System.out.println("Enter physics score");
		int physics = myObj.nextInt();
		    
		System.out.println("Enter chemistry score");
		int chemistry = myObj.nextInt();
		    
		System.out.println("Enter biology score");
		int biology = myObj.nextInt();
			
	    int total = 0;
		int percentage = 0;
		
		results a = new results();
		
		a.method1(physics, chemistry, biology, total, percentage);
		
	}
	
}
