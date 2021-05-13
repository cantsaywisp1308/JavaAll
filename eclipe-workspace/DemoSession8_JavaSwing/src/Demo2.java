import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JDesktopPane jdesktopPaneMain;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 frame = new Demo2();
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
	public Demo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Product");
		menuBar.add(mnNewMenu);
		
		JMenuItem jmntmAddProduct = new JMenuItem("Add");
		jmntmAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmAddProduct_actionPerformed(e);
			}
		});
		mnNewMenu.add(jmntmAddProduct);
		
		JMenuItem jmntmSearchproduct = new JMenuItem("Search");
		jmntmSearchproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmSearchproduct_actionPerformed(e); 
			}
		});
		mnNewMenu.add(jmntmSearchproduct);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/DemoSession8_JavaSwing/src/ICON for Software/PNG-24/Add.png"));
		toolBar.add(btnNewButton);
		
		jdesktopPaneMain = new JDesktopPane();
		contentPane.add(jdesktopPaneMain);
	}

	private void jmntmAddProduct_actionPerformed(ActionEvent e) {
		clearJDesktopPane(); 
		JInternalFrameAddProduct jInternalFrameAddProduct = new JInternalFrameAddProduct();
		jdesktopPaneMain.add(jInternalFrameAddProduct); 
		jInternalFrameAddProduct.setVisible(true);
	}
	
	private void jmntmSearchproduct_actionPerformed(ActionEvent e) {
		clearJDesktopPane();
		JInternalFrameSearchProduct JinternalFrameSearchProduct = new JInternalFrameSearchProduct();
		jdesktopPaneMain.add(JinternalFrameSearchProduct); 
		JinternalFrameSearchProduct.setVisible(true);
	}
	
	private void clearJDesktopPane() {
		jdesktopPaneMain.removeAll();
		jdesktopPaneMain.repaint();
		
	}
}
