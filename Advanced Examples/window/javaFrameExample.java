package window;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class javaFrameExample extends JFrame{
	public javaFrameExample() {
		this.setSize(800, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("This is the title");
		
		componentWindow();
	}
	
	private void componentWindow() {
		JPanel panel = new JPanel();
		//panel.setBackground(Color.BLACK);
		this.getContentPane().add(panel);
		//panel.setLayout(null);
		
		JLabel str = new JLabel("UNSA");
		//str.setOpaque(true);
		str.setBounds(85, 10, 300, 80);
		str.setForeground(Color.RED);
		str.setFont(new Font("lucida bright", 0, 50));
		panel.add(str);
		
		JLabel image = new JLabel(new ImageIcon("unsa-logo.png"));
		
		panel.add(image);
	}
	
	
}