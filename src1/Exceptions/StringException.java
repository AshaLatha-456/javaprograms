package Exceptions;

import java.util.Scanner;

public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String st="Asha,Sravanthi,Yamini,Swathi are good friends";
      int a=st.length();
      System.out.println(a);
      System.out.println("Enter the value of number");
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
       if(a<number){
    	   System.out.println(st);
       }
       else
       {
    	   throw new StringExcep("Give big value for number");
       }
       
	}

}
