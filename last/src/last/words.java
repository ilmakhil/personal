package last;
import java.util.Scanner;
public class words {

	public static void main(String[] args) {
		System.out.println("enter anything");
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str);
		System.out.println("no of words in string is "+word(str));
	}
		static int word(String str)
		{
		int count =1;
		for(int i=0;i<str.length()-1;i++)
		{
			if (str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
			count++;
		    }
			
			
		}
		return count;
		
		
	}

}
