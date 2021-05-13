package Demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;

import Entities.City;
import Entities.Continent;
import Entities.Country;
import Model.ContinentModel;
import Model.CountryModel;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.JTable;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class Demo3 extends JFrame {

	private JPanel contentPane;
	private JTree jtreeContinent;
	private JTable jtableCity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setBounds(100, 100, 550, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 173, 255);
		contentPane.add(scrollPane);
		
		jtreeContinent = new JTree();
		jtreeContinent.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				jtreeContinent_valueChanged(e);
			}
		});
		jtreeContinent.setRootVisible(false);
		jtreeContinent.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
				}
			}
		));
		scrollPane.setColumnHeaderView(jtreeContinent);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(191, 6, 353, 255);
		contentPane.add(scrollPane_1);
		
		jtableCity = new JTable();
		scrollPane_1.setViewportView(jtableCity);
		loadDataContinent(); 
	}
	
	private void jtreeContinent_valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jtreeContinent.getSelectionPath().getLastPathComponent();
		
		if(selectedNode.isLeaf()) {
			City city = (City) selectedNode.getUserObject();
			loadTable(city);
		}
	}
	
	private void loadTable(City city) {
		DefaultTableModel defaultTableModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		ContinentModel continentModel = new ContinentModel();
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("Area");
		defaultTableModel.addColumn("Population");
		defaultTableModel.addRow(new Object[] {
					city.getId(),
					city.getName(),
					city.getArea(),
					city.getPopulation()
			});
		
		jtableCity.setModel(defaultTableModel);
		jtableCity.getTableHeader().setReorderingAllowed(false);
	}
	

	
	private void loadDataContinent() {
		ContinentModel continentModel = new ContinentModel();
		CountryModel countryModel = new CountryModel();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for(Continent continent:continentModel.createContinent()) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(continent);
			root.add(node);
			for(Country country:continent.getCountries()) {
				DefaultMutableTreeNode sideNodeCountry = new DefaultMutableTreeNode(country);
				node.add(sideNodeCountry);
				for(City city:country.getCities()) {
					DefaultMutableTreeNode sideNodeCity = new DefaultMutableTreeNode(city);
					sideNodeCountry.add(sideNodeCity); 
				}
			}
		}
		DefaultTreeModel defaultTreeModel = new DefaultTreeModel(root);
		jtreeContinent.setModel(defaultTreeModel);
		jtreeContinent.setCellRenderer( new ContinentTreeCellRenderer());
		//jtreeContinent.setCellRenderer(new CountrytreeCellRenderer());
		//jtreeContinent.setCellRenderer(new CitytreeCellRenderer());
		
	}
	
	private class ContinentTreeCellRenderer extends DefaultTreeCellRenderer {

		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded,
				boolean leaf, int row, boolean hasFocus) {
			// TODO Auto-generated method stub
			Component component =  super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
			if(node.getUserObject()!= null && node.getUserObject() instanceof Continent) {
				Continent continent = (Continent) node.getUserObject();
				setText(continent.getName());
				Image logo = new ImageIcon("src/Resource/continents/globe.png").getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(logo));
			}
			if(node.getUserObject()!= null && node.getUserObject() instanceof Country) {
				Country country = (Country) node.getUserObject();
				setText(country.getName());
				Image logo = new ImageIcon("src/Resource/countries/"+country.getName() +".png").getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(logo));
			}
			if(node.getUserObject()!= null && node.getUserObject() instanceof City) {
				City city = (City) node.getUserObject();
				setText(city.getName());
				Image logo = new ImageIcon("src/Resource/continents/location.png").getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(logo));
			}
			
			return component; 
		}
	}
	
	private class CountrytreeCellRenderer extends DefaultTreeCellRenderer {

		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded,
				boolean leaf, int row, boolean hasFocus) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
			if(node.getUserObject()!= null && node.getUserObject() instanceof Country) {
				Country country = (Country) node.getUserObject();
				value = country.getName(); 
			}
			if(node.getUserObject()!= null && node.getUserObject() instanceof City) {
				City city = (City) node.getUserObject();
				value = city.getName(); 
			}
			if(node.getUserObject()!= null && node.getUserObject() instanceof Continent) {
				Continent continent = (Continent) node.getUserObject();
				value = continent.getName(); 
			}
			// TODO Auto-generated method stub
			return super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		}
		
	}
	
	private class CitytreeCellRenderer extends DefaultTreeCellRenderer {

		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded,
				boolean leaf, int row, boolean hasFocus) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
			if(node.getUserObject()!= null && node.getUserObject() instanceof City) {
				City city = (City) node.getUserObject();
				value = city.getName(); 
			}
			// TODO Auto-generated method stub
			return super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		}
		
	}
}
