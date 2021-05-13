package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.AccountModel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Activation extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JTextField jtextFieldSecurityCode;
	private Map<String, Object> values = new HashMap<String, Object>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activation frame = new Activation();
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
	public Activation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Activation");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/check.png"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(110, 6, 224, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/id-card.png"));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(6, 64, 100, 16);
		panel.add(lblNewLabel_1);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setBounds(156, 60, 224, 26);
		panel.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Security Code");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/security-code.png"));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(6, 104, 138, 20);
		panel.add(lblNewLabel_2);
		
		jtextFieldSecurityCode = new JTextField();
		jtextFieldSecurityCode.setBounds(156, 102, 224, 26);
		panel.add(jtextFieldSecurityCode);
		jtextFieldSecurityCode.setColumns(10);
		
		JButton jbtnActivate = new JButton("Activate");
		jbtnActivate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnActivate_actionPerformed(e);
			}
		});
		jbtnActivate.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Next.png"));
		jbtnActivate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnActivate.setBounds(29, 176, 117, 29);
		panel.add(jbtnActivate);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/cancel.png"));
		jbtnCancel.setBounds(263, 176, 117, 29);
		panel.add(jbtnCancel);
	}
	
	public void jbtnActivate_actionPerformed(ActionEvent e) {
		try {
			AccountModel accountModel = new AccountModel();
			String username = jtextFieldUsername.getText();
			String securityCode = jtextFieldSecurityCode.getText();
			if (accountModel.active(username, securityCode)) {
				JOptionPane.showMessageDialog(null, "Done!");
				Login login = new Login();
				login.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Failed !");
			}
		} catch(Exception e1) {
			System.err.print(e1.getMessage());
		}
		
	}
	
	public Activation(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		String username = (String) values.get("username");
		jtextFieldUsername.setText(username);
	} 

}
