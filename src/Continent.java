
public class Continent {
	private String name;
	private int ownershipBonus;
	public Continent(){
		name = "";
		ownershipBonus = 0;
	}
	public Continent(String _name, int ownBon){
		name = _name;
		ownershipBonus = ownBon;
	}
	public String getName() {
		return name;
	}
	public int getOwnershipBonus() {
		return ownershipBonus;
	}
}
