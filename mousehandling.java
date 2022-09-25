package eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mousehandling {
	JFrame fr = new JFrame("Event Handling");
	JPanel pa = new JPanel();
	JLabel la = new JLabel("Hello World!");
	public mousehandling() {
		fr.setSize(500, 300);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.setLocationRelativeTo(null);
		fr.add(pa);
		pa.add(la);
		la.addMouseListener(new FontListener());
		fr.setVisible(true);
	}
	class FontListener implements MouseListener
	{
		Font fo;
		public void mouseEntered(MouseEvent evt)
		{
			fo = la.getFont();
			la.setFont(new Font("arial",0,35));
		}
		public void mouseExited(MouseEvent evt)
		{
			la.setFont(fo);
		}
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	public static void main(String args[])
	{
		new mousehandling();
	}
}
