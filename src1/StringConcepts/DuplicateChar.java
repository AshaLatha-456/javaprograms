package StringConcepts;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] ch = S.toCharArray();
		System.out.println("Duplicate characters are");
		for (int i = 0; i < ch.length; i++) {
			int c = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					c++;
					ch[j] = '0';
				}
			}
				if (c > 0 && ch[i] != '0') {
					System.out.println(ch[i]);
				}
			}

		}
	}

