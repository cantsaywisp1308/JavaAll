package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.AccountModel;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(37, 44, 86, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(37, 104, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(135, 39, 194, 26);
		contentPane.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(135, 99, 194, 26);
		contentPane.add(jpasswordFieldPassword);
		
		JButton jbtnLogin = new JButton("Login");
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnLogin_actionPerformed(e);
			}
		});
		jbtnLogin.setBounds(61, 180, 117, 29);
		contentPane.add(jbtnLogin);
	}
	
	public void jbtnLogin_actionPerformed(ActionEvent e) {
		AccountModel accountModel = new AccountModel();
		String username = jtextFieldUsername.getText().trim();
		String password = new String(jpasswordFieldPassword.getPassword());
		if(accountModel.login(username, password) == null) {
			JOptionPane.showMessageDialog(null, "Invalid");
		} else {
			Map<String, Object>values = new HashMap<String, Object>();
			values.put("username", username);
			Main2 main2 = new Main2(values);
			main2.setVisible(true);
		}
	}

}
