
import org.junit.jupiter.api.Test;

public class Map {
	
	private int x;
	private int y;
	private int currentX = (int) (Math.random() * 10);
	private int currentY = (int) (Math.random() * 10);
	
	Map(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	@Test
	public int getCurrentX() {
		return currentX;
		
	}
	
	@Test
	public int getCurrentY() {
		return currentY;
		
	}
	
	@Test
	public void move(String direction) {
		if (direction.equals("N")) {
			if (this.currentY == this.y) {
				this.currentY = 0;
				
			} else {
				this.currentY = this.currentY + 1;
				
			}
			
		} else if (direction.equals("E")) {
			if (this.currentX == this.x) {
				this.currentX = 0;
				
			} else {
				this.currentX = this.currentX + 1;
				
			}
			
		} else if (direction.equals("S")) {
			if (this.currentY == 0) {
				this.currentY = this.y;
				
			} else {
				this.currentY = this.currentY - 1;
				
			}
			
		} else if (direction.equals("W")) {
			if (this.currentX == 0) {
				this.currentX = this.x;
				
			} else {
				this.currentX = this.currentX - 1;
				
			}
			
		} else {
			System.out.println("Invalid response. Please try again.");
			
		}
		
	}
	
}
