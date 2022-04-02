package MethodPractice;

public class TryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c,d;
     a=10;
     b=30;
     try {
        System.out.println(c=a/0);
	}
     catch(Exception e){
    	System.out.println(e.getMessage());
     }
	}

}
