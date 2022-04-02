package text;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter ur Option");
       Scanner sc=new Scanner(System.in);
       int option=sc.nextInt();
      switch(option) {
      case 1: 
   	      System.out.println("Sunday");
   	      break;
       
       case 2: 
   	       System.out.println("Monday");
  	       break;
      
       case 3: 
           System.out.println("Tuesday");
    	   break;
       
       case 4: 
    	   System.out.println("Wednesday");
    	   break;
       
       case 5: 
    	    System.out.println("Thrusday");
   	        break;
       
       case 6:
    	   System.out.println("Friday");
    	   break;
       
       case 7: 
    	    System.out.println("Saturday");
    	    break;
       
       default : 
    	    System.out.println("Entered Wrong Option" + " Enter between 1 to 7");
       
       }
      
   }

}
