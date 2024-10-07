package review;

public class InterfaceClass implements Interface1, Interface2{

	public void show() 
	{
		System.out.println("interface 1");
	}
	
	public void display() 
	{
		System.out.println("Interface 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj = new InterfaceClass();
		obj.show();
		obj.display();

	}

}
