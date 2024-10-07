package trycatchException;

public class MultipleCatchExcep 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{		
			int a = 10/0;			
		}
		catch(ArithmeticException e)  
		{
			System.out.println(e);  
		}			
		catch(NullPointerException e)  
		{
			System.out.println(e);  
		}			
		catch(Exception e)    // must be last catch
		{
			System.out.println(e);  
		}

	}

}
