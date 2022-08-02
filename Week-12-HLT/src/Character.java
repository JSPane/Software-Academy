
import org.junit.Test;

public class Character {
	
	private String name;
	private int maxHealth;
	private int currentHealth;
	private int maxMorale;
	private int currentMorale;
	private int movementDistance;
	private int attackValue;
	private int defenceValue;
	
	Character(String name, int maxHealth, int currentHealth, int maxMorale, int currentMorale, int movementDistance, int attackValue, int defenceValue) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.currentHealth = currentHealth;
		this.maxMorale = maxMorale;
		this.currentMorale = currentMorale;
		this.movementDistance = movementDistance;
		this.attackValue = attackValue;
		this.defenceValue = defenceValue;
		
	}

	@Test
	public String getName() {
		return this.name;
		
	}

	@Test
	public void setName(String name) {
		this.name = name;
		
	}

	@Test
	public int getMaxHealth() {
		return maxHealth;
		
	}

	@Test
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
		
	}

	@Test
	public int getCurrentHealth() {
		return currentHealth;
		
	}

	@Test
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		
	}

	@Test
	public int getMaxMorale() {
		return maxMorale;
		
	}

	@Test
	public void setMaxMorale(int maxMorale) {
		this.maxMorale = maxMorale;
		
	}

	@Test
	public int getCurrentMorale() {
		return currentMorale;
		
	}

	@Test
	public void setCurrentMorale(int currentMorale) {
		this.currentMorale = currentMorale;
		
	}

	@Test
	public int getMovementDistance() {
		return movementDistance;
		
	}

	@Test
	public void setMovementDistance(int movementDistance) {
		this.movementDistance = movementDistance;
	}

	@Test
	public int getAttackValue() {
		return attackValue;
		
	}

	@Test
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
		
	}

	@Test
	public int getDefenceValue() {
		return defenceValue;
		
	}

	@Test
	public void setDefenceValue(int defenceValue) {
		this.defenceValue = defenceValue;
		
	}

}
