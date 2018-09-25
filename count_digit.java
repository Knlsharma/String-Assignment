import java.util.*;
class count_digit
{
public static void main(String args[])
{
Scanner x= new Scanner(System.in);
System.out.println("enter string");
String str=x.nextLine();

for(int i=0;i<str.length();i++)
{
System.out.print(str.charAt(i));
}



    int counter = 0;
    for(char c : str.toCharArray()) {
        if( c >= '0' && c<= '9') {
            ++counter;
        }
    }
    System.out.println(counter);

}
}