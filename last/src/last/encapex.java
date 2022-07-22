package last;

public class encapex {

	public static void main(String[] args) {
	geting s=new geting();
	s.setRn(55);
	System.out.print("roll:" + s.getRn());
	}

}
class geting
{
	private int rn;
	public int getRn() 
	{
	return rn;	
	}
	public void setRn(int rn)
	{
	this.rn=rn;	
	}
}
