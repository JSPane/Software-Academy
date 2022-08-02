
import static org.junit.Assert.*;

import org.junit.Test;

class CurrentMoraleTest {
	
	private int currentMorale;

	@Test
	public int getCurrentMorale() {
		assertEquals("Not what was expected", currentMorale, this.currentMorale);
		assertSame(currentMorale, this.currentMorale);
		return this.currentMorale;
		
	}
	
	@Test
	public int setCurrentMorale() {
		assertEquals("Not what was expected", currentMorale, this.currentMorale);
		assertSame(currentMorale, this.currentMorale);
		return currentMorale;
		
	}

}
