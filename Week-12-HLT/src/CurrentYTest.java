
import static org.junit.Assert.*;

import org.junit.Test;

class CurrentYTest {
	
	private int currentY;

	@Test
	public int getCurrentY() {
		assertEquals(currentY, this.currentY);
		assertSame(currentY, this.currentY);
		return this.currentY;
		
	}

}
