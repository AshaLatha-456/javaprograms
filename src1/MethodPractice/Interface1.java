package MethodPractice;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TOL L;
    L=new TOL();
    L.MortgageLoans();
    L.AutoLoans();
    L.PersonalLoans();
    L.CardLoans();
    //ArthOpt A;
    //A=new ArthOpt();
    L.Add();
    L.Sub();
    L.Multi();
    L.Divi();
    
	}

}
interface Loans{
	int a=10,b=5,c=7,d=25;
	void MortgageLoans();
	void AutoLoans();
	void PersonalLoans();
	void CardLoans();
}
class ArthOpt{
	void Add(){
		int A=Loans.a+Loans.b;
		System.out.println("Addition="+A);
	}
	void Sub() {
		int S=Loans.c-Loans.d;
		System.out.println("Subtraction="+S);
	}
	void Multi() {
		int M=Loans.b*Loans.c;
		System.out.println("Multiplication="+M);
	}
	void Divi() {
		int D=Loans.d/Loans.b;
		System.out.println("Division="+D);
	}
}
class TOL extends ArthOpt implements Loans{
	
	public void  MortgageLoans(){
		System.out.println(a+" Home loans");
	}
	public void AutoLoans() {
		System.out.println(b+" Vehicle Loans");
	}
	public void PersonalLoans() {
		System.out.println(c+" Personal Loans");
	}
	public void CardLoans() {
		System.out.println(d+" Credit Card Loans");
	}
	
}