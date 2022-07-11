
import java.util.HashMap;

public class RobotEscape {

	static class Coords {
		int x = 10;
		int y = 10;
		
		public boolean equals(Object o) {
            Coords c = (Coords) o;
            return c.x == x && c.y == y;
            
        }

        public Coords(int x, int y) {
        	super();
        	
        	this.x = x;
            this.y = y;
            
        }

	}

	public static void main(String[] args) {
		Character player = new Character("Player", 100, 100, 100, 100, 10, 5, 8);
		System.out.println(player.getName());
		
		Character killerRobot = new Character("Killer Robot", 1000, 1000, 1000, 1000, 4, 20, 12);
		System.out.println(killerRobot.getName());
		
		HashMap<Coords, String> map = new HashMap<Coords, String>();
		map.put(new Coords(6, 7), player.getName());
		map.put(new Coords(2, 2), killerRobot.getName());
		
	}

}
