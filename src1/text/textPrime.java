package text;

import java.util.Scanner;

public class textPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the number");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       //boolean flag=false;
      
    	  for(int i=2;i<=number/2;i++) {
    		if(number%i== 0) 
    		{ System.out.println(number+" is not a prime number");
    		  break;
    		}
    		
    	  else
    	  { System.out.println(number+" is a prime number");
    		  break;}
      

	} 

}
	
}