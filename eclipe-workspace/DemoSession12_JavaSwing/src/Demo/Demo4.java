package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;

import org.mindrot.jbcrypt.BCrypt;

import Entities.Account;
import Helper.MailHelper;
import Helper.RandomHelper;
import Model.AccountModel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class Demo4 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JPasswordField jpasswordFieldPassword;
	private JLabel jlblPhoto;
	private File photo; 
	private JTextField jtextFieldFullName;
	private JTextField jtextFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo4 frame = new Demo4();
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
	public Demo4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(6, 47, 75, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(95, 42, 245, 26);
		contentPane.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(6, 103, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(95, 98, 245, 26);
		contentPane.add(jpasswordFieldPassword);
		
		JLabel lblNewLabel_2 = new JLabel("Photo");
		lblNewLabel_2.setBounds(6, 155, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton jbtnBrowse = new JButton("Browse");
		jbtnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnBrowse_actionPerformed(e);
			}
		});
		jbtnBrowse.setBounds(95, 150, 117, 29);
		contentPane.add(jbtnBrowse);
		
		jlblPhoto = new JLabel("");
		jlblPhoto.setBorder(new LineBorder(null));
		jlblPhoto.setBounds(95, 191, 130, 149);
		contentPane.add(jlblPhoto);
		
		JButton jbtnAdd = new JButton("Add");
		jbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnAdd_actionPerformed(e); 
			}
		});
		jbtnAdd.setBounds(38, 349, 117, 29);
		contentPane.add(jbtnAdd);
		
		JLabel lblNewLabel_3 = new JLabel("Full Name");
		lblNewLabel_3.setBounds(0, 75, 81, 16);
		contentPane.add(lblNewLabel_3);
		
		jtextFieldFullName = new JTextField();
		jtextFieldFullName.setBounds(95, 70, 245, 26);
		contentPane.add(jtextFieldFullName);
		jtextFieldFullName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(6, 127, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.setBounds(95, 122, 245, 26);
		contentPane.add(jtextFieldEmail);
		jtextFieldEmail.setColumns(10);
	}
	
	public void jbtnBrowse_actionPerformed(ActionEvent e) {
		JFileChooser jFileChooser = new  JFileChooser();
		jFileChooser.setDialogTitle("Upload Files");
		jFileChooser.setMultiSelectionEnabled(false);
		int result = jFileChooser.showOpenDialog(null);
		if (result == jFileChooser.APPROVE_OPTION) {
			photo = jFileChooser.getSelectedFile();
			jlblPhoto.setIcon(new ImageIcon(photo.getAbsolutePath()));
		}
	}
	
	public void jbtnAdd_actionPerformed(ActionEvent e) {
		try {
			String securityCode = RandomHelper.randomUUID(); 
			Account account = new Account();
			String username = jtextFieldUsername.getText(); 
			account.setUsername(username);
			String password = new String(jpasswordFieldPassword.getPassword()); 
			account.setPassword(BCrypt.haspw(password, BCrypt.gensalt()));
			account.setPhoto(Files.readAllBytes(Paths.get(photo.getAbsolutePath())));
			account.setSecurityCode(securityCode);
			account.setStatus(false);
			account.setFullName(jtextFieldFullName.getText());
			String email = jtextFieldEmail.getText();
			account.setEmail(email);
			
			AccountModel accountModel = new AccountModel();
			if(accountModel.create(account)) {
				//Gửi email 
				String content ="Hello " + jtextFieldUsername.getText() +
						"<br>Security Code: "+ securityCode;
				if(MailHelper.send("duykhang.trinh1308@gmail.com", email, "Active Account", content)) {
					JOptionPane.showMessageDialog(null, "Done !");
				} 
			} else {
				JOptionPane.showMessageDialog(null, "Failed !");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
