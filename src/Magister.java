import java.util.ArrayList;

import javax.swing.JLabel;


public class Magister {
	private int iterCount;
	private ArrayList<Player> players;
	private int mode;
	private JLabel curPlay;
	public void AddPlayer(Player p){
		players.add(p);
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public Player currentPlayer(){
		return players.get(iterCount % players.size());
	}
	public void nextTurn(){
		iterCount++;
		curPlay.setText("It is " + this.currentPlayer().getName()+ "'s turn");
	}
	public int turnNum(){
		return iterCount;
	}
	public void nextMode(){
		mode++;
		if(mode > 4){
			mode = 2;
		}
		//0 = claim territories
		//1 = add troops
		//2 = 
		//3 = 
		//4 = 
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	Magister(){
		iterCount = 0;
		players = new ArrayList<Player>();
		curPlay = new JLabel();
		curPlay.setLocation(10,10);
		curPlay.setText("Players not yet initialized");
		curPlay.setSize(100, 30);
	}
	Magister(ArrayList<Player> a){
		iterCount = 0;
		players = a;
		curPlay = new JLabel();
		curPlay.setLocation(10,10);
		curPlay.setText("Players not yet initialized");
		curPlay.setSize(100, 30);
	}
	public JLabel getCurPlay() {
		return curPlay;
	}
}
