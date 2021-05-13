package Windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JMenu mnNewMenu;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

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
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Add CSV");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Close");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Profile");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Edit Profile");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Logout");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250,8,40));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Copyright 2021 by cantsaywisp1308");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250,8,40));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		btnNewButton = new JButton("Student's results ");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/research.png"));
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Attendance");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setRequestFocusEnabled(false);
		btnNewButton_1.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/id-card.png"));
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New events");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_2.setRequestFocusEnabled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/party.png"));
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New Recruitment");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_3.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/question.png"));
		btnNewButton_3.setPressedIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/question.png"));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setRequestFocusEnabled(false);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Report");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_4.setRequestFocusEnabled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/StudentManagement/src/Image/PNG-24/Warning.png"));
		panel_1.add(btnNewButton_4);
	}

}
