import java.awt.Color;

public class Player {
	private String name;
	private Color playCol;
	private int troops;
	private int DontYouHaveBetterThingsToDo;
	public Player(){
		name = "";
		playCol = new Color(0,0,0);
	}
	public Player(String _name, Color _C){
		playCol = _C;
		name = _name;
	}
	public String getName() {
		return name;
	}
	public Color getPlayCol() {
		return playCol;
	}
	public int getTroops() {
		return troops;
	}
	public void setTroops(int troops) {
		this.troops = troops;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", playCol=" + playCol + ", troops="
				+ troops + "]";
	}
	public int draftArmies(Territory[] a, Continent[] c){
		int terOwned = 0;
		int retVal = 0;
		for(Territory I: a){
			if(I.getOwnedBy().equals(this)){
				terOwned++;
			}
		}
		if(terOwned / 3 < 3){
			retVal += 3;
		} else {
			retVal += terOwned /3;
		}
		boolean contOwn = true;
		for(Continent J: c){
			contOwn = true;
			for(Territory I: a){
				if(I.getContinentParent().equals(J)){
					if(!I.getOwnedBy().equals(this)){
						contOwn = false;
					}
				}
			}
			if(contOwn){
				retVal += J.getOwnershipBonus();
			}
		}
		return retVal;
	}
}
