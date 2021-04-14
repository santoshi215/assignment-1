
package application;

import java.util.Scanner;

//how many times given char is present in a string
public class Presence {
    
   
	void method()
	{ 
            Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s1  = sc.next();
		
		System.out.println("Enter character to count: ");
		char character = sc.next().charAt(0);
		
                //we can count a single char by this .
		
		char ch[] = s1.toCharArray();
		int counter =0;
		for(int i=0;i<ch.length;i++)
		{
			if(character == ch[i])
			{
				counter++ ;//sop(character)
			}                  //else
		}                           // sop(not present)
		
		System.out.println("Character "+character+" in string "+s1+" is present at "+counter+ " times.");
	}
    
    public static void main(String[] args)
    {
        Presence pr=new Presence();
        pr.method();
    }
}
