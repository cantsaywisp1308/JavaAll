package Demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src//data/b.doc"));
			String line = "";
			while ((line = bufferedReader.readLine()) != null ) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch(Exception e) {}
	}

}
