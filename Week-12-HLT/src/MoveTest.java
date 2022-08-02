
import static org.junit.Assert.*;

import org.junit.Test;

class MoveTest {
	
	String direction;
	
	private int currentX = (int) (Math.random() * 10);
	private int currentY = (int) (Math.random() * 10);
	
	@Test
	public void move(String direction) {
		if (direction.equals("N")) {
			assertEquals("Not what was expected", "N", direction);
			
		} else if (direction.equals("E")) {
			assertEquals("Not what was expected", "E", direction);
			
		} else if (direction.equals("S")) {
			assertEquals("Not what was expected", "S", direction);
			
		} else if (direction.equals("W")) {
			assertEquals("Not what was expected", "W", direction);
			
		} else {
			assertNotSame("N", direction);
			assertNotSame("E", direction);
			assertNotSame("S", direction);
			assertNotSame("W", direction);
			
		} 
		
	}
	
	
	@Test
	public void testCurrentX() {
		if (direction == "E" && currentX == 10) {
		    assertEquals("Not what was expected", 0, this.currentX);
		    
		} else if (direction == "E" && currentX != 10) {
		    assertEquals("Not what was expected", currentX, this.currentX);
		    
		} else if (direction == "W" && currentX == 0) {
		    assertEquals("Not what was expected", 10, this.currentX);
		    
		} else if (direction == "W" && currentX != 0) {
		    assertEquals("Not what was expected", currentX, this.currentX);
		    
		}
		
	}
	
	@Test
	public void testCurrentY() {
		if (direction == "N" && currentY == 10) {
		    assertEquals("Not what was expected", 0, this.currentY);
		    
		} else if (direction == "N" && currentY != 10) {
		    assertEquals("Not what was expected", currentY, this.currentY);
		    
		} else if (direction == "S" && currentY == 0) {
		    assertEquals("Not what was expected", 10, this.currentY);
		    
		} else if (direction == "S" && currentY != 0) {
		    assertEquals("Not what was expected", currentY, this.currentY);
		    
		}
		
	}

}
