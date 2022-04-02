package text;

import java.util.Scanner;

public class DescendingAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
//   for(int i=0;i<a.length;i++) {
//	   System.out.print(" "+a[i]);
//   }
		int[] k=new int[] {28,90,35,49,57};
   System.out.println("Descending order");
   DescendingAray obj=new DescendingAray();
   int[] r=obj.Desc(k);
   for(int i=0;i<r.length;i++) {
   System.out.print(" "+r[i]);
   }
	}

	
   int[] Desc(int[] a) {
	  int temp=0;
	   //Scanner sc=new Scanner(System.in);
	   //System.out.println("enter the no. of arrays to be printed");
	   //number=sc.nextInt();
	  // int a[]=new int[number];
	   //for(int i=0;i<number;i++) {
		   //a[i]=sc.nextInt();
	  // }
	 for(int i=0;i<a.length;i++) {
		   for(int j=i;j<a.length;j++) {
			   if(a[i]<a[j]) {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
		    
	   }
	
   return a;
   
	}

}
