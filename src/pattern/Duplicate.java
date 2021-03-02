package pattern;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int r=0;  //char t2=  'r';
		System.out.println("enter string");
		Scanner t=new Scanner(System.in);
		String t1 =t.nextLine();
		char a[]=t1.toCharArray();
		System.out.println("enter char which you want to find");
		Scanner t5=new Scanner(System.in);
		String t2=  t5.nextLine();
		char a1= t2.charAt(0);
		 for (int i=0; i<a.length;i++ )
         {
			 
      	   if (a1==a[i]) {
      		 
      		   r=r+1;
      	   }
      	
         }
		 System.out.println(r);
	}

}
