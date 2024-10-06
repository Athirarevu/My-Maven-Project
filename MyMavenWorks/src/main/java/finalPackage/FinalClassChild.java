package finalPackage;

public class FinalClassChild //extends FinalClassParent 
{

	public void display() 
	{
		System.out.println("display1");
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FinalClassChild obj= new FinalClassChild();
		obj.display();
	//	obj.show(); if this is not commented error will come - reason.. if we make any class as final..we cannot extend the class
	}

}
//If you make any class as final you cannot extend it.(we can’t maintain IS-A relationship)