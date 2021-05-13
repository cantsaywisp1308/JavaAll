package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Customer;
import Model.CustomerModel;


import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditAccount extends JFrame {

	private JPanel contentPane;
	private Map<String, Object> values = new HashMap<String, Object>();
	private JTextField jtextFieldName;
	private JTextField jtextFieldAddress;
	private JTextField jtextFieldPhone;
	private Customer customer;
	private JDateChooser jdateChooserBirthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditAccount frame = new EditAccount();
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
	public EditAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(6, 28, 61, 16);
		panel.add(lblNewLabel);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(103, 23, 223, 26);
		panel.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(6, 67, 61, 16);
		panel.add(lblNewLabel_1);
		
		jtextFieldAddress = new JTextField();
		jtextFieldAddress.setBounds(103, 62, 223, 26);
		panel.add(jtextFieldAddress);
		jtextFieldAddress.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Birthday");
		lblNewLabel_2.setBounds(6, 108, 61, 16);
		panel.add(lblNewLabel_2);
		
		jdateChooserBirthday = new JDateChooser();
		jdateChooserBirthday.setDateFormatString("dd/MM/yyyy");
		jdateChooserBirthday.setBounds(103, 98, 223, 26);
		panel.add(jdateChooserBirthday);
		
		JLabel lblNewLabel_3 = new JLabel("Phone");
		lblNewLabel_3.setBounds(6, 150, 61, 16);
		panel.add(lblNewLabel_3);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setBounds(103, 145, 223, 26);
		panel.add(jtextFieldPhone);
		jtextFieldPhone.setColumns(10);
		
		JButton jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e);
			}
		});
		jbtnSave.setBounds(30, 212, 117, 29);
		panel.add(jbtnSave);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnCancel_actionPerformed(e);
			}
		});
		jbtnCancel.setBounds(262, 212, 117, 29);
		panel.add(jbtnCancel);
	}

	public void jbtnSave_actionPerformed(ActionEvent e) {
		try {
			CustomerModel customerModel  = new CustomerModel();
			customer.setName(jtextFieldName.getText());
			customer.setAddress(jtextFieldAddress.getText());
			customer.setBirthday((java.sql.Date) jdateChooserBirthday.getDate());
			customer.setPhone(jtextFieldPhone.getText());
			if(customerModel.update(customer)) {
				JOptionPane.showMessageDialog(null, "Done !");
				Demo1 demo1 = new Demo1();
				demo1.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Falied !");
			}
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	
	public EditAccount(Map<String, Object>values) {
		this();
		this.values = values;
		loadData(); 
	}
	
	private void loadData() {
		int id = Integer.parseInt(values.get("id").toString());
		CustomerModel accountModel = new CustomerModel();
		Customer customer = accountModel.find(id); 
		jtextFieldName.setText(customer.getName());
		jtextFieldAddress.setText(customer.getAddress());
		jdateChooserBirthday.setDate(customer.getBirthday());
		jtextFieldPhone.setText(customer.getPhone());
	}
	
	public void jbtnCancel_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Demo1 demo1 = new Demo1();
		demo1.setVisible(true);
	}
}
