package encapsulation;

public class Employee2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee1 obj = new Employee1();
		
		obj.setId(101);  
		System.out.println("Employee ID : " + obj.getId());
		
		obj.setName("Athira");  
		System.out.println("Employee Name : " + obj.getName());
		
		obj.setAge(30);  
		System.out.println("Employee Age : " + obj.getAge());
		
		obj.setSalary(50000.00f);  
		System.out.println("Employee Salary : " + obj.getSalary());
	}

}
