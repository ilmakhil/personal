
package last;
import java.util.Scanner;
public class ovels {

	public static void main(String[] args) 
	{
		System.out.println("enter word or sentence");
		Scanner sca=new Scanner(System.in);
		String inp=sca.nextLine();
		System.out.println(count_voles(inp));
		

	}
	static int count_voles(String inp) 
	{
		int count = 0;
        for (int i = 0; i < inp.length(); i++)
        {
            if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i'
                    || inp.charAt(i) == 'o' || inp.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

		
		
	}

