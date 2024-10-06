package collection;

import java.util.ArrayList;

public class ArrayList_RemovePrg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String>obj= new ArrayList <String>();
		obj.add("Hi");
		obj.add("This");
		obj.add("is");// values stored in list
		obj.add("a");
		obj.add("example");
		obj.remove(2);//Removes the element at the specified position in this list
		System.out.print(obj);

	}

}
