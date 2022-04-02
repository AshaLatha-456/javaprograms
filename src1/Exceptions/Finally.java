package Exceptions;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter the CreditHistory points");
         Scanner sc=new Scanner(System.in);
         int CreditHistory=sc.nextInt();
         try {
         if(CreditHistory>650){
        	 System.out.println("You are eligible for Loan");
         }
         else {
        	 throw new Exception();
         }
        }
         catch(Exception e){
        	 System.out.println("Your CreditHistory is Low");
        	 System.out.println("You are not Eligible for Loan");
        	 //System.out.println(e.getMessage());
         }
       finally {
    	   System.out.println("Your Profile is verified");
       }
}
}
