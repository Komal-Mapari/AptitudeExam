package AptitudeTest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age Here : ");
		int age=sc.nextInt();
		
		System.out.println("Enter Weight Here : ");
		int weight= sc.nextInt();
		
		try {
			if(age >= 21 && age<= 60) {
				System.out.println("Age in criteria");
				if(weight >= 40 && weight <= 70) {
					System.out.println("Weight in Criteria");
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
