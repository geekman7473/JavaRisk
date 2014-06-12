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
		Territory territory[] = {new Territory(60, 76, "Alaska", continent[0], 0), new Territory(108, 112, "Alberta", continent[0], 1), new Territory(120, 234, "Central America", continent[0], 2), new Territory(170, 180, "Eastern United States", continent[0], 3), new Territory(252, 47, "Greenland", continent[0], 4), new Territory(108, 47, "Northwest Terriory", continent[0], 5), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory(), new Territory()};
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
