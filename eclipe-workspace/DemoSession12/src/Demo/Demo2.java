package Demo;

import java.io.File;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("src/data/b.rtf");
			System.out.println("File name: "+file.getName());
			System.out.println("file size(byte): "+file.length());
			int index = file.getName().lastIndexOf(".");
			System.out.println("index: "+index);
			String ext = file.getName().substring(index +1);
			System.out.println("ext :"+ext);
			System.out.println("path: "+file.getAbsolutePath());
			System.out.println("");
		} catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
	}

}
