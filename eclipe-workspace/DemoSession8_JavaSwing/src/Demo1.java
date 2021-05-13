import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private JTextArea JtextAreaContent;

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
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JtextAreaContent = new JTextArea();
		JtextAreaContent.setBorder(new LineBorder(Color.BLACK));
		JtextAreaContent.setBounds(438, 6, -431, 106);
		contentPane.add(JtextAreaContent);
		
		JButton jbtnSave = new JButton("Save");
		jbtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnSave_actionPerformed(e);
			}
		});
		jbtnSave.setBounds(29, 154, 117, 29);
		contentPane.add(jbtnSave);
	}
	
	public void jbtnSave_actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Save a text file");
		fileChooser.setMultiSelectionEnabled(false);
		int result = fileChooser.showSaveDialog(null);
		if(result == fileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			System.out.println("Path : "+file.getAbsolutePath());
			String content = JtextAreaContent.getText();
			try {
				Files.write(Paths.get(file.getAbsolutePath()), content.getBytes());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
