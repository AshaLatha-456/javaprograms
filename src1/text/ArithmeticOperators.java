package text;

public class ArithmeticOperators {
    int a=40;        //instance variable
    int b=2;
    static int d=50; //static variable   here we r not using this d value.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArithmeticOperators obj1=new ArithmeticOperators();
     obj1.Add(10,20);
     
     System.out.println();
     obj1.Sub(20,10);
     obj1.Multi();
     obj1.Div();
     obj1.Rem();
     int c=50;    // local variable  this c also we r not using here
	}
     int Add(int a,int b) {
    	 //System.out.println(a+b);
    	 //int a=10;
    	 //int b=20;
    	 //int c=a+b;
     return a+b;
     }
     void Sub(int a,int b) {
    	 System.out.println("Subraction is= "+(a-b));
    	 //return a-b;
     }
     void Multi() {
    	 System.out.println(a*b);
     }
     void Div() {
    	System.out.println(a/b);
     }
     void Rem() {
    	 System.out.println(a%b);
     }
     
    
     
	}


