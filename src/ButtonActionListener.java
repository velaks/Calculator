import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonActionListener implements ActionListener {
	private Calculator parent;
	
	char selectedAction = ' ';
	double currentResult = 0;
	
	public ButtonActionListener(Calculator parent) {
		this.parent = parent;
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		JButton clickedButton = (JButton) event.getSource();
		
		String dispFieldText = parent.getDisplayValue();
		
		double displayValue = 0;
		
		if(!"".equals(dispFieldText)){
			displayValue = Double.parseDouble(dispFieldText);
		}
		
		Object src = event.getSource();
		
		if(src == parent.bpl) {
			selectedAction = '+';
			currentResult = displayValue;
			parent.setDisplayValue("");
			
		} else if(src == parent.bmin) {
			selectedAction = '-';
			currentResult = displayValue;
			parent.setDisplayValue("");
			
		} else if(src == parent.bmult) {
			selectedAction = '*';
			currentResult = displayValue;
			parent.setDisplayValue("");
			
		} else if(src == parent.bdiv) {
			selectedAction = '/';
			currentResult = displayValue;
			parent.setDisplayValue("");
			
		} else if(src == parent.cancel) {
			currentResult = 0;
			parent.setDisplayValue("");
			
		} else if(src == parent.equal) {
			if(selectedAction == '+'){
				currentResult += displayValue;
				parent.setDisplayValue("" + currentResult);
				
			} else if(selectedAction == '-'){
				currentResult -= displayValue;
				parent.setDisplayValue("" + currentResult);
				
			} else if(selectedAction == '*'){
				currentResult *= displayValue;
				parent.setDisplayValue("" + currentResult);
				
			} else if(selectedAction == '/'){
				currentResult /= displayValue;
				parent.setDisplayValue("" + currentResult);
				
			}
			
		} else {
		
		String clickedButtonLabel = clickedButton.getText();
		
		parent.setDisplayValue(dispFieldText + clickedButtonLabel);
	
		}
	}
	
}
