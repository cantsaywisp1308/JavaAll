package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo4 frame = new Demo4();
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
	public Demo4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 437);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setForeground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Java Project");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Project");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_1.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Package");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Open File");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem jmenuClose = new JMenuItem("Close");
		jmenuClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmenuClose_actionPerformed(e);
			}
		});
		jmenuClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
		mnNewMenu.add(jmenuClose);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Close All");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Search");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Search");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("File...");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Java");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_2.add(separator_2);
		
		JMenu mnNewMenu_3 = new JMenu("Text");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Workspace");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Project");
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("File");
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Working Set");
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_2.add(separator_3);
		
		JMenu mnNewMenu_4 = new JMenu("References");
		mnNewMenu_2.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Workspace");
		mntmNewMenuItem_14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.SHIFT_MASK | InputEvent.META_MASK));
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Projects");
		mnNewMenu_4.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Hierachy");
		mnNewMenu_4.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Working Set...");
		mnNewMenu_4.add(mntmNewMenuItem_17);
		
		JMenu mnNewMenu_5 = new JMenu("Declarations");
		mnNewMenu_2.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Workspace");
		mntmNewMenuItem_18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.SHIFT_MASK | InputEvent.META_MASK));
		mnNewMenu_5.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("Projects");
		mnNewMenu_5.add(mntmNewMenuItem_21);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("Hierachy");
		mnNewMenu_5.add(mntmNewMenuItem_22);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("Working Set...");
		mnNewMenu_5.add(mntmNewMenuItem_23);
		
		JMenu mnNewMenu_6 = new JMenu("Implementors");
		mnNewMenu_2.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_20);
		
		JMenu mnNewMenu_7 = new JMenu("Read Access");
		mnNewMenu_2.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("Write Access");
		mnNewMenu_2.add(mnNewMenu_8);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_2.add(separator_4);
		
		JMenu mnNewMenu_9 = new JMenu("Occurences in Files...");
		mnNewMenu_2.add(mnNewMenu_9);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Referring text");
		mnNewMenu_2.add(mntmNewMenuItem_13);
		
		JMenu mnNewMenu_10 = new JMenu("Quick Search");
		mnNewMenu_2.add(mnNewMenu_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	private void jmenuClose_actionPerformed(ActionEvent e) {
		System.out.println("Menu is selected");
	}

}
