package MethodPractice;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Super1 S=new Super1();
     S.Display();
	}

}
class Super{
	int a=40;
}
class Super1 extends Super{
	int a=50;
	void Display(){
		System.out.println(a);
		System.out.println(super.a);
	}
}