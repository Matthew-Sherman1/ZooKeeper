package zookeeper;

public class Bat extends mammal {

	public Bat() {
		super();
		this.energyLevel = 300;
		}
	public void fly() {
		System.out.println("flying nouse");
		this.setEnergyLevel(getEnergyLevel() - 25);
	}
	public void eatHumans() {
		System.out.println("nom nom nom");
		this.setEnergyLevel(getEnergyLevel() + 50);
		
	}
	public void attackTown() {
		System.out.println("RAWRRRRRR");
		this.setEnergyLevel(getEnergyLevel() - 75);
	}
}
