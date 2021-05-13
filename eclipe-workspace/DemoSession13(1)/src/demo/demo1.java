package demo;
import java.io.FileInputStream;
public class demo1 {

	public static void main(String[] args) {
	
	try {
		FileInputStream  fileInputStream = new FileInputStream("src\\data\\a.txt");
		int ch;
		while ((ch = fileInputStream.read())!= -1 ){
			System.out.print((char) ch);
		}
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}

	}

}
