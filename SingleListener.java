package eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SingleListener {
	
	
		JFrame fr=new JFrame("Event handling");
		JPanel pa=new JPanel();
		JButton bt1=new JButton("Red Background");
		JButton bt2=new JButton("Green Background");
		JButton bt3=new JButton("Blue Background");
		public SingleListener()
		{
			fr.setSize(400,400);
			fr.setResizable(false);
			fr.setDefaultCloseOperation(3);
			fr.setLocationRelativeTo(null);
			fr.add(pa);
			pa.add(bt1);
			pa.add(bt2);
			pa.add(bt3);
			ColorListener listener=new ColorListener();
			bt1.addActionListener(listener);
			bt2.addActionListener(listener);
			bt3.addActionListener(listener);
			pa.setBackground(Color.yellow);
			fr.setVisible(true);
		}
		class ColorListener implements ActionListener
		{
			public void actionPerformed(ActionEvent evt) 
			{
				Object source=evt.getSource();
				
				if(source==bt1)//when bt1 button clicked
					pa.setBackground(Color.red);
				else if(source==bt2)//when bt2 button clicked
					pa.setBackground(Color.green);
				else if(source==bt3)//when bt3 button clicked
					pa.setBackground(Color.blue);
			}
		}
		public static void main(String[] args) 
		{
			new SingleListener();
		}
	


	}