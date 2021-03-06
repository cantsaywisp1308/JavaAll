package Windows;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Entities.Transfer;
import Model.TransferModel;

public class RequestList extends JPanel {
	private static JTable jtableRequestList;

	/**
	 * Create the panel.
	 */
	public RequestList() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/request.png"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Request List");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		jtableRequestList = new JTable();
		jtableRequestList.addMouseListener(new MouseAdapter() {
			@Override
			 public void mouseReleased(MouseEvent e) 
	         {
	             int r = jtableRequestList.rowAtPoint(e.getPoint());
	             if (r >= 0 && r < jtableRequestList.getRowCount()) {
	            	 jtableRequestList.setRowSelectionInterval(r, r);
	             } else {
	            	 jtableRequestList.clearSelection();
	             }
	             
	             //row index is found...
	             int rowindex = jtableRequestList.getSelectedRow();
	             if (rowindex < 0)
	                 return;
	             if (e.isPopupTrigger() && e.getComponent() instanceof JTable ) {
	                 JPopupMenu popup = createYourPopUp(rowindex,jtableRequestList);
	                 popup.show(e.getComponent(), e.getX(), e.getY());
	             }
	         }
		});
		scrollPane.setViewportView(jtableRequestList);
		loadData(); 
	}
	
	public static JPopupMenu createYourPopUp(int rowindex, JTable jtableRequestList) {
	     JPopupMenu popup = new JPopupMenu();
	     JMenuItem  approve = new JMenuItem("Approve/Decline");       
	     JMenuItem  delete = new JMenuItem("Delete");
	     JMenuItem  edit = new JMenuItem("Edit");
	     
	 approve.addActionListener(new ActionListener() {
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 int selectedRow = jtableRequestList.getSelectedRow();
		int id = Integer.parseInt(jtableRequestList.getValueAt(selectedRow, 0).toString());
			Map<String,Object> values = new HashMap<String, Object>();
			values.put("id", id);
			Approve approve = new Approve(values);
			approve.setVisible(true);
			//JFrameUpdateCustomer jFrameUpdateCustomer = new JFrameUpdateCustomer(values);
			//jFrameUpdateCustomer.setVisible(true);
			//setVisible(false);
	 
	 }
	  });
	 delete.addActionListener(new ActionListener() {
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 TransferModel transferModel = new TransferModel();
		 int selectedRow2 = jtableRequestList.getSelectedRow();
			int id = Integer.parseInt(jtableRequestList.getValueAt(selectedRow2, 0).toString());
			Map<String,Object> values = new HashMap<String, Object>();
			values.put("id",id);
			int result = JOptionPane.showConfirmDialog(null, "Are you sure to delete the item?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) {
				if(transferModel.delete(id)) {
					loadDataToTable(transferModel.findAll()); 
					JOptionPane.showMessageDialog(null, "Delete Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Fail to delete");
				}
			}		 
		 //JFrameAddOrder jframeAddOrder = new JFrameAddOrder(values);
		  //jframeAddOrder.setVisible(true);
		  //setVisible(false);
	 // JOptionPane.showMessageDialog(null, "");
	  }
	 });
	 
	 edit.addActionListener(new ActionListener() {

//		@Override
		 public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int selectedRow2 = jtableRequestList.getSelectedRow();
			int id = Integer.parseInt(jtableRequestList.getValueAt(selectedRow2, 0).toString());
			Map<String,Object> values = new HashMap<String, Object>();
			values.put("id",id);
			EditTransfer editTransfer = new EditTransfer(values);
			editTransfer.setVisible(true);
		}
		 
	 });
	     popup.add(approve);
	     popup.add(delete);
	     popup.add(edit); 
	     return popup;
	}
	
	private void loadData() {
		TransferModel transferModel = new TransferModel();
		loadDataToTable(transferModel.findAll()); 
	}
	
	private static void loadDataToTable(List<Transfer> transfers) {
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
		jtableRequestList.setModel(defaultTableModel);
		jtableRequestList.getTableHeader().setReorderingAllowed(false);
		jtableRequestList.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				// TODO Auto-generated method stub
				super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				String status = (String) jtableRequestList.getModel().getValueAt(row, 13);
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


