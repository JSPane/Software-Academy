
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

	public String getName() {
		return this.name;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public int getMaxHealth() {
		return maxHealth;
		
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
		
	}

	public int getCurrentHealth() {
		return currentHealth;
		
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		
	}

	public int getMaxMorale() {
		return maxMorale;
		
	}

	public void setMaxMorale(int maxMorale) {
		this.maxMorale = maxMorale;
		
	}

	public int getCurrentMorale() {
		return currentMorale;
		
	}

	public void setCurrentMorale(int currentMorale) {
		this.currentMorale = currentMorale;
		
	}

	public int getMovementDistance() {
		return movementDistance;
		
	}

	public void setMovementDistance(int movementDistance) {
		this.movementDistance = movementDistance;
	}

	public int getAttackValue() {
		return attackValue;
		
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
		
	}

	public int getDefenceValue() {
		return defenceValue;
		
	}

	public void setDefenceValue(int defenceValue) {
		this.defenceValue = defenceValue;
		
	}

}
