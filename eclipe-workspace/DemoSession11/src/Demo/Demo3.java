package Demo;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names = new HashSet<String>();
		names.add("Name1");
		names.add("Name2");
		names.add("Name3");
		names.add("Name4");
		names.remove("Name3");
		System.out.println("Số phần tử: "+names.size());
		for(String name: names) {
			System.out.println(name);
		}
	}

}
