import javax.swing.*;
import java.awt.*;


public class Calculator extends JPanel{
	private JButton b7, b8, b9, b4, b5, b6, b1, b2, b3, b0, bdel, bmult, bpl, bmin, beq;
	private JTextField f;
	private JLabel label = new JLabel();
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Calculator() {
		setLayout(new GridBagLayout());
		
		f = new JTextField(10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 8;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 0.0;
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5); //top left bottom right
		gbc.ipadx = 0; 
		gbc.ipady = 10;
		add(f, gbc);
		
		//simpler
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
		add(b0, new GridBagConstraints(0, 4, 2, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		beq = new JButton("=");
		add(beq, new GridBagConstraints(2, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
				0, 0));
		
		bdel = new JButton("/");
		add(bdel, new GridBagConstraints(3, 1, 1, 1, 0, 0, GridBagConstraints.CENTER,
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
		add(bpl, new GridBagConstraints(3, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 
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
		bdel.addActionListener(bal);
		beq.addActionListener(bal);
		
	}
	
	public void setDisplayValue(String val) {
		f.setText(val);
	}
	
	public String getDisplayValue(){
		return f.getText();
	}
	
	public static void main(String args[]) {
		Calculator c = new Calculator();
		JFrame jf = new JFrame("Calculator");
		jf.setSize(600, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.add(c);
		jf.pack();
		
		
	}
}
