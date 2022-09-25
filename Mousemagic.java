package eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Mousemagic {
			JFrame fr=new JFrame("Event handling");
			JLabel la=new JLabel("Touch me to see magic");
			boolean move=true;
			public Mousemagic()
			{
				fr.setSize(900,600);
				fr.setResizable(false);
				fr.setDefaultCloseOperation(3);
				fr.setLocationRelativeTo(null);
				fr.setLayout(null);
				la.setFont(new Font("arial",0,20));
				la.setBounds(100,100,220,30);
				fr.add(la);
				la.addMouseListener(new MagicListener());
				fr.addKeyListener(new StopListener());
				fr.setVisible(true);
			}
			class MagicListener implements MouseListener
			{
				Random ra=new Random();
				public void mouseEntered(MouseEvent evt)
				{	
					if(move)
					{
						int x=ra.nextInt(700);
						int y=ra.nextInt(500);
						//fr.setTitle("x="+x+",y="+y);
						la.setLocation(x,y);
					}
					move=true;
				}
				public void mouseExited(MouseEvent e){}
				public void mouseClicked(MouseEvent e){} 
				public void mousePressed(MouseEvent e){} 
				public void mouseReleased(MouseEvent e){} 
			}
			class StopListener implements KeyListener
			{
				public void keyPressed(KeyEvent evt) 
				{
					char ch=evt.getKeyChar();
					if(ch=='a')
						move=false;
				}
				public void keyReleased(KeyEvent arg0){} 
				public void keyTyped(KeyEvent arg0) {}
			}
			public static void main(String[] args) 
			{
				new Mousemagic();
			}
	}