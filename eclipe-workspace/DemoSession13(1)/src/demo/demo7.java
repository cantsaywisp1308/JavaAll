package demo;

import java.nio.file.Files;
import java.nio.file.Paths;

public class demo7 {

	public static void main(String[] args) {
		try {
			String content = "Hello";
			Files.write(Paths.get("src/data/c.txt"),content.getBytes());
			System.out.println("Done");
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
