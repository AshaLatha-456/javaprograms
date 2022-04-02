package Exceptions;

import java.io.FileNotFoundException;

public class ThrowsInJava {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ThrowsInJava T=new ThrowsInJava();
		T.m1();
	}
   void m1() throws FileNotFoundException{
	   readfile();
   }
   void readfile() throws FileNotFoundException {
	   FileInputStream fs=new FileInputStream("C:\ASHA\Testing");
	   }
}
