package MethodPractice;

public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     XY a;
     a=new XYZ();
     a.Display();
     a.Show();
     a.Print();
	}

}
interface X1{
	void Display();
}
interface Y1{
	void Show();
}
interface XY extends X1,Y1{
	void Print();
}
class XYZ implements XY{
	public void Display() {
		System.out.println("THis is Display Method");
		}
	public void Show() {
		System.out.println("This is Show Method");
	}
	public void Print() {
		System.out.println("This is Print Method");
	}
}
