package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Activation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JLabel lblNewLabel = new JLabel("Activation Step");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/bitcoin.png"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 18, 173, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Number");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Profile.png"));
		lblNewLabel_1.setBounds(6, 75, 130, 24);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(148, 70, 247, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Security Code");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/coding.png"));
		lblNewLabel_2.setBounds(6, 119, 130, 24);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 117, 247, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton jbtnConfirm = new JButton("Confirm");
		jbtnConfirm.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/check.png"));
		jbtnConfirm.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnConfirm.setBounds(38, 198, 117, 29);
		panel.add(jbtnConfirm);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Delete.png"));
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(263, 198, 117, 29);
		panel.add(jbtnCancel);
	}

}
