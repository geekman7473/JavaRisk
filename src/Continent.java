
public class Continent {
	private String name;
	private int ownershipBonus;
	private int memberCount;
	public Continent(){
		name = "";
		ownershipBonus = 0;
	}
	public Continent(String _name, int ownBon, int _memberCount){
		name = _name;
		ownershipBonus = ownBon;
		memberCount = _memberCount;
	}
	public String getName() {
		return name;
	}
	public int getOwnershipBonus() {
		return ownershipBonus;
	}
}
