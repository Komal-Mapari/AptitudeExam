package AptitudeTest;

import java.util.Scanner;

public class SumEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Here : ");
		int num=sc.nextInt();
		int sum=0;
	    int rem=0;
		
		for(int i=1;i<=num;i++) {
			num = num/10;
		    rem=num%10;
		    
		    System.out.println(num);			
            
		    if(num /2==0) {
		    	System.out.println("Even Number : num");
		    	sum=sum+num;
		    	System.out.println("Addtion of Even Number :"+sum);
		    	
		    }else {
		    	System.out.println("Odd Number : num");
		    	sum=sum+num;
		    	System.out.println("Addition of odd Number is :"+sum);
		    }

		}
	}
}
