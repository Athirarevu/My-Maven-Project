package abstraction;

public class Child_Jasmine extends Parent_Flowers{

	public void garden()
	{
		System.out.println("JASMINE");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Parent_Flowers obj=new Child_Jasmine();//upcasting//parentclass name obj=new childclass name();
		obj.garden();
		Parent_Flowers obj1=new Child_Rose();
		//upcasting//parentclass name obj=new other childclass name();
		obj1.garden();

	}

}
