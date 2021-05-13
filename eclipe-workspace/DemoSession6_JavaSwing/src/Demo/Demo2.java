package Demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import Entities.Faculty;
import Model.FacultyModel;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JTree jtreeFaculty;
	private JTextField jtextFieldId;
	private JTextField jtextFieldName;
	private JLabel jlabelPhoto;

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
		setBounds(100, 100, 522, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 205, 309);
		contentPane.add(scrollPane);
		
		jtreeFaculty = new JTree();
		jtreeFaculty.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				jtreeFaculty_valueChanged(e);
			}
		});
		jtreeFaculty.setRootVisible(false);
		jtreeFaculty.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
				}
			}
		));
		scrollPane.setColumnHeaderView(jtreeFaculty);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(223, 9, 61, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldId = new JTextField();
		jtextFieldId.setBounds(307, 4, 130, 26);
		contentPane.add(jtextFieldId);
		jtextFieldId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(223, 46, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(307, 42, 130, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		jlabelPhoto = new JLabel("");
		jlabelPhoto.setBounds(223, 121, 180, 93);
		contentPane.add(jlabelPhoto);
		loadData(); 
	}
	
	private void loadData() {
		FacultyModel facultyModel = new FacultyModel();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for(Faculty faculty:facultyModel.findAll()) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(faculty);
			root.add(node);
		}
		DefaultTreeModel defaultTreeModel = new DefaultTreeModel(root);
		jtreeFaculty.setModel(defaultTreeModel); 
		//jtreeFaculty.setCellRenderer(new FacultyTreeCellRenderer());
		jtreeFaculty.setCellRenderer(new FacultyLogoCellRenderer());
		
		//Xử lý hình ảnh
		jlabelPhoto.setIcon(new ImageIcon("src/Resource/Abaddon_icon.png"));
		//Scale  hình ảnh 
		int width = jlabelPhoto.getWidth();
		int height = jlabelPhoto.getHeight();
		Image image = new ImageIcon("src/Resource/Abaddon_icon.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		jlabelPhoto.setIcon(new ImageIcon(image));
	}
	
	private class FacultyTreeCellRenderer extends DefaultTreeCellRenderer {
		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
				int row, boolean hasFocus) {
		DefaultMutableTreeNode	node = (DefaultMutableTreeNode) value;
			if(node.getUserObject()!= null && node.getUserObject() instanceof Faculty) {
				Faculty faculty = (Faculty) node.getUserObject();
				value = faculty.getName();
			}
			// TODO Auto-generated method stub
			return super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		}	
	}
	
	private class FacultyLogoCellRenderer extends DefaultTreeCellRenderer {

		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded,
				boolean leaf, int row, boolean hasFocus) {
			// TODO Auto-generated method stub
			Component component = super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
			DefaultMutableTreeNode	node = (DefaultMutableTreeNode) value;
			if(node.isLeaf()) {
				if(node.getUserObject()!= null && node.getUserObject() instanceof Faculty) {
					Faculty faculty = (Faculty) node.getUserObject();
					setText(faculty.getName());
					Image logo = new ImageIcon("src/Resource/" + faculty.getLogo()).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
					setIcon(new ImageIcon(logo));
				}
			}
			return component;
		}
		
	}

	private void jtreeFaculty_valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jtreeFaculty.getSelectionPath().getLastPathComponent();
		Faculty faculty = (Faculty) selectedNode.getUserObject();
		jtextFieldId.setText(faculty.getId());
		jtextFieldName.setText(faculty.getName());
	}
	

}
