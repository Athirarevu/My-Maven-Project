package trycatchException;

public class NumberFormatException {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{	
			String a = "Haii";
			int b = Integer.parseInt(a);	
		}
		catch(Exception e) 
		{
			System.out.println(e);	
		}
	}

}
