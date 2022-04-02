package text;

public class Staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     outer.inner.add();
	}

}
class outer{
	
	static class inner{
		static void add() {
			//int a=10;
			//int b=10;
			//int c;
			//c=a+b;
			System.out.println("this is static class");
		}
	}
}