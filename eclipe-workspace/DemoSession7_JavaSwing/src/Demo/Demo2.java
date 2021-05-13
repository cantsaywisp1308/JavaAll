package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Demo2 extends JFrame {

	private JPanel contentPane;
	private JLabel jlblPhoto;
	private JButton jbtnOpenFiles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 frame = new Demo2();
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
	public Demo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbtnOpenFile = new JButton("Open file");
		jbtnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnOpenFile_actionPerformed(e); 
			}
		});
		jbtnOpenFile.setBounds(6, 24, 117, 29);
		contentPane.add(jbtnOpenFile);
		
		jlblPhoto = new JLabel("");
		jlblPhoto.setBounds(16, 76, 107, 184);
		contentPane.add(jlblPhoto);
		
		jbtnOpenFiles = new JButton("Open Files");
		jbtnOpenFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnOpenFiles_actionPerformed(e);
			}
		});
		jbtnOpenFiles.setBounds(174, 24, 117, 29);
		contentPane.add(jbtnOpenFiles);
	}
	
	public void jbtnOpenFile_actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser("/Users/macbookair/Desktop/Anime Background");
		fileChooser.setDialogTitle("Select a photo"); 
		fileChooser.setMultiSelectionEnabled(false);
		int result = fileChooser.showOpenDialog(null); 
		if(result == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			System.out.println("path: "+file.getAbsolutePath());
			System.out.println("File name: "+file.getName());
			System.out.println("File name: "+file.length());
			jlblPhoto.setIcon(new ImageIcon(file.getAbsolutePath()));
		} else {
			System.out.print("Cancel");
		}
 	}
	
	public void jbtnOpenFiles_actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser("/Users/macbookair/Desktop/Anime Background");
		fileChooser.setDialogTitle("Select a photo"); 
		fileChooser.setMultiSelectionEnabled(true);
		int result = fileChooser.showOpenDialog(null); 
		if(result == JFileChooser.APPROVE_OPTION) {
			File[] files = fileChooser.getSelectedFiles();
			for(File file:files) {
				System.out.println("path: "+file.getAbsolutePath());
				System.out.println("File name: "+file.getName());
				System.out.println("File name: "+file.length());
				System.out.println("========================");
			}
		} else {
			System.out.print("Cancel");
		}
	}

}
