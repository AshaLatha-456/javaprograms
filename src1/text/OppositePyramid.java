package text;

import java.util.Scanner;

public class OppositePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total rows ");
		Scanner sc=new Scanner(System.in);
		int tr=sc.nextInt();
		
		for(int row=1;row<=tr;row++) {
	    
		for(int sp=1;sp<=row-1;sp++) {
	    	System.out.print(" ");
	    }
				for(int st=0;st<=tr-row;st++) {
					System.out.print("* ");	
			
				}
	    System.out.println();
		
		}
	}

}
