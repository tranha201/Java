package demo.javacore;

import java.util.Scanner;
public class JavaOperator {
	
	//If, If...else,...
	//Bai tap
	

	public class ThueCaNhan {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số tiền chịu thuế (triệu đồng): ");
	        double tien = scanner.nextDouble();

	        if (tien < 10) {
	            System.out.println("Không phải đóng thuế.");
	        } else if (tien <= 15) {
	            System.out.println("Thuế 10%");
	        } else if (tien <= 30) {
	            System.out.println("Thuế 20%");
	        } else {
	            System.out.println("Thuế 50%");
	        }

	        scanner.close();
	    }
	}

	

}
