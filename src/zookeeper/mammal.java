package zookeeper;

public class mammal {
	protected int energyLevel;

	public mammal() {
		this.energyLevel = 100;
	}

	public int displayEnergyLevel() {
		System.out.println(getEnergyLevel());
		return getEnergyLevel();
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}