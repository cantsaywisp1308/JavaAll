import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo4 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldName;
	private JTextField jtextFieldQuantity;
	
	private static String[] values;
	private JTextField jtextFieldID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					values = args; 
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
		setTitle("Frame 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(6, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(6, 47, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(79, 39, 331, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(6, 95, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jtextFieldQuantity = new JTextField();
		jtextFieldQuantity.setBounds(79, 90, 331, 26);
		contentPane.add(jtextFieldQuantity);
		jtextFieldQuantity.setColumns(10);
		
		jtextFieldID = new JTextField();
		jtextFieldID.setBounds(82, 1, 321, 26);
		contentPane.add(jtextFieldID);
		jtextFieldID.setColumns(10);
		loadData();
		
	}

	private void loadData() {
		jtextFieldID.setText(values[0]);
		jtextFieldName.setText(values[1]);
		int quantity = Integer.parseInt(values[2]);
		quantity += 5;
		jtextFieldQuantity.setText(String.valueOf(quantity));
	}
}
