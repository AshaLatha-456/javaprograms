package text;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the fact number");
		Scanner sc=new Scanner(System.in);
		   int number=sc.nextInt();
	factorial obj1=new factorial();
	   int result=obj1.factorial1(number);
	   
	   System.out.print("fact= "+result);
	   
	}
	int factorial1(int number) {
	 int fact=1;
	for(int i=1;i<=number;i++) {
		   fact=i*fact;
		   }
	return fact;
	}
}
