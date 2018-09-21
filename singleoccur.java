import java.util.*;
import java.io.*;

class singleoccur 
{
public static void main (String args[])
    {
int i,c=0;
Scanner s= new Scanner(System.in);
String str12=s.nextLine();
s.close();
        occur(str12);
}

public static void occur(String str){
        int i=0;
        int j=0;
        char arr[]=new char[50];
        while (i<str.length()-1) {            
            if(str.charAt(i)!=str.charAt(i+1)){
                arr[j]=str.charAt(i);
                i++;
                j++;
            }else{
                i++;
            }
        }
        arr[j]=str.charAt(str.length()-1);
        for(char c:arr){
            System.out.print(c);
        }
    }
}