package StringConcepts;

import java.util.Scanner;

public class NameChangeSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter  First Name");
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		System.out.println("Enter Middle Name ");
		String S1=sc.nextLine();
		System.out.println("Enter Last Name");
		String S2=sc.nextLine();
//		String S4=(S.concat(S1));
//		String S5=(S2.concat(S4));
		System.out.println(S2+" "+S+" "+S1);
		//System.out.println(S2+" "+S4);
		//System.out.println(S5);
	}

}
