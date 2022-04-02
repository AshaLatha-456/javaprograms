package StringConcepts;

import java.util.Scanner;

public class Duplicatchar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		//char[] ch = S.toCharArray();
		int c=0;
		System.out.println("Duplicate characters are");
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j < S.length(); j++) {
				if(S.charAt(i)==S.charAt(j)) {
					c++;
			System.out.println(S.charAt(i));
			
			break;
				}
			}
			}
				
			}

	}


