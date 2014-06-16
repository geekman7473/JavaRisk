import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Territory {
	private int ID;
	private JButton button;
	private JLabel troopCount;
	private String name;
	private Player ownedBy;
	private int troopStrength;
	private Continent continentParent;
	private ArrayList<Territory> neighbors;
	public Territory(int x, int y, String _name, Continent parCon, int _ID){
		button = new JButton();
		button.setSize(15,15);
		button.setLocation(x,y);
		button.setToolTipText(_name);
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
	public JButton getButton() {
		return button;
	}
	public JLabel getTroopCountLabel() {
		return troopCount;
	}
	public String getName() {
		return name;
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
	public AttackResult attack(Territory target){
		//assumes that troop strength of attacking territory is > 1
		Integer[] aDice, dDice;
		if(troopStrength > 3){
			aDice = new Integer[3];
		} else{
			aDice = new Integer[troopStrength - 1];
		}
		
		if(target.getTroopStrength() > 3){
			dDice = new Integer[3];
		} else{
			dDice = new Integer[target.getTroopStrength() - 1];
		}
		
		for(int i = 0; i < aDice.length; i++){
			aDice[i] = Util.diceRoll();
		}
		for(int i = 0; i < dDice.length; i++){
			dDice[i] = Util.diceRoll();
		}
		AttackResult res = new AttackResult(aDice,dDice);
		troopStrength -= res.getAttackerLosses();
		target.troopStrength -= res.getDefenderLosses();
		
		if(target.troopStrength <= 0){
			target.troopStrength = 0;
			target.setOwnedBy(this.ownedBy);
		}
		return res;
	}
	public ArrayList<Territory> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(ArrayList<Territory> neighbors) {
		this.neighbors = neighbors;
	}
	public boolean isNeighbor(Territory t){
		return neighbors.contains(t);
	}
	public void addNe(Territory t){
		neighbors.add(t);
	}
	public void addNe(Territory[] t){
		for(Territory x: t){
			neighbors.add(x);
		}
	}
}
