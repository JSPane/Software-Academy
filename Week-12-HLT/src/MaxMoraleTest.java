
import static org.junit.Assert.*;

import org.junit.Test;

class MaxMoraleTest {
	
	private int maxMorale;

	@Test
	public int getMaxMorale() {
		assertEquals("Not what was expected", maxMorale, this.maxMorale);
		assertSame(maxMorale, this.maxMorale);
		return this.maxMorale;
		
	}
	
	@Test
	public int setMaxMorale() {
		assertEquals("Not what was expected", maxMorale, this.maxMorale);
		assertSame(maxMorale, this.maxMorale);
		return maxMorale;
		
	}

}
