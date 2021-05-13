package Demo6;

import entities.Invoice;

public class Demo2 {
	
	public static void print(Invoice[] invoices) {
		for(Invoice invoice:invoices) {
			invoice.output();
			System.out.println("_______________________-"); 
		}
	}

	public static Invoice[] inputArray() {
		Invoice[] invoices = new Invoice[3];
		
		for(int i=0; i<invoices.length; i++ ) {
			invoices[i] = new Invoice();
			invoices[i].input();
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

		System.out.println("List 2");
		print(invoices);
		
		System.out.println("List 3:  ");
		print(inputArray());
			
	}

}
