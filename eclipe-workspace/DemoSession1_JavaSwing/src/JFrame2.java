

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField jusernameFieldUsername;
	private JPasswordField jpasswordFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame2 frame = new JFrame2();
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
	public JFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(6, 6, 86, 24);
		contentPane.add(lblNewLabel);
		
		jusernameFieldUsername = new JTextField();
		jusernameFieldUsername.setEditable(false);
		jusernameFieldUsername.setBounds(80, 5, 130, 26);
		contentPane.add(jusernameFieldUsername);
		jusernameFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(6, 47, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(80, 42, 130, 26);
		contentPane.add(jpasswordFieldPassword);
		
		JButton jbuttonSave = new JButton("Save");
		jbuttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSave_actionPerformed(e);
			}
		});
		jbuttonSave.setBounds(59, 103, 117, 29);
		contentPane.add(jbuttonSave);
		
		loadData();
	}
	
	public void loadData() {
		jusernameFieldUsername.setText("Acc1");
	}
	
	public void jbuttonSave_actionPerformed(ActionEvent e) {
		System.out.println("Hello! "); 
		String username = jusernameFieldUsername.getText();
		System.out.println(username); 
		String password = new String(jpasswordFieldPassword.getPassword());
		System.out.println("password: "+password); 
	}
}
