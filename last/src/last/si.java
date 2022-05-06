
package last;
import java.util.Scanner;

public class si {
	
	public static void main(String[] args) {
		int i;
		
		int fact = 1;
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		  
        
		int no=sc.nextInt();
		for ( i=1;i<=no;i++)
		{
			
			fact=fact*i;
			
		}
		System.out.println("factorial of given no is "+ fact);
		// TODO Auto-generated method stub

	}

}
