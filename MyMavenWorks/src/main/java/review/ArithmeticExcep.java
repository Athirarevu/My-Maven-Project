package review;

public class ArithmeticExcep {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			int num = 10/0;			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero is not possible! Arithmetic Exception Example");
			
		}
	}

}
