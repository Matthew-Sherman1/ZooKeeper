package zookeeper;

public class gorilla extends mammal{
	

	public gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("I throw");
		this.setEnergyLevel(getEnergyLevel() - 5);
	}
	public void eatBananas() {
		System.out.println("I hungry");
		this.setEnergyLevel(getEnergyLevel() + 10);
		
	}
	public void climb() {
		System.out.println("I climb");
		this.setEnergyLevel(getEnergyLevel() - 10);
	}

}