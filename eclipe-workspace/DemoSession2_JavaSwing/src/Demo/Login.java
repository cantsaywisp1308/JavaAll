package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField JTextFieldUsername;
	private JPasswordField JpasswordFieldPassword;
	private JLabel JLabelMessage;

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
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JLabelUsername = new JLabel("Username");
		JLabelUsername.setBounds(6, 6, 78, 22);
		contentPane.add(JLabelUsername);
		
		JTextFieldUsername = new JTextField();
		JTextFieldUsername.setBounds(96, 4, 259, 26);
		contentPane.add(JTextFieldUsername);
		JTextFieldUsername.setColumns(10);
		
		JLabel JLabelPassword = new JLabel("Password");
		JLabelPassword.setBounds(6, 40, 78, 22);
		contentPane.add(JLabelPassword);
		
		JButton JButtonLogin = new JButton("Login");
		JButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonLogin_actionPerformed(e);
				
			}
		});
		JButtonLogin.setBounds(36, 107, 117, 29);
		contentPane.add(JButtonLogin);
		
		JButton JButtonReset = new JButton("Reset");
		JButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonReset_actionPerformed(e);
			}
		});
		JButtonReset.setBounds(234, 107, 117, 29);
		contentPane.add(JButtonReset);
		
		JLabelMessage = new JLabel("");
		JLabelMessage.setBounds(36, 166, 319, 22);
		contentPane.add(JLabelMessage);
		
		JpasswordFieldPassword = new JPasswordField();
		JpasswordFieldPassword.setBounds(96, 42, 259, 26);
		contentPane.add(JpasswordFieldPassword);
	}
	
	private void jbuttonLogin_actionPerformed(ActionEvent e) {
		String username = JTextFieldUsername.getText().trim();
		String password = new String(JpasswordFieldPassword.getPassword());
		if((username.equalsIgnoreCase("abc") && password.equalsIgnoreCase("def"))) {
			JLabelMessage.setText("Success");
		} else {
			JLabelMessage.setText("Failed");
		}
	}
	
	private void jbuttonReset_actionPerformed(ActionEvent e) {
		JTextFieldUsername.setText("");
		JpasswordFieldPassword.setText("");
	}

}
