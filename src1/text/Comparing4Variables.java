package text;

public class Comparing4Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=40;
      int b=30;
      int c=70;
      int d=90;
      
      if (a>b && a>c && a>d) {
    	  System.out.println("A is Greater");
      }
      else if (b>a && b>c && b>d) {
    	  System.out.println("B is Greater");
      }
      else if (c>a && c>b && c>d) {
    	  System.out.println("C is Greater");
     }
      else {
    	  System.out.println("D is Greater");    	  
      }
	}

}
