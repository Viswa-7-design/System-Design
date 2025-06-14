package prototype;

public class Bean implements Cloneable{
    private String name;
    private int health;
    private int attackPower;
    private int level;
	public Bean(String name, int health, int attackPower, int level) {
		super();
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getLevel() {
		return level;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Bean [name=" + name + ", health=" + health + ", attackPower=" + attackPower + ", level=" + level + "]";
	}
	public Bean clone() throws CloneNotSupportedException {
		return (Bean)super.clone();
	}
    
}
