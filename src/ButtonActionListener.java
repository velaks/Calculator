import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonActionListener implements ActionListener {
	private Calculator parent;
	
	
	public ButtonActionListener(Calculator parent) {
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		JButton clickedButton = (JButton) event.getSource();
		
		String cbv = parent.getDisplayValue();
		
		String clickedButtonLabel = clickedButton.getText();
		
		parent.setDisplayValue(cbv + clickedButtonLabel);
	
		
	}
	
}
