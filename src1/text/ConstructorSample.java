package text;

public class ConstructorSample {
	String Name;
	int RN;
	String address;
	ConstructorSample(String studentName,int studentRN,String studentaddress){
		Name=studentName;
		RN=studentRN;
		address=studentaddress;
//		System.out.print("name= "+Name);
//    	System.out.print(" RN= "+RN);
//    	System.out.print(" address= "+address);
//    	System.out.println();
//    	
		}
    void studentinfo(){
    	System.out.print("name= "+Name);
    	System.out.print(" RN= "+RN);
    	System.out.print(" address= "+address);
    	System.out.println();
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConstructorSample obj=new ConstructorSample("Asha",1,"Texas");
     obj.studentinfo();
     ConstructorSample obj1=new ConstructorSample("Swathi",2,"Houston");
     obj1.studentinfo();
     ConstructorSample obj2=new ConstructorSample("Yamini",3,"California");
     obj2.studentinfo();
     ConstructorSample obj3=new ConstructorSample("Sravanthi",4,"Newyork");
     obj3.studentinfo();

	}

}
