
package application;
//how many times a entered word is occured in a given string

import java.util.Scanner;


public class Occurance {
    
    Scanner sc= new Scanner(System.in);
    void method1()
	{
                System.out.println("ENter string: ");
		String s1 = sc.nextLine();
		
		System.out.println("ENter word to check: ");
		String s2 = sc.next();
		
		String str[] = s1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(s2.equals(str[i]))
			{
				System.out.println("Word found at position: "+i);
				break;
			}
		}
	}
   
     public static void main(String[] args)
    {
    Occurance oc= new Occurance();
    oc.method1();
    }  
}
