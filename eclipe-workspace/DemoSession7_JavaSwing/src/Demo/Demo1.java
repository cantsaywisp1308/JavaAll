package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo1 extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbtnInfoDialog = new JButton("info Dialog");
		jbtnInfoDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnInfoDialog_actionPerformed(e); 
			}
		});
		jbtnInfoDialog.setBounds(6, 21, 117, 29);
		contentPane.add(jbtnInfoDialog);
		
		JButton jbtnConfirmDialog = new JButton("Confirm");
		jbtnConfirmDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnConfirmDialog_actionPerformed(e); 
			}
		});
		jbtnConfirmDialog.setBounds(153, 21, 117, 29);
		contentPane.add(jbtnConfirmDialog);
	}
	
	private void jbtnInfoDialog_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Done!" ,"Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void jbtnConfirmDialog_actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Message",JOptionPane.YES_NO_CANCEL_OPTION); 
		System.out.print(result);
		if(result == JOptionPane.YES_OPTION) {
			System.out.print("Yes");
		} else if (result == JOptionPane.NO_OPTION) {
			System.out.print("No");
		} else {
			System.out.print("Cancel");
		}
	}

}
