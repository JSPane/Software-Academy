
import static org.junit.Assert.*;

import org.junit.Test;

class MaxHealthTest {
	
	private int maxHealth;

	@Test
	public int getMaxHealth() {
		assertEquals("Not what was expected", maxHealth, this.maxHealth);
		assertSame(maxHealth, this.maxHealth);
		return this.maxHealth;
		
	}
	
	@Test
	public int setMaxHealth() {
		assertEquals("Not what was expected", maxHealth, this.maxHealth);
		assertSame(maxHealth, this.maxHealth);
		return maxHealth;
		
	}

}
