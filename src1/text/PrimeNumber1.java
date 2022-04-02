package text;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the number");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       boolean flag=false;
       int i=2;
       
       do {
  		if(number%i== 0) {
  	   flag=true;
  		break;
  		}
  		i++;
	}while(i<=number/2); 
         if (flag)
    		  System.out.println(number+" is not a prime number");
    	  else
    		  System.out.println(number+" is a prime number");
      

	}

}



