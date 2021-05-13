package Demo;
import java.util.*;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> student = new HashMap<String, Object>();
		student.put("Id", "id01");
		student.put("Name ", "Name 2");
		student.put("Age",20);
		student.put("score", 6.5);
		student.put("score", 10);
		student.put("score", 4);
		student.remove("score"); 
		System.out.println("id: "+student.get("id02"));
		for(String key: student.keySet()) {
			System.out.println(key + ": "+student.get(key));
		}
		if(student.containsKey("score")) {
			System.out.println("Tồn tại"); 
		} else {
			System.out.println("Không tồn tại");
		}
	}

}
