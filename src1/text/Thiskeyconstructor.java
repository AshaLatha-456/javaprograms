package text;

public class Thiskeyconstructor {

	Thiskeyconstructor()
	{
		this(10);
		System.out.println("this is 0 arg Constructor");
	}
	
	Thiskeyconstructor(int a)
	{
		this(10,20);
		System.out.println("this is 1 arg Constructor");
	}
	Thiskeyconstructor(int a,int b)
	{
		System.out.println("this is 2 args Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyconstructor obj=new Thiskeyconstructor();
	}
}
