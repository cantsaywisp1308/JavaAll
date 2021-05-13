package Demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Data/Students.csv"));
			String line = "";
			while ((line = bufferedReader.readLine()) != null ) {
				String[] result = line.split(",");
				System.out.println("id: "+result[0]);
				System.out.println("name: "+result[1]);
				System.out.println("score: "+result[2]);
				System.out.println("========================"); 
			}
			bufferedReader.close();
		} catch(Exception e) {}
	}

}
