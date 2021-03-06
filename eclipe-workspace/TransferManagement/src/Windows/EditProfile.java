package Windows;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.Color;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import Entities.Account;
import Entities.Department;
import Entities.Location;
import Entities.Project;
import Model.AccountModel;
import Model.DepartmentModel;
import Model.LocationModel;
import Model.ProjectModel;

import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class EditProfile extends JPanel {
	private JTextField textFieldFullName;
	private JPanel panel_2;
	private JTextField jtextFieldPhone;
	private JTextField jtextFieldEmail;
	private Map<String, Object>values = new HashMap<String, Object>();
	private JLabel jlblProfilePicture;
	private JButton jbtnCancel;
	private JButton jbtnSave;
	private JDateChooser jdateChooserBirthday;
	private File photo; 
	private Account account; 
	private JLabel jlblCurrentDepartment;
	private JLabel jlblCurrentLocation;
	private JLabel jlblCurrentProject;
	

	/**
	 * Create the panel.
	 */
	public EditProfile() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipse-workspace/TransferManagement/src/Image/PNG-24/Profile.png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/Profile.png"));
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1 = new JLabel("Edit Profile Section");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(203, 17, 81, 16);
		panel_2.add(lblNewLabel_2);
		
		textFieldFullName = new JTextField();
		textFieldFullName.setBounds(296, 12, 243, 26);
		panel_2.add(textFieldFullName);
		textFieldFullName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Birthday");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(203, 55, 61, 16);
		panel_2.add(lblNewLabel_3);
		
		jdateChooserBirthday = new JDateChooser();
		jdateChooserBirthday.setBounds(296, 54, 243, 26);
		panel_2.add(jdateChooserBirthday);
		
		JLabel lblNewLabel_4 = new JLabel("Phone");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(203, 97, 61, 16);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(203, 135, 61, 16);
		panel_2.add(lblNewLabel_5);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setBounds(296, 92, 243, 26);
		panel_2.add(jtextFieldPhone);
		jtextFieldPhone.setColumns(10);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.setBounds(296, 130, 243, 26);
		panel_2.add(jtextFieldEmail);
		jtextFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Profile Picture");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(6, 17, 112, 16);
		panel_2.add(lblNewLabel_6);
		
		jlblProfilePicture = new JLabel("");
		jlblProfilePicture.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlblProfilePicture.setBounds(16, 45, 128, 149);
		panel_2.add(jlblProfilePicture);
		
		jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e);
			}
		});
		jbtnSave.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnSave.setBounds(55, 320, 117, 29);
		panel_2.add(jbtnSave);
		
		jbtnCancel = new JButton("Cancel");
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(348, 320, 117, 29);
		panel_2.add(jbtnCancel);
		
		JButton jbtnBrowse = new JButton("Browse");
		jbtnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnBrowse_actionPerformed(e);
			}
		});
		jbtnBrowse.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnBrowse.setBounds(6, 200, 117, 29);
		panel_2.add(jbtnBrowse);
		
		JLabel lblNewLabel_7 = new JLabel("Current Location");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(203, 178, 129, 16);
		panel_2.add(lblNewLabel_7);
		
		jlblCurrentLocation = new JLabel("");
		jlblCurrentLocation.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblCurrentLocation.setBounds(355, 178, 184, 16);
		panel_2.add(jlblCurrentLocation);
		
		JLabel lblNewLabel_7_1 = new JLabel("Current Department");
		lblNewLabel_7_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(203, 213, 144, 16);
		panel_2.add(lblNewLabel_7_1);
		
		jlblCurrentDepartment = new JLabel("");
		jlblCurrentDepartment.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblCurrentDepartment.setBounds(355, 213, 184, 16);
		panel_2.add(jlblCurrentDepartment);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Current Project");
		lblNewLabel_7_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7_1_1.setBounds(203, 249, 144, 16);
		panel_2.add(lblNewLabel_7_1_1);
		
		jlblCurrentProject = new JLabel("");
		jlblCurrentProject.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblCurrentProject.setBounds(355, 250, 184, 16);
		panel_2.add(jlblCurrentProject);

	}
	
	public void jbtnSave_actionPerformed(ActionEvent e) {
		AccountModel accountModel = new AccountModel();
		try {
			account.setFullName(textFieldFullName.getText());
			account.setBirthday(jdateChooserBirthday.getDate());
			account.setPhone(jtextFieldPhone.getText());
			account.setEmail(jtextFieldEmail.getText());
			if(photo == null) {
				account.setPhoto(account.getPhoto());
			} else {
				account.setPhoto(Files.readAllBytes(Paths.get(photo.getAbsolutePath())));
			}
			
			if(accountModel.update(account)) {
				JOptionPane.showMessageDialog(null,"Successfully Update !");
			} else {
				JOptionPane.showMessageDialog(null, "Fail to update !");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Fail to update !");
		}
	}
	
	public void jbtnBrowse_actionPerformed(ActionEvent e) {
		JFileChooser jFileChooser = new  JFileChooser();
		jFileChooser.setDialogTitle("Upload Files");
		jFileChooser.setMultiSelectionEnabled(false);
		int result = jFileChooser.showOpenDialog(null);
		if (result == jFileChooser.APPROVE_OPTION) {
			photo = jFileChooser.getSelectedFile();
			int height = jlblProfilePicture.getHeight();
			int width = jlblProfilePicture.getWidth();
			Image image = new ImageIcon(photo.getAbsolutePath()).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
			jlblProfilePicture.setIcon(new ImageIcon(image));
		}
	}
	
	public EditProfile(Map<String, Object>values) {
		this();
		this.values = values;
		loadData(); 
	}
	
	private void loadData() {
		AccountModel accountModel = new AccountModel();
		account = (Account) values.get("account");
		textFieldFullName.setText(account.getFullName());
		jdateChooserBirthday.setDate(account.getBirthday());
		jtextFieldPhone.setText(account.getPhone());
		jtextFieldEmail.setText(account.getEmail());
		int height = jlblProfilePicture.getHeight();
		int width = jlblProfilePicture.getWidth();
		Image image = new ImageIcon(account.getPhoto()).getImage().getScaledInstance(width, height,Image.SCALE_SMOOTH);
		jlblProfilePicture.setIcon(new ImageIcon(image));
		jlblCurrentLocation.setText(account.getLocation());
		jlblCurrentDepartment.setText(account.getDepartment());
		jlblCurrentProject.setText(account.getProject());
	}
}
