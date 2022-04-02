package MethodPractice;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B2 obj=new B2();
       obj.Add();
       obj.Sub();
       C2 obj1=new C2();
       obj1.Multi();
       obj1.Add();
	}

}
class A2{
	int a=20;
	int b=15;
	void Add() {
	System.out.println("addition="+(a+b));
}
}
class B2 extends A2
{
	int c=30;
	int d=20;
	void Sub() {
		System.out.println("Subration="+(c-d));
	}
}
class C2 extends A2
{
	int e=20;
	int f=15;
	void Multi() {
		System.out.println("Multiplication"+(e*f));
	}
}