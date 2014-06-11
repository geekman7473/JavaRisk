import javax.swing.JButton;
import javax.swing.JLabel;


public class Territory {
	private int ID;
	private JButton button;
	private JLabel troopCount;
	private String name;
	private Player ownedBy;
	private int troopStrength;
	private Continent continentParent;
	public Territory(int x, int y, String _name, Continent parCon, int _ID){
		button = new JButton();
		button.setSize(15,15);
		button.setLocation(x,y);
		button.setText(_name);
		name = _name;
		continentParent = parCon;
		ID = _ID;
		troopStrength = 0;
		ownedBy = new Player();
	}
	public Territory(){
		button = new JButton();
		name = "";
		continentParent = new Continent();
		ID = -1;
		troopStrength = 0;
		ownedBy = new Player();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public JLabel getTroopCountLabel() {
		return troopCount;
	}
	public void setTroopCountLabel(JLabel troopCount) {
		this.troopCount = troopCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(Player ownedBy) {
		this.ownedBy = ownedBy;
	}
	public int getTroopStrength() {
		return troopStrength;
	}
	public void setTroopStrength(int troopStrength) {
		this.troopStrength = troopStrength;
	}
	public Continent getContinentParent() {
		return continentParent;
	}
	public void setContinentParent(Continent continentParent) {
		this.continentParent = continentParent;
	}

}
