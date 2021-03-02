package pattern;

import java.util.Scanner;

public class Planindrome {

	public static void main(String[] args) {
		int r=0; char t1; String rev = null;
		 StringBuilder input1 = new StringBuilder();
		System.out.println("enter the number");
           Scanner t= new Scanner(System.in);
           String l = t.nextLine();
           String l1= l;
           for (int i=l.length()-1;i>=0;i--)
           {
        	   
        	   System.out.println(l.charAt(i));
        	   
        	   input1.append(l.charAt(i)); 
        	 rev=input1.toString();  
        	  
           }
           System.out.println(input1);
           System.out.println(l);
           System.out.println(rev.equals(l));  
           
	}

}
