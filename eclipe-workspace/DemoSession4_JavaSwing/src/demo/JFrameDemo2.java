package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import entities.Product;
import models.ProductModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class JFrameDemo2 extends JFrame {

	private JPanel contentPane;
	private JTable jtableProduct;
	private JTextField jtextFieldId;
	private JTextField jtextFieldName;
	private JTextField jtextFieldPrice;
	private JTextField jtextFieldQuantity;
	private JTextField jtextFieldCreated;
	private JCheckBox jcheckboxStatus;

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
					JFrameDemo2 frame = new JFrameDemo2();
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
	public JFrameDemo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 584, 125);
		contentPane.add(scrollPane);

		jtableProduct = new JTable();
		jtableProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtableProduct_mouseClicked(arg0);
			}
		});
		jtableProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(jtableProduct);

		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 148, 55, 16);
		contentPane.add(lblId);

		jtextFieldId = new JTextField();
		jtextFieldId.setBounds(71, 142, 141, 28);
		contentPane.add(jtextFieldId);
		jtextFieldId.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 182, 55, 16);
		contentPane.add(lblName);

		jtextFieldName = new JTextField();
		jtextFieldName.setColumns(10);
		jtextFieldName.setBounds(71, 176, 141, 28);
		contentPane.add(jtextFieldName);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(235, 148, 55, 16);
		contentPane.add(lblPrice);

		jtextFieldPrice = new JTextField();
		jtextFieldPrice.setColumns(10);
		jtextFieldPrice.setBounds(298, 142, 141, 28);
		contentPane.add(jtextFieldPrice);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(235, 182, 55, 16);
		contentPane.add(lblQuantity);

		jtextFieldQuantity = new JTextField();
		jtextFieldQuantity.setColumns(10);
		jtextFieldQuantity.setBounds(298, 176, 141, 28);
		contentPane.add(jtextFieldQuantity);

		JLabel lblCreated = new JLabel("Created");
		lblCreated.setBounds(10, 216, 55, 16);
		contentPane.add(lblCreated);

		jtextFieldCreated = new JTextField();
		jtextFieldCreated.setColumns(10);
		jtextFieldCreated.setBounds(71, 210, 141, 28);
		contentPane.add(jtextFieldCreated);

		jcheckboxStatus = new JCheckBox("Status");
		jcheckboxStatus.setBounds(298, 210, 104, 18);
		contentPane.add(jcheckboxStatus);

		loadData();
	}

	private void jtableProduct_mouseClicked(MouseEvent arg0) {
		int selectedRow = jtableProduct.getSelectedRow();
		String id = jtableProduct.getValueAt(selectedRow, 0).toString();
		ProductModel productModel = new ProductModel();
		Product product = productModel.find(id);
		jtextFieldId.setText(product.getId());
		jtextFieldName.setText(product.getName());
		jtextFieldPrice.setText(String.valueOf(product.getPrice()));
		jtextFieldQuantity.setText(String.valueOf(product.getQuantity()));
		jcheckboxStatus.setSelected(product.isStatus());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		jtextFieldCreated.setText(simpleDateFormat.format(product.getCreated()));
	}

	private void loadData() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		ProductModel productModel = new ProductModel();
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};
		defaultTableModel.addColumn("Id");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("Status");
		defaultTableModel.addColumn("Created");
		defaultTableModel.addColumn("Price");
		defaultTableModel.addColumn("Quantity");
		defaultTableModel.addColumn("Total");
		for (Product product : productModel.findAll()) {
			defaultTableModel.addRow(new Object[] { product.getId(), product.getName(),
					product.isStatus() ? "Show" : "Hide", simpleDateFormat.format(product.getCreated()),
					product.getPrice(), product.getQuantity(), product.getPrice() * product.getQuantity() });
		}
		jtableProduct.setModel(defaultTableModel);
		jtableProduct.getTableHeader().setReorderingAllowed(false);
	}
}
