package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.awt.event.ActionEvent;

public class Demo4 extends JFrame {

	private JPanel contentPane;
	private JTable jtableProducts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo4 frame = new Demo4();
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
	public Demo4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 438, 205);
		contentPane.add(scrollPane);
		
		jtableProducts = new JTable();
		scrollPane.setViewportView(jtableProducts);
		
		JButton jbtnImportCSV = new JButton("Import CSV");
		jbtnImportCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnImportCSV_actionPerformed(e);
			}
		});
		jbtnImportCSV.setBounds(16, 223, 117, 29);
		contentPane.add(jbtnImportCSV);
	}
	
	public void jbtnImportCSV_actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser("/Users/macbookair/eclipse-workspace/DemoSession7_JavaSwing/src/Demo");
		fileChooser.setDialogTitle("Choose a file");
		fileChooser.setMultiSelectionEnabled(false);
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
				DefaultTableModel defaultTableModel = new DefaultTableModel() {

					@Override
					public boolean isCellEditable(int row, int column) {
						// TODO Auto-generated method stub
						return super.isCellEditable(row, column);
					}
				};
				defaultTableModel.addColumn("ID");
				defaultTableModel.addColumn("Name");
				defaultTableModel.addColumn("Price");
				defaultTableModel.addColumn("Quantity");
				for(String line:lines) {
					String[] product = line.split(","); 
					defaultTableModel.addRow(new Object[] {
							product[0],
							product[1],
							product[2],
							product[3]
					});
				}
				jtableProducts.setModel(defaultTableModel);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}
