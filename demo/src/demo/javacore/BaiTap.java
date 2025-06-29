package demo.javacore;

import java.util.Scanner;

public class BaiTap {

	public static void main(String[] args) {
//		Cho phương trình ax + b = 0 
//		Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình  trên 
//		Gợi ý: 
//		- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm" - Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm" 
//		- Còn lại: x = -b/a => thông báo x = ? 
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao bien a = ");
		int a = scanner.nextInt();
		System.out.println("Nhap vao bien b = ");
		int b=scanner.nextInt();
		System.out.printf("Giai pt bac nhat %dx + %d = 0", a, b);
		
		if(a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		}else if(a == 0 && b != 0) {
			System.out.println("Phuong trinh ko co nghiem");
		}else {
			float x =(float) -b/a;
			System.out.printf("Phuong trinh co nghiem = %.3f ",x);
		}
		
		scanner.close();

	}

}
