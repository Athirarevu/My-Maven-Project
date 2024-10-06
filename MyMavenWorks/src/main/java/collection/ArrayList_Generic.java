package collection;

import java.util.ArrayList;


public class ArrayList_Generic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String>obj= new ArrayList <String>();

		obj.add("Hi");
		obj.add("This");
		obj.add("is");// values stored in list
		obj.add("a");
		obj.add("example");
		
		obj.add(4, "Java");//Inserts the specified element at the specified position in the list
		
		System.out.print(obj);// for getting result
	}

}
