package superUsage1;

public class Dog extends Animal
{
	String name = "Aradhya";
	
	public void display()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog obj= new Dog();
		obj.display();

	}

}
