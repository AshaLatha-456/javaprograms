package MethodPractice;

public class InterfaceDemo implements Abc1 {
	public void StudentName() {
		System.out.println("Asha");
		System.out.println("Kauser");
		System.out.println("Swathy");
	}
	 public void Studentid() {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}
	 public void StudentBranch() {
			System.out.println("CSE");
			System.out.println("EEE");
			System.out.println("Arts");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo b=new InterfaceDemo();
     b.StudentName();
     //Cde c=new Cde();
     b.Studentid();
    // Def d=new Def();
     b.StudentBranch();
	}
}
interface Abc1{
	public void StudentName();
	  void Studentid();
	 void StudentBranch();
}
//class Bcd implements Abc1{
//	public void StudentName() {
//		System.out.println("Asha");
//		System.out.println("Kauser");
//		System.out.println("Swathy");
//	}
//	 public void Studentid() {
//			System.out.println("1");
//			System.out.println("2");
//			System.out.println("3");
//		}
//	 public void StudentBranch() {
//			System.out.println("CSE");
//			System.out.println("EEE");
//			System.out.println("Arts");
//		}
//}
//class Cde implements Abc{
//	 void Studentid() {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//	}
//}
//class Def implements Abc{
//	void StudentBranch() {
//		System.out.println("CSE");
//		System.out.println("EEE");
//		System.out.println("Arts");
//	}
//}
//
