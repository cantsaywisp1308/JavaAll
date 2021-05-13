package Demo;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JPanelDelete extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelDelete() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("You delete it");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Delete.png"));
		add(lblNewLabel);

	}

}
