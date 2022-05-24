package last;
import java.util.Scanner;
public class random {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter starting number");
		int a=s.nextInt();	
		System.out.println("enter ending number");
		int b=s.nextInt();	
		int c = (int) (Math.random()*(b-a+1)+a);
		System.out.println(c);
	}

}
