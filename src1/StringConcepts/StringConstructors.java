package StringConcepts;

public class StringConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Hello String";
		StringBuffer SB=new StringBuffer("Hello StringBuffer");
		StringBuilder SBI=new StringBuilder("Hello StringBuilder");
      String SC=new String();//Creating empty string constructor
      System.out.println(SC);
      String SC1=new String ("Hello java");//This is String parameter constructor use to assign/passing string directly here
      System.out.println(SC1);
      String SC2=new String(SB);//This constructor convert StringBuffer to String
      System.out.println(SB);
      String SC3=new String(SBI);//Here constructor convert StringBuilder to String
      System.out.println(SC3);
      
      char ch[]= {'A','S','H','A'};
      String SC4=new String(ch);//Here Constructor covert CharacterArray to String
      System.out.println(ch);
      
      char ch1[]= {65,83,72,65};
      String SC5=new String(ch1);//Here Constructor covert CharacterArray to String
      System.out.println(SC5); 
      
      byte b1[]= {'A','B','C','D'};
      String SC6=new String(b1);//Here Constructor covert ByteArray to String
      System.out.println(SC6);
      
      byte b[]= {65,66,97,98};
      String SC7=new String(b);
      System.out.println(SC7);
      	}

}
