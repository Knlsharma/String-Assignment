class equalwithoutfn
{
 
public static void main(String[] args) {
      String org= "This car is my car";
      String [] temp=org.split(" ");
      int len=temp.length;
      String ne = "This car is my car";
      String [] temp1=ne.split(" ");
      for(int i=0;i<len;i++)
      {
          if(temp[i].matches(temp1[i]))
{
              System.out.println("T");             
 }     }
        
    }
}