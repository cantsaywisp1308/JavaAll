package Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Entities.Invoice;
import Model.InvoiceModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private JTable jtableInvoice;
	private JTextField jtextFieldFrom;
	private JTextField jtextFieldTo;
	private JComboBox jcomboBoxPayment;
	private JComboBox jcomboBoxStatus;
	private JButton jButtonSearch;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 36, 438, 99);
		contentPane.add(scrollPane);
		
		jtableInvoice = new JTable();
		scrollPane.setViewportView(jtableInvoice);
		
		jcomboBoxPayment = new JComboBox();
		jcomboBoxPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxPayment_actionPerformed(e);
			}
		});
		jcomboBoxPayment.setBounds(6, 147, 115, 27);
		contentPane.add(jcomboBoxPayment);
		
		jcomboBoxStatus = new JComboBox();
		jcomboBoxStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxStatus_actionPerformed(e);
			}
		});
		jcomboBoxStatus.setBounds(117, 147, 105, 27);
		contentPane.add(jcomboBoxStatus);
		
		JLabel lblNewLabel = new JLabel("From");
		lblNewLabel.setBounds(223, 151, 61, 16);
		contentPane.add(lblNewLabel);
		
		jtextFieldFrom = new JTextField();
		jtextFieldFrom.setBounds(260, 146, 130, 26);
		contentPane.add(jtextFieldFrom);
		jtextFieldFrom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setBounds(223, 186, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		jtextFieldTo = new JTextField();
		jtextFieldTo.setBounds(260, 179, 130, 26);
		contentPane.add(jtextFieldTo);
		jtextFieldTo.setColumns(10);
		
		jButtonSearch = new JButton("Search");
		jButtonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonSearch_actionPerformed(e); 
			}
		});
		jButtonSearch.setBounds(247, 221, 117, 29);
		contentPane.add(jButtonSearch);
		loadDataTable();
	}
	
	private void jcomboBoxPayment_actionPerformed(ActionEvent e) {
		String payment = jcomboBoxPayment.getSelectedItem().toString();
		InvoiceModel invoiceModel = new InvoiceModel();
		if(payment.equalsIgnoreCase("all")) {
			fillDataToJTable(invoiceModel.findAll()); 
		} else {
			fillDataToJTable(invoiceModel.findByPayment(payment));
		}
	}
	
	private void jcomboBoxStatus_actionPerformed(ActionEvent e) {
		String status = jcomboBoxStatus.getSelectedItem().toString();
		InvoiceModel invoiceModel = new InvoiceModel();
		if(status.equalsIgnoreCase("all")) {
			fillDataToJTable(invoiceModel.findAll()); 
		} else {
			fillDataToJTable(invoiceModel.findByStatus(status));
		}
	}
	
	public void jButtonSearch_actionPerformed(ActionEvent e) {
		double from = Double.parseDouble(jtextFieldFrom.getText());
		double to = Double.parseDouble(jtextFieldTo.getText());
		InvoiceModel invoiceModel = new InvoiceModel();
		fillDataToJTable(invoiceModel.findByTotal(from, to)); 
	}
	
	private void loadDataTable() {
		
		
		
		InvoiceModel invoiceModel = new InvoiceModel();
		fillDataToJTable(invoiceModel.findAll()); 
		
		DefaultComboBoxModel<String> defaultComboBoxModelStatus = new DefaultComboBoxModel();
		defaultComboBoxModelStatus.addElement("All");
		defaultComboBoxModelStatus.addElement("Paid");
		defaultComboBoxModelStatus.addElement("On Hold");
		jcomboBoxStatus.setModel(defaultComboBoxModelStatus);
		
		DefaultComboBoxModel<String> defaultComboBoxModelPayment = new DefaultComboBoxModel();
		defaultComboBoxModelPayment.addElement("All");
		defaultComboBoxModelPayment.addElement("Cash");
		defaultComboBoxModelPayment.addElement("Check");
		defaultComboBoxModelPayment.addElement("Credit Card");
		jcomboBoxPayment.setModel(defaultComboBoxModelPayment); 
	}
	
	

	private void fillDataToJTable(List<Invoice> invoices) {
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false; 
			}
			
		};
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		defaultTableModel.addColumn("Id");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("Total");
		defaultTableModel.addColumn("Payment");
		defaultTableModel.addColumn("Status");
		defaultTableModel.addColumn("Created");
		for(Invoice invoice:invoices) {
			defaultTableModel.addRow(new Object[] {
					invoice.getId(),
					invoice.getName(),
					invoice.getTotal(),
					invoice.getPayment(),
					invoice.getStatus(),
					simpleDateFormat.format(invoice.getCreated())
			} );
		}
		jtableInvoice.setModel(defaultTableModel);
	}
}
