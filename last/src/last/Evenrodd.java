package last;

public class Evenrodd {

	
		static boolean isEven(int n)
		{
		     
		   
		    return ((n / 2) * 2 == n);
		}
		 
		
		public static void main(String[] args)
		{
		    int n = 102;
		    if(isEven(n) != false)
		        System.out.print( "Even" );
		    else
		        System.out.print( "Odd" );
		

	}

}
