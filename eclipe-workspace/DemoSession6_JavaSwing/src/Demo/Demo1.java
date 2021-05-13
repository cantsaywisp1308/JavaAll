package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextField;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private JTree jtreeMenu;
	private JTextField jtextFieldMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1 frame = new Demo1();
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
	public Demo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 174, 246);
		contentPane.add(scrollPane);
		
		jtreeMenu = new JTree();
		jtreeMenu.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				jtreeMenu_valueChanged(e);
			}
		});
		jtreeMenu.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
				}
			}
		));
		scrollPane.setColumnHeaderView(jtreeMenu);
		
		jtextFieldMenu = new JTextField();
		jtextFieldMenu.setBounds(192, 18, 130, 26);
		contentPane.add(jtextFieldMenu);
		jtextFieldMenu.setColumns(10);
		loadData(); 
	}

	private void loadData() {
		DefaultMutableTreeNode menu = new DefaultMutableTreeNode("Menu");
		
		DefaultMutableTreeNode menu1 = new DefaultMutableTreeNode("Menu1");
		menu.add(menu1);
		
		DefaultMutableTreeNode menu1a  = new DefaultMutableTreeNode("Menu1.1");
		menu1.add(menu1a);
		DefaultMutableTreeNode menu1b  = new DefaultMutableTreeNode("Menu1.2");
		menu1.add(menu1b);
		
		DefaultMutableTreeNode menu2 = new DefaultMutableTreeNode("Menu 2");
		menu.add(menu2); 
		
		DefaultMutableTreeNode menu3 = new DefaultMutableTreeNode("Menu 3");
		menu.add(menu3);
		
		DefaultTreeModel defaultTreeModel = new DefaultTreeModel(menu);
		jtreeMenu.setModel(defaultTreeModel); 
	}
	
	private void jtreeMenu_valueChanged(TreeSelectionEvent e) {
		System.out.println("value changed"); 
		
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jtreeMenu.getSelectionPath().getLastPathComponent();
		System.out.println(selectedNode.isLeaf()); 
		String value = selectedNode.getUserObject().toString();
		jtextFieldMenu.setText(value); 
		
	}
}
