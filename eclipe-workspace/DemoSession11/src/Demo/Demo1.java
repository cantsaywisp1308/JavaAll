package Demo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(5); //0 
		a.add(-7); //1
		a.add(10); //2 
		a.add(25); //3 
		System.out.println(a.get(1)); //->-7; 
		a.remove(2); //Xoá phần tử vị trí 2;
		a.clear();  //Xoá sạch 
		System.out.println("Số phần tử trong collection: "+a.size());
		for(int i=0; i< a.size();i++ ) {
			System.out.println(a.get(i)+ " ");
		}
		
		for(int i:a ) {
			System.out.print(i+" ");
		}
	}

}
