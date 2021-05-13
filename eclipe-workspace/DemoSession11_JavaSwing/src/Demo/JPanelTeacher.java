package Demo;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class JPanelTeacher extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelTeacher() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Teacher");
		add(lblNewLabel);

	}

}
