package Demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

import Entities.Country;
import Model.CountryModel;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private JComboBox jcomboBoxCountry;
	private JLabel lblNewLabel_1;
	private JTextField jtextFieldNumber;
	private JLabel lblNewLabel_2;
	private JTextField jtextFieldCurrency;
	private JLabel lblNewLabel_3;
	private JTextField jtextFieldPercent;
	private JLabel lblNewLabel_4;
	private JTextField jtextFieldDateTime;
	private JLabel lblNewLabel_5;
	private JTextField jtextFieldContent;
	private JButton jbtnSave;
	private Locale locale = new Locale("en","US");

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
		setBounds(100, 100, 453, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Country");
		lblNewLabel.setBounds(6, 42, 85, 16);
		contentPane.add(lblNewLabel);
		
		jcomboBoxCountry = new JComboBox();
		jcomboBoxCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxCountry_actionPerformed(e); 
			}
		});
		jcomboBoxCountry.setBounds(100, 38, 174, 27);
		contentPane.add(jcomboBoxCountry);
		
		lblNewLabel_1 = new JLabel("Number");
		lblNewLabel_1.setBounds(6, 92, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldNumber = new JTextField();
		jtextFieldNumber.setBounds(100, 87, 167, 26);
		contentPane.add(jtextFieldNumber);
		jtextFieldNumber.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Currency");
		lblNewLabel_2.setBounds(6, 142, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jtextFieldCurrency = new JTextField();
		jtextFieldCurrency.setBounds(100, 137, 167, 26);
		contentPane.add(jtextFieldCurrency);
		jtextFieldCurrency.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Percent");
		lblNewLabel_3.setBounds(6, 193, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		jtextFieldPercent = new JTextField();
		jtextFieldPercent.setBounds(100, 188, 167, 26);
		contentPane.add(jtextFieldPercent);
		jtextFieldPercent.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Date Time");
		lblNewLabel_4.setBounds(6, 235, 73, 16);
		contentPane.add(lblNewLabel_4);
		
		jtextFieldDateTime = new JTextField();
		jtextFieldDateTime.setBounds(100, 230, 174, 26);
		contentPane.add(jtextFieldDateTime);
		jtextFieldDateTime.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Content");
		lblNewLabel_5.setBounds(6, 282, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		jtextFieldContent = new JTextField();
		jtextFieldContent.setBounds(100, 277, 167, 26);
		contentPane.add(jtextFieldContent);
		jtextFieldContent.setColumns(10);
		
		jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnSave.setBounds(40, 327, 117, 29);
		contentPane.add(jbtnSave);
		initView(); 
		loadDataCountry();
	}
	
	private void initView() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Resource.content", locale);
		jbtnSave.setText(resourceBundle.getString("save"));
	}
	
	public void jcomboBoxCountry_actionPerformed(ActionEvent e) {
		Country country = (Country) jcomboBoxCountry.getSelectedItem();
		System.out.println("Language ID: "+country.getLanguageId());
		System.out.println("Country ID "+country.getCountryId());
		locale = new Locale(country.getLanguageId(), country.getCountryId());
		
		//Dịnh dạng số 
		int n = 1234567;
		NumberFormat numberFormat1 = NumberFormat.getNumberInstance(locale); 
		jtextFieldNumber.setText(numberFormat1.format(n));
		
		//Dịnh dạng tiền tệ 
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(locale);
		jtextFieldCurrency.setText(numberFormat2.format(n));
		
		//Định dạng %
		double percent = 12.34;
		NumberFormat numberFormat3 = NumberFormat.getPercentInstance(locale);
		jtextFieldPercent.setText(numberFormat3.format(percent));
		
		//Định dạng thời gian 
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		jtextFieldDateTime.setText(dateFormat.format(new Date()));
		
		//Định dạng nội dung 
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Resource.content", locale);
		String msg = resourceBundle.getString("msg");
		jtextFieldContent.setText(msg);
		initView();
	}
	
	public void loadDataCountry() {
		CountryModel countryModel = new CountryModel();
		List<Country> countries = countryModel.findAll();
		DefaultComboBoxModel<Country> defaultComboBoxCountry = new DefaultComboBoxModel<Country>();
		for(Country country:countries) {
			defaultComboBoxCountry.addElement(country);
		}
		jcomboBoxCountry.setModel(defaultComboBoxCountry);
		jcomboBoxCountry.setRenderer(new CountryListCellRenderer());
	}
	
	private class CountryListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			if(value instanceof Country) {
				Country country = (Country) value;
				value = country.getCountryName(); 
			}
			
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
}
