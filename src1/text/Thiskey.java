
package text;

public class Thiskey {
	String Name;
	int RN;
	String address;
	Thiskey(String Name,int RN,String address){
		this.Name=Name;
		this.RN=RN;
		this.address=address;
		}
    void studentinfo(){
    	System.out.print("name= "+Name);
    	System.out.print(" RN= "+RN);
    	System.out.print(" address= "+address);
    	System.out.println(" ");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thiskey obj=new Thiskey("Asha",1,"Texas");
     obj.studentinfo();
     Thiskey obj1=new Thiskey("swathi",2,"Houston");
     obj1.studentinfo();

	}

}
