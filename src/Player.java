import java.awt.Color;

public class Player {
	private String name;
	private Color playCol;
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
}
