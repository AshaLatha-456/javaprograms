package text;

import java.util.Scanner;

public class Calladdmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperators at=new ArithmeticOperators();
		System.out.println("enter first number and second number");
		Scanner sc= new Scanner(System.in);
		int firstnumber=sc.nextInt();
		int Secondnumber=sc.nextInt();
		int result=at.Add(firstnumber,Secondnumber);
		at.Sub(firstnumber,Secondnumber);
		at.Multi();
		System.out.print("addition is="+ result);
		//System.out.println("subraction is= "+result1);
		
	}

}
