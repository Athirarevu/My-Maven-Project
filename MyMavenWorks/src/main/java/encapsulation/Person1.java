package encapsulation;

public class Person1 
{
	private String name;
	private int age;
		
	public String getName() {   // binded name and getter method [to view]
		return name;
	}
		
	public void setName(String name) { // binded name and setter method - [ to set ]
		this.name = name;
	}
	public int getAge() {        // binded age and getter method
		return age;
	}
	public void setAge(int age) {     // binded age and getter method
		this.age = age; 
	}
}
