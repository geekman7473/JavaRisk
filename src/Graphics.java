import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.annotation.Resources;
import javax.imageio.ImageTranscoder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Graphics {
	public static void main(String[]args){
		//LayoutManager
		LayoutManager layout = new FlowLayout();
				
		//Frame
		JFrame frame = new JFrame("JavaRisk");
		frame.setSize(750, 650);
		frame.setLocation(50, 50);
		
		//Board
		ImageIcon riskBoard = new ImageIcon("resources/Risk_board.png");
		JLabel board = new JLabel(riskBoard);
		board.setSize(riskBoard.getIconWidth(), riskBoard.getIconHeight());
		frame.add(board);
		
		//JButton
		//JButton button[] = new JButton[41];
		//button[0].setSize(20, 10);
		//button.setLocation(100, 20);
		//board.add(button);
		
		//Territories
		Continent continent[] = {new Continent("North America", 5), new Continent("South America", 2), new Continent("Europe", 5), new Continent("Africa", 3), new Continent("Asia", 7),  new Continent("Australia", 2)};
		Territory territory[] = {new Territory(55, 76, "Alaska", continent[0], 0), new Territory(108, 112, "Alberta", continent[0], 1), new Territory(120, 234, "Central America", continent[0], 2), new Territory(170, 180, "Eastern United States", continent[0], 3), new Territory(252, 47, "Greenland", continent[0], 4), new Territory(111, 76, "Northwest Terriory", continent[0], 5), new Territory(162, 128, "Ontario", continent[0], 6), new Territory(210, 121, "Quebec", continent[0], 7), new Territory(111, 165, "Western United States", continent[0], 8), new Territory(188, 381, "Argentina", continent[1], 9), new Territory(223, 316, "Brazil", continent[1], 10), new Territory(181, 339, "Peru", continent[1], 11), new Territory(167, 272, "Venezuela", continent[1], 12), new Territory(297, 153, "Great Britain", continent[2], 13), new Territory(312, 99, "Iceland", continent[2], 14), new Territory(367, 160, "Northern Europe", continent[2], 15), new Territory(377, 80, "Scandanavia", continent[2], 16), new Territory(382, 208, "Sourthern Europe", continent[2], 17), new Territory(434, 117, "Ukraine", continent[2], 18), new Territory(320, 210, "Western Europe", continent[2], 19), new Territory(399, 363, "Congo", continent[3], 20), new Territory(423, 326, "East Africa", continent[3], 21), new Territory(390, 277, "Egypt", continent[3], 22), new Territory(470, 429, "Madagascar", continent[3], 23), new Territory(340, 300, "North Africa", continent[3], 24), new Territory(400, 422, "South Africa", continent[3], 25), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory()};
		for(Territory i: territory){
			board.add(i.getButton());
		} 
		
		/*
		//Button ActionListener
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("meow");
			}
		});
		*/
		
		//Frame settings
		frame.setLayout(layout);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
