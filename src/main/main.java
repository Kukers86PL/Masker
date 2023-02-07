package main;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("My First GUI");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300,300);
	    JButton button = new JButton("Hello World");
	    frame.getContentPane().add(button); // Adds Button to content pane of frame
	    frame.setVisible(true);
	}

}
