import java.util.ArrayList;
import java.util.Collections;


public class AttackResult {
	private ArrayList<Integer> attackingDice;
	private ArrayList<Integer> defendingDice;
	private Integer AttackerLosses;
	private Integer DefenderLosses;
	public AttackResult(){
		attackingDice = new ArrayList<Integer>();
		defendingDice = new ArrayList<Integer>();
		AttackerLosses = 0;
		DefenderLosses = 0;
	}
	public AttackResult(Integer[] attackDice, Integer[] defendDice){
		attackingDice = popList(attackDice);
		defendingDice = popList(defendDice);
		Collections.sort(attackingDice);
		Collections.sort(defendingDice);
		for(int i = 0; i < Math.min(attackingDice.size(), defendingDice.size()); i++){
			if(attackingDice.get(i) > defendingDice.get(i)){
				DefenderLosses++;
			} else {
				AttackerLosses--;
			}
		}
	}
	public String getString() {
		return "Attacker lost " + AttackerLosses + " and Defender lost " + DefenderLosses;
	}
	public ArrayList<Integer> getAttackingDice() {
		return attackingDice;
	}
	public ArrayList<Integer> getDefendingDice() {
		return defendingDice;
	}
	public Integer getAttackerLosses() {
		return AttackerLosses;
	}
	public Integer getDefenderLosses() {
		return DefenderLosses;
	}
	private ArrayList<Integer> popList(Integer[] a){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(Integer x: a){
			temp.add(x);
		}
		return temp;
	}
}
