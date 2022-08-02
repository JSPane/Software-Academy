
import static org.junit.Assert.*;

import org.junit.Test;

class NameTest {
	
	private String name;

	@Test
	public String getName() {
		assertEquals("Not what was expected", name, this.name);
		assertSame(name, this.name);
		return this.name;
		
	}
	
	@Test
	public String setName() {
		assertEquals("Not what was expected", name, this.name);
		assertSame(name, this.name);
		return name;
		
	}

}
