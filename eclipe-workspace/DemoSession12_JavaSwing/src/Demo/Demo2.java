package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldTo;
	private JTextField jtextFieldSubject;
	private JButton jbtnSend;
	private JTextArea jtextAreaContent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 frame = new Demo2();
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
	public Demo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("To");
		lblNewLabel.setBounds(6, 24, 61, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldTo = new JTextField();
		jtextFieldTo.setBounds(79, 19, 282, 26);
		contentPane.add(jtextFieldTo);
		jtextFieldTo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Subject");
		lblNewLabel_1.setBounds(6, 60, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldSubject = new JTextField();
		jtextFieldSubject.setBounds(79, 55, 282, 26);
		contentPane.add(jtextFieldSubject);
		jtextFieldSubject.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Content");
		lblNewLabel_2.setBounds(6, 101, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jtextAreaContent = new JTextArea();
		jtextAreaContent.setBounds(79, 93, 282, 122);
		contentPane.add(jtextAreaContent);
		
		jbtnSend = new JButton("Send");
		jbtnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSend_actionPerformed(e);
			}
		});
		jbtnSend.setBounds(79, 265, 117, 29);
		contentPane.add(jbtnSend);
	}
	
	public void jbtnSend_actionPerformed(ActionEvent e) {
		try {
			Properties properties = new Properties();
			 properties.put("mail.smtp.auth", "true");
			 properties.put("mail.smtp.starttls.enable", "true");
			 properties.put("mail.smtp.host", "smtp.gmail.com");
			 properties.put("mail.smtp.port", "587");
			 Session session = Session.getDefaultInstance(properties, new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication("duykhang.trinh1308@gmail.com", "foneta1024KHANG");
				}
				 
			 }); 
			 
			 //Khai báo mail 
			 Message message = new MimeMessage(session);
			 message.setFrom(new InternetAddress("duykhang.trinh1308@gmail.com"));
			 message.setRecipient(RecipientType.TO, new InternetAddress(jtextFieldTo.getText()));
			 message.setSubject(jtextFieldSubject.getText());
			 message.setContent(jtextAreaContent.getText(), "text/html");
			 message.setSentDate(new Date());
			 
			 Transport.send(message); 
			 JOptionPane.showMessageDialog(null, "Done !");
		} catch(Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
			System.err.print(e1.getMessage());
		}
	}
}
