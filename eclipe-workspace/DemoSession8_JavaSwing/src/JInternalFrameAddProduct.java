import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class JInternalFrameAddProduct extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameAddProduct frame = new JInternalFrameAddProduct();
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
	public JInternalFrameAddProduct() {
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Add Product");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel jpanelRed = new JPanel();
		jpanelRed.setBackground(Color.RED);
		jpanelRed.setBounds(6, 6, 117, 159);
		getContentPane().add(jpanelRed);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(jpanelRed, popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Menu 1");
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Menu 2");
		popupMenu.add(mntmNewMenuItem_1);
		
		JPanel jpanelBlue = new JPanel();
		jpanelBlue.setBackground(Color.BLUE);
		jpanelBlue.setBounds(240, 6, 117, 159);
		getContentPane().add(jpanelBlue);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(jpanelBlue, popupMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Menu 3");
		popupMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Menu 4");
		popupMenu_1.add(mntmNewMenuItem_3);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
