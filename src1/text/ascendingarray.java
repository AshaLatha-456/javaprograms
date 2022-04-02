package text;

public class ascendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {19,35,26,72,69};
   for(int i=0;i<a.length;i++) {
	   System.out.print(" "+a[i]);
   }
   System.out.println("Ascending order");
   int temp=0;
   for(int i=0;i<a.length;i++) {
	   for(int j=i;j<a.length;j++) {
		   if(a[i]>a[j]) {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
	   }
	   System.out.print(" "+a[i]);
   }
	}

}
