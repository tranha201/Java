package javacore.oop;


public class product {

	private String name;
	private double price;
	private double tax;
	
	
	public product() {
		super();
	}

	public product(String name, double price, double tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public product nhapThongTin(String name, double price, double tax) {
		product pr = new product(name, price, tax);
		return pr;
		
	}
	
    public void xuatThongTin(product pr) {
    	System.out.println("Name = "+pr.getName() + "Price = "+pr.getPrice() + "Tax = " +pr.getTax());
		
	}
    
    public double getTaxPrice(double price, double tax) {
    	return price * tax;
		
	}
    
	
}
