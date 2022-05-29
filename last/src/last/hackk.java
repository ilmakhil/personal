package last;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hackk {
	 public static void main(String[] args) 
	    {
	        
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        scn.nextLine();
	        Map<String,Integer> map = new HashMap<>(n);
	        
	        for (int i=0;i<n;i++)
	        {
	        String name = scn.nextLine();
	        int number = scn.nextInt();
	        scn.nextLine();
	        map.put(name, number);
	        
	        }
	        while(scn.hasNext()) 
	        {
	        String find = scn.nextLine();
	        if(map.containsKey(find)){
                System.out.println(find+"="+map.get(find));
            }else{
                System.out.println("Not found");
            }
	        
	        }
	        
	        
	        

	    }


}
