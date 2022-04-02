package text;

public class DesendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
//   for(int i=0;i<a.length;i++) {
//	   System.out.print(" "+a[i]);
//   }
   System.out.println("Descending order");
   //DesendingArray obj=new DesendingArray();
   int[] r=Desc();
   int temp=0;
   for(int i=0;i<r.length;i++) {
	   for(int j=i;j<r.length;j++) {
		   if(r[i]<r[j]) {
			   temp=r[i];
			   r[i]=r[j];
			   r[j]=temp;
		   }
	   }
	   System.out.print(" "+r[i]);  
   }
   
	}
   public static int[] Desc() {
	   
	int[] a= {19,35,26,72,69};
   
   return a;
	}

}
