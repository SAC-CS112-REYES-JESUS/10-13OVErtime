import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class OneOne {

	public static void main(String[] args)

{
		
		JFrame f = new JFrame("The Window name");
		f.setVisible(true);
		f.setSize(800, 500);
		f.setLocation(250,50);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel p = new JPanel();
		p.setBackground(Color.yellow);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.GREEN);
		
		
		
		JButton b1 = new JButton("The Button");
		JButton b2 = new JButton("ThSecond Button");
		JLabel lab = new JLabel("Ths is the test label");
		
		JButton b3 = new JButton("Jpane2 butttttttttttttton");
		JButton b4 = new JButton ("JPanne2 button");
		JLabel lab2 = new JLabel("Ths is the test label");
		
		
		p.add(b1);
		p.add(lab);
		p.add(b2);
		
		
		p2.add(b3);
		p2.add(lab2);		
		p2.add(b4);
		
		f.add(p,BorderLayout.SOUTH);
		f.add(p2,BorderLayout.NORTH);

	}
	
	
	
		
	}

