package eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TicTacToe1 {
		JFrame fr=new JFrame("Tic Tac Toe");
		JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
		JPanel[] pa = new JPanel[3];
		JButton [] bt = new JButton[9];
		JLabel msg=new JLabel("First Player Turn..");
		JButton reset = new JButton("RESET");
		//code to load both images
		ImageIcon icon1 = new ImageIcon(getClass().getResource("images/user1.png"));
		ImageIcon icon2 = new ImageIcon(getClass().getResource("images/user2.png"));
		int player=1,count=0;
		boolean winnerFound=false;
		public TicTacToe1()
		{
			createFrame();
		}
		private void createFrame()
		{
			fr.setSize(500,640);
			fr.setLocationRelativeTo(null);
			fr.setResizable(false);
			fr.setDefaultCloseOperation(3);
			fr.add(la);
			addPanels();
			fr.setVisible(true);
		}
		private void addPanels()
		{
			la.setLayout(null);
			for(int i=0; i<3; i++)
			{
				pa[i]=new JPanel();
				la.add(pa[i]);
				}
			pa[0].setBounds(50, 20, 400, 40);
			pa[1].setBounds(50, 90, 400, 400);
			pa[2].setBounds(50, 520, 400, 40);
			addButtons();
		}
		private void addButtons()
		{
			pa[1].setLayout(new GridLayout(3,3));
			TicListener listener = new TicListener();
			for(int i=0; i<9; i++)
			{
				bt[i]=new JButton();
				bt[i].addActionListener(listener);
				pa[1].add(bt[i]);
				bt[i].setBackground(Color.yellow);
			}
			addOthers();
		}
		private void addOthers()
		{
			pa[0].add(msg);
			msg.setFont(new Font("lucida Calligraphy", 1 ,25));
			msg.setForeground(Color.blue);
			pa[2].add(reset);
			pa[2].setOpaque(false);
			reset.setFont(new Font("arial", 0 , 18));
			reset.addActionListener(new ResetListener());
			reset.setEnabled(false);
		}
		class TicListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e) 
			{
				JButton bb=(JButton)e.getSource();
				if(player == 1) //when first player clicks
				{
					bb.setIcon(icon1);
					bb.setEnabled(false); //make the button disable after used
					msg.setText("Second player Turn..");
					msg.setForeground(Color.MAGENTA);
					player=2;
				}
				else if(player == 2) //when second player clicks
				{
					bb.setIcon(icon2);
					bb.setEnabled(false);
					msg.setText("First player Turn..");
					msg.setForeground(Color.blue);
					player=1;	
			}
				findWinner();
				count++;
				if(count==9 && !winnerFound)
				{
					msg.setText("Game Over...");
					msg.setForeground(Color.orange);
					reset.setEnabled(true);
					JOptionPane.showMessageDialog(fr,"Oooops!!! It is a Tie..");
				}
		}
			private void findWinner()
			{
				if(bt[0].getIcon()==icon1 && bt[1].getIcon()==icon1 && bt[2].getIcon()==icon1)
					announceWinner(0,1,2,"First");
				else if(bt[0].getIcon()==icon2 && bt[1].getIcon()==icon2 && bt[2].getIcon()==icon2)
					announceWinner(0,1,2, "Second");
				if(bt[3].getIcon()==icon1 && bt[4].getIcon()==icon1 && bt[5].getIcon()==icon1)
					announceWinner(3,4,5,"First");
				else if(bt[3].getIcon()==icon2 && bt[4].getIcon()==icon2 && bt[5].getIcon()==icon2)
					announceWinner(3,4,5, "Second");
				if(bt[6].getIcon()==icon1 && bt[7].getIcon()==icon1 && bt[8].getIcon()==icon1)
					announceWinner(6,7,8,"First");
				else if(bt[6].getIcon()==icon2 && bt[7].getIcon()==icon2 && bt[8].getIcon()==icon2)
					announceWinner(6,7,8, "Second");
				if(bt[0].getIcon()==icon1 && bt[3].getIcon()==icon1 && bt[6].getIcon()==icon1)
					announceWinner(0,3,6,"First");
				else if(bt[0].getIcon()==icon2 && bt[3].getIcon()==icon2 && bt[6].getIcon()==icon2)
					announceWinner(0,3,6, "Second");
				if(bt[1].getIcon()==icon1 && bt[4].getIcon()==icon1 && bt[7].getIcon()==icon1)
					announceWinner(1,4,7,"First");
				else if(bt[1].getIcon()==icon2 && bt[4].getIcon()==icon2 && bt[7].getIcon()==icon2)
					announceWinner(1,4,7, "Second");
				if(bt[2].getIcon()==icon1 && bt[5].getIcon()==icon1 && bt[8].getIcon()==icon1)
					announceWinner(2,5,8,"First");
				else if(bt[2].getIcon()==icon2 && bt[5].getIcon()==icon2 && bt[8].getIcon()==icon2)
					announceWinner(2,5,8, "Second");
				if(bt[0].getIcon()==icon1 && bt[4].getIcon()==icon1 && bt[8].getIcon()==icon1)
					announceWinner(0,4,8,"First");
				else if(bt[0].getIcon()==icon2 && bt[4].getIcon()==icon2 && bt[8].getIcon()==icon2)
					announceWinner(0,4,8, "Second");
				if(bt[2].getIcon()==icon1 && bt[4].getIcon()==icon1 && bt[6].getIcon()==icon1)
					announceWinner(2,4,6,"First");
				else if(bt[2].getIcon()==icon2 && bt[4].getIcon()==icon2 && bt[6].getIcon()==icon2)
					announceWinner(2,4,6, "Second");
			}
			private void announceWinner(int i, int j, int k, String str)
			{
				reset.setEnabled(true);
				winnerFound=true;
				bt[i].setBackground(Color.red);
				bt[j].setBackground(Color.red);
				bt[k].setBackground(Color.red);
				msg.setText("Game Over...");
				msg.setForeground(Color.orange);
				for(int c=0; c<9; c++)
				{
				bt[c].setEnabled(false);
				}
				JOptionPane.showMessageDialog(fr, str+" player won..");
			}
	}
		class ResetListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{	
				for(int c=0; c<9; c++)
				{
				bt[c].setEnabled(true);
				bt[c].setBackground(Color.yellow);
				bt[c].setIcon(null);
				}
				player=1;
				msg.setText("First player Turn");
				msg.setForeground(Color.blue);
				winnerFound=false;
				count=0;
				reset.setEnabled(false);
			}	
		}
		public static void main(String[] args)
		{
			new TicTacToe1();
		}
	}