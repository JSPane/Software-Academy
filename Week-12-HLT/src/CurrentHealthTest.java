
import static org.junit.Assert.*;

import org.junit.Test;

class CurrentHealthTest {
	
	private int currentHealth;

	@Test
	public int getCurrentHealth() {
		assertEquals("Not what was expected", currentHealth, this.currentHealth);
		assertSame(currentHealth, this.currentHealth);
		return this.currentHealth;
		
	}
	
	@Test
	public int setCurrentHealth() {
		assertEquals("Not what was expected", currentHealth, this.currentHealth);
		assertSame(currentHealth, this.currentHealth);
		return currentHealth;
		
	}

}
