package Demo;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class JPanelFees extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelFees() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Fees");
		add(lblNewLabel);

	}

}
