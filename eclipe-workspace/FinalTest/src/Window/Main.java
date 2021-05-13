package Window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Entities.Customer;
import Model.CustomerModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable jtableCustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 438, 131);
		contentPane.add(scrollPane);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(scrollPane, popupMenu);
		
		JMenuItem jmntmProfile = new JMenuItem("Profile");
		jmntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmProfile_actionPerformed(e);
			}
		});
		popupMenu.add(jmntmProfile);
		
		JMenuItem jmntmAddOrder = new JMenuItem("Add order");
		jmntmAddOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmAddOrder_actionPerformed(e);
			}
		});
		popupMenu.add(jmntmAddOrder);
		
		JMenuItem jmntmDelete = new JMenuItem("Delete");
		jmntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmDelete_actionPerformed(e);
			}
		});
		popupMenu.add(jmntmDelete);
		
		jtableCustomer = new JTable();
		scrollPane.setViewportView(jtableCustomer);
		loadData();
	}
	
	public void jmntmAddOrder_actionPerformed(ActionEvent e) {
		int selectedRow = jtableCustomer.getSelectedRow();
		int id = Integer.parseInt(jtableCustomer.getValueAt(selectedRow, 0).toString());
		Map<String, Object>values = new HashMap<String, Object>();
		values.put("id", id); 
		AddOrder addOrder = new AddOrder(values);
		addOrder.setVisible(true);
		this.setVisible(false);
	}
	
	public void jmntmProfile_actionPerformed(ActionEvent e) {
		int selectedRow = jtableCustomer.getSelectedRow();
		int id = Integer.parseInt(jtableCustomer.getValueAt(selectedRow, 0).toString());
		Map<String, Object>values = new HashMap<String, Object>();
		values.put("id", id);
		EditCustomer editCustomer = new EditCustomer(values);
		editCustomer.setVisible(true);
		this.setVisible(false);
	}
	
	private void jmntmDelete_actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirm", JOptionPane.YES_NO_OPTION); 
		if(result == JOptionPane.YES_OPTION) {
			CustomerModel customerModel = new CustomerModel();
			int selectedRow = jtableCustomer.getSelectedRow();
			int id = Integer.parseInt(jtableCustomer.getValueAt(selectedRow, 0).toString());
			if(customerModel.delete(id)) {
				fillDataToJTable(customerModel.findAll());
			} else {
				JOptionPane.showMessageDialog(null, "Failed !");
			}
		}
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
	
	private void loadData() {
		CustomerModel customerModel = new CustomerModel();
		fillDataToJTable(customerModel.findAll()); 
		
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
					customer.getId(),customer.getName(),customer.getAddress(),customer.getBirthday(),customer.getPhone()
			});
		}
		jtableCustomer.setModel(defaultTableModel);
		jtableCustomer.getTableHeader().setReorderingAllowed(false);
	}
}
