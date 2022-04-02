package MethodPractice;

public class FinalConcepts {
	final  int b;//blank or uninitialized final variable
	{       //instance block
	b=30;
	System.out.println("instance block "+b);
	}
	static final int c;//static blank final variable
	static {              //static block
		c=70;
		System.out.println("static block "+c);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int a=10; // u can't change the value of a in the class
        System.out.println("Final Variable= "+a);
        Final1 F=new Final1();
        F.Display();
        F.Display1();
        final int b;//blank or uninitialized final variable in main method
        b=40;
        System.out.println(b);
        FinalConcepts F1=new FinalConcepts();//object creation
        System.out.println("instance variable b value= "+F1.b);
        }
}
class Final{
	 int a=20;
	 final void Display() { //u can't override the method in final
		 System.out.println("Final method= "+a);
		System.out.println("this is FInal class method");
	}
}
final class Final1 extends Final{//u can't create child class for final class 
	int a=30;
	void Display1() {
		Display();            //final method we can inherited
		System.out.println("Final class= "+a);
		System.out.println("this is Final1 class method");
	}
}

