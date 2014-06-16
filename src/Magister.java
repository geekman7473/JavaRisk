import java.util.ArrayList;


public class Magister {
	private int iterCount;
	private ArrayList<Player> players;
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
	Magister(){
		iterCount = 0;
		players = new ArrayList<Player>();
	}
	Magister(ArrayList<Player> a){
		iterCount = 0;
		players = a;
	}
}
