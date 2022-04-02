package text;

public class Thiskeymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeymethod obj=new Thiskeymethod();
		obj.m1();
		
	}

	void m1() {
		this.m2();
		System.out.println("this is m1 method");
	}
	void m2() {
		System.out.println("this is m2 method");
	}
}
