package text;

public class AscArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[]= {110,300,206,543,176,154};
		int minimum=a[0];
      for(int i=0;i<a.length;i++) {
    	if(a[i]<minimum) {
    		minimum=a[i];
    	}
	}
   System.out.println("minimum number is "+ minimum);
}
}
