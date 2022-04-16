
package last;

public class Employeeregister {
	
	static int emp_id;
	static char name;
	Employeeregister(char name,int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
	

	public static void main(String[] args) {
		 Employeeregister e1= new Employeeregister ((char) 97,123);
		 System.out.println(Employeeregister.emp_id);
		 System.out.println(Employeeregister.name);
		 Employeeregister e2= new Employeeregister ((char) 98,1234);
		 System.out.println(Employeeregister.emp_id);
		 System.out.println(Employeeregister.name);
		// TODO Auto-generated method stub

	}

}
