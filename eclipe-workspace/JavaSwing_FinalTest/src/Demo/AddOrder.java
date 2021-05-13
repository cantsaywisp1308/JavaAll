package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import Entities.Order;
import Model.OrderModel;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class AddOrder extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldName;
	private JTextField jtextFieldCustomerId;
	private JComboBox jcomboBoxPayments;
	private JDateChooser jdateChooserDateCreation;
	private Map<String, Object>values = new HashMap<String, Object>();

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
		
		JLabel jlblName = new JLabel("Name");
		jlblName.setBounds(6, 38, 61, 16);
		contentPane.add(jlblName);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(100, 33, 130, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Date Creation");
		lblNewLabel.setBounds(0, 81, 86, 16);
		contentPane.add(lblNewLabel);
		
		jdateChooserDateCreation = new JDateChooser();
		jdateChooserDateCreation.setBounds(100, 71, 130, 26);
		contentPane.add(jdateChooserDateCreation);
		
		JLabel lblNewLabel_1 = new JLabel("Payments");
		lblNewLabel_1.setBounds(6, 125, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jcomboBoxPayments = new JComboBox();
		jcomboBoxPayments.setBounds(100, 121, 140, 27);
		contentPane.add(jcomboBoxPayments);
		
		JLabel lblNewLabel_2 = new JLabel("Customerid");
		lblNewLabel_2.setBounds(6, 171, 80, 16);
		contentPane.add(lblNewLabel_2);
		
		jtextFieldCustomerId = new JTextField();
		jtextFieldCustomerId.setBounds(100, 166, 130, 26);
		contentPane.add(jtextFieldCustomerId);
		jtextFieldCustomerId.setColumns(10);
		
		JButton jbtnAdd = new JButton("Add");
		jbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnAdd_actionPerformed(e);
			}
		});
		jbtnAdd.setBounds(32, 225, 117, 29);
		contentPane.add(jbtnAdd);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(251, 225, 117, 29);
		contentPane.add(btnNewButton_1);
		loadData();
	}
	
	public void jbtnAdd_actionPerformed(ActionEvent e) {
		OrderModel orderModel = new OrderModel(); 
		String payment = jcomboBoxPayments.getSelectedItem().toString();
		Order order = new Order();
		order.setName(jtextFieldName.getText());
		order.setDatecreation(jdateChooserDateCreation.getDate());
		order.setPayments(jcomboBoxPayments.getSelectedItem().toString());
		order.setCustomerid(Integer.parseInt(jtextFieldCustomerId.getText()));
		if(orderModel.add(order)) {
			JOptionPane.showMessageDialog(null, "Done ! ");
		} else {
			JOptionPane.showMessageDialog(null, "Failed ! ");
		}
	}
	
	private void loadData() {
		DefaultComboBoxModel<String> payments = new DefaultComboBoxModel<String>();
		payments.addElement("Cash");
		payments.addElement("Visa");
		payments.addElement("Master Card");
		payments.addElement("Paypal");
		jcomboBoxPayments.setModel(payments);
		
	}
	
	public AddOrder(Map<String, Object>values) {
		this();
		this.values=values;
		loadData1();
	}
	
	private void loadData1() {
		int id = Integer.parseInt(values.get("id").toString());
		jtextFieldCustomerId.setText(String.valueOf(id));
	}
}
