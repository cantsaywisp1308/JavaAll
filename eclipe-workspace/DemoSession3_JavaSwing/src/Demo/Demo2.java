package Demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Entities.Category;
import Model.CategoryModel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JComboBox jcomboBoxCategory;
	private JComboBox jcomboBoxCategory2;
	private JButton JButtonSave2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			 } catch (Throwable e) {
			 e.printStackTrace();
			 }
		
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
		setBounds(100, 100, 542, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jcomboBoxCategory = new JComboBox();
		jcomboBoxCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxCategory_actionPerformed(e);
			}
		});
		jcomboBoxCategory.setBounds(28, 32, 166, 27);
		contentPane.add(jcomboBoxCategory);
		
		JButton jButtonSave = new JButton("Save");
		jButtonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonSave_actionPerformed(e);
			}
		});
		jButtonSave.setBounds(28, 76, 94, 27);
		contentPane.add(jButtonSave);
		
		jcomboBoxCategory2 = new JComboBox();
		jcomboBoxCategory2.setBounds(293, 33, 156, 25);
		contentPane.add(jcomboBoxCategory2);
		
		JButtonSave2 = new JButton("Save");
		JButtonSave2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButtonSave2_actionPerformed(e);
			}
		});
		JButtonSave2.setBounds(303, 76, 94, 27);
		contentPane.add(JButtonSave2);
		
		loadData();
	}
	
	private void JButtonSave2_actionPerformed(ActionEvent e) {
		Category category = (Category) jcomboBoxCategory2.getSelectedItem();
		System.out.println("id: "+category.getId());
		System.out.println("name: "+category.getName()); 
	}
	
	private void loadData() {
		DefaultComboBoxModel<String> categories = new DefaultComboBoxModel<String>();
		categories.addElement("Category 1");
		categories.addElement("Category 2");
		categories.addElement("Category 3");
		categories.addElement("Category 4");
		jcomboBoxCategory.setModel(categories);
		
		CategoryModel categoryModel = new CategoryModel();
		DefaultComboBoxModel<Category> defaultComboBoxCategories = new DefaultComboBoxModel<Category>();
		for(Category category: categoryModel.findAll()) {
			defaultComboBoxCategories.addElement(category);
		}
		jcomboBoxCategory2.setModel(defaultComboBoxCategories);
		jcomboBoxCategory2.setRenderer(new CategoryListCellRender());
	}
	
	private void jButtonSave_actionPerformed(ActionEvent e) {
		String value =jcomboBoxCategory.getSelectedItem().toString();
		System.out.println(value); 
		int index = jcomboBoxCategory.getSelectedIndex();
		System.out.println("index: "+index); 
	}
	
	private void jcomboBoxCategory_actionPerformed(ActionEvent e) {
		String value =jcomboBoxCategory.getSelectedItem().toString();
		System.out.println(value); 
	}
	
	private class CategoryListCellRender extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Category category = (Category) value;
			value = category.getId() + ":" + category.getName();
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
		
	}
}
