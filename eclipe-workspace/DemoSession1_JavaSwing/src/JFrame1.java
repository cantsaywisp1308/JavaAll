import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

public class JFrame1 extends JFrame {

	private JPanel contentPane;
	private JLabel JLabelHi;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame1 frame = new JFrame1();
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
	public JFrame1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrame1.class.getResource("/Resources/icon.png")));
		setTitle("Demo1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabelHi = new JLabel("Hello");
		JLabelHi.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabelHi.setForeground(Color.PINK);
		JLabelHi.setBounds(22, 60, 61, 16);
		contentPane.add(JLabelHi);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrame1.class.getResource("/Resources/icon.png")));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(128, 43, 283, 202);
		contentPane.add(lblNewLabel);
		loadData();
	}
	
	public void loadData() {
		System.out.println("hi !");
		JLabelHi.setText("Hi !");
	}
}
