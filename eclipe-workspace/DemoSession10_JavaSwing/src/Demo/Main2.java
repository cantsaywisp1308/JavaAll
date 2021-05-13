package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main2 extends JFrame {

	private JPanel contentPane;
	private JMenuItem jmntmLogout;
	private JMenuItem jmntmProfile;
	private JMenu jmnWelcome;
	private Map<String, Object> values = new HashMap<String, Object>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
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
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		jmnWelcome = new JMenu("Welcome");
		menuBar.add(jmnWelcome);
		
		jmntmProfile = new JMenuItem("Profile");
		jmnWelcome.add(jmntmProfile);
		
		jmntmLogout = new JMenuItem("Logout");
		jmntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmLogout_actionPerformed(e);
			}
		});
		jmnWelcome.add(jmntmLogout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}
	
	public  Main2(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}

	private void loadData() {
		String username = values.get("username").toString();
		jmnWelcome.setText("Welcome " + username);
	}
	
	private void jmntmLogout_actionPerformed(ActionEvent e) {
		Login login = new Login();
		login.setVisible(true);
		this.setVisible(false);
	}
}
