package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Demo3 extends JFrame {

	private JPanel contentPane;
	private JPanel jpanelMain;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton jbtnMail = new JButton("");
		jbtnMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnMail_actionPerformed(e);
			}
		});
		jbtnMail.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Email.png"));
		toolBar.add(jbtnMail);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Delete.png"));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Bar Chart.png"));
		toolBar.add(btnNewButton_2);
		
		JPanel jpanelLeft = new JPanel();
		jpanelLeft.setBackground(new Color(54,33,89));
		contentPane.add(jpanelLeft, BorderLayout.WEST);
		jpanelLeft.setLayout(new BoxLayout(jpanelLeft, BoxLayout.Y_AXIS));
		
		JButton jbtnStudent = new JButton("Student");
		jbtnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnStudent_actionPerformed(e);
			}
		});
		jbtnStudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jbtnStudent.setForeground(Color.WHITE);
		jbtnStudent.setFocusPainted(false);
		jbtnStudent.setBorderPainted(false);
		jbtnStudent.setContentAreaFilled(false);
		jbtnStudent.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Info.png"));
		jpanelLeft.add(jbtnStudent);
		
		JButton jbtnTeacher = new JButton("Teacher");
		jbtnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnTeacher_actionPerformed(e);
			}
		});
		jbtnTeacher.setForeground(Color.WHITE);
		jbtnTeacher.setFocusPainted(false);
		jbtnTeacher.setContentAreaFilled(false);
		jbtnTeacher.setBorderPainted(false);
		jbtnTeacher.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/Search.png"));
		jpanelLeft.add(jbtnTeacher);
		
		JButton jbtnFees = new JButton("Fees");
		jbtnFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnFees_actionPerformed(e);
			}
		});
		jbtnFees.setForeground(Color.WHITE);
		jbtnFees.setContentAreaFilled(false);
		jbtnFees.setBorderPainted(false);
		jbtnFees.setFocusPainted(false);
		jbtnFees.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession11_JavaSwing/src/Resource/ICON for Software/PNG-24/confetti.png"));
		jpanelLeft.add(jbtnFees);
		
		jpanelMain = new JPanel();
		contentPane.add(jpanelMain, BorderLayout.CENTER);
		jpanelMain.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(54,33,89));
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Copyright 2021");
		panel.add(lblNewLabel);
	}
	
	public void jbtnStudent_actionPerformed(ActionEvent e) {
		clearPanel();
		JPanelStudent jPanelStudent = new JPanelStudent();
		jpanelMain.add(jPanelStudent);
		jPanelStudent.setVisible(true);
	}
	
	public void jbtnTeacher_actionPerformed(ActionEvent e) {
		clearPanel();
		JPanelTeacher jPanelTeacher = new JPanelTeacher();
		jpanelMain.add(jPanelTeacher);
		jPanelTeacher.setVisible(true);
	}
	
	public void jbtnFees_actionPerformed(ActionEvent e) {
		clearPanel(); 
		JPanelFees jPanelFees = new JPanelFees();
		jpanelMain.add(jPanelFees);
		jPanelFees.setVisible(true);
	}
	
	private void clearPanel() {
		jpanelMain.removeAll();
		jpanelMain.revalidate();
		jpanelMain.repaint();
	}
	
	public void jbtnMail_actionPerformed(ActionEvent e) {
		
	}

}
