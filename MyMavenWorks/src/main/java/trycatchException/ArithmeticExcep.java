//try- catch - finally - ArithmeticException

package trycatchException;

public class ArithmeticExcep 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{		
			int a = 10/0;	
			//int a = 10/5;     // for finally
		}
		catch(ArithmeticException e)   // ArithmeticException object name
		{
			//System.out.println("Arithmetic Exception Handled");
			System.out.println(e);  // print caught exception
		}	
		
		finally {      // always execute
			System.out.println("Finally exception!!!");
		}
	}

}
