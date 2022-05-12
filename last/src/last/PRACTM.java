package last;
import java.util.Scanner;


public class PRACTM {
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	System.out.print("enter first nuber");
	int p=s.nextInt();
	System.out.print("enter second nuber");
	int q=s.nextInt();
	System.out.print("enter thied nuber");
	int r=s.nextInt();
	System.out.print(small(p,q,r));
	}
	
static int small(int p,int q,int r)
{
	return  ((p+q+r)/3);
	
}
}
