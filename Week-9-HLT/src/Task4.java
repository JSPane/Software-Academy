
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		
		boolean numberGuessed = false;
		
		double random = Math.floor(Math.random() * (max - min + 1) + min);
		
		while (numberGuessed == false) {
			
			Scanner value = new Scanner(System.in);
			
			System.out.println("Enter a number between 1-100:");
			
			int inputValue = value.nextInt();
			System.out.println("You entered: " + inputValue + "!");
		
		    if (inputValue > random) {
			    System.out.println("Number is too high!");
			
		    } else if (inputValue < random) {
			    System.out.println("Number is too low!");
			
		    } else if (inputValue == random) {
			    System.out.println("You got it!");
			    numberGuessed = true;
			
		    }

		}

	}

}
