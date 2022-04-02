package StringConcepts;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String S= "Asha";
    System.out.println(S);
    int L=S.length();
    System.out.println(L);
    
    for(int i=L;i>0;i--) {
    	 System.out.print(S.charAt(i-1));
    }
	}

}
