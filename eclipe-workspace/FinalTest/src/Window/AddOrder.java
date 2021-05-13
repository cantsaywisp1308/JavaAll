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
import Entities.Order;
import Model.CustomerModel;
import Model.OrderModel;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddOrder extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldName;
	private JTextField jtextFieldCustomerId;
	private Customer customer; 
	private Map<String, Object>values = new HashMap<String, Object>();
	private JComboBox jcomboBoxPayments;
	private JButton jbtnSave;
	private JDateChooser jdateChooserDateCreation;
	private JCheckBox jchckbxStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddOrder frame = new AddOrder();
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
	public AddOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(6, 41, 61, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(99, 36, 202, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date Created");
		lblNewLabel_1.setBounds(6, 88, 87, 16);
		contentPane.add(lblNewLabel_1);
		
		jdateChooserDateCreation = new JDateChooser();
		jdateChooserDateCreation.setBounds(99, 78, 202, 26);
		contentPane.add(jdateChooserDateCreation);
		
		JLabel lblNewLabel_2 = new JLabel("Status");
		lblNewLabel_2.setBounds(6, 129, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jchckbxStatus = new JCheckBox("In Stock");
		jchckbxStatus.setBounds(99, 125, 128, 23);
		contentPane.add(jchckbxStatus);
		
		JLabel lblNewLabel_3 = new JLabel("Payments");
		lblNewLabel_3.setBounds(6, 173, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		jcomboBoxPayments = new JComboBox();
		jcomboBoxPayments.setBounds(99, 162, 202, 27);
		contentPane.add(jcomboBoxPayments);
		
		JLabel lblNewLabel_4 = new JLabel("customer ID");
		lblNewLabel_4.setBounds(6, 214, 87, 16);
		contentPane.add(lblNewLabel_4);
		
		jtextFieldCustomerId = new JTextField();
		jtextFieldCustomerId.setBounds(99, 204, 202, 26);
		contentPane.add(jtextFieldCustomerId);
		jtextFieldCustomerId.setColumns(10);
		
		jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e);
			}
		});
		jbtnSave.setBounds(40, 243, 117, 29);
		contentPane.add(jbtnSave);
		loadDataComboBox();
	}
	
	private void jbtnSave_actionPerformed(ActionEvent e) {
		try {
			OrderModel orderModel = new OrderModel();
			Order order = new Order();
			order.setName(jtextFieldName.getText());
			order.setDateCreation(jdateChooserDateCreation.getDate());
			order.setStatus(jchckbxStatus.isSelected());
			order.setPayment(jcomboBoxPayments.getSelectedItem().toString());
			order.setCustomerId(Integer.parseInt(jtextFieldCustomerId.getText()));
			if(orderModel.add(order)) {
				JOptionPane.showMessageDialog(null, "Done !");
				Main main = new Main();
				main.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Failed !");
			}
		} catch(Exception e1) {
			System.err.print(e1.getMessage());
		}
	}
	
	public AddOrder(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		int id = Integer.parseInt(values.get("id").toString());
		CustomerModel customerModel = new CustomerModel(); 
		customer = customerModel.find(id);
		jtextFieldCustomerId.setText(String.valueOf(customer.getId()));
	}
	
	private void loadDataComboBox() {
		DefaultComboBoxModel<String> payments = new DefaultComboBoxModel<String>();
		payments.addElement("Cash");
		payments.addElement("Visa");
		payments.addElement("Master Card");
		payments.addElement("Paypal");
		jcomboBoxPayments.setModel(payments);
	}
}
