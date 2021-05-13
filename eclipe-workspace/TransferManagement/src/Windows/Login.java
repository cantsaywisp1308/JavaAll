package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Account;
import Model.AccountModel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JPasswordField jpasswordFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(35,255,110));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Session");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/log-in.png"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 6, 156, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(6, 62, 73, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(Employee/Manager Number)");
		lblNewLabel_2.setBounds(6, 94, 182, 16);
		panel.add(lblNewLabel_2);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(91, 66, 286, 26);
		panel.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 122, 73, 16);
		panel.add(lblNewLabel_3);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(91, 122, 286, 26);
		panel.add(jpasswordFieldPassword);
		
		JButton jbtnLogin = new JButton("Login");
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnLogin_actionPerformed(e);
			}
		});
		jbtnLogin.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/log-in.png"));
		jbtnLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		jbtnLogin.setBounds(39, 184, 117, 29);
		panel.add(jbtnLogin);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/cancel.png"));
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(260, 186, 117, 29);
		panel.add(jbtnCancel);
	}
	
	public void jbtnLogin_actionPerformed(ActionEvent e) {
		try {
			AccountModel accountModel = new AccountModel();
			String username = jtextFieldUsername.getText();
			String password = new String(jpasswordFieldPassword.getPassword());
			if(accountModel.login(username, password)!= null ) {
				JOptionPane.showMessageDialog(null, "Success! ");
				Account account = accountModel.find(username);
				Map<String, Object>values = new HashMap<String, Object >();
				values.put("account", account);
				MainWindow mainWindow = new MainWindow(values);
				mainWindow.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Failed ! ");
			}
			
		} catch(Exception e1) {
			System.err.println(e1.getMessage());
		}
		
	}
}
