// array out of bound exception

package trycatchException;

public class ArrayIndexOutExcep 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
        {
            int arr[] = new int[5]; 
            arr[10] = 20;           
        }
        catch (Exception e) 
        {
            System.out.println(e); 
        }

	}

}
