package demo;

import java.util.Scanner;

public class TinhToan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài hcn: ");
		int chieuDai = scanner.nextInt();
		System.out.println("Nhập chiều rộng hcn:");
		int chieuRong = scanner.nextInt();
		System.out.println("Chu vi hcn: " + (chieuDai+chieuRong)*2);
		System.out.println("Dien tich hcn: " + (chieuDai*chieuRong));
		System.out.println("Canh nho nhat: " + Math.min(chieuDai, chieuRong));
		
		System.out.println("Nhap canh hinh vuong: ");
		int canh = scanner.nextInt();
		System.out.println("The tich: "+Math.pow(canh, 3));
		scanner.close();
	}

}
