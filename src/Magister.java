import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//#OneBigHair
//Remember, Remember the 16th of September
//Programming for no reason and whatnot
//I see no reason why the programming reason ever was forgot

//no but seriously what the hell are we doing?
//Sincerely,
//Amir and Justin
//FTC Mentors

//Au revoir!

public class Magister {
	private int iterCount;
	private ArrayList<Player> players;
	private int mode;
	private JLabel curPlay;
	private Clip attackSound;
	private JLabel gameState;
	public Territory attackSource;
	public Territory attackTarget;
	public void setGameState(JLabel gameState) {
		this.gameState = gameState;
	}
	public JLabel getGameState() {
		return gameState;
	}
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
	public Player nextPlayer(){
		return players.get((iterCount + 1) % players.size());
	}
	public void nextTurn(){
		setMode(getMode());
		iterCount++;
		curPlay.setText("It is " + this.currentPlayer().getName()+ "'s turn");
	}
	public int turnNum(){
		return iterCount;
	}
	public void nextMode(){
		mode++;
		if(mode > 6){
			mode = 2;
		}
		if(mode == 0){
			gameState.setText("|| " +"Claim territory phase");
		} else if(mode == 1){
			gameState.setText("|| " +"Initial Reinforcement Phase");
		} else if(mode == 2){
			gameState.setText("|| " +"Reinforcement Phase." + " You have " + currentPlayer().draftArmies(Graphics.territory, Graphics.continent) + " reinforcements to place");
		}else if(mode == 3){
			gameState.setText("|| " +"Attack Phase");
		} else if (mode == 4){
			gameState.setText("|| " +"Select attack target");
		}else if (mode == 5){
			gameState.setText("|| " +"Fortification phase");
		} else if (mode == 6){
			gameState.setText("|| " +"Fortification phase select target");
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
		if(mode == 0){
			gameState.setText("|| " +"Claim territory phase");
		} else if(mode == 1){
			gameState.setText("|| " +"Initial Reinforcement Phase");
		} else if(mode == 2){
			gameState.setText("|| " +"Reinforcement Phase." + " You have " + currentPlayer().draftArmies(Graphics.territory, Graphics.continent) + " reinforcements to place");
		}else if(mode == 3){
			gameState.setText("|| " +"Attack Phase");
		} else if (mode == 4){
			gameState.setText("|| " +"Select attack target");
		}else if (mode == 5){
			gameState.setText("|| " +"Fortification phase");
		} else if (mode == 6){
			gameState.setText("|| " +"Fortification phase select target");
		}
	}
	Magister(){
		iterCount = 0;
		players = new ArrayList<Player>();
		curPlay = new JLabel();
		curPlay.setLocation(10,10);
		curPlay.setText("Players not yet initialized");
		curPlay.setSize(100, 30);
		gameState = new JLabel();
		gameState.setLocation(10,10);
		gameState.setText("|| " +"Claim territory phase");
		gameState.setSize(100, 30);
	}

	public JLabel getCurPlay() {
		return curPlay;
	}
	public int getTurnCount(){
		return iterCount;
	}
	public void playAttackSound(){
		try {
			attackSound = AudioSystem.getClip();
		    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("resources/Attack Sound.wav"));
		    attackSound.open(inputStream);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		attackSound.start();
	}
}
