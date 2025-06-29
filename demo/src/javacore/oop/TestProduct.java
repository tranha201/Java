package javacore.oop;

public class TestProduct {

	public static void main(String[] args) {
		product test = new product();
		product pr1 = test.nhapThongTin("tivi", 1000, 0.1);
		test.xuatThongTin(pr1);
		System.out.println("Tax = "+test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
