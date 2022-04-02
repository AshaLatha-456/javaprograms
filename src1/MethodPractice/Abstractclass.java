package MethodPractice;

 public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  F obj=new F();
      obj.display();
      obj.show();
      obj.print();
      }
	}
abstract class G{
	G(){
		System.out.println("This is constructor ");
	}
	void display(){
   System.out.println("This is non abstract Method");		
	}
	abstract void show();
	abstract void print();
}
class F extends G{
	void show() {
		System.out.println("This is Abstract Method");
	}
	void print() {
		System.out.println("This is print method");
	}
}