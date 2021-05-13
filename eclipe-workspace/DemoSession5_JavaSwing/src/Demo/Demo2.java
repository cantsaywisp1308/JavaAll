package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JTree jtreeCategory;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 99, 266);
		contentPane.add(scrollPane);
		
		jtreeCategory = new JTree();
		jtreeCategory.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
				}
			}
		));
		scrollPane.setViewportView(jtreeCategory);
		loadData(); 
	}
	
	private void loadData() {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Categories");
		
		DefaultMutableTreeNode category1 = new DefaultMutableTreeNode("Category 1");
		root.add(category1);
		
		DefaultMutableTreeNode category2 = new DefaultMutableTreeNode("Category 2");
		root.add(category2);
		
		DefaultMutableTreeNode category11 = new DefaultMutableTreeNode("Category 1.1");
		category1.add(category11);
		
		DefaultMutableTreeNode category12 = new DefaultMutableTreeNode("Category 1.2");
		category1.add(category12);
		
		DefaultTreeModel defaultTreeModel = new DefaultTreeModel(root);
		jtreeCategory.setModel(defaultTreeModel);
	}
}
