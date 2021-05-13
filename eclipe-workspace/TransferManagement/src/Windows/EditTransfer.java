package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Transfer;
import Model.TransferModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditTransfer extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldAllowance;
	private Map<String, Object>values = new HashMap<String, Object>();
	private int id; 
	private JLabel jlblEmployeeNumber;
	private JLabel jlblFullName;
	private JLabel jlbLocationFrom;
	private JLabel jlblDepartmentFrom;
	private JLabel jlblProjectFrom;
	private JLabel jlblLocationTo;
	private JLabel jlblDepartmentTo;
	private JLabel jlblProjectTo;
	private JButton jbtnSave;
	private JButton jbtnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditTransfer frame = new EditTransfer();
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
	public EditTransfer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Modify.png"));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Edit Transfer");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Number");
		lblNewLabel_2.setBounds(6, 6, 120, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Full Name");
		lblNewLabel_3.setBounds(6, 34, 108, 16);
		panel.add(lblNewLabel_3);
		
		jlblEmployeeNumber = new JLabel("");
		jlblEmployeeNumber.setBounds(138, 6, 204, 16);
		panel.add(jlblEmployeeNumber);
		
		jlblFullName = new JLabel("");
		jlblFullName.setBounds(138, 34, 204, 16);
		panel.add(jlblFullName);
		
		JLabel lblNewLabel_5 = new JLabel("From");
		lblNewLabel_5.setBounds(6, 62, 61, 16);
		panel.add(lblNewLabel_5);
		
		jlbLocationFrom = new JLabel("");
		jlbLocationFrom.setBounds(79, 62, 120, 16);
		panel.add(jlbLocationFrom);
		
		JLabel lblNewLabel_7 = new JLabel("To");
		lblNewLabel_7.setBounds(6, 90, 61, 16);
		panel.add(lblNewLabel_7);
		
		jlblDepartmentFrom = new JLabel("");
		jlblDepartmentFrom.setBounds(211, 62, 108, 16);
		panel.add(jlblDepartmentFrom);
		
		jlblProjectFrom = new JLabel("");
		jlblProjectFrom.setBounds(331, 62, 108, 16);
		panel.add(jlblProjectFrom);
		
		jlblLocationTo = new JLabel("");
		jlblLocationTo.setBounds(79, 90, 120, 16);
		panel.add(jlblLocationTo);
		
		jlblDepartmentTo = new JLabel("");
		jlblDepartmentTo.setBounds(211, 90, 120, 16);
		panel.add(jlblDepartmentTo);
		
		jlblProjectTo = new JLabel("");
		jlblProjectTo.setBounds(331, 90, 108, 16);
		panel.add(jlblProjectTo);
		
		JLabel lblNewLabel_9 = new JLabel("Allowance");
		lblNewLabel_9.setBounds(6, 123, 85, 16);
		panel.add(lblNewLabel_9);
		
		jtextFieldAllowance = new JTextField();
		jtextFieldAllowance.setBounds(89, 118, 204, 26);
		panel.add(jtextFieldAllowance);
		jtextFieldAllowance.setColumns(10);
		
		jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e); 
			}
		});
		jbtnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnSave.setBounds(29, 247, 117, 29);
		panel.add(jbtnSave);
		
		jbtnCancel = new JButton("Cancel");
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(322, 247, 117, 29);
		panel.add(jbtnCancel);
	}
	
	public void jbtnSave_actionPerformed(ActionEvent e) {
		TransferModel transferModel = new TransferModel();
		int allowance = Integer.parseInt(jtextFieldAllowance.getText());
		if(transferModel.update(id, allowance)) {
			JOptionPane.showMessageDialog(null, "Update successfully");
		} else {
			JOptionPane.showMessageDialog(null, "Failed to Update");
		}
	}
	
	public EditTransfer(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		id = (int) values.get("id");
		TransferModel transferModel = new TransferModel();
		Transfer transfer = transferModel.find(id);
		jlblEmployeeNumber.setText(transfer.getUsername());
		jlblFullName.setText(transfer.getFullname());
		jlbLocationFrom.setText(transfer.getCurrentLocation());
		jlblDepartmentFrom.setText(transfer.getCurrentDepartment());
		jlblProjectFrom.setText(transfer.getCurrentProject());
		jlblLocationTo.setText(transfer.getTransferLocation());
		jlblDepartmentTo.setText(transfer.getTransferDepartment());
		jlblProjectTo.setText(transfer.getTransferProject());
	}
}
