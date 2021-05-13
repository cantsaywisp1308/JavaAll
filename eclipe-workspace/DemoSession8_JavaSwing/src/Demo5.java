import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo5 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldID;
	private JTextField jtextFieldName;
	private JTextField jtextFieldQuantity;
	
	private Map<String,Object> values;  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo5 frame = new Demo5();
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
	public Demo5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(6, 29, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(6, 90, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(6, 160, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jtextFieldID = new JTextField();
		jtextFieldID.setBounds(79, 24, 195, 26);
		contentPane.add(jtextFieldID);
		jtextFieldID.setColumns(10);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(79, 85, 195, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		jtextFieldQuantity = new JTextField();
		jtextFieldQuantity.setBounds(79, 155, 195, 26);
		contentPane.add(jtextFieldQuantity);
		jtextFieldQuantity.setColumns(10);
	}
	
	public Demo5(Map<String, Object> values) {
		this();
		this.values = values;
		loadData(); 
	}
	
	public void loadData() {
		String id = (String) values.get("ID");
		jtextFieldID.setText(id);
		String name = (String) values.get("name"); 
		jtextFieldName.setText(name);
		int quantity = Integer.parseInt(values.get("quantity").toString());
		jtextFieldQuantity.setText(String.valueOf(quantity));
	}

}
