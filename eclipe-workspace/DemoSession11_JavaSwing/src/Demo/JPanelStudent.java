package Demo;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JPanelStudent extends JPanel {
	private JTextField jtextFieldSearch;
	private JTable jtableStudent;

	/**
	 * Create the panel.
	 */
	public JPanelStudent() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBackground(new Color(85,65,118));
		add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Modify.png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		panel_1.add(lblNewLabel_2);
		
		jtextFieldSearch = new JTextField();
		panel_1.add(jtextFieldSearch);
		jtextFieldSearch.setColumns(10);
		
		JButton jbtnSearch = new JButton("Search");
		panel_1.add(jbtnSearch);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		jtableStudent = new JTable();
		scrollPane.setViewportView(jtableStudent);
		loadData();

	}
	
	private void loadData() {
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("Phone");
		defaultTableModel.addColumn("Email");
		defaultTableModel.addColumn("Score");
		for(int i =1;  i < 100;  i++ ) {
			defaultTableModel.addRow(new Object[] {
					"st0 " + i,
					"name "+i,
					"Email "+i,
					"Score "+ i,
					i
			});
		}
		jtableStudent.setModel(defaultTableModel);
	}

}
