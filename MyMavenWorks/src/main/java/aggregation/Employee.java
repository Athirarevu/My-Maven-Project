package aggregation;

public class Employee {

	int ID;
	String name;
	Address address;// reference object created as instance object
	
	public Employee(String name, int ID, Address address)
	{
		this.name= name;
		this.ID= ID;
		this.address= address;
	}
	public void show()
	{
		System.out.println(ID+" , "+name);
		System.out.println(address.State+" ,  "+address.City+" , "+address.Country);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Address obj1=  new Address("Kerala","TVM", "India");
		Employee obj= new Employee("Athira", 100, obj1);
		obj.show();
	}

}
