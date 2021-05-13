package Modal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Entities.products;

public class ProductModel {
	public List<products> findAll() {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			List<products> products = new ArrayList<products>();
			products.add(new products("id01","tape",3.4,45,simpleDateFormat.parse("12/11/2019")));
			products.add(new products("id02","knife ",14,40,simpleDateFormat.parse("12/12/2019")));
			products.add(new products("id03","kitten",100,23,simpleDateFormat.parse("10/10/2019")));
			products.add(new products("id04","puppey",400,10,simpleDateFormat.parse("02/08/2019")));
			return products; 
		} catch(Exception e) {
			return null;
		}
	}
	
	public void print(List<products> products) {
		for(products product:products ) {
			System.out.println(product.toString());
			System.out.println("=========================");
		}
	}
	
	public double total(List<products> products) {
		double s = 0;
		for(products product:products) {
			s += product.getPrice()*product.getQuantity();
		}
		return s;
	}
	
	public List<products> search(String key, List<products> products ) {
		List<products> result = new ArrayList<products>();
		for(products product:products ) {
			if(product.getName().toLowerCase().contains(key)) {
				result.add(product);
			}
		}
		return result;
	}
	
	public List<products> search(int month, int year, List<products> products) {
		List<products> result = new ArrayList<products>();
		for(products product:products) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(product.getCreated());
			int mon = calendar.get(Calendar.MONTH)+1;
			int yea = calendar.get(Calendar.YEAR);
			if((month==mon)&&(year==yea)) {
				result.add(product);
			}
		}
		return result;
	}
	
	public List<products> search(Date  start, Date end, List<products> products) {
		List<products> result = new ArrayList<products>();
		for(products product:products) {
			if((start.compareTo(product.getCreated())<0) || 
					(start.compareTo(product.getCreated())==0) &&
					((end.compareTo(product.getCreated())>0) ||
							(end.compareTo(product.getCreated())==0)))  {
				result.add(product); 
			}
		}
	return result; 
	} 
	
}
