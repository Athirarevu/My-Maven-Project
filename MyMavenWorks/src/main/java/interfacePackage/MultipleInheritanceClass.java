package interfacePackage;

public class MultipleInheritanceClass implements Interfaceparent1,Interfaceparent2{

	public void show() 
	{
		System.out.println("Multiple Inheritance from interface parent class 1");
	}

	public void display() 
	{
		System.out.println("Multiple Inheritance from interface parent class 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceClass obj =new MultipleInheritanceClass();
		obj.show();
		obj.display();
	}

}
