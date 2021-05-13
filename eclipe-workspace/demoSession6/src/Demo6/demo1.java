package Demo6;

import entities.Invoice;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice[] invoices = new Invoice[3];  
		
		Invoice invoice1 = new Invoice();
		invoice1.setId("id01");
		invoice1.setName("Hoá đơn 1");
		invoice1.setPrice(34.1);
		invoice1.setPayment("cash");
		invoices[0] = invoice1;
		
		Invoice invoice2 = new Invoice("id02","Name 2",23.2,"cash");
		invoices[1] = invoice2; 
		
		Invoice invoice3 = new Invoice();
		invoice3.input();
		invoices[2] = invoice3;
		
		System.out.println("List 1");
		for(int i=0; i< invoices.length; i++) {
			System.out.println("id: "+invoices[i].getId());
			System.out.println("Name: "+invoices[i].getName());
			System.out.println("Price: "+invoices[i].getPrice());
			System.out.println("Payment: "+invoices[i].getPayment());
			System.out.println("-------------------------------------");
			
		}
		
		System.out.println("List 02: ");
		for(int i=0; i< invoices.length; i++) {
			invoices[i].output();
			System.out.println("-------------------------------------"); 
		} 
		
		System.out.println("List 03: ");
		for(Invoice invoice:invoices ) {
			invoice.output();
			System.out.println("-------------------------------------"); 
		} 
	}
}
