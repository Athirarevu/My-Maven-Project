package throwException;

public class ThrowPrgm {

	public void show(int age) 
	{		
		if(age<18) 
		{			
			throw new ArithmeticException("Person is not eligible to vote");  //throw exception based on user entering value			
		}
		else 
		{
			System.out.println("Person is eligible to vote");
		}				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowPrgm obj =new ThrowPrgm();
		//obj.show(15);
		obj.show(25);

	}

}
