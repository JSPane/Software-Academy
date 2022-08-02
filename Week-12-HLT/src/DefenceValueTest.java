
import static org.junit.Assert.*;

import org.junit.Test;

class DefenceValueTest {
	
	private int defenceValue;

	@Test
	public int getDefenceValue() {
		assertEquals("Not what was expected", defenceValue, this.defenceValue);
		assertSame(defenceValue, this.defenceValue);
		return this.defenceValue;
		
	}
	
	@Test
	public int setDefenceValue() {
		assertEquals("Not what was expected", defenceValue, this.defenceValue);
		assertSame(defenceValue, this.defenceValue);
		return defenceValue;
		
	}

}
