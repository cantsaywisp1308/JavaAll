package Demo;

import java.io.File;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File folder = new File("src/data");
			File[] files = folder.listFiles();
			System.out.println("file: "+ files.length);
			for(File file:files ) {
				if(file.isFile()) {
					System.out.println("File name: "+file.getName());
					System.out.println("File size: "+file.length());
					System.out.println("==========================");
				} 
				if(file.isDirectory()) {
					System.out.println("Folder name: "+file.getName());
					System.out.println("==========================");
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
