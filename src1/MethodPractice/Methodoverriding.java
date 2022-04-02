package MethodPractice;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj=new Login();
		obj.loginApp();
		System.out.println("-----------------");
		NewLogin obj1=new NewLogin();
		obj1.loginApp();
	}
 
}
class Login{
	void loginApp() {
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Click Submit Button");
	}
}
class NewLogin extends Login{
	void loginApp() {
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Enter Mobile Number");
		System.out.println("Click Submit Button");
	}
}
