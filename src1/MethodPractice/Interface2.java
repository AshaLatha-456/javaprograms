package MethodPractice;

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AB1 b;
     b=new AB1();
     b.Display();
     b.Show();
     b.Print();
     b.Display1();
	}

}
interface X{
	void Display();
	void Show();
}
interface Y{
	void Print();
}
class AB implements X,Y{
	public void Display(){
		System.out.println("This is Display Method");
	}
	public void Show() {
		System.out.println("This is Show Method");
	}
	public void Print() {
		System.out.println("This is Print Method");
	}
}
class AB1 extends AB{
	public void Display1() {
		System.out.println("This is Display1 Method");
	}
}
