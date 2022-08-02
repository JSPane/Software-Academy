
import static org.junit.Assert.*;

import org.junit.Test;

class MovementDistanceTest {
	
	private int movementDistance;

	@Test
	public int getMovementDistance() {
		assertEquals("Not what was expected", movementDistance, this.movementDistance);
		assertSame(movementDistance, this.movementDistance);
		return this.movementDistance;
		
	}
	
	@Test
	public int setMovementDistance() {
		assertEquals("Not what was expected", movementDistance, this.movementDistance);
		assertSame(movementDistance, this.movementDistance);
		return movementDistance;
		
	}

}
