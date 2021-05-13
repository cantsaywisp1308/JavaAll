package Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("src/data/a.doc", true);
				String s = "Good game, well-played";
				String s1 = "Line 1 \nLine 2 \nLine3 "; 
				fileOutputStream.write(s1.getBytes());
				fileOutputStream.flush();
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()); 
			}

		
		
	}

}
