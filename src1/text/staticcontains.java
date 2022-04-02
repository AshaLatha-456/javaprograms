package text;

public class staticcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     variableDemo.m1();
     variableDemo v=new variableDemo();
     v.m2();
	}
}
	
	class variableDemo{
		static void m1() {
			System.out.println("this is static method");
		}
		void m2() {
			System.out.println("this is instance Method");
		}
	
}
