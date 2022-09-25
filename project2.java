package eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class project2 {
	
	JFrame frame = new JFrame("Ashok Chakra");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Ashok Chakra");
	ImageIcon icon = new ImageIcon("C:/Users/Aditya/Desktop/Files/images.png");
	Border border = BorderFactory.createLineBorder(Color.blue, 3);
	
	public project2() {
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.add(label);
		panel.setBackground(Color.black);
		label.setIcon(icon);
		label.setBounds(50,50,350,350);
		label.addMouseListener(new FontListener());
		label.setBorder(border);
	}
	
	class FontListener implements MouseListener {
		Font font;
		@Override
		public void mouseEntered(MouseEvent e) {
			font = label.getFont();
			label.setFont(new Font("Algerian",Font.BOLD,20));
			label.setForeground(Color.blue);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setIconTextGap(0);
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			label.setFont(font);			
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		}
	
	

	public static void main(String[] args) {
		
		new project2();
		
	}
		
	
	}


