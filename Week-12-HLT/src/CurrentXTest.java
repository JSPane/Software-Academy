
import static org.junit.Assert.*;

import org.junit.Test;

class CurrentXTest {
	
	private int currentX;

	@Test
	public int getCurrentX() {
		assertEquals(currentX, this.currentX);
		assertSame(currentX, this.currentX);
		return this.currentX;
		
	}

}
