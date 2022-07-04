
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter a number to display its times table:");
		
		int inputValue = value.nextInt();
		System.out.println("You entered: " + inputValue + " - It's times table is:");
		
        int num = inputValue;
		
		System.out.println(num);
		
		for (int i = 0; i < 11; i++) {
			num += inputValue;
			
			System.out.println(num);
			
		}

	}

}
