package demo;

import java.util.Scanner;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner = new Scanner(System.in); 
			System.out.println("Your name is: "); 
			String name = scanner.nextLine(); 
			System.out.println("Your age is: "); 
			int age = scanner.nextInt(); 
			System.out.println("My name is " + name + ", age = " + age); 
			scanner.close(); 
			

	}

}
