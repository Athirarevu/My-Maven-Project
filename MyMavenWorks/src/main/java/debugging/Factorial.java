package debugging;

public class Factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i, fact = 1;    
		int number=8;   
		
        for (i = 1; i <= number; i++)
        {
            fact = fact * i;         // if i=1 - fact = 1 * 1 = 1
        }
        System.out.println("Factorial of " + number + " is: " + fact);
	}

}
