package Demo;

import java.io.FileInputStream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("src/data/a.doc");
			int ch;
			while((ch = fileInputStream.read()) != -1 ) {
				System.out.println((char) ch);
			}
		} catch(Exception e) {
			e.getMessage();
		}
	}

}
