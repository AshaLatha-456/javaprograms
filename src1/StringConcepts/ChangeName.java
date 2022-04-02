package StringConcepts;

public class ChangeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String S= "Asha Latha Kanamarlapudi";
     String Temp="";
     String S1=(String) S.subSequence(0, 10);
     String SA[]=S.split(" ");
     for(int i=0;i<SA.length;i++) {
    	 System.out.println(SA[i]);
    	 Temp=SA[i];
      }
     System.out.println(Temp+" "+S1);
     }

}
