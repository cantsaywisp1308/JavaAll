import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class JInternalFrameSearchProduct extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameSearchProduct frame = new JInternalFrameSearchProduct();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JInternalFrameSearchProduct() {
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Search Product");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 39, 414, 158);
		getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(6, 17, 128, 23);
		panel_3.add(chckbxNewCheckBox);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 37, 130, 26);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(108, 35, 117, 29);
		panel_1.add(btnNewButton);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Tab 1", new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession8_JavaSwing/src/ICON for Software/PNG-24/Add.png"), panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(128, 37, 130, 26);
		panel.add(textField);
		textField.setColumns(10);

	}
}
