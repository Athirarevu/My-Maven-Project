package abstraction;

public class Abs_Constructor2 extends Abs_Constructor1 {

	public void show()
	{
		System.out.println("HI");
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abs_Constructor2 obj=new Abs_Constructor2();//parent class constructor also get invoked with this object creation
		obj.show();
		obj.show1();
	}

}
