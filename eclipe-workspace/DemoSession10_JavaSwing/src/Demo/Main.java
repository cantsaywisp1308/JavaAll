package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Entities.Product;
import Helpers.NumberHelper;
import Model.ProductModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable jtableProduct;
	private JTextField jtextFieldSearch;
	private JTextField jtextFieldMin;
	private JTextField jtextFieldMax;
	private JButton jbtnSearch2;
	private JButton jbtnAdd;
	private JButton jbtnDelete;
	private JButton jbtnEdit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 98, 438, 122);
		contentPane.add(scrollPane);
		
		jtableProduct = new JTable();
		jtableProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtableProduct_mouseClicked(e); 
			}
		});
		jtableProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(jtableProduct);
		
		jtextFieldSearch = new JTextField();
		jtextFieldSearch.setBounds(6, 20, 122, 27);
		contentPane.add(jtextFieldSearch);
		jtextFieldSearch.setColumns(10);
		
		JButton jbtnSearch = new JButton("Search");
		jbtnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSearch_actionPerformed(e); 
			}
		});
		jbtnSearch.setBounds(140, 20, 94, 27);
		contentPane.add(jbtnSearch);
		
		jtextFieldMin = new JTextField();
		jtextFieldMin.setBounds(6, 59, 122, 27);
		contentPane.add(jtextFieldMin);
		jtextFieldMin.setColumns(10);
		
		jtextFieldMax = new JTextField();
		jtextFieldMax.setBounds(150, 59, 122, 27);
		contentPane.add(jtextFieldMax);
		jtextFieldMax.setColumns(10);
		
		jbtnSearch2 = new JButton("Search");
		jbtnSearch2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSearch2_actionPerformed(e);
			}
		});
		jbtnSearch2.setBounds(284, 59, 94, 27);
		contentPane.add(jbtnSearch2);
		
		jbtnAdd = new JButton("Add");
		jbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnAdd_actionPerformed(e); 
			}
		});
		jbtnAdd.setBounds(6, 232, 94, 27);
		contentPane.add(jbtnAdd);
		
		jbtnDelete = new JButton("Delete");
		jbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnDelete_actionPerformed(e);
			}
		});
		jbtnDelete.setBounds(112, 232, 94, 27);
		contentPane.add(jbtnDelete);
		
		jbtnEdit = new JButton("Edit");
		jbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnEdit_actionPerformed(e);
			}
		});
		jbtnEdit.setEnabled(false);
		jbtnEdit.setBounds(218, 232, 94, 27);
		contentPane.add(jbtnEdit);
		loadData(); 
	}
	
	private void jbtnEdit_actionPerformed(ActionEvent e) {
		int selectedRow = jtableProduct.getSelectedRow();
		int id = Integer.parseInt(jtableProduct.getValueAt(selectedRow, 0).toString());
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("id", id); 
		EditProduct editProduct = new EditProduct(values);
		editProduct.setVisible(true);
		setVisible(false);
	}
	
	public void jtableProduct_mouseClicked(MouseEvent e) {
		jbtnDelete.setEnabled(true);
		jbtnEdit.setEnabled(true);
	}
	
	public void jbtnAdd_actionPerformed(ActionEvent e) {
		AddProduct addProduct = new AddProduct();
		addProduct.setVisible(true);
		this.setVisible(false); 
	}
	
	private void jbtnDelete_actionPerformed(ActionEvent e) {
		try {
			int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirm", JOptionPane.YES_NO_OPTION); 
			if(result == JOptionPane.YES_OPTION) {
				ProductModel productModel = new ProductModel();
				int selectedRow = jtableProduct.getSelectedRow();
				int id = Integer.parseInt(jtableProduct.getValueAt(selectedRow, 0).toString());
				if(productModel.delete(id)) {
					fillDataToJTable(productModel.findAll());
					jbtnDelete.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(null, "Failed !");
				}
			}
		} catch(Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	
	private void jbtnSearch2_actionPerformed(ActionEvent e) {
		String min = jtextFieldMin.getText().trim();
		String max = jtextFieldMax.getText().trim();
		if(jtextFieldMin.getText().isEmpty() || jtextFieldMax.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Empty feature","Error", JOptionPane.ERROR_MESSAGE);
		} else {
			if(!NumberHelper.isNumber(min) || !NumberHelper.isNumber(max)) {
				JOptionPane.showMessageDialog(null, "Wrong feature", "Error", JOptionPane.ERROR_MESSAGE);
			} 
		 else {
			double mi = Double.parseDouble(min);
			double ma = Double.parseDouble(max); 
			ProductModel productModel = new ProductModel();
			fillDataToJTable(productModel.search(mi,ma)); 
		}
		}
	}
	
	private void jbtnSearch_actionPerformed(ActionEvent e) {
		String keyword = jtextFieldSearch.getText().trim();
		if(keyword.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Enter at least 1 char", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			ProductModel productModel = new ProductModel();
			fillDataToJTable(productModel.search(keyword)); 
		}
	}
	
	private void loadData() {
		ProductModel productModel = new ProductModel();
		fillDataToJTable(productModel.findAll()); 
		jbtnDelete.setEnabled(false);
		jbtnEdit.setEnabled(false);
	}
	
	private void fillDataToJTable(List<Product> products) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; 
			}
			
		};
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("Price");
		defaultTableModel.addColumn("Quantity");
		defaultTableModel.addColumn("Status");
		defaultTableModel.addColumn("Description");
		defaultTableModel.addColumn("Created");
		for(Product product:products) {
			defaultTableModel.addRow(new Object[] {
					product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.isStatus() ? "Show": "Hide",
					product.getDescription(), simpleDateFormat.format(product.getCreated())
			});
		}
		jtableProduct.setModel(defaultTableModel);
		jtableProduct.getTableHeader().setReorderingAllowed(false);
	}
}
