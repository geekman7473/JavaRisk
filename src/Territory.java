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
		troopStrength = 0;
		button = new JButton();
		button.setSize(15,15);
		button.setLocation(x,y);
		button.setToolTipText(_name);
		name = _name;
		continentParent = parCon;
		ID = _ID;
		ownedBy = new Player();
		troopCount = new JLabel("0");
		troopCount.setSize(20, 20);
		troopCount.setLocation(x + 20, y);
		neighbors = new ArrayList<Territory>();
		ownedBy = new Player();
	}
	public Territory(){
		troopCount = new JLabel();
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
		button.setBackground(ownedBy.getPlayCol());
	}
	public int getTroopStrength() {
		return troopStrength;
	}
	public void setTroopStrength(int troopStrength) {
		this.troopStrength = troopStrength;
		troopCount.setText(Integer.valueOf(troopStrength).toString());
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
		} else if(target.getTroopStrength() == 1){
			dDice = new Integer[1];
		} else {
			dDice = new Integer[target.getTroopStrength() - 1];
		}
		
		for(int i = 0; i < aDice.length; i++){
			aDice[i] = Util.diceRoll();
		}
		for(int i = 0; i < dDice.length; i++){
			dDice[i] = Util.diceRoll();
		}
		AttackResult res = new AttackResult(aDice,dDice);
		System.out.println(aDice.length);
		System.out.println(dDice.length);
		this.troopStrength -= res.getAttackerLosses();
		target.troopStrength -= res.getDefenderLosses();
		
		if(target.troopStrength <= 0){
			target.troopStrength = 0;
			target.setOwnedBy(this.ownedBy);
			do {
				target.setTroopStrength(Integer.valueOf((String) JOptionPane.showInputDialog(Graphics.frame, "How many reinforcements would you like to send?", "Reinforcements", JOptionPane.PLAIN_MESSAGE, null, null, null)));
			} while (target.getTroopStrength() < 1 || target.getTroopStrength() > this.troopStrength);
			this.troopStrength -= target.getTroopStrength();
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
	public void addNeighbors(Territory t){
		neighbors.add(t);
	}
	public void addNeighbors(Territory[] t){
		for(Territory x: t){
			neighbors.add(x);
		}
	}
	@Override
	public String toString() {
		return "Territory [ID=" + ID + ", name=" + name + ", ownedBy="
				+ ownedBy.toString() + "]";
	}

	
}
