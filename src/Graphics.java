import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Graphics {

	static JFrame frame = new JFrame("JavaRisk");

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
		Continent continent[] = {new Continent("North America", 5), new Continent("South America", 2), new Continent("Europe", 5), new Continent("Africa", 3), new Continent("Asia", 7),  new Continent("Australia", 2)};
		Territory territory[] = {new Territory(45, 76, "Alaska", continent[0], 0), new Territory(108, 112, "Alberta", continent[0], 1), new Territory(120, 237, "Central America", continent[0], 2), new Territory(165, 180, "Eastern United States", continent[0], 3), new Territory(252, 47, "Greenland", continent[0], 4), new Territory(111, 76, "Northwest Terriory", continent[0], 5), new Territory(157, 128, "Ontario", continent[0], 6), new Territory(205, 121, "Quebec", continent[0], 7), new Territory(111, 165, "Western United States", continent[0], 8), new Territory(188, 381, "Argentina", continent[1], 9), new Territory(223, 316, "Brazil", continent[1], 10), new Territory(181, 339, "Peru", continent[1], 11), new Territory(167, 272, "Venezuela", continent[1], 12), new Territory(295, 153, "Great Britain", continent[2], 13), new Territory(305, 95, "Iceland", continent[2], 14), new Territory(367, 160, "Northern Europe", continent[2], 15), new Territory(377, 80, "Scandanavia", continent[2], 16), new Territory(370, 205, "Southern Europe", continent[2], 17), new Territory(434, 117, "Ukraine", continent[2], 18), new Territory(305, 225, "Western Europe", continent[2], 19), new Territory(399, 363, "Congo", continent[3], 20), new Territory(423, 326, "East Africa", continent[3], 21), new Territory(390, 277, "Egypt", continent[3], 22), new Territory(470, 429, "Madagascar", continent[3], 23), new Territory(340, 300, "North Africa", continent[3], 24), new Territory(400, 422, "South Africa", continent[3], 25), new Territory(496, 177, "Afghanistan", continent[4], 26), new Territory(581, 215, "China", continent[4], 27), new Territory(533, 248, "India", continent[4], 28), new Territory(592, 117, "Irkutsk", continent[4], 29), new Territory(677, 177, "Japan", continent[4], 30), new Territory(655, 63, "Kamchatka", continent[4], 31), new Territory(448, 243, "Middle East", continent[4], 32), new Territory(596, 169, "Mongolia", continent[4], 33), new Territory(588, 275, "Siam", continent[4], 34), new Territory(544, 83, "Siberia", continent[4], 35), new Territory(503, 108, "Ural", continent[4], 36), new Territory(600, 57, "Yakutsk", continent[4], 37), new Territory(680, 405, "Eastern Australia", continent[5], 38), new Territory(593, 356, "Indonesia", continent[5], 39), new Territory(662, 339, "New Guinea", continent[5], 40), new Territory(636, 424, "Western Australia", continent[5], 41)};
		
		for(final Territory i: territory){
			//Add button
			board.add(i.getButton());
			board.add(i.getTroopCountLabel());
			
			//Button ActionListener
			i.getButton().addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0) {
					System.out.println(i.getName());
				}
			});
		}		
		
		//Frame settings
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		//Players
		ArrayList<Player> player = new ArrayList<Player>();
		
		//parent, message, title, message type, icon, options, default selected
		int numPlayers = 0;
		do {
			numPlayers = Integer.valueOf((String) JOptionPane.showInputDialog(frame, "How many players?", "Setup", JOptionPane.PLAIN_MESSAGE, null, null, null));
			if (numPlayers > 6 || numPlayers < 2) JOptionPane.showMessageDialog(frame, "Invalid number of players.");
		} while (numPlayers > 6 || numPlayers < 2);
		
		Object[] colors = {"BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "PINK", "RED", "YELLOW"};
		for(int i=1 ; i<=numPlayers; i++){
			player.add(new Player((String) JOptionPane.showInputDialog(frame, "Player " + i + " name?", "Setup", JOptionPane.PLAIN_MESSAGE, null, null, null), (Color)Class.forName("java.awt.Color").getField((String) JOptionPane.showInputDialog(frame, "Player " + i + " color?", "Setup", JOptionPane.PLAIN_MESSAGE, null, colors, null)).get(null)));
			
			for(int j=1; j<=i; j++){
				if((player.get(i-1).getName().equals(player.get(j-1).getName()) || player.get(i-1).getPlayCol().equals(player.get(j-1).getPlayCol())) && i!=j){
					i--;
					player.remove(player.size()-1);
					JOptionPane.showMessageDialog(frame, "Different player values cannot be the same.");
					break;
				}
			}			
		}
		*/

	}
}
