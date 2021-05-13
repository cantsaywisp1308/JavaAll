package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Account;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Profile extends JFrame {


	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JPasswordField jpasswordFieldPassword;
	private JTextField jtextFieldRole;
	
	private Map<String, Object> values =  new HashMap<String, Object>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setTitle("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(6, 48, 78, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setColumns(10);
		jtextFieldUsername.setBounds(85, 43, 285, 26);
		contentPane.add(jtextFieldUsername);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(6, 92, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(85, 87, 285, 26);
		contentPane.add(jpasswordFieldPassword);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setBounds(6, 133, 78, 16);
		contentPane.add(lblRole);
		
		jtextFieldRole = new JTextField();
		jtextFieldRole.setColumns(10);
		jtextFieldRole.setBounds(85, 128, 285, 26);
		contentPane.add(jtextFieldRole);
	}
	
	public Profile(Map<String, Object> values) {
		this();
		this.values = values; 
		loadData(); 
	}
	
	private void loadData() {
		Account account = (Account) values.get("account");
		jtextFieldUsername.setText(account.getUsername());
		jtextFieldRole.setText(account.getRole());
	}

}
