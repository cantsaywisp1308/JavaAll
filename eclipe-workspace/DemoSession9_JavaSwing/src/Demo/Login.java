package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Account;
import Models.AccountModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
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
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(21, 65, 78, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(21, 118, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(100, 60, 285, 26);
		contentPane.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(100, 113, 285, 26);
		contentPane.add(jpasswordFieldPassword);
		
		JButton jbtnLogin = new JButton("Login");
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnLogin_actionPerformed(e); 
			}
		});
		jbtnLogin.setBounds(51, 187, 117, 29);
		contentPane.add(jbtnLogin);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setBounds(299, 187, 117, 29);
		contentPane.add(jbtnCancel);
	}
	
	private void jbtnLogin_actionPerformed(ActionEvent e) {
		try {
			String username = jtextFieldUsername.getText();
			String password = new String(jpasswordFieldPassword.getPassword());
			AccountModel accountModel = new AccountModel();
			Account account = accountModel.login(username, password);
			if(account != null) {
				Map<String, Object> values = new HashMap<String, Object>();
				values.put("account", account); 
				Main main = new Main(values);
				main.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Failed!", "Login Failed", JOptionPane.ERROR_MESSAGE);
			}
		} catch(Exception e1) {
			System.err.print(e1.getMessage());
		}
	}
	
	
}
