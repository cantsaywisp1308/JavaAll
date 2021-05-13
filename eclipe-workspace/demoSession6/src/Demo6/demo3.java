package Demo6;

import entities.Invoice;

public class demo3 {
	
	public static void print(Invoice[] invoices) {
		for(Invoice invoice:invoices) {
			invoice.output();
			System.out.println("_______________________-"); 
		}
	}
	
	public static double total(Invoice[] invoices) {
		double total = 0;
		for(Invoice invoice:invoices) {
			total += invoice.getPrice(); 
		}
		return total; 
	}
	
	public static double totalByPayment(Invoice[] invoices, String payment) {
		double total = 0; 
		for(Invoice invoice:invoices) {
			if (invoice.getPayment().toLowerCase().equalsIgnoreCase(payment.toLowerCase())) {
				total += invoice.getPrice();
			} 
		}
		return total;
	}
	
	public static Invoice max(Invoice[] invoices) {
		Invoice m  = invoices[0];
		for(Invoice invoice:invoices ) {
			if (invoice.getPrice() < m.getPrice()) {
				m = invoice; 
			}
		}
		return m;
	}
	
	public static Invoice[] sort(Invoice[] invoices) {
		for(int i =0; i < invoices.length -1; i++) {
			for (int j = i+1; j<invoices.length; j++) {
				if(invoices[i].getPrice() > invoices[i].getPrice()) {
					Invoice temp = invoices[i];
					invoices[i] = invoices[j];
					invoices[j] = temp;  
					
				}
			}
		}
		return invoices; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice[] invoices = {
				new Invoice("id01","Name 1",12,"Cash"),
				new Invoice("id02","Name 2",12.3,"Credit Card"),
				new Invoice("id03","Name 4",12.4,"Cash")
		}; 
		
		System.out.println("Tổng tiền: "+ total(invoices)); 
		System.out.println("Tổng tiền theo cash: "+totalByPayment(invoices,"Cash"));
		System.out.println("Hoá đơn có tiền lớn nhất : "); 
		max(invoices).output(); 
		System.out.println("Mảng sau khi sắp xếp giảm dần: ");
		print(invoices); 
	}
	

}
