package demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\data\\b.txt"));
			String line = "";
			while ((line = bufferedReader.readLine())!= null) {
				System.out.print(line);
			}
			bufferedReader.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
