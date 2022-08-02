
import static org.junit.Assert.*;

import org.junit.Test;

class AttackValueTest {
	
	private int attackValue;

	@Test
	public int getAttackValue() {
		assertEquals("Not what was expected", attackValue, this.attackValue);
		assertSame(attackValue, this.attackValue);
		return this.attackValue;
		
	}
	
	@Test
	public int setAttackValue() {
		assertEquals("Not what was expected", attackValue, this.attackValue);
		assertSame(attackValue, this.attackValue);
		return attackValue;
		
	}

}
