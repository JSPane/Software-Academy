
import java.util.Scanner;

public class RobotEscape {

	public static void main(String[] args) {
		Character player = new Character("Player", 100, 100, 100, 100, 10, 5, 8);
		
		Map level1 = new Map(10, 10);
		
		int escapeX = (int) (Math.random() * 10);
		int escapeY = (int) (Math.random() * 10);
		
    	System.out.println("You are trapped in an abandoned facility!");
    	System.out.println("Try to avoid the deadly robot and escape!");
        
        while (level1.getCurrentX() != escapeX || level1.getCurrentY() != escapeY) {
        	Scanner myScanner = new Scanner(System.in);
        	
            System.out.println("Current x position is: " + level1.getCurrentX());
            System.out.println("Current y position is: " + level1.getCurrentY());
        	
            System.out.println("Which direction do you want to go?");
            System.out.println("N for North, E for East, S for South and W for West");
            
            String direction = myScanner.nextLine();
            level1.move(direction);
        	
        }
        
        System.out.println("You've found the exit!");
        
	}

}
