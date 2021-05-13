package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JTextField jtextFieldTemp;
	private JTextField jtextFieldResult;
	private final ButtonGroup buttonGroupConvert = new ButtonGroup();

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
		setBounds(100, 100, 547, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(31, 54, 177, 202);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel jLabelGender = new JLabel("Gender");
		jLabelGender.setBounds(6, 6, 61, 16);
		panel.add(jLabelGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroupGender.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(16, 29, 141, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroupGender.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(16, 64, 141, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JButton jButtonSave = new JButton("Save");
		jButtonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonSave_actionPerformed(e);
			}
		});
		jButtonSave.setBounds(41, 268, 117, 29);
		contentPane.add(jButtonSave);
		
		JLabel lblNewLabel = new JLabel("Temperature");
		lblNewLabel.setBounds(241, 54, 82, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldTemp = new JTextField();
		jtextFieldTemp.setBounds(335, 49, 206, 26);
		contentPane.add(jtextFieldTemp);
		jtextFieldTemp.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(251, 82, 177, 77);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("C to F");
		buttonGroupConvert.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 6, 141, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("F to C");
		buttonGroupConvert.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(6, 41, 141, 23);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Result");
		lblNewLabel_1.setBounds(241, 181, 50, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldResult = new JTextField();
		jtextFieldResult.setEditable(false);
		jtextFieldResult.setBounds(298, 176, 130, 26);
		contentPane.add(jtextFieldResult);
		jtextFieldResult.setColumns(10);
		
		JButton jButtonConvert = new JButton("Convert");
		jButtonConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonConvert_actionPerformed(e);
			}
		});
		jButtonConvert.setBounds(241, 209, 117, 29);
		contentPane.add(jButtonConvert);
	}
	
	private void jButtonConvert_actionPerformed(ActionEvent e) {
		double result;
		String choice = convert();
		if(choice.equalsIgnoreCase("C to F")) {
			result = Double.parseDouble(jtextFieldTemp.getText())*1.8 + 32;
			jtextFieldResult.setText(String.valueOf(result));
		} else {
			result = (Double.parseDouble(jtextFieldTemp.getText())-32)/1.8;
			jtextFieldResult.setText(String.valueOf(result));
		}
	}
	
	private String convert() {
		Enumeration<AbstractButton> buttons =  buttonGroupConvert.getElements();
		while(buttons.hasMoreElements()) {
			JRadioButton radioButton = (JRadioButton) buttons.nextElement(); 
			if(radioButton.isSelected()) {
				return radioButton.getText();
			}
		}
		return null; 
	}
	
	private void jButtonSave_actionPerformed(ActionEvent e) {
		String gender = getGender();
		System.out.println(gender); 
	}
	
	private String getGender() {
		Enumeration<AbstractButton> buttons =  buttonGroupGender.getElements();
		while(buttons.hasMoreElements()) {
			JRadioButton radioButton = (JRadioButton) buttons.nextElement(); 
			if(radioButton.isSelected()) {
				return radioButton.getText();
			}
		}
		return null; 
	}
}
