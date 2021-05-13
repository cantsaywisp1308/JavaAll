package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Entities.Invoice;

public class InvoiceModel {
	
	public List<Invoice> findAll() {
		List<Invoice> invoices = new ArrayList<Invoice>();
		try {

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			invoices.add(new Invoice("id01","Invoice 01",76,"Cash","paid",simpleDateFormat.parse("22/11/2020")));
			invoices.add(new Invoice("id02","Invoice 02",124,"Check","paid",simpleDateFormat.parse("21/10/2020")));
			invoices.add(new Invoice("id03","Invoice 03",223,"Check","paid",simpleDateFormat.parse("10/01/2020")));
			invoices.add(new Invoice("id04","Invoice 04",79.6,"Credit Card","On hold",simpleDateFormat.parse("21/11/2020")));
			invoices.add(new Invoice("id05","Invoice 05",90.3,"Cash","On hold",simpleDateFormat.parse("22/11/2020")));
			invoices.add(new Invoice("id06","Invoice 06",222.5,"Cash","On hold",simpleDateFormat.parse("10/01/2020")));
			return invoices; 
		}  catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public List<Invoice> findByStatus(String status) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		for(Invoice invoice:findAll()) {
			if(invoice.getStatus().equalsIgnoreCase(status)) {
				invoices.add(invoice); 
			}
		}
		return invoices;
	}
	
	public List<Invoice> findByPayment(String payment) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		for(Invoice invoice:findAll()) {
			if(invoice.getPayment().equalsIgnoreCase(payment)) {
				invoices.add(invoice); 
			}
		}
		return invoices;
	}
	
	public List<Invoice> findByTotal(double min, double max) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		for(Invoice invoice:findAll()) {
			if((invoice.getTotal()>= min) &&(invoice.getTotal()<=max)) {
				invoices.add(invoice);
			}
			
		}
		return invoices;
	}
}
