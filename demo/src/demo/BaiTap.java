package demo;

import java.util.Scanner;

public class BaiTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Nhập tên: "); 
		String name = scanner.nextLine(); 
		System.out.println("Nhập điểm: "); 
		Double score = scanner.nextDouble(); 
		System.out.println(name  + "có điểm:" + score); 
		scanner.close(); 
		
	}

}
