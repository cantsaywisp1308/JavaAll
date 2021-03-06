package Windows;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Entities.Account;
import Entities.Transfer;
import Model.TransferModel;

public class NewTransfer extends JPanel {
	private JTable jtableTransfer;
	private Map<String, Object>values = new HashMap<String,Object>();
	private Account account; 

	/**
	 * Create the panel.
	 */
	public NewTransfer() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/request.png"));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New Transfer");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		jtableTransfer = new JTable();
		scrollPane.setViewportView(jtableTransfer);
	}
	
	public NewTransfer(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		TransferModel transferModel = new TransferModel(); 
		account = (Account) values.get("account");
		String username = account.getUsername();
		List<Transfer> transfers = transferModel.find(username);
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}			
		};
		
		defaultTableModel.addColumn("Transfer Number");
		defaultTableModel.addColumn("Username");
		defaultTableModel.addColumn("Full Name");
		defaultTableModel.addColumn("From Location");
		defaultTableModel.addColumn("To Location");
		defaultTableModel.addColumn("From Department");
		defaultTableModel.addColumn("To Department");
		defaultTableModel.addColumn("From Project");
		defaultTableModel.addColumn("To Project");
		defaultTableModel.addColumn("allowance");
		defaultTableModel.addColumn("Relieving Date");
		defaultTableModel.addColumn("Joining Date");
		defaultTableModel.addColumn("Report To Manager");
		defaultTableModel.addColumn("Status");
		for(Transfer transfer:transfers) {
			defaultTableModel.addRow(new Object[] {
					transfer.getId(),transfer.getUsername(),transfer.getFullname(),transfer.getCurrentLocation(),transfer.getTransferLocation(),transfer.getCurrentDepartment(),
					transfer.getTransferDepartment(),transfer.getCurrentProject(),transfer.getTransferProject(),transfer.getAllowance(),transfer.getRelievingDate(),
					transfer.getJoiningDate(),transfer.getReportManager(),transfer.isStatus()
			});
		}
		jtableTransfer.setModel(defaultTableModel);
		jtableTransfer.getTableHeader().setReorderingAllowed(false);
		jtableTransfer.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				// TODO Auto-generated method stub
				super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				String status = (String) jtableTransfer.getModel().getValueAt(row, 13);
				if("Approved".equals(status)) {
					setBackground(Color.BLUE);
                    setForeground(Color.BLACK);
				} else if("Declined".equals(status)) {
					setBackground(Color.RED);
                    setForeground(Color.BLACK);
				} else {
					setBackground(Color.WHITE);
                    setForeground(Color.BLACK);
				}
				return this;
			}
			
		});
	}
}
