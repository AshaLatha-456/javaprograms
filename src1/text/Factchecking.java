package text;

import java.util.Scanner;

public class Factchecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the number"); 
	Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     factorial obj=new factorial();
     int fact=obj.factorial1(number);
     System.out.println("The factorial of given number is "+fact);
	}

}
