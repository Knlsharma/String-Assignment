import java.util.*;

class lefttrim      //  but also work for both (left and right )
{
     public static void main (String args[])
     {
Scanner x=new Scanner(System.in);
System.out.println("Enter a string");

         String str = x.nextLine();         
   char space = ' ';
        int ascii = (int) space;

        
        char c[] = str.toCharArray();

        for (int i = 0; i<str.length(); i++) {
            if (c[i] == ascii) {
                continue;
            } else {
                System.out.print(c[i]);
            }
        }
}

    }

