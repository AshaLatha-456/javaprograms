package MethodPractice;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        System.out.println("a="+b.a+" b="+b.b);
        b.Add();
        b.Sub();
	}

}
class A{
	int a=10;
	int b=5;
	void Add() {
	System.out.println("addition="+(a+b));
}
}
class B extends A
{
	int c=50;
	int d=25;
	void Sub() {
		System.out.println(" Subration="+(c-d));
	}
}