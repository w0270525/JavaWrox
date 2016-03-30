package org.test;

import javax.swing.*;
import java.awt.FlowLayout;

public class TestMain {
	public static final void main(String[] args) {
		
		//create a panel
		JPanel windowContent = new JPanel();
		
		//set a layout manager for this panel
		FlowLayout f1 = new FlowLayout();
		windowContent.setLayout(f1);
		
		//create controls in memory
		JLabel label1= new JLabel("Number 1: ");
		JTextField field1= new JTextField(10);
		
		JLabel label2 = new JLabel("Number 2: ");
		JTextField field2= new JTextField(10);
		
		
		
	}
}
