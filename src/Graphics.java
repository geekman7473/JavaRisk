import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Graphics {

	static JFrame frame = new JFrame("JavaRisk");
	public final static Continent continent[] = {new Continent("North America", 5, 9), new Continent("South America", 2, 4), new Continent("Europe", 5, 7), new Continent("Africa", 3, 6), new Continent("Asia", 7, 12),  new Continent("Australia", 2, 4)};
	public final static Territory territory[] = {new Territory(45, 76, "Alaska", continent[0], 0), new Territory(108, 112, "Alberta", continent[0], 1), new Territory(120, 237, "Central America", continent[0], 2), new Territory(165, 180, "Eastern United States", continent[0], 3), new Territory(252, 47, "Greenland", continent[0], 4), new Territory(111, 76, "Northwest Terriory", continent[0], 5), new Territory(157, 128, "Ontario", continent[0], 6), new Territory(205, 121, "Quebec", continent[0], 7), new Territory(111, 165, "Western United States", continent[0], 8), new Territory(188, 381, "Argentina", continent[1], 9), new Territory(223, 316, "Brazil", continent[1], 10), new Territory(181, 339, "Peru", continent[1], 11), new Territory(167, 272, "Venezuela", continent[1], 12), new Territory(295, 153, "Great Britain", continent[2], 13), new Territory(305, 95, "Iceland", continent[2], 14), new Territory(367, 160, "Northern Europe", continent[2], 15), new Territory(377, 80, "Scandanavia", continent[2], 16), new Territory(370, 205, "Southern Europe", continent[2], 17), new Territory(434, 117, "Ukraine", continent[2], 18), new Territory(305, 225, "Western Europe", continent[2], 19), new Territory(399, 363, "Congo", continent[3], 20), new Territory(423, 326, "East Africa", continent[3], 21), new Territory(390, 277, "Egypt", continent[3], 22), new Territory(470, 429, "Madagascar", continent[3], 23), new Territory(340, 300, "North Africa", continent[3], 24), new Territory(400, 422, "South Africa", continent[3], 25), new Territory(496, 177, "Afghanistan", continent[4], 26), new Territory(581, 215, "China", continent[4], 27), new Territory(533, 248, "India", continent[4], 28), new Territory(592, 117, "Irkutsk", continent[4], 29), new Territory(677, 177, "Japan", continent[4], 30), new Territory(655, 63, "Kamchatka", continent[4], 31), new Territory(448, 243, "Middle East", continent[4], 32), new Territory(596, 169, "Mongolia", continent[4], 33), new Territory(588, 275, "Siam", continent[4], 34), new Territory(544, 83, "Siberia", continent[4], 35), new Territory(503, 108, "Ural", continent[4], 36), new Territory(600, 57, "Yakutsk", continent[4], 37), new Territory(680, 405, "Eastern Australia", continent[5], 38), new Territory(593, 356, "Indonesia", continent[5], 39), new Territory(662, 339, "New Guinea", continent[5], 40), new Territory(636, 424, "Western Australia", continent[5], 41)};
	
	public static void main(String[]args) throws HeadlessException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{	
		//Frame
		frame.setSize(750, 650);
		frame.setLocationRelativeTo(null);
		
		//Board
		ImageIcon riskBoard = new ImageIcon("resources/Risk_board.png");
		JLabel board = new JLabel(riskBoard);
		board.setSize(riskBoard.getIconWidth(), riskBoard.getIconHeight());
		frame.add(board);
		
		//Territories
		territory[0].addNeighbors(new Territory[]{territory[5], territory[1], territory[31]});
		territory[1].addNeighbors(new Territory[]{territory[0], territory[5], territory[6], territory[8]});
		territory[2].addNeighbors(new Territory[]{territory[3], territory[8], territory[12]});
		territory[3].addNeighbors(new Territory[]{territory[2], territory[8], territory[7], territory[6]});
		territory[4].addNeighbors(new Territory[]{territory[7], territory[6], territory[5], territory[14]});
		territory[5].addNeighbors(new Territory[]{territory[0], territory[1], territory[6], territory[4]});
		territory[6].addNeighbors(new Territory[]{territory[5], territory[1], territory[8], territory[3], territory[5], territory[7], territory[4]});
		territory[7].addNeighbors(new Territory[]{territory[6], territory[3], territory[4]});
		territory[8].addNeighbors(new Territory[]{territory[1], territory[2], territory[3], territory[6]});
		territory[9].addNeighbors(new Territory[]{territory[10], territory[11]});
		territory[10].addNeighbors(new Territory[]{territory[9], territory[11], territory[12]});
		territory[11].addNeighbors(new Territory[]{territory[9], territory[10], territory[12]});
		territory[12].addNeighbors(new Territory[]{territory[10], territory[11], territory[2]});
		territory[13].addNeighbors(new Territory[]{territory[14], territory[16], territory[19], territory[15]});
		territory[14].addNeighbors(new Territory[]{territory[4], territory[13], territory[16]});
		territory[15].addNeighbors(new Territory[]{territory[13], territory[16], territory[18], territory[17], territory[19]});
		territory[16].addNeighbors(new Territory[]{territory[14], territory[13], territory[15], territory[18]});
		territory[17].addNeighbors(new Territory[]{territory[19], territory[15], territory[18], territory[32], territory[22], territory[24]});
		territory[18].addNeighbors(new Territory[]{territory[16], territory[15], territory[17], territory[32], territory[26], territory[36]});
		territory[19].addNeighbors(new Territory[]{territory[24], territory[13], territory[15], territory[17]});
		territory[20].addNeighbors(new Territory[]{territory[21], territory[24], territory[25]});
		territory[21].addNeighbors(new Territory[]{territory[22], territory[24], territory[20], territory[25], territory[23],territory[32]});
		territory[22].addNeighbors(new Territory[]{territory[32], territory[17], territory[24], territory[21]});
		territory[23].addNeighbors(new Territory[]{territory[25], territory[21]});
		territory[24].addNeighbors(new Territory[]{territory[10], territory[19], territory[17], territory[22], territory[21], territory[20]});
		territory[25].addNeighbors(new Territory[]{territory[23], territory[20], territory[21]});
		territory[26].addNeighbors(new Territory[]{territory[18], territory[32], territory[36], territory[27], territory[28]});
		territory[27].addNeighbors(new Territory[]{territory[26], territory[36], territory[35], territory[33], territory[28], territory[34]});
		territory[28].addNeighbors(new Territory[]{territory[32], territory[26], territory[27], territory[34]});
		territory[29].addNeighbors(new Territory[]{territory[31], territory[33], territory[35], territory[37]});
		territory[30].addNeighbors(new Territory[]{territory[31], territory[33]});
		territory[31].addNeighbors(new Territory[]{territory[0], territory[37], territory[29], territory[33], territory[30]});
		territory[32].addNeighbors(new Territory[]{territory[22], territory[21], territory[17], territory[18], territory[26], territory[28]});
		territory[33].addNeighbors(new Territory[]{territory[27], territory[35], territory[29], territory[31], territory[30]});
		territory[34].addNeighbors(new Territory[]{territory[39], territory[28], territory[27]});
		territory[35].addNeighbors(new Territory[]{territory[36], territory[27], territory[33], territory[29], territory[37]});
		territory[36].addNeighbors(new Territory[]{territory[18], territory[26], territory[27], territory[35]});
		territory[37].addNeighbors(new Territory[]{territory[35], territory[29], territory[31]});
		territory[38].addNeighbors(new Territory[]{territory[41], territory[40]});
		territory[39].addNeighbors(new Territory[]{territory[34], territory[40], territory[41]});
		territory[40].addNeighbors(new Territory[]{territory[39], territory[41], territory[38]});
		territory[41].addNeighbors(new Territory[]{territory[38], territory[40], territory[39]});
		
		for(final Territory t: territory){
			//Add button
			board.add(t.getButton());
			board.add(t.getTroopCountLabel());
		}		
		
		//Frame settings
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Master class
		final Magister Cesanek = new Magister();
		frame.add(Cesanek.getCurPlay());
		frame.add(Cesanek.getGameState());
		final JButton endAttacks = new JButton();
		endAttacks.setVisible(false);
		endAttacks.setSize(100, 100);
		endAttacks.setText("End Attack Phase");
		endAttacks.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Cesanek.setMode(5);
			}
		});
		
		final JButton endFort = new JButton();
		endFort.setVisible(false);
		endFort.setSize(100, 100);
		endFort.setText("Skip Fortification");
		endFort.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Cesanek.setMode(1337);
				Cesanek.nextMode();
				Cesanek.nextTurn();
			}
		});
		
		frame.add(endFort);
		frame.add(endAttacks);
		
		//Welcome players
		JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Bienvenue dans La Conqu�te du Monde!  Jouir!</center></html>", JLabel.CENTER), "Welome", JOptionPane.PLAIN_MESSAGE);
		
		//Add players
		//parent, message, title, message type, icon, options, default selected
		int numPlayers = 0;
		do {
			try{
				numPlayers = Integer.valueOf((String) JOptionPane.showInputDialog(frame, new JLabel("<html><center>How many players?</center></html>", JLabel.CENTER), "Setup", JOptionPane.PLAIN_MESSAGE, null, null, null));
			} catch (java.lang.NumberFormatException e){
				JOptionPane.showMessageDialog(frame, new JLabel("<html><center>You must enter a valid integer response</center></html>", JLabel.CENTER));
			}
			if (numPlayers > 6 || numPlayers < 2) JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Invalid number of players.</center></html>", JLabel.CENTER));
		} while (numPlayers > 6 || numPlayers < 2);
		
		Object[] colors = {"BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "PINK", "RED", "YELLOW"};
		for(int i=1 ; i<=numPlayers; i++){
			Cesanek.AddPlayer(new Player((String) JOptionPane.showInputDialog(frame, new JLabel("<html><center>Player " + i + " name?</center></html>", JLabel.CENTER), "Setup", JOptionPane.PLAIN_MESSAGE, null, null, null), (Color)Class.forName("java.awt.Color").getField((String) JOptionPane.showInputDialog(frame, new JLabel("<html><center>Player " + i + " color?</center></html>", JLabel.CENTER), "Setup", JOptionPane.PLAIN_MESSAGE, null, colors, null)).get(null)));
			
			for(int j=1; j<=i; j++){
				if((Cesanek.getPlayers().get(i-1).getName().equals(Cesanek.getPlayers().get(j-1).getName()) || Cesanek.getPlayers().get(i-1).getPlayCol().equals(Cesanek.getPlayers().get(j-1).getPlayCol())) && i!=j){
					i--;
					Cesanek.getPlayers().remove(Cesanek.getPlayers().size()-1);
					JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Different player values cannot be the same.</center></html>", JLabel.CENTER));
					break;
				}
			}			
		}
		
		for(final Player p: Cesanek.getPlayers()){
			p.setTroops(50-5*Cesanek.getPlayers().size());
		}
		
		//Add button action listeners
		for(final Territory t: territory){
			t.getButton().addActionListener(new ActionListener(){
				int lastTurnNum = -1;
				public void actionPerformed(ActionEvent arg0) {
					System.out.println(t.toString());
					if(t.getOwnedBy().getPlayCol().equals(new Color(0,0,0)) && Cesanek.getMode() == 0){
						t.setOwnedBy(Cesanek.currentPlayer());
						t.setTroopStrength(t.getTroopStrength()+1);
						Cesanek.currentPlayer().setTroops(Cesanek.currentPlayer().getTroops()-1);
						Cesanek.nextTurn();
					} else if(t.getOwnedBy().equals(Cesanek.currentPlayer()) && Cesanek.getMode() == 1){
						t.setTroopStrength(t.getTroopStrength()+1);
						Cesanek.currentPlayer().setTroops(Cesanek.currentPlayer().getTroops()-1);
						Cesanek.nextTurn();
					} else if(t.getOwnedBy().equals(Cesanek.currentPlayer()) && Cesanek.getMode() == 2){
						if(lastTurnNum != Cesanek.getTurnCount()){
							System.out.println("turns");
							System.out.println(lastTurnNum);
							System.out.println(Cesanek.getTurnCount());
							Cesanek.currentPlayer().setTroops(Cesanek.currentPlayer().draftArmies(territory, continent));
							lastTurnNum = Cesanek.getTurnCount();
						}
						t.setTroopStrength(t.getTroopStrength()+1);
						Cesanek.currentPlayer().setTroops(Cesanek.currentPlayer().getTroops()-1);
						if(Cesanek.currentPlayer().getTroops() == 0){
							Cesanek.nextMode();
						}
					} else if(t.getOwnedBy().equals(Cesanek.currentPlayer()) && Cesanek.getMode() == 3){
						Cesanek.attackSource = t;
						Cesanek.nextMode();
					} else if(!t.getOwnedBy().equals(Cesanek.currentPlayer()) && Cesanek.getMode() == 4){
						Cesanek.attackTarget = t;
						if(Cesanek.attackSource.isNeighbor(t)){
							while(!Cesanek.attackTarget.getOwnedBy().equals(Cesanek.attackSource.getOwnedBy()) && JOptionPane.showConfirmDialog(frame, "Do you wish to attack " + Cesanek.attackTarget.getName() + " (Strength: " + Cesanek.attackTarget.getTroopStrength() + ") from " + Cesanek.attackSource.getName() + " (Strength: " + Cesanek.attackSource.getTroopStrength() + ")" , "Attack Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, new ImageIcon("resources/Die.png")) == JOptionPane.YES_OPTION){
								if(Cesanek.attackSource.getTroopStrength() < 2){
									JOptionPane.showMessageDialog(frame, new JLabel("<html><center>You cannot perform this attack because you do not have enough armies in" + Cesanek.attackSource.getName() + "</center></html>", JLabel.CENTER));
								} else {
									Cesanek.playAttackSound();
									Cesanek.attackSource.attack(Cesanek.attackTarget);
								}
							}	
						} else {
							JOptionPane.showMessageDialog(frame, new JLabel("<html><center>You cannot perform this attack because " + Cesanek.attackSource.getName() + " is not adjacent to " + Cesanek.attackTarget.getName() +"</center></html>", JLabel.CENTER));
						}
						Cesanek.setMode(3);
					} else if(t.getOwnedBy().equals(Cesanek.currentPlayer()) && Cesanek.getMode() == 5){
						Cesanek.attackSource = t;
						Cesanek.nextMode();
					} else if(t.getOwnedBy().equals(Cesanek.currentPlayer()) && Cesanek.getMode() == 6){
						Cesanek.attackTarget = t;
						if(Cesanek.attackSource.isNeighbor(t)){
							int temp = Cesanek.attackTarget.getTroopStrength();
							do {
								try{
									Cesanek.attackTarget.setTroopStrength(Integer.valueOf((String) JOptionPane.showInputDialog(frame, new JLabel("<html><center>How many reinforcements would you like to send?</center></html>", JLabel.CENTER), "Reinforcements", JOptionPane.PLAIN_MESSAGE, null, null, null)));
								} catch (java.lang.NumberFormatException e){
									JOptionPane.showMessageDialog(frame, new JLabel("<html><center>You must enter a valid integer response</center></html>", JLabel.CENTER));
								}
								} while (Cesanek.attackTarget.getTroopStrength() < 1 || Cesanek.attackTarget.getTroopStrength() > Cesanek.attackSource.getTroopStrength());
							Cesanek.attackSource.setTroopStrength(Cesanek.attackSource.getTroopStrength() - (Cesanek.attackTarget.getTroopStrength() - temp));
							Cesanek.nextMode();
							Cesanek.nextTurn();
						} else {
							JOptionPane.showMessageDialog(frame, new JLabel("<html><center>You cannot perform this fortification because " + Cesanek.attackSource.getName() + " is not adjacent to " + Cesanek.attackTarget.getName() +"</center></html>", JLabel.CENTER));
							Cesanek.setMode(5);
						}

					}
				}
			});
		}
		
		
		//Claim territories stage
		JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Select your territories, players. <br> The world is your oyster. <br> Which has been mutated to the point where it contains over 40 pearls. <br> Ouch.</center></html>", JLabel.CENTER), "Claim territories", JOptionPane.PLAIN_MESSAGE);
		
		do{
			frame.repaint();
		} while(!Util.allTerritoriesTaken(territory));
		
		Cesanek.nextMode();
		
		System.out.println("done 0");
		
		//Add troops stage
		JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Great! <br> Now add your troops. <br> A well-placed army means a well-placed empire. <br> Among the rest, I mean. <br> Assuming there are any left. <br> I won't judge if world domination is your thing.</center></html>", JLabel.CENTER), "Add troops", JOptionPane.PLAIN_MESSAGE);
		
		do{
			frame.repaint();
		} while(Cesanek.getPlayers().get(Cesanek.getPlayers().size()-1).getTroops()>0);
		
		Cesanek.nextMode();
		
		System.out.println("done 1");
		
		/*
		//Debug mode - remark out previous two modes
		
		territory[0].setOwnedBy(Cesanek.getPlayers().get(0));
		territory[0].setTroopStrength(40);
		territory[1].setOwnedBy(Cesanek.getPlayers().get(1));
		territory[1].setTroopStrength(40);
		Cesanek.setMode(3);
		*/
		
		//Begin game
		JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Fantastic.  Let the game begin!</center></html>", JLabel.CENTER), "Initium", JOptionPane.PLAIN_MESSAGE);

		while(!Util.gameOver(territory)){
			frame.repaint();
			if(Cesanek.getMode() == 3 || Cesanek.getMode() == 4){
				endAttacks.setVisible(true);
			} else {
				endAttacks.setVisible(false);
			}
			if(Cesanek.getMode() == 5 || Cesanek.getMode() == 6){
				endFort.setVisible(true);
			} else {
				endFort.setVisible(false);
			}
		}
		
		//End game
		JOptionPane.showMessageDialog(frame, new JLabel("<html><center>Congratulations " + territory[0].getOwnedBy().getName() + "!  You have won the game!</center></html>", JLabel.CENTER), "Finis", JOptionPane.PLAIN_MESSAGE);
	}
}
