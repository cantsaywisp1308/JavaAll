package demo;

import java.nio.file.Files;
import java.nio.file.Paths;

public class demo6 {

	public static void main(String[] args) {
		try {
			byte[] bytes = Files.readAllBytes(Paths.get("src/data/a.txt"));
			String content = new String(bytes);
			System.out.println(content);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
     
	}

}
