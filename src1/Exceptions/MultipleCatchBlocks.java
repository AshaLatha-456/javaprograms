package Exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int a[]= {10,20,30,40};
    	  int b=30;
    	  int c=b/0;
    	  String s=null;
    	  s.length();
      }
      catch(ArrayIndexOutOfBoundsException Arr) {
    	  System.out.println("ArrayIndexOutOfBounds Exception Occur");
    	  System.out.println(Arr.getMessage());
      }
      catch(ArithmeticException Ari){
    	  System.out.println("Arithmetic Exception Occur");
    	  System.out.println(Ari.getMessage());
      }
      catch(NullPointerException Np) {
    	  System.out.println("NullPointerException Occur");
    	  System.out.println(Np.getMessage());
      }
      catch(Exception e) {
    	  System.out.println("Exception Occur");
    	  System.out.println(e.getMessage());
      }
      System.out.println("End Of The Block ");
	}

}
