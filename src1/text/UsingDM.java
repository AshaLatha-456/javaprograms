package text;

import java.util.Scanner;

public class UsingDM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 2 numbers2");
		Scanner sc=new Scanner(System.in);
		int firstnumb=sc.nextInt();
		int Secondnumb=sc.nextInt();
		DifferentMethods obj1=new DifferentMethods();
		obj1.add();
		int result=obj1.Sub(firstnumb, Secondnumb);
		System.out.println("Subraction="+result);
		//obj1.Sub(firstnumb, Secondnumb);
		
	}
	

}
