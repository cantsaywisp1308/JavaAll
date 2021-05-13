package Demo;
import java.nio.file.*;
import java.util.List;


public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			List<String> lines = Files.readAllLines(Paths.get("src/Data/Students.csv"));
			for(String line:lines) {
				System.out.println(line);
			}
		} catch(Exception e) {
			e.getMessage(); 
		}
	}

}
