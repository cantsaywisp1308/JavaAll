import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Demo3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 frame = new Demo3();
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
	public Demo3() {
		setTitle("Frame 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbtnOpenFrame4 = new JButton("Open Frame 4");
		jbtnOpenFrame4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnOpenFrame4_actionPerformed(e); 
			}
		});
		jbtnOpenFrame4.setBounds(39, 30, 117, 29);
		contentPane.add(jbtnOpenFrame4);
		
		JButton jbtnOpenFrame5 = new JButton("Open Frame 5");
		jbtnOpenFrame5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnOpenFrame5_actionPerformed(e);
			}
		});
		jbtnOpenFrame5.setBounds(226, 30, 117, 29);
		contentPane.add(jbtnOpenFrame5);
	}
	private void jbtnOpenFrame4_actionPerformed(ActionEvent e) {
		/*
		Demo4 demo4 = new Demo4();
		demo4.setVisible(true);
		this.setVisible(false);
		*/
		String[] values = {"p01","Name 1","123"}; 
		Demo4.main(values);
		this.setVisible(false);
	}
	
	private void jbtnOpenFrame5_actionPerformed(ActionEvent e) {
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("ID", "Pr02");
		values.put("name", "name 2");
		values.put("quantity", 20);
		Demo5 demo5 = new Demo5(values);
		demo5.setVisible(true);
		this.setVisible(false);
	}

}
