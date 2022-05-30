package last;
import java.util.*;
import java.text.*;
public class curr_conv {

	public static void main(String[] args) {
		
		    
		   
		        Scanner scanner = new Scanner(System.in);
		        double payment = scanner.nextDouble();
		        scanner.close();
		        
		       String us= NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		       String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		       String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		       String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
		        System.out.println("US: " +us  );
		        System.out.println("china: " +china);
		        System.out.println("france: " + france );
		        System.out.println("india: " + india );
	}

}
