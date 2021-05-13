package demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import entities.Faculty;
import models.FacultyModel;

import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class JFrameDemo1 extends JFrame {

	private JPanel contentPane;
	private JList jlistCategory;
	private JList jlistFaculty;
	private JButton jbuttonSave2;

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
					JFrameDemo1 frame = new JFrameDemo1();
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
	public JFrameDemo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		jlistCategory = new JList();
		jlistCategory.setBounds(24, 26, 159, 181);
		contentPane.add(jlistCategory);

		JButton jbuttonSave = new JButton("Save");
		jbuttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jbuttonSave_actionPerformed(arg0);
			}
		});
		jbuttonSave.setBounds(24, 214, 159, 28);
		contentPane.add(jbuttonSave);

		jlistFaculty = new JList();
		jlistFaculty.setBounds(253, 26, 159, 181);
		contentPane.add(jlistFaculty);

		jbuttonSave2 = new JButton("Save");
		jbuttonSave2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jbuttonSave2_actionPerformed(arg0);
			}
		});
		jbuttonSave2.setBounds(247, 214, 90, 28);
		contentPane.add(jbuttonSave2);

		loadData();
	}

	private void jbuttonSave2_actionPerformed(ActionEvent arg0) {
		List<Faculty> faculties = jlistFaculty.getSelectedValuesList();
		for (Faculty faculty : faculties) {
			System.out.println(faculty.toString());
		}
	}

	private void jbuttonSave_actionPerformed(ActionEvent arg0) {
		List<String> categories = jlistCategory.getSelectedValuesList();
		if (!categories.isEmpty()) {
			for (String category : categories) {
				System.out.println(category);
			}
		}
	}

	private void loadData() {
		DefaultListModel<String> categories = new DefaultListModel<String>();
		categories.addElement("Category 1");
		categories.addElement("Category 2");
		categories.addElement("Category 3");
		categories.addElement("Category 4");
		categories.addElement("Category 5");
		jlistCategory.setModel(categories);

		FacultyModel facultyModel = new FacultyModel();
		DefaultListModel<Faculty> defaultListModelFaculty = new DefaultListModel<Faculty>();
		for (Faculty faculty : facultyModel.findAll()) {
			defaultListModelFaculty.addElement(faculty);
		}
		jlistFaculty.setModel(defaultListModelFaculty);
		jlistFaculty.setCellRenderer(new FacultyListCellRender());

	}

	private class FacultyListCellRender extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			if (value instanceof Faculty) {
				value = ((Faculty) value).getName();
			}
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}

	}

}
