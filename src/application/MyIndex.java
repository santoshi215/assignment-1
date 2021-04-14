
package application;

//index of a char in a string
public class MyIndex {
    
    private String str;
    public MyIndex(String z)
    {
        this.str=z;
    }
    
    public  int indexOf(int a)
    {
        int counter=0;
        for(int i=0;i<this.str.length();i++)
        {
            counter++;
        }
        
        char[] c=new char[counter];
        
        for(int i=0;i<c.length;i++)
        {
            c[i]=this.str.charAt(i);
        }
    
     return 1;
}
    
   public static void main (String[] args)
    {
           
         MyIndex object= new MyIndex(" i am santu patil");
         
         System.out.println( object.indexOf('s'));
         
    }
    
    
}