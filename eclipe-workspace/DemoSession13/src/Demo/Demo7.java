package Demo;
import java.nio.file.*;


public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="Hello";
		Files.write("src/data/c.txt", content.getBytes(), true);
	}

}
