import java.util.*;


class charcount {

public static void main(String[] args) {

System.out.println("Enter String");

Scanner x=new Scanner(System.in);

String str=x.nextLine();

System.out.println("Enter Char");

char c = x.next().trim().charAt(0);;

      
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + c + " = " + frequency);
    }
}