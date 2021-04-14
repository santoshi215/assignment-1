
package application;

//length of a string

public class MyString {
    
   static int length(String s)
   {
       s=s+'\u0000';
       int i=0;
       
           while(s.charAt(i)!='\u0000')
           {
             i++;
           }
              return i;
   }
   public static void main(String[] args)
    {
        String a="santu";
        System.out.println(length(a));   
}

}