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

public class JFrame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldChieuDai;
	private JTextField textFieldChieuRong;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField bdienTich;
	private JTextField bchuVi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame3 frame = new JFrame3();
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
	public JFrame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jchieudai = new JLabel("Chiều dài");
		jchieudai.setBounds(6, 16, 61, 16);
		contentPane.add(jchieudai);
		
		textFieldChieuDai = new JTextField();
		textFieldChieuDai.setBounds(82, 11, 130, 26);
		contentPane.add(textFieldChieuDai);
		textFieldChieuDai.setColumns(10);
		
		JLabel jchieurong = new JLabel("Chiều rộng");
		jchieurong.setBounds(6, 44, 74, 16);
		contentPane.add(jchieurong);
		
		textFieldChieuRong = new JTextField();
		textFieldChieuRong.setBounds(82, 39, 130, 26);
		contentPane.add(textFieldChieuRong);
		textFieldChieuRong.setColumns(10);
		
		JButton jButtonDienTich = new JButton("Tính diện tích");
		jButtonDienTich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbutton_actionPerformed(e);
			}
		});
		jButtonDienTich.setBounds(154, 156, 117, 29);
		contentPane.add(jButtonDienTich);
		
		lblNewLabel = new JLabel("Diện tích");
		lblNewLabel.setBounds(6, 75, 61, 16);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Chu vi");
		lblNewLabel_1.setBounds(6, 103, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		bdienTich = new JTextField();
		bdienTich.setColumns(10);
		bdienTich.setBounds(82, 70, 130, 26);
		contentPane.add(bdienTich);
		
		bchuVi = new JTextField();
		bchuVi.setColumns(10);
		bchuVi.setBounds(82, 98, 130, 26);
		contentPane.add(bchuVi);
	}
	
	private void jbutton_actionPerformed(ActionEvent e) {
		double cd = Double.parseDouble(textFieldChieuDai.getText());
		double cr = Double.parseDouble(textFieldChieuRong.getText());
		double dt = cd * cr;
		double cv = (cd+cr) *2;
		bdienTich.setText(String.valueOf(dt));
		bchuVi.setText(String.valueOf(cv));
	}
	
	 
		 
	 

}
