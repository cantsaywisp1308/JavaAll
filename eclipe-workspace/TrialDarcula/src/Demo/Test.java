package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class Test extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 20, 314, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton jrdbtnMale = new JRadioButton("Male");
		buttonGroupGender.add(jrdbtnMale);
		jrdbtnMale.setBounds(6, 6, 141, 23);
		panel.add(jrdbtnMale);
		
		JRadioButton jrdbtnFemale = new JRadioButton("Female");
		buttonGroupGender.add(jrdbtnFemale);
		jrdbtnFemale.setBounds(6, 41, 141, 23);
		panel.add(jrdbtnFemale);
	}

}
