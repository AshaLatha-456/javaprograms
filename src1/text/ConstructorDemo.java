package text;

public class ConstructorDemo {
	String Name;
	int RN;
	String address;
	ConstructorDemo(String studentname,int studentRN,String studentaddress){
		Name=studentname;
		RN=studentRN;
		address=studentaddress;
		}
    void studentinfo(){
    	System.out.println("name= "+Name);
    	System.out.println("RN= "+RN);
    	System.out.println("address= "+address);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConstructorDemo obj=new ConstructorDemo("Asha",1,"Texas");
     obj.studentinfo();
     ConstructorDemo obj1=new ConstructorDemo("swathi",2,"Houston");
     obj1.studentinfo();

	}

}
