package demo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class demo5 {

	public static void main(String[] args) {
	try {
		List<String> lines = Files.readAllLines(Paths.get("src/data/b.txt"));
		for(String line : lines) {
			System.out.println(line);
		}
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}

	}

}
