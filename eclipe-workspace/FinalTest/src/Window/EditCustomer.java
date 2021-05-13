package Window;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


import Entities.Customer;
import Model.CustomerModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldName;
	private JTextField jtextFieldAddress;
	private JTextField jtextFieldPhone;
	private Map<String, Object> values = new HashMap<String, Object>();
	private Customer customer; 
	private JDateChooser jdateChooserBirthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCustomer frame = new EditCustomer();
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
	public EditCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(6, 50, 61, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(105, 45, 224, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(6, 97, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldAddress = new JTextField();
		jtextFieldAddress.setBounds(105, 92, 224, 26);
		contentPane.add(jtextFieldAddress);
		jtextFieldAddress.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Birthday");
		lblNewLabel_2.setBounds(6, 141, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jdateChooserBirthday = new JDateChooser();
		jdateChooserBirthday.setBounds(105, 131, 224, 26);
		contentPane.add(jdateChooserBirthday);
		
		JLabel lblNewLabel_3 = new JLabel("Phone");
		lblNewLabel_3.setBounds(6, 193, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setBounds(105, 188, 224, 26);
		contentPane.add(jtextFieldPhone);
		jtextFieldPhone.setColumns(10);
		
		JButton jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e);
			}
		});
		jbtnSave.setBounds(22, 243, 117, 29);
		contentPane.add(jbtnSave);
	}
	
	public void jbtnSave_actionPerformed(ActionEvent e) {
		CustomerModel customerModel = new CustomerModel();
		customer.setName(jtextFieldName.getText());
		customer.setAddress(jtextFieldAddress.getText());
		customer.setBirthday(jdateChooserBirthday.getDate());
		customer.setPhone(jtextFieldPhone.getText());
		if(customerModel.update(customer)) {
			Main main = new Main();
			main.setVisible(true);
			this.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "Failed ! ");
		}
	}
	
	public EditCustomer(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		int id = Integer.parseInt(values.get("id").toString());
		CustomerModel customerModel = new CustomerModel();
		customer = customerModel.find(id);
		jtextFieldName.setText(customer.getName());
		jtextFieldAddress.setText(customer.getAddress());
		jdateChooserBirthday.setDate(customer.getBirthday());
		jtextFieldPhone.setText(customer.getPhone());
	}
	
	
}
