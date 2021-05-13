package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Account;
import Models.AccountModel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDayChooser;

public class Main extends JFrame {

	private JPanel contentPane;
	private JMenuItem jmntmProfile;
	private JMenuItem jmntmLogout;
	private JMenu jmnProduct;
	private JMenuItem jmntmAddProduct;
	private JMenuItem jmntmSearchProduct;
	private JMenu jmnAccount;
	private JMenuItem jmntmAddAccount;
	private JMenuItem jmntmListAccount;
	
	private Map<String, Object> values = new HashMap<String, Object>();
	private JMenu jmnWelcome;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 369);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		jmnProduct = new JMenu("Product");
		menuBar.add(jmnProduct);
		
		jmntmAddProduct = new JMenuItem("Add");
		jmnProduct.add(jmntmAddProduct);
		
		jmntmSearchProduct = new JMenuItem("Search");
		jmnProduct.add(jmntmSearchProduct);
		
		jmnAccount = new JMenu("Account");
		menuBar.add(jmnAccount);
		
		jmntmAddAccount = new JMenuItem("Add");
		jmnAccount.add(jmntmAddAccount);
		
		jmntmListAccount = new JMenuItem("List");
		jmnAccount.add(jmntmListAccount);
		
		jmnWelcome = new JMenu("Welcome");
		menuBar.add(jmnWelcome);
		
		jmntmProfile = new JMenuItem("Profile");
		jmntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmProfile_actionPerformed(e);
			}
		});
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

	public Main(Map<String, Object> values) {
		this();
		this.values = values; 
		loadData(); 
	}
	
	private void loadData() {
		Account account = (Account) values.get("account");
		jmnWelcome.setText("Welcome "+account.getUsername());
		assignMenu(account); 
	}
	
	private void assignMenu(Account account) {
		if(account.getRole().equalsIgnoreCase("employee")) {
			jmnAccount.setVisible(false);
			jmnProduct.setEnabled(false);
		}
	}
	
	private void jmntmLogout_actionPerformed(ActionEvent e) {
		Login login = new Login();
		login.setVisible(true);
		this.setVisible(false);
	}
	
	private void jmntmProfile_actionPerformed(ActionEvent e) {
		Profile profile = new Profile(values);
		profile.setVisible(true);
		
	}
}
