package Windows;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Entities.Account;
import Entities.Department;
import Entities.Location;
import Entities.Project;
import Entities.Transfer;
import Helper.MailHelper;
import Model.AccountModel;
import Model.DepartmentModel;
import Model.LocationModel;
//import Windows.EditProfile.LocationListCellRenderer;
//import Windows.EditProfile.DepartmentListCellRenderer;
import Model.ProjectModel;
import Model.TransferModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import Windows.EditProfile.ProjectListCellRenderer;

public class RequestTranfer extends JPanel {
	private Map<String, Object> values = new HashMap<String, Object>();
	private JComboBox jcomboBoxLocationTo;
	private JComboBox jcomboBoxDepartmentTo;
	private JComboBox jcomboBoxProjectTo;
	private Account account; 
	private JDateChooser jdateChooserRelievingDate;
	private JDateChooser jdateChooserJoiningDate;
	private JComboBox jcomboBoxManager;
	private JLabel jlblLocation;
	private JLabel jlbDepartment;
	private JLabel jlblProject;
	private JLabel jlblEmployeeName;
	private JLabel jlblEmployeeNumber;

	/**
	 * Create the panel.
	 */
	public RequestTranfer() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/request.png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Request Transfer");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Number");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(6, 19, 140, 16);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("I want to transfer to: ");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 237, 185, 16);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Location");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(6, 273, 61, 16);
		panel_2.add(lblNewLabel_4);
		
		jcomboBoxLocationTo = new JComboBox();
		jcomboBoxLocationTo.setBounds(110, 270, 184, 27);
		panel_2.add(jcomboBoxLocationTo);
		
		JLabel lblNewLabel_5 = new JLabel("Department");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(6, 312, 92, 16);
		panel_2.add(lblNewLabel_5);
		
		jcomboBoxDepartmentTo = new JComboBox();
		jcomboBoxDepartmentTo.setBounds(110, 309, 184, 27);
		panel_2.add(jcomboBoxDepartmentTo);
		
		JLabel lblNewLabel_6 = new JLabel("Project");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(6, 347, 61, 16);
		panel_2.add(lblNewLabel_6);
		
		jcomboBoxProjectTo = new JComboBox();
		jcomboBoxProjectTo.setBounds(110, 344, 184, 27);
		panel_2.add(jcomboBoxProjectTo);
		
		JLabel lblNewLabel_7 = new JLabel("Relieving Date");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(306, 273, 108, 16);
		panel_2.add(lblNewLabel_7);
		
		jdateChooserRelievingDate = new JDateChooser();
		jdateChooserRelievingDate.setBounds(420, 263, 140, 26);
		panel_2.add(jdateChooserRelievingDate);
		
		JLabel lblNewLabel_8 = new JLabel("Joining Date");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(306, 312, 106, 16);
		panel_2.add(lblNewLabel_8);
		
		jdateChooserJoiningDate = new JDateChooser();
		jdateChooserJoiningDate.setBounds(420, 302, 140, 26);
		panel_2.add(jdateChooserJoiningDate);
		
		JButton jbtnSubmit = new JButton("Submit");
		jbtnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSubmit_actionPerformed(e);
			}
		});
		jbtnSubmit.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnSubmit.setBounds(43, 386, 117, 29);
		panel_2.add(jbtnSubmit);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnCancel.setBounds(332, 386, 117, 29);
		panel_2.add(jbtnCancel);
		
		JLabel lblNewLabel_9 = new JLabel("Employee Name");
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(6, 62, 140, 16);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("I am currently working in:");
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(6, 98, 211, 16);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Location");
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(6, 128, 61, 16);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Department");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(6, 164, 92, 16);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Project");
		lblNewLabel_6_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(6, 201, 61, 16);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_11 = new JLabel("Send to");
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(306, 348, 61, 16);
		panel_2.add(lblNewLabel_11);
		
		jcomboBoxManager = new JComboBox();
		jcomboBoxManager.setBounds(379, 344, 181, 27);
		panel_2.add(jcomboBoxManager);
		
		jlblLocation = new JLabel("");
		jlblLocation.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblLocation.setBounds(110, 129, 184, 16);
		panel_2.add(jlblLocation);
		
		jlbDepartment = new JLabel("");
		jlbDepartment.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlbDepartment.setBounds(110, 165, 184, 16);
		panel_2.add(jlbDepartment);
		
		jlblProject = new JLabel("");
		jlblProject.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblProject.setBounds(110, 202, 184, 16);
		panel_2.add(jlblProject);
		
		jlblEmployeeNumber = new JLabel("");
		jlblEmployeeNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblEmployeeNumber.setBounds(158, 20, 256, 16);
		panel_2.add(jlblEmployeeNumber);
		
		jlblEmployeeName = new JLabel("");
		jlblEmployeeName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblEmployeeName.setBounds(158, 63, 256, 16);
		panel_2.add(jlblEmployeeName);

	}
	
	private void jbtnSubmit_actionPerformed(ActionEvent e) {
		Transfer transfer = new Transfer();
		AccountModel accountModel = new AccountModel();
		transfer.setUsername(jlblEmployeeNumber.getText());
		transfer.setFullname(jlblEmployeeName.getText());
		transfer.setCurrentLocation(jlblLocation.getText());
		Location transferLocation = (Location) jcomboBoxLocationTo.getSelectedItem();
		transfer.setTransferLocation(transferLocation.getLocationName());
		transfer.setCurrentDepartment(jlbDepartment.getText()); 
		Department transferDepartment = (Department) jcomboBoxDepartmentTo.getSelectedItem();
		transfer.setTransferDepartment(transferDepartment.getDeparmentName());
		transfer.setCurrentProject(jlblProject.getText()); 
		Project transferProject = (Project) jcomboBoxProjectTo.getSelectedItem(); 
		transfer.setTransferProject(transferProject.getProjectName());
		transfer.setRelievingDate(jdateChooserRelievingDate.getDate());
		transfer.setJoiningDate(jdateChooserJoiningDate.getDate());
		Account manager = (Account) jcomboBoxManager.getSelectedItem(); 
		transfer.setReportManager(manager.getFullName());
		String email = manager.getEmail(); 
		TransferModel transferModel = new TransferModel(); 
		if(transferModel.add(transfer)) {
			String content ="Dear Sir/Madam, " +
					"<br>You have a transfer request from : "+ jlblEmployeeName.getText() +
					"<br>He/ She  wants to move to " + transferLocation.getLocationName() + 
					"<br> Department: "+transferDepartment.getDeparmentName()  + 
					"<br> Project: " + transferProject.getProjectName() +
					"<br> The request is in the Request List";
			if(MailHelper.send("duykhang.trinh1308@gmail.com", email, "Request Arrived", content)) {
				JOptionPane.showMessageDialog(null, "Request Sent ! ");
			} else {
				JOptionPane.showMessageDialog(null, "Cannot send email");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Failed ! ");
		}
	}
	
	public RequestTranfer(Map<String, Object>values) {
		this();
		this.values = values; 
		loadData(); 
		loadDataLocationTo();
		loadDataDepartmentTo();
		loadDataProjectTo(); 
		loadDataManager();
	}
		
	private void loadData() {
		account = (Account) values.get("account");
		jlblEmployeeNumber.setText(account.getUsername());
		jlblEmployeeName.setText(account.getFullName());
		jlblLocation.setText(account.getLocation());
		jlbDepartment.setText(account.getDepartment());
		jlblProject.setText(account.getProject());
	}
	
	
	private void loadDataLocationTo() {
		DefaultComboBoxModel<Location> DefaultComboBoxModelLocation = new DefaultComboBoxModel<Location>();
		LocationModel locationModel = new LocationModel();
		List<Location> locations = locationModel.findAll();
		for(Location location:locations) {
			DefaultComboBoxModelLocation.addElement(location); 
		}
		//jcomboBoxLocationFrom.setModel(DefaultComboBoxModelLocation);
		//jcomboBoxLocationFrom.setRenderer(new LocationFromListCellRenderer());
		jcomboBoxLocationTo.setModel(DefaultComboBoxModelLocation);
		jcomboBoxLocationTo.setRenderer(new LocationToListCellRenderer());
	}
	
	private class LocationToListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Location locations = (Location) value;
			value = locations.getLocationName();  
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
	}
	
	
	
	private void loadDataDepartmentTo() {
		DefaultComboBoxModel<Department> defaultComboBoxModelDepartment = new DefaultComboBoxModel<Department>();
		DepartmentModel departmentModel = new DepartmentModel();
		List<Department> departments = departmentModel.findAll();
		for(Department department:departments) {
			defaultComboBoxModelDepartment.addElement(department);
		}
		//jcomboBoxDepartmentFrom.setModel(defaultComboBoxModelDepartment);
		//jcomboBoxDepartmentFrom.setRenderer(new DepartmentFromListCellRenderer());
		jcomboBoxDepartmentTo.setModel(defaultComboBoxModelDepartment);
		jcomboBoxDepartmentTo.setRenderer(new DepartmentToListCellRenderer());
	}
	
	private class DepartmentToListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Department departments = (Department) value;
			value = departments.getDeparmentName(); 
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
	}
	
	
	private void loadDataProjectTo() {
		DefaultComboBoxModel<Project> DefaultComboBoxModelProject = new DefaultComboBoxModel<Project>();
		ProjectModel projectModel = new ProjectModel(); 
		List<Project> projects = projectModel.findAll();
		for(Project project:projects) {
			DefaultComboBoxModelProject.addElement(project); 
		}
		//jcomboBoxProjectFrom.setModel(DefaultComboBoxModelProject);
		//jcomboBoxProjectFrom.setRenderer(new ProjectListCellRenderer());
		jcomboBoxProjectTo.setModel(DefaultComboBoxModelProject);
		jcomboBoxProjectTo.setRenderer(new ProjectToListCellRenderer());
	}
	
	private class ProjectToListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Project projects = (Project) value;
			value = projects.getProjectName(); 
			// TODO Auto-generated method stub
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
	}
	
	private void loadDataManager() {
		DefaultComboBoxModel<Account> DefaultComboBoxModelManager = new DefaultComboBoxModel<Account >();
		AccountModel accountModel = new AccountModel();
		List<Account> managers = accountModel.findByRole("manager");
		for(Account manager:managers) {
			DefaultComboBoxModelManager.addElement(manager);
		}
		jcomboBoxManager.setModel(DefaultComboBoxModelManager);
		jcomboBoxManager.setRenderer(new ManagerListCellRenderer());
	}
	
	private class ManagerListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Account managers = (Account) value;
			value = managers.getFullName();
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
}
