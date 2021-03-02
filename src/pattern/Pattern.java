package pattern;

import java.util.Scanner;

public class Pattern 
{
  public static void main(String[] args) 
    {
		//String input= "ROHIT jha";
		System.out.println("enter");
		Scanner n =new Scanner(System.in);
		  String  input =n.nextLine();
		
		// StringBuilder input1 = new StringBuilder("webkul"); 
		  
//	        // append a string into StringBuilder input1 
//	        input1.append(input); 
//	        System.out.println(input1);
//	        // reverse StringBuilder input1 
//	        input1 = input1.reverse(); 
//	  
//	        // print reversed String 
//	        System.out.println(input1);
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
			
		}
     }
}