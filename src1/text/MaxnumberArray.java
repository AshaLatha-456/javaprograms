package text;

public class MaxnumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {110,300,206,543,176,154};
		int max=a[0];
      for(int i=0;i<a.length;i++) {
    	if(max<a[i]) {
    		max=a[i];
    	}
	}
   System.out.println("maximum number is "+ max);

	}

}
