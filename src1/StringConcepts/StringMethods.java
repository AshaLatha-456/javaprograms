package StringConcepts;

public class StringMethods {
	//static String s3=new String("Java is simple language");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Java is simple language";
       String s1="C is simple language";
       String s2="  C++ is simple language  ";
       String s3=new String("Java is simple language");
       String s4=new String("Java is simple language");
       
       System.out.println(s.charAt(13));//return index value character
       System.out.println(s.substring(5));//return remaining string from given index value
       System.out.println(s.substring(5,14));//return from begin index to end index
       System.out.println(s.contains(s3));//compare both strings & CaseSensitive
       System.out.println(s.equals(s1));//Doubt
       System.out.println(s3==s4);//compare both strings by object & CaseSensitive
       System.out.println(s.equalsIgnoreCase(s1));//compare both strings but it will ignore case
       System.out.println(s.isEmpty());//it checks the string is empty or not and here space not consider as empty
       System.out.println(s.isBlank());//it checks the string is blank or not and space also consider as blank
       System.out.println(s.concat(s1));//it will joint both strings
       System.out.println(s.replace('a','b'));//it will replace 'b' instead of 'a' in given string
       System.out.println(s.replace("Java","C+"));//it will replace "Java" instead of "C+" in given string
       System.out.println(s.indexOf('s'));//return index value of given character
       System.out.println(s.indexOf('s',7));//return index value of give character from given index value
       System.out.println(s.indexOf("language"));//return index value of starting character in given string
       System.out.println(s.toLowerCase());//it will change given string all characters in Lower case
       System.out.println(s.toUpperCase());//it will change given string all characters in Upper case
       System.out.println(s2.trim());//it will removes if given string have any spaces in starting and ending
	     String SA[]=s.split("a");//it will spilt the string by given character or space 
	     for(int i=0;i<SA.length;i++) {
	    	 System.out.println(SA[i]);
	     }
	}

}
