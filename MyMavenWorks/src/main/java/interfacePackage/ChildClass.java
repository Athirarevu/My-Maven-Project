package interfacePackage;

public class ChildClass implements Parent1,Parent2
{
	public void show() {
		System.out.println("Show");
	}

	public void display() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.show();
		obj.display();
	}

}
