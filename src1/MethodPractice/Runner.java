package MethodPractice;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number"); 
		Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();
		EvenOdd e=new EvenOdd();
        boolean result=e.isEven(number);
        if(result) {
	       System.out.println("Number is Even");
	    }
       else
       {
	       System.out.println("Number is Odd");
       }
	
	}

}
