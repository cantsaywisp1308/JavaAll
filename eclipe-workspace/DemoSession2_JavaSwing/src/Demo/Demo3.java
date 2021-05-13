package Demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Account;
import Model.AccountModel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Demo3 extends JFrame {

	private JPanel contentPane;
	private JTextField JtextFieldUsername;
	private JPasswordField jpasswordFieldPassword;
	private JTextField jtextFieldFullname;
	private JPanel jpanelRoles;
	private JTextField jtextFieldDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 frame = new Demo3();
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
	public Demo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JLabelUsername = new JLabel("Username");
		JLabelUsername.setBounds(34, 24, 78, 22);
		contentPane.add(JLabelUsername);
		
		JtextFieldUsername = new JTextField();
		JtextFieldUsername.setColumns(10);
		JtextFieldUsername.setBounds(124, 22, 259, 26);
		contentPane.add(JtextFieldUsername);
		
		JLabel JLabelPassword = new JLabel("Password");
		JLabelPassword.setBounds(34, 58, 78, 22);
		contentPane.add(JLabelPassword);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(124, 60, 259, 26);
		contentPane.add(jpasswordFieldPassword);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(34, 92, 78, 22);
		contentPane.add(lblFullName);
		
		jtextFieldFullname = new JTextField();
		jtextFieldFullname.setColumns(10);
		jtextFieldFullname.setBounds(124, 92, 259, 26);
		contentPane.add(jtextFieldFullname);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(34, 130, 78, 22);
		contentPane.add(lblDescription);
		
		jtextFieldDescription = new JTextField();
		jtextFieldDescription.setColumns(10);
		jtextFieldDescription.setBounds(124, 130, 259, 79);
		contentPane.add(jtextFieldDescription);
		
		JLabel lblNewLabel = new JLabel("Roles");
		lblNewLabel.setBounds(34, 218, 61, 16);
		contentPane.add(lblNewLabel);
		
		jpanelRoles = new JPanel();
		jpanelRoles.setBounds(124, 220, 267, 106);
		contentPane.add(jpanelRoles);
		jpanelRoles.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Role 1");
		chckbxNewCheckBox.setBounds(6, 6, 128, 23);
		jpanelRoles.add(chckbxNewCheckBox);
		
		JCheckBox chckbxRole = new JCheckBox("Role 2");
		chckbxRole.setBounds(6, 41, 128, 23);
		jpanelRoles.add(chckbxRole);
		
		JCheckBox chckbxRole_1 = new JCheckBox("Role 4");
		chckbxRole_1.setBounds(133, 6, 128, 23);
		jpanelRoles.add(chckbxRole_1);
		
		JCheckBox chckbxRole_2 = new JCheckBox("Role 5");
		chckbxRole_2.setBounds(133, 41, 128, 23);
		jpanelRoles.add(chckbxRole_2);
		
		JCheckBox chckbxRole_3 = new JCheckBox("Role 3");
		chckbxRole_3.setBounds(6, 76, 128, 23);
		jpanelRoles.add(chckbxRole_3);
		
		JCheckBox chckbxRole_4 = new JCheckBox("Role 6");
		chckbxRole_4.setBounds(133, 76, 128, 23);
		jpanelRoles.add(chckbxRole_4);
		
		JButton jbuttonSave = new JButton("Save");
		jbuttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSave_actionPerformed(e);
			}
		});
		jbuttonSave.setBounds(124, 338, 117, 29);
		contentPane.add(jbuttonSave);
	}
	
	public void jbuttonSave_actionPerformed(ActionEvent e) {
		Account account = new Account();
		account.setUsername(JtextFieldUsername.getText());
		account.setPassword(new String(jpasswordFieldPassword.getPassword()));
		account.setFullname(jtextFieldFullname.getText());
		account.setDescription(jtextFieldDescription.getText());
		for(Component component:jpanelRoles.getComponents()) {
			JCheckBox jcheckbox = (JCheckBox) component;
			if(jcheckbox.isSelected()) {
				account.getRoles().add(jcheckbox.getText());
			}
		}
		AccountModel accountModel = new AccountModel();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
		String filename = simpleDateFormat.format(new Date()) + "doc";
		if(accountModel.save(account, "src/Demo/" + filename)) {
			System.out.println("Done");
		} else {
			System.out.println("Failed");
		}
	}

}
