package Demo;
import java.nio.file.*;
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			byte[] bytes = Files.readAllBytes(Paths.get("src/Data/Students.csv"));
			String content = new String(bytes);
			System.out.println(content); 
		} catch(Exception e) {
			e.getMessage();
		}
	}

}
