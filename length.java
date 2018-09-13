import java.util.Scanner;
public class length {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

 int count=0;
 int sp=0;

        for(int i=0;i<str.length();i++)

{
         if(str.charAt(i)>='a' && str.charAt(i) <='z' || str.charAt(i)>='A' && str.charAt(i) <='Z' || str.charAt(i)>='0' && str.charAt(i) <='9')
{
count++;

}
else
{
sp++;
}
}

System.out.println("Total space count is "+sp);
System.out.println("Total length count is "+count);

}
}