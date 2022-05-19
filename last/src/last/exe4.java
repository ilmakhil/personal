package last;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter anything");
		String str=input.nextLine();
		System.out.println("middle character in string is"+" "+middle(str));
		

	}
public static  String middle(String str)
{
int position;
int length;
	if (str.length()%2==0)
{
	
position=str.length()/2-1;
length =2;
}
else
{
	position=str.length()/2;
	length =1;
}
return str.substring(position, position + length);
}
}
