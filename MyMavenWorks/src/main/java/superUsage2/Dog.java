package superUsage2;

public class Dog extends Animal
{

	public void run()
	{
		super.run();// invoke immediate parent class method
		System.out.println("Barking");
		//super.run(); // super should be used at the beginning
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog obj= new Dog();
		obj.run();
	}

}
