package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Transfer;
import Helper.MailHelper;
import Model.AccountModel;
import Model.TransferModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Approve extends JFrame {

	private JPanel contentPane;
	private JLabel jlblEmployeeName;
	private JLabel jlblEmployeeNumber;
	private JLabel jlblTransferNumber;
	private JLabel lblNewLabel_6_1;
	private JLabel lblNewLabel_6;
	private JLabel jlblEmailReport;
	private JLabel jlblAllowance;
	private Map<String, Object>values = new HashMap<String, Object>();
	private JLabel jlblLocationFrom;
	private JLabel jlblDepartmentFrom;
	private JLabel jlblProjectFrom;
	private JLabel jlblLocationTo;
	private JLabel jlblDepartmentTo;
	private JLabel jlblProjectTo;
	private int id; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Approve frame = new Approve();
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
	public Approve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Transfer Number");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(6, 6, 122, 16);
		panel.add(lblNewLabel_2);
		
		jlblTransferNumber = new JLabel("");
		jlblTransferNumber.setBounds(140, 7, 155, 16);
		panel.add(jlblTransferNumber);
		
		JLabel lblNewLabel_3 = new JLabel("Employee Number");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 34, 132, 16);
		panel.add(lblNewLabel_3);
		
		jlblEmployeeNumber = new JLabel("");
		jlblEmployeeNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblEmployeeNumber.setBounds(150, 35, 252, 16);
		panel.add(jlblEmployeeNumber);
		
		JLabel lblNewLabel_4 = new JLabel("Employee Name");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(6, 62, 122, 16);
		panel.add(lblNewLabel_4);
		
		jlblEmployeeName = new JLabel("");
		jlblEmployeeName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblEmployeeName.setBounds(140, 63, 262, 16);
		panel.add(jlblEmployeeName);
		
		JLabel lblNewLabel_5 = new JLabel("From");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_5.setBounds(6, 101, 61, 16);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Location");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(6, 129, 71, 16);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_6_1 = new JLabel("Department");
		lblNewLabel_6_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(6, 173, 106, 16);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Project");
		lblNewLabel_6_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6_2.setBounds(6, 214, 106, 16);
		panel.add(lblNewLabel_6_2);
		
		jlblLocationFrom = new JLabel("");
		jlblLocationFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblLocationFrom.setBounds(84, 129, 186, 16);
		panel.add(jlblLocationFrom);
		
		jlblDepartmentFrom = new JLabel("");
		jlblDepartmentFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblDepartmentFrom.setBounds(95, 173, 186, 16);
		panel.add(jlblDepartmentFrom);
		
		jlblProjectFrom = new JLabel("");
		jlblProjectFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblProjectFrom.setBounds(67, 214, 186, 16);
		panel.add(jlblProjectFrom);
		
		JLabel lblNewLabel_5_1 = new JLabel("To");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(289, 101, 61, 16);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_3 = new JLabel("Location");
		lblNewLabel_6_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6_3.setBounds(282, 130, 71, 16);
		panel.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Department");
		lblNewLabel_6_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6_1_1.setBounds(282, 174, 106, 16);
		panel.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Project");
		lblNewLabel_6_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6_2_1.setBounds(282, 215, 77, 16);
		panel.add(lblNewLabel_6_2_1);
		
		jlblLocationTo = new JLabel("");
		jlblLocationTo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblLocationTo.setBounds(356, 130, 186, 16);
		panel.add(jlblLocationTo);
		
		jlblDepartmentTo = new JLabel("");
		jlblDepartmentTo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblDepartmentTo.setBounds(372, 174, 176, 16);
		panel.add(jlblDepartmentTo);
		
		jlblProjectTo = new JLabel("");
		jlblProjectTo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblProjectTo.setBounds(356, 215, 186, 16);
		panel.add(jlblProjectTo);
		
		JLabel lblNewLabel_7 = new JLabel("Allowance");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(6, 266, 106, 16);
		panel.add(lblNewLabel_7);
		
		jlblAllowance = new JLabel("");
		jlblAllowance.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblAllowance.setBounds(140, 267, 155, 16);
		panel.add(jlblAllowance);
		
		JButton jbtnApprove = new JButton("Approve");
		jbtnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnApprove_actionPerformed(e);
			}
		});
		jbtnApprove.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		jbtnApprove.setBounds(67, 380, 117, 29);
		panel.add(jbtnApprove);
		
		JLabel lblNewLabel_9 = new JLabel("Email Report: ");
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(6, 307, 106, 16);
		panel.add(lblNewLabel_9);
		
		jlblEmailReport = new JLabel("");
		jlblEmailReport.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblEmailReport.setBounds(124, 308, 226, 16);
		panel.add(jlblEmailReport);
		
		JButton jbtnDecline = new JButton("Decline");
		jbtnDecline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnDecline_actionPerformed(e);
			}
		});
		jbtnDecline.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		jbtnDecline.setBounds(372, 381, 117, 29);
		panel.add(jbtnDecline);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/decision.png"));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Approve/Decline");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
	}
	
	public void jbtnApprove_actionPerformed(ActionEvent e) {
		TransferModel transferModel = new TransferModel(); 	
		AccountModel accountModel = new AccountModel(); 
		if(transferModel.approve(id)) {
			Transfer transfer = transferModel.find(id); 
			if(accountModel.updatePosition(jlblLocationTo.getText(), jlblDepartmentTo.getText(), jlblProjectTo.getText(), accountModel.find(transfer.getUsername()).getUsername())) {
				String content ="Dear Sir/Madam, " +
						"<br>You have been approved with  : "+ transfer.getId() +
						"<br>You will move to " + transfer.getTransferLocation() + 
						"<br> Department: "+ transfer.getTransferDepartment()  + 
						"<br> Project: " + transfer.getTransferProject() +
						"<br> Allowance: " + transfer.getAllowance() +
						"<br> Relieving Date: " + transfer.getRelievingDate() + 
						"<br> Joining Date " + transfer.getJoiningDate() + 
						"<br> The request is in the Request List";
				MailHelper.send("duykhang.trinh1308@gmail.com", accountModel.find(transfer.getUsername()).getEmail(), "Approved Transfer", content);
				JOptionPane.showMessageDialog(null, "Approval Sent");
			}
			
		}
	}
	
	public void jbtnDecline_actionPerformed(ActionEvent e) {
		TransferModel transferModel = new TransferModel(); 	
		AccountModel accountModel = new AccountModel(); 
		if(transferModel.declined(id)) {
			Transfer transfer = transferModel.find(id); 
			if(accountModel.updatePosition(jlblLocationFrom.getText(), jlblDepartmentFrom.getText(), jlblProjectFrom.getText(), accountModel.find(transfer.getUsername()).getUsername())) {
				String content ="Dear Sir/Madam, " +
						"<br>You have been decline with  : "+ transfer.getId() +
						"<br>You will stay at " + transfer.getCurrentLocation() + 
						"<br> Department: "+ transfer.getCurrentDepartment()  + 
						"<br> Project: " + transfer.getCurrentProject() +  
						"<br> The request is in the Request List";
				MailHelper.send("duykhang.trinh1308@gmail.com", accountModel.find(transfer.getUsername()).getEmail(), "Declined Transfer", content);
				JOptionPane.showMessageDialog(null, "Decline Letter Sent");
			}
		}
	}
	
	public Approve(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		id = (int) values.get("id");
		TransferModel transferModel = new TransferModel();
		Transfer transfer = transferModel.find(id);
		jlblTransferNumber.setText(String.valueOf(transfer.getId()));
		jlblEmployeeNumber.setText(transfer.getUsername());
		jlblEmployeeName.setText(transfer.getFullname());
		jlblLocationFrom.setText(transfer.getCurrentLocation());
		jlblDepartmentFrom.setText(transfer.getCurrentDepartment());
		jlblProjectFrom.setText(transfer.getCurrentProject());
		jlblLocationTo.setText(transfer.getTransferLocation());
		jlblDepartmentTo.setText(transfer.getTransferDepartment());
		jlblProjectTo.setText(transfer.getTransferProject());
		jlblAllowance.setText(String.valueOf(transfer.getAllowance()));
		jlblEmailReport.setText(transfer.getReportManager());
	}
}
