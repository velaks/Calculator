package calculator;

import javax.swing.*;
import java.awt.*;


public class Calculator extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton b7, b8, b9, b4, b5, b6, b1, b2, b3, 
	b0, bdiv, bmult, bpl, bmin, cancel, equal, bpoint;
	private JTextField textField;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Calculator() {
		setLayout(new GridBagLayout());
		
		textField = new JTextField(10);
		gbc.gridx = 0; //coordinates
		gbc.gridy = 0; 
		gbc.gridwidth = 8; //blocks
		gbc.gridheight = 1; 
		gbc.weightx = 0.0; //resizable
		gbc.weighty = 0.0;
		gbc.anchor = GridBagConstraints.NORTH; //disposition
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5); //insets; top-left-bottom-right
		gbc.ipadx = 0; //size
		gbc.ipady = 10;
		add(textField, gbc);
		
		//more simple
		b7 = new JButton("7");
		add(b7, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 
				0, 0));
		
		
		b8 = new JButton("8");
		add(b8, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b9 = new JButton("9");
		add(b9, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b4 = new JButton("4");
		add(b4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b5 = new JButton("5");
		add(b5, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b6 = new JButton("6");
		add(b6, new GridBagConstraints(2, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b1 = new JButton("1");
		add(b1, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b2 = new JButton("2");
		add(b2, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b3 = new JButton("3");
		add(b3, new GridBagConstraints(2, 3, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		b0 = new JButton("0");
		add(b0, new GridBagConstraints(1, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		bpoint = new JButton(".");
		add(bpoint, new GridBagConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		cancel = new JButton("c");
		add(cancel, new GridBagConstraints(2, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		bdiv = new JButton("/");
		add(bdiv, new GridBagConstraints(3, 1, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		bmult = new JButton("*");
		add(bmult, new GridBagConstraints(3, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		bmin = new JButton("-");
		add(bmin, new GridBagConstraints(3, 3, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		bpl = new JButton("+");
		add(bpl, new GridBagConstraints(3, 4, 1, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 
				0, 0));
		
		equal = new JButton("=");
		add(equal, new GridBagConstraints(0, 5, 3, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 
				0, 0));
		
		ButtonActionListener bal = new ButtonActionListener(this);
		b1.addActionListener(bal);
		b2.addActionListener(bal);
		b3.addActionListener(bal);
		b4.addActionListener(bal);
		b5.addActionListener(bal);
		b6.addActionListener(bal);
		b7.addActionListener(bal);
		b8.addActionListener(bal);
		b9.addActionListener(bal);
		b0.addActionListener(bal);
		bpl.addActionListener(bal);
		bmin.addActionListener(bal);
		bmult.addActionListener(bal);
		bdiv.addActionListener(bal);
		equal.addActionListener(bal);
		cancel.addActionListener(bal);
		bpoint.addActionListener(bal);
		
	}
	
	public void setDisplayValue(String val) {
		textField.setText(val);
	}
	
	public String getDisplayValue(){
		return textField.getText();
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Calculator c = new Calculator();
				JFrame jf = new JFrame("Calculator");
				jf.setSize(600, 500);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setLocationRelativeTo(null);
				jf.setResizable(false);
				jf.setVisible(true);
				jf.add(c);
				jf.pack();
			}
		});
		
	}
}
