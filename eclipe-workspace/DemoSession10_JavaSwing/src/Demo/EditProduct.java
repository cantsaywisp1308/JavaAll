package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;

import Entities.Product;
import Model.ConnectDB;
import Model.ProductModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class EditProduct extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldName;
	private JTextField jtextFieldPrice;
	private JTextField jtextFieldQuantity;
	private JTextField jtextFieldDescription;
	private JDateChooser jdateChooserCreated;
	private JButton jbtnSave;
	private JCheckBox jchckbxStatus;
	private Product product;
	private Map<String, Object> values = new HashMap<String, Object>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProduct frame = new EditProduct();
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
	public EditProduct() {
		setTitle("Add products");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name ");
		lblNewLabel.setBounds(6, 27, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setBounds(6, 67, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantity ");
		lblNewLabel_1_1.setBounds(6, 110, 61, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Description");
		lblNewLabel_1_2.setBounds(6, 152, 88, 16);
		contentPane.add(lblNewLabel_1_2);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setBounds(106, 22, 220, 26);
		contentPane.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		jtextFieldPrice = new JTextField();
		jtextFieldPrice.setColumns(10);
		jtextFieldPrice.setBounds(106, 62, 220, 26);
		contentPane.add(jtextFieldPrice);
		
		jtextFieldQuantity = new JTextField();
		jtextFieldQuantity.setColumns(10);
		jtextFieldQuantity.setBounds(106, 105, 220, 26);
		contentPane.add(jtextFieldQuantity);
		
		jchckbxStatus = new JCheckBox("Status");
		jchckbxStatus.setBounds(106, 201, 128, 23);
		contentPane.add(jchckbxStatus);
		
		jtextFieldDescription = new JTextField();
		jtextFieldDescription.setBounds(106, 147, 220, 53);
		contentPane.add(jtextFieldDescription);
		jtextFieldDescription.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Created");
		lblNewLabel_2.setBounds(6, 239, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		jdateChooserCreated = new JDateChooser();
		jdateChooserCreated.setDateFormatString("dd/MM/yyyy" );
		jdateChooserCreated.setBounds(106, 229, 220, 26);
		contentPane.add(jdateChooserCreated);
		
		jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e);
			}
		});
		jbtnSave.setBounds(39, 299, 117, 29);
		contentPane.add(jbtnSave);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnCancel_actionPerformed(e); 
			}
		});
		jbtnCancel.setBounds(308, 299, 117, 29);
		contentPane.add(jbtnCancel);
	}
	
	private void jbtnSave_actionPerformed(ActionEvent e) {
		try {
			ProductModel productModel = new ProductModel();
			product.setCreated(jdateChooserCreated.getDate());
			product.setName(jtextFieldName.getText());
			product.setPrice(Double.parseDouble(jtextFieldPrice.getText()));
			product.setQuantity(Integer.parseInt(jtextFieldQuantity.getText()));
			product.setDescription(jtextFieldDescription.getText());
			product.setStatus(jchckbxStatus.isSelected());
			if(productModel.update(product)) {
				Main main = new Main();
				main.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Falied !");
			}
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	
	public EditProduct(Map<String, Object> values) {
		this();
		this.values = values; 
		loadData(); 
	}
	
	private void loadData() {
		int id = Integer.parseInt(values.get("id").toString());
		ProductModel productModel = new ProductModel();
		product = productModel.find(id);
		jtextFieldName.setText(product.getName());
		jtextFieldPrice.setText(String.valueOf(product.getPrice()));
		jtextFieldQuantity.setText(String.valueOf(product.getQuantity()));
		jchckbxStatus.setSelected(product.isStatus());
		jtextFieldDescription.setText(String.valueOf(product.getDescription()));
		jdateChooserCreated.setDate(product.getCreated());
	}
	
	private void jbtnCancel_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Main main = new Main();
		main.setVisible(true);
	}
}
