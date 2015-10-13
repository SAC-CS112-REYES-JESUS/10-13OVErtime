import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JJPanel2 {

	
	public static void main(String[] args)
	{
		
		JFrame f = new JFrame("Window NAME");
			
		f.setVisible(true);
		f.setSize(300,100);
		f.setLocation(400,50);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		
		p.setBackground(Color.RED);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.BLUE);
		
		JLabel l = new JLabel("Hello my Name is NAE Nae");
		p.add(l);
		
		JLabel l2 = new JLabel("This is the second Lable ok");
		p2.add(l2);
		
		
		f.add(p,BorderLayout.CENTER);
		f.add(p2,BorderLayout.SOUTH);
		
		
		
		
		
		
		
	}
}
