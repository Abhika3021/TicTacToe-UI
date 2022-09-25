package eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling {
	JFrame fr = new JFrame("Event Handling");
	JPanel pa = new JPanel();
	JButton bt1 = new JButton("Red Button");
	JButton bt2 = new JButton("Blue Button");
	JButton bt3 = new JButton("Green Button");
	JButton bt4 = new JButton("Yellow Button");
public EventHandling() {
	fr.setSize(600,600);
	fr.setResizable(false);
	fr.setDefaultCloseOperation(3);
	fr.setLocationRelativeTo(null);
	fr.add(pa);
	pa.add(bt1);
	pa.add(bt2);
	pa.add(bt3);
	pa.add(bt4);
	bt1.addActionListener(new AA());
	bt2.addActionListener(new BB());
	bt3.addActionListener(new CC());
	bt4.addActionListener(new DD());
	pa.setBackground(Color.black);
	fr.setVisible(true);
}
class AA implements ActionListener
{
	public void actionPerformed(ActionEvent evt) {
		pa.setBackground(Color.red);
	}
}
class BB implements ActionListener
{
	public void actionPerformed(ActionEvent evt) {
		pa.setBackground(Color.blue);
	}
}
class CC implements ActionListener
{
	public void actionPerformed(ActionEvent evt) {
		pa.setBackground(Color.green);
	}
}
class DD implements ActionListener
{
	public void actionPerformed(ActionEvent evt) {
		pa.setBackground(Color.yellow);
	}
}
public static void main(String args[])
{
	new EventHandling();
}
}
