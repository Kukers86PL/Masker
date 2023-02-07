package main;

import javax.swing.*;
import java.awt.FlowLayout;

public class main {

	public final static String g_sVersion = "1.0";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Masker " + g_sVersion);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,80);
	    
	    JLabel label = new JLabel("Password:");
	    frame.getContentPane().add(label);
	    
	    JPasswordField password = new JPasswordField(20);
	    frame.getContentPane().add(password);
	    
	    JButton button = new JButton("Copy");
	    frame.getContentPane().add(button);
	    
	    frame.setLayout(new FlowLayout());
	    frame.setVisible(true);
	}

}
