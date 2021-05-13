package Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Entities.City;
import Entities.Country;
import Entities.District;
import Model.CityModel;
import Model.CountryModel;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo3 extends JFrame {

	private JPanel contentPane;
	private JComboBox jcomboBoxCountry;
	private JComboBox jcomboBoxCity;
	private JComboBox jcomboBoxDistrict;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		UIManager.put( "control", new Color( 128, 128, 128) );
		  UIManager.put( "info", new Color(128,128,128) );
		  UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
		  UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
		  UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
		  UIManager.put( "nimbusFocus", new Color(115,164,209) );
		  UIManager.put( "nimbusGreen", new Color(176,179,50) );
		  UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
		  UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
		  UIManager.put( "nimbusOrange", new Color(191,98,4) );
		  UIManager.put( "nimbusRed", new Color(169,46,34) );
		  UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
		  UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
		  UIManager.put( "text", new Color( 230, 230, 230) );
		  try {
		    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		      if ("Nimbus".equals(info.getName())) {
		          javax.swing.UIManager.setLookAndFeel(info.getClassName());
		          break;
		      }
		    }
		  } catch (ClassNotFoundException e) {
		    e.printStackTrace();
		  } catch (InstantiationException e) {
		    e.printStackTrace();
		  } catch (IllegalAccessException e) {
		    e.printStackTrace();
		  } catch (javax.swing.UnsupportedLookAndFeelException e) {
		    e.printStackTrace();
		  } catch (Exception e) {
		    e.printStackTrace();
		  }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 frame = new Demo3();
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
	public Demo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Country");
		lblNewLabel.setBounds(6, 19, 61, 16);
		contentPane.add(lblNewLabel);
		
		jcomboBoxCountry = new JComboBox();
		jcomboBoxCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxCountry_actionPerformed(e);
			}
		});
		jcomboBoxCountry.setBounds(79, 15, 184, 27);
		contentPane.add(jcomboBoxCountry);
		
		JLabel lblNewLabel_1 = new JLabel("City");
		lblNewLabel_1.setBounds(6, 68, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jcomboBoxCity = new JComboBox();
		jcomboBoxCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxCity_actionPerformed(e);
			}
		});
		jcomboBoxCity.setBounds(79, 64, 184, 27);
		contentPane.add(jcomboBoxCity);
		
		JLabel lblNewLabel_2 = new JLabel("District");
		lblNewLabel_2.setBounds(6, 123, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jcomboBoxDistrict = new JComboBox();
		jcomboBoxDistrict.setBounds(79, 119, 184, 27);
		contentPane.add(jcomboBoxDistrict);
		
		JButton jButtonSave = new JButton("Save");
		jButtonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonSave_actionPerformed(e);
			}
		});
		jButtonSave.setBounds(173, 186, 117, 29);
		contentPane.add(jButtonSave);
		
		loadDataCountry();
	}
	
	private void jcomboBoxCity_actionPerformed(ActionEvent e) {
		loadDataDistrict();
	}
	
	
	
	private void loadDataCountry() {
		CountryModel countryModel = new CountryModel();
		List<Country> countries = countryModel.findAll();
		DefaultComboBoxModel<Country> defaultComboBoxCountry = new DefaultComboBoxModel<Country>();
		for(Country country:countries) {
			defaultComboBoxCountry.addElement(country);
		}
		jcomboBoxCountry.setModel(defaultComboBoxCountry);
		jcomboBoxCountry.setRenderer(new CountryListCellRender());
		
		
	}
	
	private void loadDataCity() {
		DefaultComboBoxModel<City> defaultComboBoxCity = new DefaultComboBoxModel<City>();
		CityModel cityModel = new CityModel();
		Country country = (Country) jcomboBoxCountry.getSelectedItem();
		for(City city:cityModel.findAll(country, country.getId())) {
			defaultComboBoxCity.addElement(city);
		}
		jcomboBoxCity.setModel(defaultComboBoxCity);
		jcomboBoxCity.setRenderer(new CityListCellRender());
	}
	
	
	private void loadDataDistrict() {
		DefaultComboBoxModel<District> defaultComboBoxDistrict = new DefaultComboBoxModel<District>();
		CityModel cityModel = new CityModel();
		City city = (City) jcomboBoxCity.getSelectedItem();
		for(District district: cityModel.findDistrict(city, city.getId())) {
			defaultComboBoxDistrict.addElement(district);
		}
		jcomboBoxDistrict.setModel(defaultComboBoxDistrict);
		jcomboBoxDistrict.setRenderer(new DistrictListCellRender());
	}
	
	
	private void jcomboBoxCountry_actionPerformed(ActionEvent e) {
		String value = jcomboBoxCountry.getSelectedItem().toString();
		loadDataCity();

	}
	
	
	
	public void jButtonSave_actionPerformed(ActionEvent e) {
		Country country = (Country) jcomboBoxCountry.getSelectedItem();
		City city = (City) jcomboBoxCity.getSelectedItem();
		District district = (District) jcomboBoxDistrict.getSelectedItem();
		System.out.println(country.getName());
		System.out.println(city.getName());
		System.out.println(district.getName());
	}
	
	private class CountryListCellRender extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Country countries = (Country) value;
			value = countries.getName();
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
	private class CityListCellRender extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			City cities = (City) value;
			value = cities.getName();
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
	private class DistrictListCellRender extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			District districts = (District) value;
			value = districts.getName(); 
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
}
