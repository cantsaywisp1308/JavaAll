package Helper;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class MailHelper {

	public static boolean send(String from, String to, String subject, String content) {
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
			 Message message = new MimeMessage(session);
			 message.setFrom(new InternetAddress(from));
			 message.setRecipient(RecipientType.TO, new InternetAddress(to));
			 message.setSubject(subject);
			 message.setContent(content, "text/html");
			 message.setSentDate(new Date());
			 
			 Transport.send(message); 
			 return true; 
		} catch(Exception e) {
			System.err.print(e.getMessage());
			return false; 
		}
	}
}
