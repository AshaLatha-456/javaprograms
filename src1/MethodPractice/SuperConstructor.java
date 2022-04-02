package MethodPractice;

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SC1 S=new SC1();
  //SC1 S1=new SC1(60);
  //S.Display();
  }

}
class SC{
	SC(){
		System.out.println("this is SC Constructor");
	}
	SC(int b){
		System.out.println("This is SC 1 arg Constructor "+b);
	}
	int a=20;
	void Display() {
		System.out.println(a);
	}
}
class SC1 extends SC{
	SC1(){
		System.out.println("This is SC1 Constructor");
	}
	SC1(int b){
		//super(10);
		System.out.println("This is SC1 1 Arg Constructor "+b);
	}
	int a=30;
	void Display() {
		super.Display();
		System.out.println(a);
		
	}
}
