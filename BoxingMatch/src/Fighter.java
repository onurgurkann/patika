
public class Fighter {
	String name;
	int damage, health, weight;
	double dodge;
	
	public Fighter(String name, int damage, int health, int weight, double dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
	public int hit(Fighter f) {
		System.out.println(this.name + " attacked " + f.name + " => Damage : " + this.damage);
		if(f.dodge()) {
			System.out.println(f.name + " dodged the attack.");
			return f.health;
		}
		if(f.health - this.damage < 0) {
			return 0;
		}
		return f.health - this.damage;
	}
	
	public boolean dodge() {
		double rnd = Math.random() * 100;
		return rnd <= this.dodge;
	}
	
}
