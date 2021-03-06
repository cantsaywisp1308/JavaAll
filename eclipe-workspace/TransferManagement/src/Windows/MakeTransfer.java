package Windows;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.List;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Entities.Account;
import Entities.Department;
import Entities.Location;
import Entities.Project;
import Entities.Transfer;
import Helper.MailHelper;
import Helper.NumberHelper;
import Model.AccountModel;
import Model.DepartmentModel;
import Model.LocationModel;
import Model.ProjectModel;
import Model.TransferModel;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakeTransfer extends JPanel {
	private JTextField jtextFieldAllowance;
	private JComboBox jcomboBoxEmployeeNumber;
	private JComboBox jcomboBoxLocationTo;
	private JComboBox jcomboBoxDepartmentTo;
	private JComboBox jcomboBoxProjectTo;
	private JComboBox jcomboBoxManager;
	private JDateChooser jdateChooserJoiningDate;
	private JDateChooser jdateChooserRelievingDate;
	private JLabel jlblEmployeeName;
	private JLabel jlblLocationFrom;
	private JLabel jlblDepartmentFrom;
	private JPanel panel_2;
	private JLabel jlblProjectFrom;

	/**
	 * Create the panel.
	 */
	public MakeTransfer() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookair/eclipe-workspace/TransferManagement/src/Image/PNG-24/pie-chart.png"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Make Transfer");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Number");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(6, 6, 142, 16);
		panel_2.add(lblNewLabel_2);
		
		jcomboBoxEmployeeNumber = new JComboBox();
		jcomboBoxEmployeeNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcomboBoxEmployeeNumber_actionPerformed(e);
			}
		});
		jcomboBoxEmployeeNumber.setBounds(160, 3, 195, 27);
		panel_2.add(jcomboBoxEmployeeNumber);
		
		JLabel lblNewLabel_3 = new JLabel("Employee Name");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 34, 123, 16);
		panel_2.add(lblNewLabel_3);
		
		jlblEmployeeName = new JLabel("");
		jlblEmployeeName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblEmployeeName.setBounds(141, 34, 264, 16);
		panel_2.add(jlblEmployeeName);
		
		JLabel lblNewLabel_4 = new JLabel("From");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_4.setBounds(6, 62, 61, 16);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Location");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(6, 90, 91, 16);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Department");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(6, 118, 91, 16);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Project");
		lblNewLabel_5_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(6, 146, 91, 16);
		panel_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("To");
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(6, 174, 61, 16);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_3 = new JLabel("Location");
		lblNewLabel_5_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_3.setBounds(6, 202, 91, 16);
		panel_2.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Department");
		lblNewLabel_5_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_4.setBounds(6, 230, 91, 16);
		panel_2.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Project");
		lblNewLabel_5_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_5.setBounds(6, 258, 91, 16);
		panel_2.add(lblNewLabel_5_5);
		
		jcomboBoxLocationTo = new JComboBox();
		jcomboBoxLocationTo.setBounds(109, 199, 162, 27);
		panel_2.add(jcomboBoxLocationTo);
		
		jcomboBoxDepartmentTo = new JComboBox();
		jcomboBoxDepartmentTo.setBounds(109, 227, 162, 27);
		panel_2.add(jcomboBoxDepartmentTo);
		
		jcomboBoxProjectTo = new JComboBox();
		jcomboBoxProjectTo.setBounds(109, 255, 162, 27);
		panel_2.add(jcomboBoxProjectTo);
		
		JLabel lblNewLabel_6 = new JLabel("Relieving Date");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(283, 203, 101, 16);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Joining Date");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(283, 231, 101, 16);
		panel_2.add(lblNewLabel_7);
		
		jdateChooserRelievingDate = new JDateChooser();
		jdateChooserRelievingDate.setBounds(396, 192, 154, 26);
		panel_2.add(jdateChooserRelievingDate);
		
		jdateChooserJoiningDate = new JDateChooser();
		jdateChooserJoiningDate.setBounds(396, 220, 154, 26);
		panel_2.add(jdateChooserJoiningDate);
		
		JLabel lblNewLabel_8 = new JLabel("Allowance");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(283, 259, 91, 16);
		panel_2.add(lblNewLabel_8);
		
		jtextFieldAllowance = new JTextField();
		jtextFieldAllowance.setBounds(396, 254, 154, 26);
		panel_2.add(jtextFieldAllowance);
		jtextFieldAllowance.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Made By");
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(6, 286, 101, 16);
		panel_2.add(lblNewLabel_9);
		
		jcomboBoxManager = new JComboBox();
		jcomboBoxManager.setBounds(109, 283, 162, 27);
		panel_2.add(jcomboBoxManager);
		
		JButton jbtnSubmit = new JButton("Submit");
		jbtnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSubmit_actionPerformed(e); 
			}
		});
		jbtnSubmit.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jbtnSubmit.setBounds(31, 366, 117, 29);
		panel_2.add(jbtnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnCancel.setBounds(396, 366, 117, 29);
		panel_2.add(btnCancel);
		
		jlblLocationFrom = new JLabel("");
		jlblLocationFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblLocationFrom.setBounds(109, 91, 162, 16);
		panel_2.add(jlblLocationFrom);
		
		jlblDepartmentFrom = new JLabel("");
		jlblDepartmentFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblDepartmentFrom.setBounds(109, 119, 162, 16);
		panel_2.add(jlblDepartmentFrom);
		
		jlblProjectFrom = new JLabel("");
		jlblProjectFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jlblProjectFrom.setBounds(109, 147, 162, 16);
		panel_2.add(jlblProjectFrom);
		loadDatatoEmployeeNumber();
		loadDatatoLocationTo();
		loadDatatoDepartmentTo();
		loadDatatoProjectTo(); 
		loadDatatoSendTo();
	}
	
	public void jcomboBoxEmployeeNumber_actionPerformed(ActionEvent e) {
		Account employee = (Account) jcomboBoxEmployeeNumber.getSelectedItem();
		jlblEmployeeName.setText(employee.getFullName());
		jlblLocationFrom.setText(employee.getLocation());
		jlblDepartmentFrom.setText(employee.getDepartment());
		jlblProjectFrom.setText(employee.getProject());
	}
	
	private void loadDatatoEmployeeNumber() {
		DefaultComboBoxModel<Account> DefaultComboBoxModelEmployeeNumber = new DefaultComboBoxModel<Account>();
		AccountModel accountModel = new AccountModel();
		List<Account> employees = accountModel.findByRole("employee");
		for(Account employee:employees) {
			DefaultComboBoxModelEmployeeNumber.addElement(employee);
		}
		jcomboBoxEmployeeNumber.setModel(DefaultComboBoxModelEmployeeNumber);
		jcomboBoxEmployeeNumber.setRenderer(new EmployeeListCellRenderer());
	}
	
	private class EmployeeListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Account employees = (Account) value;
			value = employees.getUsername();
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
	private void loadDatatoLocationTo() {
		DefaultComboBoxModel<Location> DefaultComboBoxModelLocationTo = new DefaultComboBoxModel<Location>();
		LocationModel locationModel = new LocationModel();
		List<Location> locationsTo = locationModel.findAll();
		for(Location locationTo :locationsTo) {
			DefaultComboBoxModelLocationTo.addElement(locationTo);
		}
		jcomboBoxLocationTo.setModel(DefaultComboBoxModelLocationTo);
		jcomboBoxLocationTo.setRenderer(new LocationToListCellRenderer());
	}
	
	private class LocationToListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Location locationsFrom = (Location) value;
			value = locationsFrom.getLocationName();
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
	private void loadDatatoDepartmentTo() {
		DefaultComboBoxModel<Department> DefaultComboBoxModelDepartmentTo = new DefaultComboBoxModel<Department>();
		DepartmentModel departmentModel = new DepartmentModel();
		List<Department> departmentsTo  = departmentModel.findAll();
		for(Department departmentTo: departmentsTo ) {
			DefaultComboBoxModelDepartmentTo.addElement(departmentTo);
		}
		jcomboBoxDepartmentTo.setModel(DefaultComboBoxModelDepartmentTo);
		jcomboBoxDepartmentTo.setRenderer(new DepartmentToListCellRenderer());
	}
	
	private class DepartmentToListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Department departmentsTo = (Department) value;
			value = departmentsTo.getDeparmentName(); 
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
	}
	
	private void loadDatatoProjectTo() {
		DefaultComboBoxModel<Project> DefaultComboBoxModelProjectFrom = new DefaultComboBoxModel<Project>();
		ProjectModel projectModel = new ProjectModel();
		List<Project> projectsTo = projectModel.findAll();
		for(Project projectTo :projectsTo) {
			DefaultComboBoxModelProjectFrom.addElement(projectTo);
		}
		jcomboBoxProjectTo.setModel(DefaultComboBoxModelProjectFrom);
		jcomboBoxProjectTo.setRenderer(new ProjectToListCellRenderer());
	}
	
	private class ProjectToListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Project projectsTo = (Project) value;
			value = projectsTo.getProjectName(); 
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
	private void loadDatatoSendTo() {
		DefaultComboBoxModel<Account> DefaultComboBoxModelManager = new DefaultComboBoxModel<Account>();
		AccountModel accountModel = new AccountModel();
		List<Account> managers  = accountModel.findByRole("manager");
		for(Account manager:managers) {
			DefaultComboBoxModelManager.addElement(manager);
		}
		jcomboBoxManager.setModel(DefaultComboBoxModelManager);
		jcomboBoxManager.setRenderer(new ManagersListCellRenderer());
	}
	
	private class ManagersListCellRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Account managers = (Account) value;
			value = managers.getFullName();
			return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		}
		
	}
	
	public void jbtnSubmit_actionPerformed(ActionEvent e) {
		NumberHelper numberHelper = new NumberHelper();
		if(numberHelper.isNumber(jtextFieldAllowance.getText()) == false) {
			JOptionPane.showMessageDialog(null, "Invalid value of Allowance, please edit to a number !");
		} else {
			Transfer transfer = new Transfer();
			AccountModel accountModel = new AccountModel();
			Account employee = (Account) jcomboBoxEmployeeNumber.getSelectedItem();
			transfer.setUsername(employee.getUsername());
			transfer.setFullname(jlblEmployeeName.getText());
			transfer.setCurrentLocation(jlblLocationFrom.getText());
			Location transferLocation = (Location) jcomboBoxLocationTo.getSelectedItem();
			transfer.setTransferLocation(transferLocation.getLocationName());
			transfer.setCurrentDepartment(jlblDepartmentFrom.getText()); 
			Department transferDepartment = (Department) jcomboBoxDepartmentTo.getSelectedItem();
			transfer.setTransferDepartment(transferDepartment.getDeparmentName());
			transfer.setCurrentProject(jlblProjectFrom.getText()); 
			Project transferProject = (Project) jcomboBoxProjectTo.getSelectedItem(); 
			transfer.setTransferProject(transferProject.getProjectName());
			transfer.setRelievingDate(jdateChooserRelievingDate.getDate());
			transfer.setJoiningDate(jdateChooserJoiningDate.getDate());
			Account manager = (Account) jcomboBoxManager.getSelectedItem(); 
			String allowance = jtextFieldAllowance.getText();
			transfer.setAllowance(Integer.parseInt(allowance));
			transfer.setReportManager(manager.getFullName());
			String emailManager = manager.getEmail(); 
			TransferModel transferModel = new TransferModel(); 
			if(transferModel.add(transfer)) {
				String contentToEmployee ="Dear Sir/Madam, " +
						"<br>You have a transfer request from : "+ manager.getFullName() +
						"<br>He/ She  wants you to move to " + transferLocation.getLocationName() + 
						"<br> Department: "+transferDepartment.getDeparmentName()  + 
						"<br> Project: " + transferProject.getProjectName() +
						"<br> The request is in the Request List";
				
				String contentToManager = "Dear Sir/Madam, " +
						"<br>You make a transfer request to : "+ employee.getFullName() +
						"<br>He/ She will move to " + transferLocation.getLocationName() + 
						"<br> Department: "+transferDepartment.getDeparmentName()  + 
						"<br> Project: " + transferProject.getProjectName() +
						"<br> The request is in the Request List";
				
				
				if(MailHelper.send("duykhang.trinh1308@gmail.com", emailManager, "Request Made", contentToManager) 
						&& MailHelper.send("duykhang.trinh1308@gmail.com", employee.getEmail(), "Request Arrived", contentToEmployee)) {
					JOptionPane.showMessageDialog(null, "Request Sent ! ");
				} else {
					JOptionPane.showMessageDialog(null, "Cannot send email");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Failed ! ");
			}
		} 
	}
}
