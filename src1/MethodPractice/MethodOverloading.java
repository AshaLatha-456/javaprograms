package MethodPractice;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(24.5f,25));
		System.out.println(obj.add(10,20,30));
		System.out.println(obj.add(10,20,10.5f,13));
	}
  int add(int a,int b) {
  return a+b;
  }
  float add(float a,int b) {
	  return a+b;
  }
  int add(int a,int b,int c) {
	  return a+b+c;
  }
  float add(int a,int b,float c,int d) {
	  return a+b+c+d;
  }
}
