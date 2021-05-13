package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.mindrot.jbcrypt.BCrypt;

import Entities.Account;
import Model.AccountModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class AddAccount extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JPasswordField jpasswordFieldPassword;
	private JTextField jtextFieldFullName;
	private JTable jtableAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccount frame = new AddAccount();
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
	public AddAccount() {
		setTitle("Add Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(6, 34, 88, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(6, 91, 88, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name");
		lblNewLabel_2.setBounds(6, 156, 88, 16);
		contentPane.add(lblNewLabel_2);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(106, 29, 235, 26);
		contentPane.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(106, 86, 235, 26);
		contentPane.add(jpasswordFieldPassword);
		
		jtextFieldFullName = new JTextField();
		jtextFieldFullName.setBounds(106, 151, 235, 26);
		contentPane.add(jtextFieldFullName);
		jtextFieldFullName.setColumns(10);
		
		JButton jbtnAdd = new JButton("Add");
		jbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnAdd_actionPerformed(e);
			}
		});
		jbtnAdd.setBounds(47, 197, 117, 29);
		contentPane.add(jbtnAdd);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(264, 197, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 265, 438, 172);
		contentPane.add(scrollPane);
		
		jtableAccount = new JTable();
		scrollPane.setViewportView(jtableAccount);
		loadData(); 
	}
	private void loadData() {
		AccountModel accountModel = new AccountModel();
		fillDataToTable(accountModel.findAll());
	}
	private void jbtnAdd_actionPerformed(ActionEvent e) {
		List<Account> accounts = new ArrayList<Account>();
		AccountModel accountModel = new AccountModel();
		String username = jtextFieldUsername.getText();
		if(accountModel.find(username) != null ) {
			JOptionPane.showMessageDialog(null, "Username existed");
		} else {
			String password = new String(jpasswordFieldPassword.getPassword());
			String fullname = jtextFieldFullName.getText();
			Account account = new Account();
			account.setUsername(username);
			account.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
			account.setFullname(fullname);
			if(accountModel.create(account)) {
				JOptionPane.showMessageDialog(null, "Done !");
				fillDataToTable(accountModel.findAll());
			} else {
				JOptionPane.showMessageDialog(null, "Failed !");
			}
		}
		
	}
	
	private void fillDataToTable(List<Account> accounts) {
		DefaultTableModel defaultTableModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; 
			}
		};
		defaultTableModel.addColumn("Username");
		defaultTableModel.addColumn("Fullname");
		for(Account account1 :accounts) {
			defaultTableModel.addRow(new Object [] {
					account1.getUsername(), account1.getFullname()
			});
		}
		jtableAccount.setModel(defaultTableModel);
		jtableAccount.getTableHeader().setReorderingAllowed(false );		
	}

	
	
}
