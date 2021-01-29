package model;

public class Character {
	private String name;
	private int age;
	private int health;
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character(String name, int age, int health) {
		super();
		this.name = name;
		this.age = age;
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public String takeDamage(int damage) {
		int remainingHealth = getHealth() - damage;
		setHealth(remainingHealth);
		return "Remaining Health: " + remainingHealth;
	}
	
	public boolean isAlive() {
		if (getHealth() <= 0) {
			return false;
		} else
		{
			return true;
		}
	}
	
}
