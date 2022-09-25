package eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class project1 {

	JFrame frame = new JFrame("Color Changing Panel");
	JPanel panel = new JPanel();
	JButton button1 =  new JButton("Green Button");
	JButton button2 =  new JButton("Red Button");
	JButton button3 =  new JButton("Blue Button");
	JButton button4 =  new JButton("Black Button");
	JButton button5 =  new JButton("Random Color");
	
	public project1(){
		frame.setSize(550,550);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.setBackground(Color.yellow);
		button1.addActionListener(new AA());
		button2.addActionListener(new BB());
		button3.addActionListener(new CC());
		button4.addActionListener(new DD());
		button5.addActionListener(new EE());
	}
	
	class AA implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			panel.setBackground(Color.green);
		}
	}
	class BB implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			panel.setBackground(Color.red);
		}
	}
	class CC implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			panel.setBackground(Color.blue);
		}
	}
	class DD implements ActionListener{
	public void actionPerformed(ActionEvent evt) {
		panel.setBackground(Color.black);
		}
	}
	class EE implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			panel.setBackground(new Color(125,50,250));
			}
		}
	
	
	public static void main(String[] args) {
		
			new project1();
	}

}
