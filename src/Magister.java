import java.util.ArrayList;


public class Magister {
	private int iterCount;
	private ArrayList<Player> players;
	private int mode;
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
	}
	public int turnNum(){
		return iterCount;
	}
	public void nextMode(){
		mode++;
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
	}
	Magister(ArrayList<Player> a){
		iterCount = 0;
		players = a;
	}
}
