package eventhandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator 
{
	JFrame fr= new JFrame("Simple Calculation");
	JTextField tb1= new JTextField();
	JTextField tb2= new JTextField();
	JButton bt1 = new JButton("Add");
	JButton bt2 = new JButton("Multiply");
	JLabel la = new JLabel("result");
	public SimpleCalculator() 
	{
		fr.setSize(400,400);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(null);
		addComponents();
		fr.setVisible(true);
		}
	private void addComponents()
	{
		Font fo = new Font("arial", 0, 20);
		tb1.setFont(fo);
		tb2.setFont(fo);
		la.setFont(fo);
		tb1.setBounds(100,100, 100,30);
		fr.add(tb1);
		tb2.setBounds(210,100, 100,30);
		fr.add(tb2);
		bt1.setBounds(100,250, 100,30);
		fr.add(bt1);
		bt2.setBounds(210,250, 100,30);
		fr.add(bt2);
		la.setBounds(180, 180, 100, 30);
		fr.add(la);
		CalListener listener = new CalListener();
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);
	}
	class CalListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			//get event source reference
			JButton bb=(JButton)e.getSource();
			//write code to get both number and store in variables
			String v1=tb1.getText();
			String v2=tb2.getText();
			//code to convert values of v1 and v2 into int
			int n1=Integer.parseInt(v1);
			int n2=Integer.parseInt(v2);
			if(bb==bt1)//add button
			{
				int res=(n1+n2);
				String r=String.valueOf(res);
				la.setText(r);
			}
			else if(bb==bt2)//Multiply button
			{
				int res=(n1*n2);
				String r=String.valueOf(res);
				la.setText(r);
			}
			
		}
		
	}
	public static void main(String[] args) {
		new SimpleCalculator();
	}

}
