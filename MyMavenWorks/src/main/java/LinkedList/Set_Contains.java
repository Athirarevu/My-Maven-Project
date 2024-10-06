package LinkedList;

import java.util.HashSet;

public class Set_Contains {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer>obj= new HashSet <Integer>();
		obj.add(5);
		obj.add(7);
		obj.add(10);// values stored in list
		obj.add(2);
		obj.add(1);
		obj.add(5);
		System.out.println(obj.contains(10));//Returns true if this set contains the specified element
		System.out.println(obj.contains(11));
	}

}
