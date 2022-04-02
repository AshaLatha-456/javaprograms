package StringConcepts;

import java.util.Scanner;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the String");
//		Scanner sc=new Scanner(System.in);
//		String S=sc.nextLine();
		StringBuffer S=new StringBuffer("asha latha");
		//int L=S.length();
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j < S.length(); j++) {
				if(S.charAt(i)==S.charAt(j)) {
			S.replace(S.charAt(i),' ',S);
			break;
				}
			}
			}
		System.out.println(S);
	}

}
