package MethodPractice;

public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smethod1 S =new Smethod1();
		S.Display();
	}

}
class Smethod{
	int a=20;
	void Display() {
		System.out.println(a);
	}
}
class Smethod1 extends Smethod{
	int a=40;
	//super.Display();
	void Display() {
		super.Display();
		System.out.println(super.a);
		System.out.println(a);
	}
}


	
