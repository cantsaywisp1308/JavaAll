package Windows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFileChooser jFileChooser = new  JFileChooser();
		jFileChooser.setDialogTitle("Upload Files");
		jFileChooser.setMultiSelectionEnabled(false);
		int result = jFileChooser.showOpenDialog(null);
		if (result == jFileChooser.APPROVE_OPTION) {
			File photo = jFileChooser.getSelectedFile();
			System.out.print(Paths.get(photo.getAbsolutePath()));
	}
	}
}
