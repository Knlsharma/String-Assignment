import java.util.*;
import java.io.*;

class sequencecount 
{
    public static void main (String args[])
    {
int i,c=0;
Scanner s= new Scanner(System.in);
String str=s.nextLine();
s.close();
        sequenceCount(str);
}

static void sequenceCount(String s1) {
    char[] arr = s1.toCharArray();
    int i = 0, n = arr.length;

    while (i < n) {
        char c = arr[i];
        int count = 0;
        do {
            ++i; ++count;
        } while (i < n && arr[i] == c);
        System.out.println("letter "+ c +":"+"number of times " + count);
    }
}
}
