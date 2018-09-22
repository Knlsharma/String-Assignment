class replace
{
 
public static void main(String[] args) {
      String org= "This car is my car";
      String [] temp=org.split(" ");
      int len=temp.length;
      String ne = "";
      for(int i=0;i<len;i++)
      {
          if(temp[i].matches("car"))
              temp[i]="bike";
          ne=ne+temp[i]+" ";

      }
        System.out.println(ne);
    }
}