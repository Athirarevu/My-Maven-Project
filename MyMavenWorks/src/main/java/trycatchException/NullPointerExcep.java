package trycatchException;

public class NullPointerExcep 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{			
			String a = null;
			System.out.println(a.length());
		}
		catch(NullPointerException e) 
		{
			System.out.println(e);			
		}
	}

}
