package text;

public class DifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentMethods obj=new DifferentMethods();
		obj.add();
		int result=obj.Sub(10,20);
		System.out.println("addition="+result);
	}
	void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("addition="+c);
	}
   int Sub(int a, int b) {
	   int c=a-b;
	   //System.out.println(c);
	   return c;
   }
}
