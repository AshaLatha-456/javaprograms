package text;

public class BlocksInJava {
	int a,b;
	{
		a=10;         //instance block
		b=30;
		System.out.println("this is instance block "+a);
	}
	{                //another instance block
		System.out.println("this is instance block1 "+b);
	}
	static{           //static block
		int a=28;
		System.out.println("this is Static block "+a);
	}
	static{           //Another Static block
		int b=36;
		System.out.println("this is Static1 block "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlocksInJava B=new BlocksInJava();
		BlocksInJava B1=new BlocksInJava();
		BlocksInJava B2=new BlocksInJava();
	}

}
