package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Account;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JButton jbtnEditProfile;
	private JButton jbtnRequestTransfer;
	private JButton jbtnRequestList;
	private JButton jbtnWarning;
	private JButton jbtnLogout;
	private Map<String, Object>values = new HashMap<String, Object>();
	private JLabel jlblWelcome;
	private JPanel jpanelMain;
	private Account account;
	private JButton btnNewButton;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JButton jbtnMakeTransfer;
	private JButton jbtnNewTransfer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 402);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Search");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Search by Name");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Search request");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Search by username");
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(35,255,110));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Copyright 2021 by Bug to Bugs team");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(35,255,110));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		jlblWelcome = new JLabel("");
		jlblWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(jlblWelcome);
		
		jbtnEditProfile = new JButton("Edit Profile");
		jbtnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnEditProfile_actionPerformed(e);
			}
		});
		jbtnEditProfile.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Profile.png"));
		jbtnEditProfile.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnEditProfile.setRequestFocusEnabled(false);
		jbtnEditProfile.setFocusPainted(false);
		jbtnEditProfile.setBorderPainted(false);
		panel_1.add(jbtnEditProfile);
		
		jbtnRequestTransfer = new JButton("Request Transfer");
		jbtnRequestTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnRequestTransfer_actionPerformed(e);
			}
		});
		jbtnRequestTransfer.setBorderPainted(false);
		jbtnRequestTransfer.setFocusPainted(false);
		jbtnRequestTransfer.setRequestFocusEnabled(false);
		jbtnRequestTransfer.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/request.png"));
		jbtnRequestTransfer.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(jbtnRequestTransfer);
		
		jbtnRequestList = new JButton("Request List");
		jbtnRequestList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnRequestList_actionPerformed(e);
			}
		});
		
		jbtnMakeTransfer = new JButton("Make Transfer");
		jbtnMakeTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnMakeTransfer_actionPerformed(e);
			}
		});
		jbtnMakeTransfer.setBorderPainted(false);
		jbtnMakeTransfer.setFocusPainted(false);
		jbtnMakeTransfer.setRequestFocusEnabled(false);
		jbtnMakeTransfer.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/pie-chart.png"));
		jbtnMakeTransfer.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(jbtnMakeTransfer);
		
		jbtnNewTransfer = new JButton("Transfer History");
		jbtnNewTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnNewTransfer_actionPerformed(e);
			}
		});
		jbtnNewTransfer.setBorderPainted(false);
		jbtnNewTransfer.setFocusPainted(false);
		jbtnNewTransfer.setRequestFocusEnabled(false);
		jbtnNewTransfer.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/request.png"));
		jbtnNewTransfer.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(jbtnNewTransfer);
		jbtnRequestList.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/request.png"));
		jbtnRequestList.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnRequestList.setRequestFocusEnabled(false);
		jbtnRequestList.setBorderPainted(false);
		jbtnRequestList.setFocusPainted(false);
		panel_1.add(jbtnRequestList);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Search.png"));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_1.add(btnNewButton);
		
		jbtnWarning = new JButton("Warning");
		jbtnWarning.setBorderPainted(false);
		jbtnWarning.setFocusPainted(false);
		jbtnWarning.setRequestFocusEnabled(false);
		jbtnWarning.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnWarning.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Warning.png"));
		panel_1.add(jbtnWarning);
		
		jbtnLogout = new JButton("Logout");
		jbtnLogout.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/logout.png"));
		jbtnLogout.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnLogout.setBorderPainted(false);
		jbtnLogout.setFocusPainted(false);
		jbtnLogout.setRequestFocusEnabled(false);
		panel_1.add(jbtnLogout);
		
		jpanelMain = new JPanel();
		contentPane.add(jpanelMain, BorderLayout.CENTER);
		jpanelMain.setLayout(new BoxLayout(jpanelMain, BoxLayout.X_AXIS));
	}
	
	
	public void jbtnMakeTransfer_actionPerformed(ActionEvent e) {
		clearPanel();
		MakeTransfer makeTransfer = new MakeTransfer();
		jpanelMain.add(makeTransfer); 
	}
	
	public MainWindow(Map<String, Object>values) {
		this();
		this.values = values;
		loadData();
	}
	
	private void loadData() {
		account = (Account) values.get("account");
		jlblWelcome.setText("Welcome, "+ account.getFullName());
		assignButton(account);
	}
	
	private void assignButton(Account account) {
		if(account.getRole().contains("employee")) {
			jbtnRequestList.setVisible(false);
			jbtnMakeTransfer.setVisible(false);
		}
	}
	
	private void jbtnEditProfile_actionPerformed(ActionEvent e) {
		clearPanel();
		EditProfile editProfile = new EditProfile(values);
		jpanelMain.add(editProfile); 
		editProfile.setVisible(true);
	}
	
	private void jbtnRequestTransfer_actionPerformed(ActionEvent e) {
		clearPanel();
		RequestTranfer requestTransfer = new RequestTranfer(values);
		jpanelMain.add(requestTransfer);
		requestTransfer.setVisible(true);
	}
	
	private void jbtnRequestList_actionPerformed(ActionEvent e) {
		clearPanel();
		RequestList requestList = new RequestList();
		jpanelMain.add(requestList);
		requestList.setVisible(true);
	}
	
	private void clearPanel() {
		jpanelMain.removeAll();
		jpanelMain.revalidate();
		jpanelMain.repaint();
	}

	private void jbtnNewTransfer_actionPerformed(ActionEvent e) {
		clearPanel();
		NewTransfer newTransfer = new NewTransfer(values);
		jpanelMain.add(newTransfer);
		newTransfer.setVisible(true);
	}
}
