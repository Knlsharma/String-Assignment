import java.util.*;
class reverse 
{
     public static void main (String args[])
     {
            Scanner x=new Scanner(System.in);

         String str =x.nextLine();
         int i;
         
                 String str1="";
           for (  i = str.length() - 1 ; i >= 0 ; i-- )
           {
         str1 = str1 + str.charAt(i);
           }
      System.out.println("Reverse of entered string is: "+str1);
     }
}