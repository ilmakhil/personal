package last;
import java.util.Scanner;
public class leap {

	public static void main(String[] args) 
	{
		System.out.println("enter the year");
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		System.out.println("entered year is"+" "+year);
		
	
		
		if(year%400==0 || year%4==0 && year%100!=0)
		{
			System.out.println("leap year ");	
		}
		else 
		{
			System.out.println(" not leap year ");
		}
		
		

	}

}
