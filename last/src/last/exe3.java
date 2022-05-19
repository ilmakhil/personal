package last;
import java.util.Scanner;
public class exe3 {
  public static void main(String[] args)
    {
      String s1 = new String("akhila");
      char a[]  = s1.toCharArray();
      int length  = a.length/2; 
      if (length%2!=0)
      {
      System.out.println(a[length]+ ""+a[length-1]);
      }
      else
      {
    	  System.out.println(a[length]);  
      }
      
    }  
}	  
			  