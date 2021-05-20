package ro.ase.cts.memento;

public class CharacterMemento {
	String name;
	int hitpoints;
	
	public CharacterMemento(String name, int hitpoints) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
	}

	public String getName() {
		return name;
	}

	public int getHitpoints() {
		return hitpoints;
	}
	
	
}
