package Demo;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Entities.Customer;
import Model.CustomerModel;
//import Entities.Product;
//import Model.ProductModel;

import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private JTable jtableCustomer;
	private Map<String, Object>values = new HashMap<String,Object>();
	private JButton btnAddOrder;
	private JButton jbtnProfile;
	private JButton jbtnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1 frame = new Demo1();
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
	public Demo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		jtableCustomer = new JTable();
		jtableCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtableCustomer_mouseClicked(e);
			}
		});
		scrollPane.setViewportView(jtableCustomer);
		
		jbtnProfile = new JButton("Profile");
		jbtnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnProfile_actionPerformed(e);
			}
		});
		contentPane.add(jbtnProfile);
		
		btnAddOrder = new JButton("Add Order");
		btnAddOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddOrder_actionPerformed(e);
			}
		});
		contentPane.add(btnAddOrder);
		
		jbtnDelete = new JButton("Delete");
		jbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnDelete_actionPerformed(e);
			}
		});
		contentPane.add(jbtnDelete);
		loadData();
	}
	
	public void jtableCustomer_mouseClicked(MouseEvent e) {
		jbtnDelete.setEnabled(true);
		jbtnProfile.setEnabled(true);
		btnAddOrder.setEnabled(true);
	}
	
	public void btnAddOrder_actionPerformed(ActionEvent e) {
		int selectedRow = jtableCustomer.getSelectedRow();
		int id = Integer.parseInt(jtableCustomer.getValueAt(selectedRow, 0).toString());
		Map<String, Object>values = new HashMap<String, Object>();
		values.put("id", id); 
		AddOrder addOrder = new AddOrder(values);
		addOrder.setVisible(true);
	}
	
	public void jbtnDelete_actionPerformed(ActionEvent e) {
		try {
			int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirm", JOptionPane.YES_NO_OPTION); 
			if(result == JOptionPane.YES_OPTION) {
				CustomerModel customerModel = new CustomerModel();
				int selectedRow = jtableCustomer.getSelectedRow();
				int id = Integer.parseInt(jtableCustomer.getValueAt(selectedRow, 0).toString());
				if(customerModel.delete(id)) {
					fillDataToJTable(customerModel.findAll());
					jbtnDelete.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(null, "Failed !");
				}
			}
		} catch(Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	
	public void jbtnProfile_actionPerformed(ActionEvent e) {
		int selectedRow = jtableCustomer.getSelectedRow();
		int id = Integer.parseInt(jtableCustomer.getValueAt(selectedRow, 0).toString());
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("id", id); 
		EditAccount editProduct = new EditAccount(values);
		editProduct.setVisible(true);
		setVisible(false);
	}
	
	
	private void loadData() {
		CustomerModel customerModel = new CustomerModel();
		fillDataToJTable(customerModel.findAll()); 
		jbtnDelete.setEnabled(false);
		jbtnProfile.setEnabled(false);
		btnAddOrder.setEnabled(false);
		
	}
	
	private void fillDataToJTable(List<Customer> customers) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; 
			}
			
		};
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("Address");
		defaultTableModel.addColumn("Birthday");
		defaultTableModel.addColumn("Phone");
		for(Customer customer:customers) {
			defaultTableModel.addRow(new Object[] {
					customer.getId(),customer.getName(),customer.getAddress(),customer.getAddress(),customer.getPhone()
			});
		}
		jtableCustomer.setModel(defaultTableModel);
		jtableCustomer.getTableHeader().setReorderingAllowed(false);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
