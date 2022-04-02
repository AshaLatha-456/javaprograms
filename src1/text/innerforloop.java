package text;

public class innerforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int i;
//     int j;
//     for(i=1;i<=5;i++) {
//    	 for(j=1;j<=5;j++)
//    	 System.out.println("i="+i+" j="+j);
//     }
	
		int tr=5;
		for(int row=1;row<=tr;row++) {
	    for(int sp=1;sp<=tr-row;sp++) {
	    	System.out.print(" ");
	    }
		for(int st=1;st<=row;st++) {
			System.out.print("*");	
		
		
	    }
	    System.out.println();
		
		}
		}

}
