package last;

public class callbymethod
		int age;

		void initObj( int a)
		{

		 
		age=a;
		}
		 void display()
		 {

		 System.out.println(age);
		 }
		public static void main(String[] args) {

			callbymethod buzo=new callbymethod();

		buzo.initObj(20);
		buzo.display();
		
	}

}
 