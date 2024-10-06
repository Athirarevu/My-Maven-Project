package collection;


import java.util.ArrayList;
import java.util.List;

public class List_Generic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer>obj= new ArrayList <Integer>();

		obj.add(5);
		obj.add(7);
		obj.add(10);// values stored in list
		obj.add(2);
		obj.add(1);
	//	System.out.print(obj);// for getting result
		
		for(int temp:obj) // for each loop - for printing the line one by one
		{
			System.out.println(temp);
		}

	}

}
// for each loop & for loop can be used only in generic- i.e, for elements having same data type
// iterator can be used in both generic & non Generic methods