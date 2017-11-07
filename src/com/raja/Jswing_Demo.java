package com.raja;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jswing_Demo {

	public void start() {
		JFrame f=new JFrame("Type the name of frame");
		JLabel l=new JLabel("Rajaprabu"); 
		f.add(l); f.setSize(400,400); f.setVisible(true); 
	} 
	public static void main(String args[]) {
		new Jswing_Demo().start(); 
	}

	
}
