package StringConcepts;

import java.util.Scanner;

public class DuplicateStringSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		//char[] ch = S.toCharArray();
		System.out.println("Duplicate Strings are");
		String SA[]=S.split(" ");
		for (int i = 0; i < SA.length; i++) {
			for (int j = i + 1; j < SA.length; j++) {
				if(SA[i].equals(SA[j])) {
			System.out.println(SA[i]);
			break;
				}
			}
			}
				
	}

}
