package text;
import java.util.Scanner; 
public class Ageforvoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the age");
		Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
      //System.out.println("You are eligible for voting "+ age);
      //System.out.println("you are not eligible for voting "+age );
      Ageforvoting obj=new Ageforvoting();
      boolean result=obj.Eligible(age);
     if(result)
    	 System.out.println( "you are eligible for voting ");
     else
    	 System.out.println("you are not eligible for voting ");
	}


 boolean Eligible(int age) {
	 if(age>=18) {
   	  return true;
   	 
     }
     else {
   	  return false;
     }
 }
 
}