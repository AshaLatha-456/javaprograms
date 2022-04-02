package MethodPractice;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C1 obj=new C1();
      obj.Add();
      obj.Sub();
      obj.Multi();
      }

}
class A1{
	int a=10;
	int b=5;
	void Add() {
	System.out.println("addition="+(a+b));
}
}
class B1 extends A1
{
	int c=50;
	int d=25;
	void Sub() {
		System.out.println("Subration="+(c-d));
	}
}
class C1 extends B1
{
	int e=30;
	int f=10;
	void Multi() {
		System.out.println("Multiplication="+(e*f));
	}
}