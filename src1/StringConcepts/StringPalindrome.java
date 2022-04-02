package StringConcepts;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		 //String S="abcba";
		String reverse="";
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		//System.out.println(S);
		int L=S.length();
		for(int i=L-1;i>=0;i--) {
			//System.out.print(S.charAt(i));
			char ch=S.charAt(i);
			reverse=reverse+ch;
		}
		
		System.out.println(reverse);
		if (S.equals(reverse)) {
			System.out.println(S+" is Palindrome");
		}
		else {
			System.out.println(S+" is not Palindrome");
			
		}
		 
	}

}
