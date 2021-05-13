package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel jlbLogo;
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
		contentPane.setBackground(new Color(250,8,40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		jlbLogo = new JLabel("");
		jlbLogo.setBounds(6, 8, 146, 60);
		panel.add(jlbLogo);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Aptech Vietnam");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_1.setBounds(154, 28, 280, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Profile.png"));
		lblNewLabel.setBounds(6, 93, 97, 26);
		panel.add(lblNewLabel);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(105, 93, 257, 26);
		panel.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/key.png"));
		lblNewLabel_2.setBounds(6, 138, 87, 30);
		panel.add(lblNewLabel_2);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(105, 140, 257, 26);
		panel.add(jpasswordFieldPassword);
		
		JButton jbtnLogin = new JButton("Login");
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnLogin_actionPerformed(e);
			}
		});
		jbtnLogin.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/log-in.png"));
		jbtnLogin.setBounds(6, 210, 117, 29);
		panel.add(jbtnLogin);
		
		JButton jbtnForgetPassword = new JButton("Forget Password");
		jbtnForgetPassword.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/question.png"));
		jbtnForgetPassword.setBounds(135, 210, 146, 29);
		panel.add(jbtnForgetPassword);
		
		JButton jbtnSignUp = new JButton("Sign Up");
		jbtnSignUp.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Modify.png"));
		jbtnSignUp.setBounds(293, 210, 117, 29);
		panel.add(jbtnSignUp);
		loadData(); 
	}
	
	public void loadData() {
		jlbLogo.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/aptech_logo.png"));
		int height = jlbLogo.getHeight();
		int width = jlbLogo.getWidth();
		Image image = new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/aptech_logo.png")
				.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		jlbLogo.setIcon(new ImageIcon(image));
	}
	
	public void jbtnLogin_actionPerformed(ActionEvent e) {
		String username = jtextFieldUsername.getText();
		String password = new String(jpasswordFieldPassword.getPassword());
		
	}

}
