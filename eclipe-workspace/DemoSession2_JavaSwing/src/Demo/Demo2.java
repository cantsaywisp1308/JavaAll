package Demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JCheckBox JcheckboxStatus;
	private JPanel JpanelLanguages;

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
		
		JcheckboxStatus = new JCheckBox("Status");
		JcheckboxStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcheckboxStatus_actionPerformed(e);
				boolean selected = JcheckboxStatus.isSelected();
				System.out.println(selected);
			}
		});
		JcheckboxStatus.setSelected(true);
		JcheckboxStatus.setBounds(6, 28, 128, 23);
		contentPane.add(JcheckboxStatus);
		
		JButton JbuttonSave = new JButton("Save");
		JbuttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSave_actionPerformed(e);
			}
		});
		JbuttonSave.setBounds(17, 80, 117, 29);
		contentPane.add(JbuttonSave);
		
		JpanelLanguages = new JPanel();
		JpanelLanguages.setBorder(new TitledBorder(null, "Languages", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JpanelLanguages.setBounds(146, 6, 298, 139);
		contentPane.add(JpanelLanguages);
		JpanelLanguages.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Language 1");
		chckbxNewCheckBox.setBounds(6, 23, 128, 23);
		JpanelLanguages.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Language 2");
		chckbxNewCheckBox_1.setBounds(6, 58, 128, 23);
		JpanelLanguages.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Language 3");
		chckbxNewCheckBox_1_1.setBounds(6, 93, 128, 23);
		JpanelLanguages.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Language 4");
		chckbxNewCheckBox_1_2.setBounds(144, 23, 128, 23);
		JpanelLanguages.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Language 5");
		chckbxNewCheckBox_1_3.setBounds(146, 58, 128, 23);
		JpanelLanguages.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("Language 6");
		chckbxNewCheckBox_1_4.setBounds(146, 93, 128, 23);
		JpanelLanguages.add(chckbxNewCheckBox_1_4);
		
		JButton jbuttonSave2 = new JButton("Save 2");
		jbuttonSave2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSave2_actionPerformed(e); 
			}
		});
		jbuttonSave2.setBounds(156, 159, 117, 29);
		contentPane.add(jbuttonSave2);
	}
	
	private void jbuttonSave_actionPerformed(ActionEvent e) {
		boolean selected = JcheckboxStatus.isSelected();
		System.out.println(selected);
	}
	
	private void jcheckboxStatus_actionPerformed(ActionEvent e) {
		boolean selected = JcheckboxStatus.isSelected();
		System.out.println(selected);
	}
	
	//Control button, radio, checkbox ... --> Component(Java Swing)
	
	private void jbuttonSave2_actionPerformed(ActionEvent e) {
		Component[] components = JpanelLanguages.getComponents();
		System.out.println("size: " + components.length);
		for(Component component:components) {
			JCheckBox jcheckbox = (JCheckBox)component;
			if(jcheckbox.isSelected()) {
				System.out.println(jcheckbox.getText()); 
			}
		}
	}
}
