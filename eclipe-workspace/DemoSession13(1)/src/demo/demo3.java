package demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class demo3 {

	public static void main(String[] args) {
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\data\\Student.csv"));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				String[] result = line.split("/");
				System.out.println("id: " + result[0]);
				System.out.println("name: " + result[1]);
				System.out.println("score: " + result[2]);
				System.out.println("--------------------");
			}
			bufferedReader.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	

		}

	}
