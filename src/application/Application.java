
package application;
//inde of a char in a string usring indexof()

public class Application {

    public static void indexes()
    {
         String s="santu";
         String indexOfChar="u";
         int index=s.indexOf(indexOfChar);
         while(index>=0)
       {
           
           System.out.println("index is:"+index);
           break;
       }   
    }
        public static void main(String[] args)
    {
        indexes();  
    }       
}
     
    /* char[] ch=s.toCharArray();
     
     for(char x:ch)
     
     
     for(int i=0;i<ch.length;i++)
     {
         if(x==ch[i])
         {
             System.out.println(ch[i]);
             break;
         } 
         else
         {
             System.out.println("-1");
         }
   }
        
    }*/
   
   
   
