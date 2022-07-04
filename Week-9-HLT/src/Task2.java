
public class Task2 {

	public static void main(String[] args) {
		for (int i = 1900; i < 2030; i++) {
			
			if (i % 4 != 0) {
				System.out.println(i + " is not a leap year!");
			
		    } else if (i % 400 == 0) {
		    	System.out.println(i + " *is* a leap year!");
		    
		    } else if (i % 100 == 0) {
		    	System.out.println(i + " is not a leap year!");
		    
		    } else {
		    	System.out.println(i + " *is* a leap year!");
		    
		    }

		}

	}

}
