package Demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class Demo3 extends JFrame {

	private JPanel contentPane;
	private JTextArea jtextAreaContent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 frame = new Demo3();
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
	public Demo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jmnFile = new JMenu("File");
		menuBar.add(jmnFile);
		
		JMenuItem jmntmOpen = new JMenuItem("Open");
		jmntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmntmOpen_actionPerformed(e); 
			}
		});
		jmnFile.add(jmntmOpen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		jtextAreaContent = new JTextArea();
		contentPane.add(jtextAreaContent, BorderLayout.CENTER);
	}
	
	public void jmntmOpen_actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select a file");
		fileChooser.setMultiSelectionEnabled(false);
		int result = fileChooser.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				byte[] bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
				String result2 = new String(bytes);
				jtextAreaContent.setText(result2); 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
		}
		
		
	}

}
