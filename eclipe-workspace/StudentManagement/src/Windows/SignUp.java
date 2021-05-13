package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.mindrot.jbcrypt.BCrypt;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import Entities.Student;
import Helper.MailHelper;
import Helper.RandomHelper;
import Model.StudentModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JPasswordField jpasswordFieldPassword;
	private JTextField jtextFieldFullName;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JTextField jtextFieldUsername;
	private JTextField jtextFieldClass;
	private JTextField jtextFieldPhone;
	private JTextField jtextFieldEmail;
	private JDateChooser jdateChooserBirthday;

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
		setTitle("Aptech Sign Up Session");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up Session ");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Modify.png"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(126, 6, 189, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(6, 49, 83, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(6, 77, 61, 16);
		panel.add(lblNewLabel_2);
		
		jpasswordFieldPassword = new JPasswordField();
		jpasswordFieldPassword.setBounds(101, 72, 242, 26);
		panel.add(jpasswordFieldPassword);
		
		JLabel lblNewLabel_3 = new JLabel("Full Name");
		lblNewLabel_3.setBounds(6, 105, 72, 16);
		panel.add(lblNewLabel_3);
		
		jtextFieldFullName = new JTextField();
		jtextFieldFullName.setBounds(101, 100, 242, 26);
		panel.add(jtextFieldFullName);
		jtextFieldFullName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(6, 148, 61, 16);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(101, 138, 171, 26);
		panel.add(panel_1);
		
		JRadioButton jrdbtnMale = new JRadioButton("Male");
		panel_1.add(jrdbtnMale);
		buttonGroupGender.add(jrdbtnMale);
		
		JRadioButton jrdbtnFemale = new JRadioButton("Female");
		panel_1.add(jrdbtnFemale);
		buttonGroupGender.add(jrdbtnFemale);
		
		JLabel lblNewLabel_5 = new JLabel("Birthday");
		lblNewLabel_5.setBounds(6, 191, 61, 16);
		panel.add(lblNewLabel_5);
		
		jdateChooserBirthday = new JDateChooser();
		jdateChooserBirthday.setBounds(101, 181, 171, 26);
		panel.add(jdateChooserBirthday);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setToolTipText("Your Student number");
		jtextFieldUsername.setBounds(101, 44, 242, 26);
		panel.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Class");
		lblNewLabel_6.setBounds(6, 233, 61, 16);
		panel.add(lblNewLabel_6);
		
		jtextFieldClass = new JTextField();
		jtextFieldClass.setBounds(101, 228, 242, 26);
		panel.add(jtextFieldClass);
		jtextFieldClass.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Phone ");
		lblNewLabel_7.setBounds(6, 271, 61, 16);
		panel.add(lblNewLabel_7);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setBounds(101, 266, 242, 26);
		panel.add(jtextFieldPhone);
		jtextFieldPhone.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setBounds(6, 307, 61, 16);
		panel.add(lblNewLabel_8);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.setBounds(101, 302, 242, 26);
		panel.add(jtextFieldEmail);
		jtextFieldEmail.setColumns(10);
		
		JButton jbtnSignUp = new JButton("Sign Up");
		jbtnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSignUp_actionPerformed(e);
			}
		});
		jbtnSignUp.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Modify.png"));
		jbtnSignUp.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnSignUp.setBounds(50, 362, 117, 29);
		panel.add(jbtnSignUp);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Delete.png"));
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(266, 362, 117, 29);
		panel.add(jbtnCancel);
	}
	
	public void jbtnSignUp_actionPerformed(ActionEvent e) {
		String password = new String(jpasswordFieldPassword.getPassword());
		String gender = getGender();
		Student student = new Student();
		student.setUsername(jtextFieldUsername.getText());
		student.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
		student.setFullName(jtextFieldFullName.getText());
		student.setGender(gender);
		student.setBirthday(jdateChooserBirthday.getDate());
		student.setClass(jtextFieldClass.getText());
		student.setPhone(jtextFieldPhone.getText());
		student.setEmail(jtextFieldEmail.getText());
		student.setStatus(false);
		StudentModel studentModel = new StudentModel();
		if(studentModel.add(student)) {
			String securityCode = RandomHelper.randomUUID();
			String content = "Hello " + jtextFieldUsername.getText() +
					"<br>Security Code: "+ securityCode;
			JOptionPane.showMessageDialog(null, "Successfully Sign up. Please login your email to receive the activation code !");
			if(MailHelper.send("duykhang.trinh1308@gmail.com", jtextFieldEmail.getText().trim(), "Active Account", content)) {
				JOptionPane.showMessageDialog(null, "Done !");
				
			} 
		} else {
			JOptionPane.showMessageDialog(null, "Failed !");
		}
	}
	
	private String getGender() {
		Enumeration<AbstractButton> buttons = buttonGroupGender.getElements();
		while(buttons.hasMoreElements()) {
			JRadioButton jRadioButton = (JRadioButton) buttons.nextElement();
			if(jRadioButton.isSelected()) {
				return jRadioButton.getText();
			}
		}
		
		return null; 
	}
}
