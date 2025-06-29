package demo.javacore.loop;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 1 số nguyên bất kì: ");
		int value = scanner.nextInt();
		 int count = 0;
		 for (int i = 2; i <= value - 1; i++) {
			 if(value % i == 0) {
				 System.out.println("Ước số khác: "+i);
				 count++;
				 break;
			 }
			
		}
		     if(count == 0) {
		    	  System.out.printf("%d là số nguyên tố",value);
		     }else {
		    	 System.out.printf("%d không phải là số nguyên tố",value);
		     }
		     scanner.close();
		

	}

}
