package collection;

import java.util.ArrayList;

public class ArrayList_SetPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj= new ArrayList <String>();
		obj.add("Hi");
		obj.add("This");
		obj.add("is");// values stored in list
		obj.add("a");
		obj.add("example");
		
		obj.set(4, "Java");//Replaces the element at the specified position in this list with the specified element
		
		System.out.print(obj);
	}

}
