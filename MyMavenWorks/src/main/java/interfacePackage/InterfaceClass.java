package interfacePackage;

public class InterfaceClass implements Interface1{

	public void show() 
	{
		System.out.println("Abstract Method from Interface "
				+ " implementing inside" + " class ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InterfaceClass obj = new InterfaceClass();
		obj.show();

	}

}
