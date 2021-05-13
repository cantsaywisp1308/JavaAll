package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import Entities.Account;
import Helper.RandomHelper;
import Model.AccountModel;



public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JPasswordField jpasswordFieldPassword;
	private JTextField jtextFieldPhone;
	private JTextField jtextFieldEmail;
	private JDateChooser jdateChooserBirthday;
	private JTextField jtextFieldFullname;
	private File file;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(35,255,110)); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up Session");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/Modify.png"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(86, 6, 251, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/id-card.png"));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(6, 49, 109, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(Employee/Manager Number)");
		lblNewLabel_2.setBounds(6, 70, 182, 16);
		panel.add(lblNewLabel_2);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(127, 45, 251, 26);
		panel.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/secure.png"));
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 98, 109, 22);
		panel.add(lblNewLabel_3);
		
		JButton jbtnSignUp = new JButton("Sign Up");
		jbtnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSignUp_actionPerformed(e);
			}
		});
		jbtnSignUp.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Modify.png"));
		jbtnSignUp.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnSignUp.setBounds(20, 314, 117, 36);
		panel.add(jbtnSignUp);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/cancel.png"));
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(261, 314, 117, 36);
		panel.add(jbtnCancel);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(127, 97, 251, 26);
		panel.add(jpasswordFieldPassword);
		
		JLabel lblNewLabel_4 = new JLabel("Birthday");
		lblNewLabel_4.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/birthday-cake.png"));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(6, 201, 109, 29);
		panel.add(lblNewLabel_4);
		
		jdateChooserBirthday = new JDateChooser();
		jdateChooserBirthday.setBounds(127, 201, 251, 26);
		panel.add(jdateChooserBirthday);
		
		JLabel lblNewLabel_5 = new JLabel("Phone");
		lblNewLabel_5.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/telephone.png"));
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(6, 239, 109, 26);
		panel.add(lblNewLabel_5);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setBounds(127, 240, 251, 26);
		panel.add(jtextFieldPhone);
		jtextFieldPhone.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/email.png"));
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(6, 277, 85, 16);
		panel.add(lblNewLabel_6);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.setBounds(127, 267, 251, 26);
		panel.add(jtextFieldEmail);
		jtextFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Full Name");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(6, 146, 109, 16);
		panel.add(lblNewLabel_7);
		
		jtextFieldFullname = new JTextField();
		jtextFieldFullname.setBounds(127, 142, 251, 26);
		panel.add(jtextFieldFullname);
		jtextFieldFullname.setColumns(10);
	}
	
	private byte[] ConvertFile(String fileName) {
		FileInputStream fileInputStream = null;
		File file = new File(fileName);
		byte[] bFile = new byte[(int) file.length()];
		try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		} catch (Exception e) {
			bFile = null;
		}
		return bFile;
	}
	
	public void jbtnSignUp_actionPerformed(ActionEvent e) {
		
		try {
			Account account = new Account();
			AccountModel accountModel = new AccountModel(); 
			String username = jtextFieldUsername.getText();
			String password = org.mindrot.jbcrypt.BCrypt.hashpw(new String(jpasswordFieldPassword.getPassword()),org.mindrot.jbcrypt.BCrypt.gensalt());
			account.setUsername(username);
			account.setPassword(password);
			account.setFullName(jtextFieldFullname.getText());
			account.setBirthday(jdateChooserBirthday.getDate());
			account.setPhone(jtextFieldPhone.getText());
			account.setEmail(jtextFieldEmail.getText());
			account.setLocation("--None--");
			account.setDepartment("--None--");
			account.setProject("--None--");
			account.setPhoto(Files.readAllBytes(Paths.get("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/profile.png")));
			if(jtextFieldUsername.getText().toLowerCase().contains("employee")) {
				account.setRole("employee");
			} else if (jtextFieldUsername.getText().toLowerCase().contains("admin")){
				account.setRole("admin");
			} else if( jtextFieldUsername.getText().toLowerCase().contains("manager")) {
				account.setRole("manager");
			} else {
				account.setRole("none");
			}
			account.setSecurityNumber(RandomHelper.randomUUID())  ;
			account.setStatus(false);
			if(accountModel.add(account)) {
				JOptionPane.showMessageDialog(null, "Done !");
				Map<String, Object> values = new HashMap<String, Object>();
				values.put("username", username);
				Activation activation = new Activation(values);	
				activation.setVisible(true);	
			} else {
				JOptionPane.showMessageDialog(null, "Failed ! ");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Failed ! "); 
		}
		
	}
}
