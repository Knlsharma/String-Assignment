import java.util.*;
class find_digit
{
public static void main(String args[])
{
Scanner x= new Scanner(System.in);
System.out.println("enter string");
String str=x.nextLine();

/* for(int i=0;i<str.length();i++)
{
System.out.print(str.charAt(i));
}



    int counter = 0;
    for(char c : str.toCharArray()) {
        if( c >= '0' && c<= '9') {
            ++counter;
        }
 }
    System.out.println(counter); */


//String s = "qwerty1qwerty2";
for(int i=0;i<str.length();i++)
{
   if(Character.isDigit(str.charAt(i)))
   System.out.print(str.charAt(i)+"  ");
}



}
}