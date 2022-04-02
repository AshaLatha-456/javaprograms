package StringConcepts;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String S="Hello Asha";
       S.concat(" Hello Java");
       StringBuffer SB=new StringBuffer("Welcome to Java Class");//String And StringBuffer performance is slow because both are Synchronized
       System.out.println("After Concat= "+S.concat(" Hello Java"));
       System.out.println(S);//Here String didn't change after concat because String is Immutable 
       SB.append(" Hello Java");
       //System.out.println(SB.append(" Hello Java"));
       System.out.println(SB);//here StringBuffer changed after concat because StringBuffer is Mutable
       StringBuilder Sbi=new StringBuilder("Hello Asha");
       Sbi.append("Hello Prathik");
       System.out.println(Sbi);//StringBuider performance is fast because it is non-syncronized
       
       
       
	}

}
